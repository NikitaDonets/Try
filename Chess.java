/*
public class Cell {
	
	public abstract void passibleMove(int[] a);
	
}

public class Pawn extends Figure {
	@Override
	public void passibleMove(int[] a){
		int[][] array = {{0, 1}, {-1, 1}, {1, 1}};
		int[] passible = {0, 0, 0};
		
	}
}


public class Chess{
	public static void main(String[] args) {
        	System.out.println("Hello вася");
        }
}
*/

class SimpleChess {
	static Cells[] Cell = new Cells[256];
	
	public static void main (String[] args){
		/*"Заполняем пустые поля вне поля"*/
		for (int i=0; i<68; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=188; i<256; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=76; i<84; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=92; i<100; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=108; i<116; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=124; i<132; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=140; i<148; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=156; i<164; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		for (int i=172; i<180; i++){
			Cell[i] = new Cells(0, 0, 0, 0);
		}
		/*Заполняем пустые поля в поле*/
		for (int i=100; i<108; i++){
			Cell[i] = new Cells(1, 0, 0, 0);
		}
		for (int i=116; i<124; i++){
			Cell[i] = new Cells(1, 0, 0, 0);
		}
		for (int i=132; i<140; i++){
			Cell[i] = new Cells(1, 0, 0, 0);
		}
		for (int i=148; i<156; i++){
			Cell[i] = new Cells(1, 0, 0, 0);
		}
		/*Заполняем пешки двух цветов*/
		int j = 8;
		for (int i=84; i<92; i++){
			Cell[i] = new Cells(1, 1, 6, j);
			j++;
		}
		j = 8;
		for (int i=164; i<172; i++){
			Cell[i] = new Cells(1, 2, 6, j);
			j++;
		}
		/*Заполняем оставшиеся фигуры белых*/
		Cell[68] = new Cells(1, 1, 5, 6);
		Cell[69] = new Cells(1, 1, 4, 4);
		Cell[70] = new Cells(1, 1, 3, 2);
		Cell[71] = new Cells(1, 1, 2, 1);
		Cell[72] = new Cells(1, 1, 1, 0);
		Cell[73] = new Cells(1, 1, 3, 3);
		Cell[74] = new Cells(1, 1, 4, 5);
		Cell[75] = new Cells(1, 1, 5, 7);
		/*Заполняем оставшиеся фигуры черных*/
		Cell[180] = new Cells(1, 2, 5, 6);
		Cell[181] = new Cells(1, 2, 4, 4);
		Cell[182] = new Cells(1, 2, 3, 2);
		Cell[183] = new Cells(1, 2, 2, 1);
		Cell[184] = new Cells(1, 2, 1, 0);
		Cell[185] = new Cells(1, 2, 3, 3);
		Cell[186] = new Cells(1, 2, 4, 5);
		Cell[187] = new Cells(1, 2, 5, 7);
		System.out.println("# \t In space \t Color \t Type \t Index");
		for (int i=0; i<256; i++){
			System.out.println(i+"\t"+Cell[i].space+"\t"+Cell[i].color+"\t"+Cell[i].type+"\t"+Cell[i].index);
		}
	}
}

class Cells{
	int color,type,index, space;
	
	public Cells (int space,int color,int type,int index){
		this.space = space;
		this.color = color;
		this.type = type;
		this.index = index;
	}
}