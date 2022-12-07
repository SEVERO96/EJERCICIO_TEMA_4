public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------Condicion If---------");
        condicionIf(1);
        System.out.println("--------bucle while---------");
        bucleWhile(0);
        System.out.println("-------- bucle Do While-----------");
        bucleDoWhile(4);
        System.out.println("-------- bucle For-----------");
        bucleFor(0);
        System.out.println("-------- switch-----------");
        condicionSwitch("invierno");

    }
    
    public static void condicionIf(int a){
        if (a >= 1){
            System.out.println("Es Positivo");
        } else  
            System.out.println("Es Negativo");
    }
    public static void bucleWhile(int numeroWhile){
        while ( numeroWhile <= 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
    }
    public static void bucleDoWhile(int numeroDoWhile){
        do{
            System.out.println(numeroDoWhile);
        } while(numeroDoWhile <= 3);
    }
    public static void bucleFor(int numeroFor){
        for (int contador = numeroFor; contador <= 3; contador = contador + 1){
            System.out.println(contador);
        }
    }
    public static void condicionSwitch(String a){
        switch(a){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "primavera":
                System.out.println("Es primera");
                break;
            default:
            System.out.println("ninguna estacion");    
        }
    }
}
