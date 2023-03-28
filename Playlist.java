import java.util.ArrayList;
public class Playlist{
    public static void main (String []args){
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Yoü and I: Lady Gaga");
        listaParaIlhaDeserta.add("Babylon: Lady Gaga");
        listaParaIlhaDeserta.add("Hearless: The Weenkdn");
        listaParaIlhaDeserta.add("Dark Paradise: Lana Del Rey");
        listaParaIlhaDeserta.add("Always Remember This Way: Lady Gaga");
        listaParaIlhaDeserta.add("Angel down: Lady Gaga");
        System.out.println(listaParaIlhaDeserta);

        listaParaIlhaDeserta.remove(1);
     System.out.println(listaParaIlhaDeserta);
     int indiceA = 4;
     int indiceB = 5;
     String tempA = listaParaIlhaDeserta.get(indiceA);
     String tempB = listaParaIlhaDeserta.get(indiceB);
     listaParaIlhaDeserta.set(indiceB, tempA);
     listaParaIlhaDeserta.set(indiceA, tempB);
     System.out.println(listaParaIlhaDeserta);

    }
}