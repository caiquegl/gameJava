
package views;

import Classes.GetUsuario;
import java.util.Random;

public class main {
    public static int quantJogada = 0;
    public static int acertos = 0;
    public static float porcento = 0;
    
    
    public void reset(){
        quantJogada = 0;
        acertos = 0;
        porcento = 0;
    }
    
    public int addJogada(int x){
        int total = quantJogada;

        return quantJogada = total + x;
    }
    
    public int acertos(int x){
        int total = acertos;
        return acertos = total + x;
    }
    
    public float media(){
        float totalMedia;
        
        if(quantJogada == 0){
            totalMedia = 0;
        }else{
        totalMedia = (acertos * 100) / quantJogada;
        porcento = totalMedia;
        }
        System.out.println(quantJogada);
        System.out.println(acertos);
        System.out.println(porcento);
        return totalMedia;
    }
    
    public static void main(String[] args){
        Random random = new Random();
        int tipoQuestao = random.nextInt(4);
        int aula = random.nextInt(4);
        
        

        Splash Tela = new Splash();
        
        Tela.setVisible(true);
        


    }
    
    public int numeroRandomType(){
            Random random = new Random();
            int numero = random.nextInt(3);

    return numero;
       
   }
    
    public int numeroRandomQuestion(){
            Random random = new Random();
            int numero = random.nextInt(3);

    return numero;
       
   }
    

    public String exHtml(int x, int z){
        String html[][] = { 
            {"Insira uma quebra linha", "c <br />" , "a <select>", "b <br>", "c <br />", "d <hr>"}, 
            {"A tag semântica <figure> é usada para que ?","d Especificar conteúdo autossuficiente, como ilustrações, fotos e diagramas.", "a Alterar o espaçamento das colunas, mediante um novo objeto.", "b Acrescentar uma área de inserção apenas para tabelas de dados.", "c Inserir uma imagem de forma dinâmica na página web, sem uso de JavaScript.", "d Especificar conteúdo autossuficiente, como ilustrações, fotos e diagramas."},
            {"HTML é uma linguagem de...", "a Formatação", "a Formatação", "b Programação", "c Informação", "d Criação"},
            {"Quando o programador deseja aplicar uma formatação na tag, esse processo é chamado de estilo...", "a In-Line", "a In-Line", "b CSS", "c Incorporado", "d In-Tag"},
            {"A tag para adição do estilo CSS fica entre que tags?", "d </title></head>", "a <body></body>", "b <html></title>", "c <head></head>", "d </title></head>"},
        };
       return html[x][z];
       
   }
   
    public String exCss(int x, int z){
        String css[][] = { 
            {"Qual é a propriedade do CSS que estabelece o raio da borda inferior esquerda do box?", "c border-bottom-left-radius" , "a border-top-left-radius", "b border-bottom-right-radius", "c border-bottom-left-radius", "d border-radius"}, 
            {"Qual a alternativa que corresponde à propriedade CSS que é utilizada para aplicar uma cor de fundo em um determinado elemento HTML?","a color", "a color", "b border-color", "c Backcolor", "d Display-color"},
            {"Qual das alternativas a seguir indica a sintaxe correta para a formatação de um elemento HTML através de uma classe CSS.", "c .classe{ propriedade : valor; }", "a %classe{ propriedade : valor; }", "b $classe{ propriedade : valor; }", "c .classe{ propriedade : valor; }", "d #classe{ propriedade : valor; }"},
            {"Qual a alternativa que indica a propriedade que define uma fonte para um elemento da página.", "a font-family", "a font-family", "b font-size", "c text-style", "d text-decoration"},
            {"Ao se utilizar o css, cada declaração contém uma propriedade e um valor separados por:", "c dois pontos (:)", "a um simples ponto (.)", "b duas barras (//)", "c dois pontos (:)", "d duas barras verticais (||)"},
        };
    return css[x][z];
       
   }
    
    public String exPhp(int x, int z){
        String php[][] = { 
            {"Qual dos seguintes NÃO é um operador de comparação válido de PHP?", "a <=>" , "a <=>", "b >=", "c !=", "d <>"}, 
            {"Qual comando abre o shell interativo do PHP na interface da linha de comando?","a php -a", "a php -a", "b php artisian", "c php _run", "d php -int"},
            {"Qual dos métodos a seguir pode ser usado para criar um banco de dados MySql usando PHP?", "b mysql_query()", "a mysql_connect()", "b mysql_query()", "c mysql_create()", "d mysql_close()"},
            {"Qual dos seguintes métodos de classe Exception retorna string formatada de trace?", "d  getTraceAsString()", "a getTrace()", "b getMessage()", "c getString()", "d  getTraceAsString()"},
            {"Qual dos seguintes tipos de variáveis ​​são números inteiros, sem um ponto decimal, como 4195?", "c Integers", "a Doubles", "b Booleans", "c Integers", "d Strings"},
        };
    return php[x][z];
       
   }
    
    public String exJava(int x, int z){
        String java[][] = { 
            {"O que significa a sigla API?", "c Applications Programming Interface" , "a Applications Per Interface", "b Applications Programming Inteconection", "c Applications Programming Interface", "d Applications Paralelo Internal"}, 
            {"Em linguagens orientadas a objetos, os conceitos de ligação tardia e sobrecarga de métodos referem-se a:","c Polimorfismo", "a Herança", "b Objetos", "c Polimorfismo", "d Encapsulamento"},
            {"O que é gerado pelo compilador Java?", "a Bytecodes", "a Bytecodes", "b Binário interpretado", "c Booleano", "d Linguagem natural"},
            {"Em POO (Programação Orientada a Objetos), dizer que a classe A estende a classe B é o mesmo que dizer que:", "c  a classe A é derivada de B;", "a a classe B é subclasse de A;", "b a classe A é superclasse de B;", "c a classe A é derivada de B;", "d  as classes A e B são irmãs."},
            {"Classes que encapsulam os tipos primitivos como objetos, agregando funcionalidades de conversão, são as chamadas, especificamente, classes:", "e wrappers", "a mothers", "b abstratas", "c primitivas", "d wrappers"},
        };
    return java[x][z];
       
   }
    
   

}
