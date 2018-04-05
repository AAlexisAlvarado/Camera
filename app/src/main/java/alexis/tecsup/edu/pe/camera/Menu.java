package alexis.tecsup.edu.pe.camera;

import java.util.ArrayList;

/**
 * Created by alexi on 4/04/2018.
 */

public class Menu {
    private int idImagen;
    private String titulo;

    public Menu()
    {
        idImagen=0;
        titulo="";
    }

    public Menu(int idImagen, String titulo){

        this.idImagen=idImagen;
        this.titulo=titulo;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Menu>listaMenu() {

        Menu menu;
        ArrayList<Menu> lista = new ArrayList<Menu>();

        Integer[] IdImagenes = new Integer[]{R.drawable.imagen2, R.drawable.imagen3, R.drawable.imagen4};
        String[] titulos = new String[]{"Foto Thiago", "Foto cumpleaños", "Foto setimo mes"};

        for (int i = 0; i < IdImagenes.length; i++) {
            menu = new Menu(IdImagenes[i], titulos[i]);

            lista.add(menu);
        }
        return lista;
    }
}
