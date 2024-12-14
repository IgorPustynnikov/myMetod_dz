public class Main {
    //    public static int length(char[] arr));
//    Описание: Метод возвращает длину массива символов arr.
//    Считает количество символов в массиве arr и возвращает это значение.
    public static int mylength(char[] arr) {
        return arr.length;
    }

//    public static char charAt(int index);
//    Описание:
//    Метод возвращает символ, находящийся по указанному индексу в массиве.
//    Берет массив символов и индекс index, проверяет, существует ли символ на этом месте. Если индекс корректен, возвращает символ.
public static char[] mycharAt(char[]arr,int index){
    System.out.println(arr[index]);
        return null;
}

    //    public static int indexOf(char simvol);
//    Описание:
//    Метод возвращает индекс первого вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//    Проходит по массиву слева направо, ищет первый символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.
    public static int myindexOf(char[]arr,char simvol){
        int nomer=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==simvol){
                nomer=i;
                break;
            }
            else{
                nomer=-1;
                continue;
            }
        }
        return nomer;
    }

//
//    public static int lastIndexOf(char simvol);
//    Описание:
//    Метод возвращает индекс последнего вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//    Проходит по массиву справа налево, ищет последний символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.
public static int mylastIndexOf(char[]arr,char simvol){
    int nomer=0;
    for (int i = arr.length-1; i >=0; i--) {
        if (arr[i]==simvol){
            nomer=i;
            break;
        }
        else{
            nomer=-1;
            continue;
        }
    }
    return nomer;
}



//    public static char[] toUpperCase(char[] arr) ;
//    Описание:
//    Метод возвращает новый массив символов, где все буквы преобразованы в верхний регистр.
//    Для каждой буквы в массиве проверяет, является ли она строчной (например, a-z). Если да, то заменяет её на соответствующую заглавную (например, A-Z).
//    Если символ не является буквой, он остается неизменным.
public static char[] mytoUpperCase(char[] arr){
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>=97 && arr[i]<=122){
            arr[i]= (char) (arr[i]-32);
        }
            }
    return arr;
}



    //    public static char[] toLowerCase(char[] arr) ;
//    Описание:
//    Метод возвращает новый массив символов, где все буквы преобразованы в нижний регистр.
//    Для каждой буквы в массиве проверяет, является ли она заглавной (например, A-Z). Если да, то заменяет её на соответствующую строчную (например, a-z).
//    Если символ не является буквой, он остается неизменным.
    public static char[] myLowerCase(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=65 && arr[i]<=90){
                arr[i]= (char) (arr[i]+32);
            }
        }
        return arr;
    }


//    public static char[] trim(char[] arr );
//    Метод возвращает новый массив символов, из которого удалены начальные и конечные пробелы.
//    Удаляет все пробелы (символы ' ') с начала и конца массива.
//    Пробелы внутри строки остаются неизменными.
    public static char[] mytrim(char[] arr) {
        int spaseL=0;
        int spaseR=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                spaseL++;
            } else {
                break;
            }
        }
            for (int j = arr.length-1; j>=0 ; j--) {
                if (arr[j] == ' ') {
                    spaseR++;
                }
                else {
                    break;
                }
            }
        char[] arr2=new char[arr.length-spaseL-spaseR];
        for (int i = spaseL,j=0 ; i <arr.length-spaseR ; i++,j++) {
            arr2[j] = arr[i];
        }
            return arr2;
        }

    public static void main(String[] args) {
      char[] arr={' ',' ', 'P','u','s','t','y','n','n','i','k','o','v',' '};
      String str="    Igor   Pustynnikov   ";
      char[] arr2=str.toCharArray();
        System.out.println(mylength(arr));
        mycharAt(arr,5);
        System.out.println(myindexOf(arr,'s'));
        System.out.println(mylastIndexOf(arr,'n'));
        System.out.println(mytrim(arr2));
        System.out.println(mytoUpperCase(arr));
        System.out.println(myLowerCase(arr));
    }
  }