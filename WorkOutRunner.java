class WorkOutRunner{

public static void main(String[] out){

WorkOut work = (startTime)->{
int durationInMinutes = 25;

if (durationInMinutes >= 30) {
    System.out.println("Great job! You've completed a full workout session.");
} else {
    System.out.println("Keep going! You need at least 30 minutes to complete your session.");
}


};

work.startWorkout("High");
}
}