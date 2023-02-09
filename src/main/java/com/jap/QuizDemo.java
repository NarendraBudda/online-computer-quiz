package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
      int highScore=0;
      String highScoreSchool=nameOfSchool[0];
      try {
          for(int i=0;i<nameOfSchool.length;i++){
              int score= Integer.parseInt(scores[i]);
              if(score>highScore){
                  highScore=score;
                  highScoreSchool=nameOfSchool[i];

              }
          }
      } catch (NumberFormatException exception) {
          return exception.toString();
      }




        return highScoreSchool;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public  String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new  String[name.length];
        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
        } catch (NullPointerException exception) {
            return new String[]{exception.toString()};
        }

        return upperCase;
    }
    public static void main(String args[]){
        QuizDemo quizDemo=new QuizDemo();
        String nameOfSchools[]={"DAV","RSK","Treamis","Candor","Oak","UAV","BCGS","BCBS","Baldwin","NPS"};
        String scores[]={"86","78","95","6","44","33","82","77","8","90"};

        System.out.println("high score school name "+quizDemo.highestScore(nameOfSchools,scores));

        String nameOfSchools1[]={"DAV","RSK","Treamis","Candor","Oak","UAV","BCGS","BCBS","Baldwin","NPS"};
        String scores1[]={"86","78","95","6","Forty-four","33","82","77","8","90"};
        System.out.println("high score school name which score given in word "+quizDemo.highestScore(nameOfSchools1,scores1));

        String nameOfSchools2[]={"DAV","RSK",null,"Candor","Oak","UAV","BCGS","BCBS","Baldwin","NPS"};
        String schoolUpperCase[]=quizDemo.convertAllNamesToCapital(nameOfSchools2);
        for (int i=0;i<schoolUpperCase.length;i++){
            System.out.println(schoolUpperCase[i]);
        }


    }
}






