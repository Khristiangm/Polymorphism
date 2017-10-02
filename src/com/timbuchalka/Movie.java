package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
//Classe Super deste projeto que esta abordando Polimorfismo
public class Movie {
    public String name;

    public Movie(String name) {
        this.name = name;
    }
    //Metodo criado que sera responsavel pelo polimorfismo em todas as outras classes, alterando os respectivos plots atraves do mesmo metodo..utilizando o @override.
    public String plot(){

        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}
