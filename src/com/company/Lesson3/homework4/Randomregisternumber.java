package com.company.Lesson3.homework4;

/**
 * Created by 123 on 24.03.2017.
 */
public class Randomregisternumber {

    private char[] letters = {'А',  'В', 'Е',  'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'X', 'У'};

    private String[] codesOfRegions = {"1","02","102","3","4","5","6","7","8","9","10",
            "11","12","13","113","14","15","16","116","17","18","19","20","21","121",
            "22","23","93","24","84","88","124","25","125","26","27","28","29","30",
            "31","32","33","34","35","36","37","38","85","138","39","91","40","41","82",
            "42","43","44","45","46","47","48","49","50","90","150","190","51","52","152","53","54","154",
            "55","56","57","58","59","81","159","60","61","161","62","63","163","64","164","65","66","96",
            "67","68","69","70","71","72","73","173","74","174","75","80","76","77","97","99","177","199",
            "197","78","98","198","79","83","86","87","89","92","94","95"};

    private int series;
    private String code;
    private char letter;
    private long countUniqueAutoNumbers;
    private String randomizeRegisterNumber1;

    public void randomizeRegisterNumber () {

        this.letter = letters[(int)(Math.random()*letters.length)];
        this.code =  codesOfRegions[(int)(Math.random()*codesOfRegions.length)];
        this.series = (int)(Math.random()*1000);
        int counter = capacity(series);
        char[] letters2 = {letters[(int)(Math.random()*letters.length)], letters[(int)(Math.random()*letters.length)]};
        String str = new String(letters2);
        String randomnumber;
        switch (counter) {

            case 1:
                randomnumber = letter + " " + "00" + String.valueOf(series) + " " + str + " " + code;
                break;
            case 2:
                randomnumber = letter + " " + "0" + String.valueOf(series) + " " + str + " " + code;
                break;
                default:
                    randomnumber = letter + " " + String.valueOf(series) + " " + str + " " + code;
                    break;
        }
        System.out.println(randomnumber);

    }

    private static int capacity (int n) {
        int counter = 0;
        if (n / 10 == 0) {
            counter = 1;
            /*System.out.println("Введенное число " + counter + "-х значное");*/
            return counter;
        } else {
            do {

                n = n / 10;
                counter++;
                /*System.out.println("counter = " + counter);
                System.out.println("n = " + n);*/
            } while (n / 10 != 0);
        }

        counter = counter + 1;
        /*System.out.println("Введенное число " + counter + "-х значное");*/
        return counter;
    }

  public  void setCountUniqueAutoNumbers() {

        for(int a = 0; a<letters.length; a++) {
            if (countUniqueAutoNumbers == 100)
                break;
                for (int b = 1; b < 999; b++) {
                    for (int c = 0; c < letters.length; c++) {
                        for (int d = 0; d < letters.length; d++) {
                            for (int e = 0; e < codesOfRegions.length; e++) {
                                countUniqueAutoNumbers++;

                            }
                        }

                    }
                }
            }



String[] randomAutoNumbers = new String[(int)countUniqueAutoNumbers];
int k = 0;
int counter;
      for(int a = 0; a<letters.length; a++) {
          for (int b = 1; b < 999; b++) {
              for (int c = 0; c < letters.length; c++) {
                  for (int d = 0; d < letters.length; d++) {
                      for (int e = 0; e < codesOfRegions.length; e++) {

                         counter = capacity(b);
                          switch (counter) {

                              case 1:

                                      randomAutoNumbers[k] = " " + letters[a] + " " + "00" + String.valueOf(b) + " " + letters[c] + letters[b]
                                              + " " + codesOfRegions[e];

                                      k++;

                                  break;
                              case 2:
                                  randomAutoNumbers[k] = " " + letters[a] + " "+ "0" + String.valueOf(b) + " " +letters[c] + letters[b]
                                          + " " + codesOfRegions[e];
                                  k++;
                                  break;
                              default:
                                  randomAutoNumbers[k] = " " + letters[a] + " " + String.valueOf(b) + " " +letters[c] + letters[b]
                                          + " " + codesOfRegions[e];
                                  k++;
                                  break;
                          }

                      }
                  }
              }
          }
      }

      for (int i =0; i<randomAutoNumbers.length; i++ ) {

          System.out.println(randomAutoNumbers[i]);
      }



  }




}
