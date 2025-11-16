package com.mkvbs.recipe_search_service.controller

import com.mkvbs.recipe_search_service.dto.RecipeResponseDto
import com.mkvbs.recipe_search_service.service.IRecipeSuggestionService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@Tag(
    name = "CRUD REST APIs for recipe suggestions",
    description = "Rest Api to suggest recipes for users"
)
@RestController
@RequestMapping("/api/recipe-suggest/v1")
@Validated
class RecipeSuggestionController(
    private val service: IRecipeSuggestionService
) {
    suspend fun getSuggestedRecipes(@Validated @PathVariable userId: UUID, @Validated @PathVariable size: Int): List<RecipeResponseDto> {

    }
}