public class Escalacao{

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    private Jogador jogador5;
    private Time time;
    
    private Escalacao(){
        time = new Time();
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        jogador3 = new Jogador();
        jogador4 = new Jogador();
        jogador5 = new Jogador();
    }


    public void Imprimir()
    {
        System.out.println( "Time:" + time.getNome() );
        System.out.println( "-------------------------" );
        System.out.println( "1-" + jogador1.getNome() );
        System.out.println( "2-" + jogador2.getNome() );
        System.out.println( "3-" + jogador3.getNome() );
        System.out.println( "4-" + jogador4.getNome() );
        System.out.println( "5-" + jogador5.getNome() );
    }   

}
