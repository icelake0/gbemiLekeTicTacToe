package gbemiLekeTicTacToe;
public class Player {   
    private String name;
    private int score, playerId;
    public static int currentPlayer=1;
    public static int[]whoWines=new int[9];
    public Player(){
        score=0;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setScore(int score){
        this.score=score;
    }
     public int getplayerId(){
        return playerId;
    }
    
    public void sePlayerId(int playerId){
        this.playerId=playerId;
    }
    public static void UpdateCurrentPlayer(){
            if(currentPlayer==1) currentPlayer++;
            else  currentPlayer--;
    }
    public static void updateWhowins(int player, int point){
    if(player==1)
        whoWines[point]=1;
    else whoWines[point]=2;        
    }
    public static int checkWhoWins(){
        if(whoWines[0]==whoWines[4]&&whoWines[4]==whoWines[8]) return whoWines[4];
       else if(whoWines[2]==whoWines[4]&&whoWines[4]==whoWines[6]) return whoWines[4];
       else if(whoWines[1]==whoWines[4]&&whoWines[4]==whoWines[7]) return whoWines[4];
       else if(whoWines[3]==whoWines[4]&&whoWines[4]==whoWines[5]) return whoWines[4];
       else if(whoWines[3]==whoWines[0]&&whoWines[0]==whoWines[6]) return whoWines[0];
       else if(whoWines[1]==whoWines[0]&&whoWines[0]==whoWines[2]) return whoWines[0];
       else if(whoWines[2]==whoWines[8]&&whoWines[8]==whoWines[5]) return whoWines[8];
       else if(whoWines[6]==whoWines[8]&&whoWines[8]==whoWines[7]) return whoWines[8];
       else return 0;
        
    }
    
}
