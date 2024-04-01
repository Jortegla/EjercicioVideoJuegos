
package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuego {

   
    public static void main(String[] args) {
       //Creando Lista de Video Juegos
        List<VideoJuego> listVideoJuegos  = new ArrayList<VideoJuego>();
        
        //Creando 5 Video Juegos
        VideoJuego videoJuego1 = new VideoJuego(123, "Banjo Kazooi", "Nintendo 64", 4, "Plataforma");
        VideoJuego videoJuego2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        VideoJuego videoJuego3 = new VideoJuego(789, "Age of Empire II", "PC", 4, "Estrategia");
        VideoJuego videoJuego4 = new VideoJuego(101, "Counter Strike 1.6", "PC", 2, "Shooter");
        VideoJuego videoJuego5 = new VideoJuego(121, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");
        
        //Añadiendo video juegos a la lista
        listVideoJuegos.add(videoJuego1);
        listVideoJuegos.add(videoJuego2);
        listVideoJuegos.add(videoJuego3);
        listVideoJuegos.add(videoJuego4);
        listVideoJuegos.add(videoJuego5);
        
        //Recorriendo la lista de videoJuegos
        System.out.println("-------------------RECORRIENDO LA LISTA------------------------------------");
        for(VideoJuego juego:listVideoJuegos){
            System.out.println("Titulo de Video juego: "+juego.getTitulo()+ " consola: "+ juego.getConsola() + " cantidad de jugadores: " + juego.getCantidadJugadores());
        }
        System.out.println("-------------------------------------------------------------------------------------");
        
        //Cambiando nombre y cantidad de jugadores
        videoJuego3.setTitulo("Age of Empire III");
        videoJuego3.setCantidadJugadores(6);
        videoJuego5.setTitulo(" Mario Bross");
        videoJuego5.setCantidadJugadores(4);
        
        //Recorriendo la lista después del cambio
        System.out.println("-------------------RECORRIENDO LA LISTA DESPUES DE CAMBIAR EL VIDEO JUEGO------------------------------------");
        for(VideoJuego juego:listVideoJuegos){
            System.out.println("Codigo: "+juego.getCodigo() + " Titulo: " + juego.getTitulo() + " consola: " + juego.getConsola()+" Cant Jugadores: "+
                    juego.getCantidadJugadores()+" categoria: " + juego.getCategoria() );
        }
        System.out.println("-------------------------------------------------------------------------------------");
        
        //Mostrando solo juegos de Nintendo 64
         System.out.println("-------------------MOSTRANDO SOLO JUEGOS DE NINTENDO 64------------------------------------");
        for(VideoJuego juego:listVideoJuegos){
            if(juego.getConsola().equalsIgnoreCase("Nintendo 64")){
             juego.toString();
        }
        }
         System.out.println("-------------------------------------------------------------------------------------");
    }
    
}
