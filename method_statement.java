package udemy;

public class method_statement {
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your high Score is " + highScore);
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your high Score is " + highScore);
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Umesh", highScorePosition);
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Bob", highScorePosition);

	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Youre Final Score is " + finalScore);
			return finalScore;
		}

		return -1;

	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out
				.println(playerName + " manage to get the position " + highScorePosition + " on the high Score table.");

	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore > 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore <= 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore <= 500) {
			return 3;
		} else {
			return 4;
		}

	}

}
