package ru.geekbrains.guess_the_number;

public class Main<i> {

    public static void main(String[] args) {
	int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
	int j;
        System.out.print("Задача 1. ");
	for (j=0; j<10; j++){

	    if(array[j]>0){
	        array[j]=0;
        }else{
	        array[j]=1;
        }
        System.out.print(array[j]);
    }
	Task2();
	Task3();
	Task4();
	Task5();
	//Если можно я тогда позже скину решение 6 и 7 задачи
	/*//Задача 6.........................................................................................................
	int[] ArrayForTask6 = {1,2,2,3,5,10,2};
	int iterator;
	for(iterator=0; iterator<5; iterator++){  //я просто не понял как в метод положить массив
	    Task6(ArrayForTask6[iterator]);
    }

	//.................................................................................................................*/
    }
    public static void Task2(){
        int[] array = new int[8];
        int j;
        System.out.print("\nЗадача 2. "+array[0]+" ");
        for (j=1; j<array.length; j++){
           array[j]=array[j-1]+3;
           System.out.print(array[j]+" ");
        }

    }
    public static void Task3(){
        int[] array={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int j;
        System.out.print("\nЗадача 3. ");
        for(j=0; j<12; j++ ){
            if (array[j]<6){
                array[j]=array[j]*2;
            }
            System.out.print(array[j]+" ");
        }
    }
    public static void Task4(){                        //не совсем понял что такое диагональные элементы) поэтому заполнил главную диагональ
        int[][] array = new int[8][8];
        System.out.print("\nЗадача 4. \n");
        int i;
        int j;
        for (i=0; i<array.length; i++){
            for (j=0; j<array[i].length; j++) {
                if(i==j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
    public static void Task5(){
        int[] array= {-1,1,5,10};
        int max=array[0],min=array[0];
        int i;
        System.out.print("Задача 5. ");
        for ( i=0; i<array.length; i++) {
            if (min>max){
                min=max;
            }else{
                max=array[i];
            }
        }
        System.out.print("Ваш максимум "+ max);
        System.out.print(" Ваш минимум "+ min);
    }
    /*public static void Task6(int ArrayForTask6){
        ArrayForTask6=ArrayForTask6+ArrayForTask6;
        System.out.println("Задача 6. "+ArrayForTask6);
    }*/


}
