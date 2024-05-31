package ma.formation.webService.rest.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.rest.model.dtos.requestdto.ProductRequest;
import ma.formation.webService.rest.model.dtos.response.ProductResponse;
import ma.formation.webService.rest.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-product")
@AllArgsConstructor
@Slf4j
public class ProductController {
    private final IProductService iProductService;
    @Operation(summary = "Cette opération permet d'ajout un product dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération d'ajout est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            })
    })
    @PostMapping("/create-product")
    public ProductResponse createProduct (@RequestBody ProductRequest productRequest){
        log.debug("Create Product Controller {}",productRequest);
        return iProductService.saveProduct(productRequest);
    }
    @Operation(summary = "Cette opération permet selection tout les products dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération selection est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            })
    })

    @GetMapping("/get-all-product")
    public List<ProductResponse> getAllProduct (){
        log.debug("Get ALl Product");
        return iProductService.getAllProduct();
    }
    @Operation(summary = "Cette opération permet suprimé products dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération suprimé est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            })
    })
    @DeleteMapping("/delete")
    public void deleteById(Long idDelete){
        iProductService.deleteProductById(idDelete);
    }
    @Operation(summary = "Cette opération permet modifier products dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération modification est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = IProductService.class))
            })
    })
    @PutMapping("/update-product")
    public ProductResponse updateProduct (@RequestBody ProductRequest productRequest){
        return iProductService.updateProduct(productRequest);
    }
}
