package com.mkvbs.recipe_search_service.service

import com.mkvbs.recipe_search_service.domain.Recipe
import java.util.UUID

/**
 * I recipe suggestion service
 *
 * @constructor Create empty I recipe suggestion service
 */
interface IRecipeSuggestionService {


    /**
     * Get suggested recipes.
     * 1. Gets liked and unliked ingredients of user
     * 2. Gets last 100 liked recipes
     * 3. Try to find the most recipes with the most user popular ingredients
     * 4. Get the most popular recipes recently
     * 5. Get just random recipe
     * 6. Combine all recipes to the output of 30 recipes
     *
     * @param userId
     * @param size
     * @return
     */
    suspend fun getSuggestedRecipes(userId: UUID, size: Int): List<Recipe>
}