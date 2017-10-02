package com.timbuchalka;

public class Main {
    //Metodo que retorna um tipo MOVIE criado para selecionar de forma randomica qual filme sera selecionado
    public static Movie randomMovie() {
        //variavel que vai guardar o numero randomico entre 1 e 5.
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("The random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Independency();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

                default: return new Forgetable();
        }

    }

    public static void main(String[] args) {
        //Estrutura de repetição criada para trazer os filmes criados no metodo RandomMovie.
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    ":" + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");

        }
//         TESTANDO AS FUNCÕES DO MATH.RANDOM
//        System.out.println((Math.random() * 5));
//        System.out.println(Math.random());
//        System.out.println(Math.random() * 5);
//        System.out.println((Math.random() * 5));
//        System.out.println(Math.random());

    }


}
