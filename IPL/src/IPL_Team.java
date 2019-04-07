import java.util.ArrayList;

public class IPL_Team {
    String team_name,WicketKeeper,allrounder,caption;
    IPL_Team(String team_name,String WicketKeeper,String allrounder,String caption){
      this.team_name=team_name;
      this.WicketKeeper=WicketKeeper;
      this.allrounder=allrounder;
      this.caption=caption;
    }
    IPL_Team(){
        
    }
    class Player{
        String playerName;
        float Price;
        Player(String playerName,float price){
            playerName=this.playerName;
            price=this.Price;

        }

    }

    public static void main(String[] args) {
        ArrayList<IPL_Team> teams=new ArrayList<IPL_Team>();
        IPL_Team t1=new IPL_Team("A","Dhoni","ABC","MS");
        IPL_Team t2=new IPL_Team("B","Kohli","ACB","Virat");
        IPL_Team t3=new IPL_Team("C","Sharma","robin","Rohit");
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
        ArrayList<Player> players =new ArrayList<>();
        IPL_Team t=new IPL_Team();
        IPL_Team.Player p1=t.new Player("Dhoni",20.5f);
        IPL_Team.Player p2=t.new Player("Kohli",20.1f);
        IPL_Team.Player p3=t.new Player("Rohit",19.5f);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        for (Player p:players
             ) {
            System.out.println("Player name is "+p.playerName+" "+"Price of player is "+p.Price);
        }
    }
    



}
