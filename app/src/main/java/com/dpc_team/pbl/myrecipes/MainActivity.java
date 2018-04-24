package com.dpc_team.pbl.myrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dpc_team.pbl.myrecipes.Adapters.RecipesAdapter;
import com.dpc_team.pbl.myrecipes.Models.Recipe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // se declara el contenedor recycler view
    RecyclerView recyclerViewRecipes;
    ArrayList<Recipe> recipes;
    RecipesAdapter recipesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // crear los datos de recetas
        createData();

        recyclerViewRecipes = (RecyclerView) findViewById(R.id.cvRecipesRecycler);

        // se define el layout del recycler view
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // se asigna el espacio de trabajo al recycler view
        recyclerViewRecipes.setLayoutManager(linearLayoutManager);

        recipesAdapter = new RecipesAdapter(this, recipes);

        recyclerViewRecipes.setAdapter(recipesAdapter);

    }

    public void createData() {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(
                "1",
                "sandwitch",
                "pan con jamon queso chile mas queso",
                "",
                "sandwich de jamon",
                2,
                1)
        );
        recipes.add(new Recipe(
                "2",
                "huevos",
                "huevos",
                "",
                "huevos duros",
                2,
                1)
        );
        recipes.add(new Recipe(
                "3",
                "hotdogs",
                "hotdog",
                "",
                "hotdog big",
                2,
                1)
        );
        recipes.add(new Recipe(
                "4",
                "hotcakes",
                "hotcakes",
                "",
                "hotcake big",
                2,
                1)
        );
        recipes.add(new Recipe(
                "5",
                "pezcado",
                "pezcado",
                "",
                "pezcado",
                2,
                1)
        );
        recipes.add(new Recipe(
                "6",
                "pechuga azada",
                "pechuga azada",
                "",
                "pechuga azada big",
                2,
                1)
        );
        recipes.add(new Recipe(
                "7",
                "pasto",
                "ensalada",
                "",
                "lechuga limon y sal",
                2,
                1)
        );
    }
}
