package ma.formation.webService.rest.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.rest.model.dtos.requestdto.CategoryRequest;
import ma.formation.webService.rest.model.dtos.response.CategoryResponse;
import ma.formation.webService.rest.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-category")
@Slf4j
@AllArgsConstructor
public class CategoryController {
    private final ICategoryService iCategoryService;

    @Operation(summary = "Cette opération permet d'ajout un category dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération d'ajout est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = CategoryController.class))

            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            })
    })
    @PostMapping("/create-product")
    public CategoryResponse createCategory (@RequestBody CategoryRequest categoryRequest){
        log.debug("Create Product Controller {}",categoryRequest);
        return iCategoryService.saveCategory(categoryRequest);
    }
    @Operation(summary = "Cette opération permet selection tout les category dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération selection est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = CategoryController.class))

            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            })
    })
    @GetMapping("/get-all-category")
    public List<CategoryResponse> getAllCategory (){
        log.debug("Get All Category Controller");
        return iCategoryService.getAllCategory();
    }
    @Operation(summary = "Cette opération permet suprimé category dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération suprimé est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = CategoryController.class))

            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            })
    })
    @DeleteMapping("/delete")
    public void deleteById (Long iddelete){
        log.debug("Delete By Id Controller {}",iddelete);
        iCategoryService.deleteCategoryById(iddelete);
    }
    @Operation(summary = "Cette opération permet modifier category dans la base.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'opération modification est effectuée avec succés",content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "400",description = "La requete envoyée incorrect. Bad Request !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "401",description = "l'utilisateur n'est pas authentifié",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "403",description = "l'utilisateur n'est pas authorisé à faire l'action demandé",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "404",description = "la resource demandée est introuvable. Not Found !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            }),
            @ApiResponse(responseCode = "500",description = "Erreur Server !",content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryController.class))
            })
    })
    @PutMapping("/update-category")
    public CategoryResponse updateCategory (@RequestBody CategoryRequest categoryRequest){
        log.debug("Update Category Controller {}",categoryRequest);
        return iCategoryService.updateCategory(categoryRequest);
    }
}
