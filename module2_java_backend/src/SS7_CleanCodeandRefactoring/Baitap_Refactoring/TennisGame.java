package SS7_CleanCodeandRefactoring.Baitap_Refactoring;

public class TennisGame {

    public static final String PERFORMSCORE = "-";

    public static String getScore(String player1Name, String player2Name, int miniFirstScore, int miniSecondScore) {
        String score = "";
        int tempScore=0;
        if (miniFirstScore==miniSecondScore)
        {
            switch (miniFirstScore)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (miniFirstScore>=4 || miniSecondScore>=4)
        {
            int minusResult = miniFirstScore-miniSecondScore;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = miniFirstScore;
                else { score+= PERFORMSCORE; tempScore = miniSecondScore;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
