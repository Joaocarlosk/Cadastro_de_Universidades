public class MEC {
    public void imprimeUniversidades(Universidade uni[]){
        for(int i=0; i<uni.length; i++){
            if (uni[i] instanceof Publica){
                System.out.println("===== Informações da Universidade "+i+" =====");
                System.out.println("Tipo: Pública");                
                ((Publica)uni[i]).imprimeInfo();
                System.out.println();
            }else if (uni[i] instanceof Privada){
                System.out.println("===== Informações da Universidade "+i+" =====");
                System.out.println("Tipo: Privada");
                ((Privada)uni[i]).imprimeInfo();
                System.out.println();
            }
        }       
    }

    public void maisCara(Universidade[] uni){
        double valor=0;
        int flag=0;
        boolean localizou=false;
        System.out.println("===== Informações da Universidade Privada mais cara =====");
        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Privada && valor < ((Privada)uni[i]).getValorMensalidade()){
                valor = ((Privada)uni[i]).getValorMensalidade();
                flag = i;
                localizou=true;
            }
        }    
        if(localizou==true){            
            ((Privada)uni[flag]).imprimeInfo();
        }else{
            System.out.println("Não há Universidade Privada cadastrada!");
        }
    }
    

    public void universidadesDoSul(Universidade[] uni){
        System.out.println();
        int flag = 0;
        System.out.println("===== Informações das Universidades Públicas do sul do Brasil =====");
        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Publica) 
            if(((Publica)uni[i]).getEstado().equalsIgnoreCase("PR")||((Publica)uni[i]).getEstado().equalsIgnoreCase("SC")||((Publica)uni[i]).getEstado().equalsIgnoreCase("RS")){
                ((Publica)uni[i]).imprimeInfo();
                System.out.println();
                flag = 1; 
            }          
        }
        if(flag==0){
            System.out.println("Não há Universidades públicas cadastradas no sul do Brasil");
        }        
    }
}

  