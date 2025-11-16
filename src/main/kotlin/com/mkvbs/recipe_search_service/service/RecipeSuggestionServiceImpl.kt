package com.mkvbs.recipe_search_service.service

import com.mkvbs.recipe_search_service.domain.Recipe
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class RecipeSuggestionServiceImpl : IRecipeSuggestionService {

    override suspend fun getSuggestedRecipes(
        userId: UUID,
        size: Int
    ): List<Recipe> {
        TODO("Not yet implemented")
    }
}