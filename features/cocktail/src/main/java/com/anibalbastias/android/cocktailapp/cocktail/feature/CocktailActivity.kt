package com.anibalbastias.android.cocktailapp.cocktail.feature

import android.os.Bundle
import com.anibalbastias.android.cocktailapp.cocktail.BaseSplitActivity
import com.anibalbastias.android.cocktailapp.cocktail.R

class CocktailActivity : BaseSplitActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_cocktail)
    }

}
