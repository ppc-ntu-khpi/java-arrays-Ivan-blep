package domain;

public class Exercise {
    public static float Calculate(int R){
        int [] allt = new int[R];//Кількість техніки
        int [] numb = new int[6];//Масив для розбивання чисел на цифри
        int result = 0;
        for(int i = 0; i<allt.length; i++){//Заповнює масив з технікою
            allt[i]=i+1;
            for (int k = 0; k < numb.length; k++) {//Розбиває число на цифри
            numb[k] = allt[i] % 10;
            allt[i] = allt[i] / 10;
            if(numb[k]==4){//Перевіряє число на наявність цифри 4
                result++;
                break;
                }
            else if(numb[k]==1){//Перевіряє число на наявність цифри 13
                if(numb.length-1==k){break;}
                else if(numb[k+1]==3){
                result++;
                break;
                }
            }
            }
        }
        
        
        return result;
    }
}

