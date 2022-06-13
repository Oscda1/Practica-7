public class Practica5{
    public static void main(String[] args)
    {
    Blue blue = new Blue();
    Chuck chuck = new Chuck();
    Matilda matilda = new Matilda();
    int opcion;
    
    boolean salir=false;
        do{
            System.out.println("Que opcion quiere usar?");
            System.out.println("1: Blue\n2: Chuck\n3: Matilda\n4:Salir");
            opcion=Integer.parseInt(System.console().readLine());
            switch(opcion) {
                case 1:
                    blue.Lanzamiento();
                    blue.Dividir();
                    break;
                case 2:
                    chuck.Lanzamiento();
                    chuck.Acelerar();
                    break;
                case 3:
                    Matilda.Lanzamiento();
                    Matilda.Proyectil();
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        }while(salir==false);
    }
}