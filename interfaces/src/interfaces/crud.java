package interfaces;

import java.util.ArrayList;

import classes.Categoria;
import classes.Produto;

public interface crud {
  public void add();
  public ArrayList<Categoria> list();
  public ArrayList<Produto> lista();
  public void update();
  public void delete();
  
}
