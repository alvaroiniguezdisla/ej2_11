package dominio;

public class ej2_11 {
    public static int pescalar(int[]lista1,int[]lista2,int i) {
        if(i<0) {
            return 0;
        }else {
            return (lista1[i]*lista2[i])+pescalar(lista1,lista2,i-1);
        }
    }
}
