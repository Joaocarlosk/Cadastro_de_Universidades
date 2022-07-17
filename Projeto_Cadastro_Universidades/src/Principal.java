import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner le = new Scanner(System.in);
        int ind, opcao, qA, qP, flag=0; 
        Universidade []u;
        String n, e, c;
        double vM;
        System.out.print("Quantas Universidades você quer criar? ");
        ind = le.nextInt();
        u = new Universidade[ind];

        for(int i=0; i<u.length; i++){
            do{
                System.out.println("\nQual o tipo de Universidade você gostaria de cadastrar? ");
                System.out.println("Digite a opção desejada: ");
                System.out.println("1- Pública\n2- Privada");
                opcao = le.nextInt();
                le.nextLine();
                if(opcao==1){
                    System.out.print("Nome: ");
                    n = le.nextLine();
                    System.out.print("Quantidade de alunos: ");
                    qA = le.nextInt();
                    System.out.print("Quantidade de professores: ");
                    qP = le.nextInt();
                    le.nextLine();
                    System.out.print("Estado: ");
                    e = le.nextLine();
                    System.out.print("Cidade: ");
                    c = le.nextLine();
                    u[i] = new Publica(n, qA, qP, e, c);
                }else if(opcao==2){
                    System.out.print("Nome: ");
                    n = le.nextLine();
                    System.out.print("Quantidade de alunos: ");
                    qA = le.nextInt();
                    System.out.print("Quantidade de professores: ");
                    qP = le.nextInt();
                    System.out.print("Valor da mensalidade: ");
                    vM = le.nextDouble();
                    u[i] = new Privada(n, qA, qP, vM);
                }else{
                    System.out.println("Opção Inválida!");
                }
            }while(opcao!=1 && opcao!=2);
        }
        System.out.println();
        MEC m = new MEC();        
        m.imprimeUniversidades(u);  
        m.maisCara(u);
        m.universidadesDoSul(u);   
    }
}