
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
		/*
		System.out.println("# \t In space \t Color \t Type \t Index");
		for (int i=0; i<256; i++){
			System.out.println(i+"\t"+Cell[i].space+"\t"+Cell[i].color+"\t"+Cell[i].type+"\t"+Cell[i].index);
		}
		*/
		/*Заполняем массив с индексами*/
		int[][] positionfigures = new int[2][16];
		positionfigures[0][0] = 72;
		positionfigures[0][1] = 71;
		positionfigures[0][2] = 70;
		positionfigures[0][3] = 73;
		positionfigures[0][4] = 69;
		positionfigures[0][5] = 74;
		positionfigures[0][6] = 68;
		positionfigures[0][7] = 75;
		positionfigures[0][8] = 84;
		positionfigures[0][9] = 85;
		positionfigures[0][10] = 86;
		positionfigures[0][11] = 87;
		positionfigures[0][12] = 88;
		positionfigures[0][13] = 89;
		positionfigures[0][14] = 90;
		positionfigures[0][15] = 91;
		
		positionfigures[1][0] = 184;
		positionfigures[1][1] = 183;
		positionfigures[1][2] = 182;
		positionfigures[1][3] = 185;
		positionfigures[1][4] = 181;
		positionfigures[1][5] = 186;
		positionfigures[1][6] = 180;
		positionfigures[1][7] = 187;
		positionfigures[1][8] = 164;
		positionfigures[1][9] = 165;
		positionfigures[1][10] = 166;
		positionfigures[1][11] = 167;
		positionfigures[1][12] = 168;
		positionfigures[1][13] = 169;
		positionfigures[1][14] = 170;
		positionfigures[1][15] = 171;
		
		/*проверка king*/
		Figure test = new King();
		test.passibleMove(Cell, 85);
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

abstract class Figure {
	
	abstract void passibleMove(Cells[] a, int b);
	
}

class King extends Figure {
	@Override
	void passibleMove(Cells[] a, int b){
		int[] array = {-17, -16, -15, -1, 1, 15, 16, 17};
		int c, j=0;
		for (int i=0; i<8;i++){
			c = b + array[i];
			if (a[c].space == 1){
				if (a[c].color != a[b].color){
					j++;
					System.out.println(c);
				}
			}
		}
	}
}

/*public class Queen extends Figure {
	@Override
	public void passibleMove(int[] a){
		int[][] array = {{0, 1}, {-1, 1}, {1, 1}};
		int[] passible = {0, 0, 0};
		
	}
}
*/