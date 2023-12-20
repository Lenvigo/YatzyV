public class Yatzy {

    public static int chance(int... dice) {
        int total = 0;
        for (int die : dice) {
            total += die;
        }
        return total;
    }


    public static int yatzy(int... dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }
        for (int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }


    public static int ones(int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 1) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int twos(int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 2) {
                sum += 2;
            }
        }
        return sum;
    }


    public static int threes(int ...dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 3) {
                sum += 3;
            }
        }
        return sum;
    }

    protected int[] dice;
    public Yatzy(int d1, int d2, int d3, int d4, int d5)
    {
        dice = new int[]{d1, d2, d3, d4, d5};
    }

    public static int fours(int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 4) {
                sum += 4;
            }
        }
        return sum;
    }


    public static int fives(int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 5) {
                sum += 5;
            }
        }
        return sum;
    }

    public static int sixs (int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == 6) {
                sum += 6;
            }
        }
        return sum;
    }

    public static int scorePair(int... dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }

        for (int value = 6; value >= 1; value--) {
            if (counts[value - 1] >= 2) {
                return value * 2;
            }
        }
        return 0;
    }


    public static int twoPair(int... dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }

        int pairsFound = 0;
        int score = 0;

        for (int value = 6; value >= 1; value--) {
            if (counts[value - 1] >= 2) {
                pairsFound++;
                score += value;
            }
        }

        return (pairsFound == 2) ? score * 2 : 0;
    }


    public static int fourOfAKind(int... dice) {
        int[] tallies = new int[6];

        for (int die : dice) {
            tallies[die - 1]++;
        }

        for (int value = 1; value <= 6; value++) {
            if (tallies[value - 1] >= 4) {
                return value * 4;
            }
        }

        return 0;
    }


    public static int threeOfAKind(int... dice) {
        int[] tallies = new int[6];

        for (int die : dice) {
            tallies[die - 1]++;
        }

        for (int value = 1; value <= 6; value++) {
            if (tallies[value - 1] >= 3) {
                return value * 3;
            }
        }

        return 0;
    }



    public static int smallStraight(int... dice) {
        int[] tallies = countOccurrences(dice);

        for (int i = 0; i < 5; i++) {
            if (tallies[i] != 1) {
                return 0;
            }
        }

        return 15;
    }
// funcion auxiliar de conteo de frecuencia
    private static int[] countOccurrences(int... dice) {
        int[] tallies = new int[6];
        for (int die : dice) {
            tallies[die - 1]++;
        }
        return tallies;
    }


    public static int largeStraight(int... dice) {
        int[] tallies = countOccurrences(dice);

        for (int i = 1; i <= 5; i++) {
            if (tallies[i] != 1) {
                return 0;
            }
        }

        return 20;
    }

    public static int fullHouse(int... dice) {
        int[] tallies = countOccurrences(dice);
        int pairValue = 0;
        int threeOfAKindValue = 0;

        for (int i = 0; i < 6; i++) {
            if (tallies[i] == 2) {
                pairValue = (i + 1) * 2;
            } else if (tallies[i] == 3) {
                threeOfAKindValue = (i + 1) * 3;
            }
        }

        return (pairValue > 0 && threeOfAKindValue > 0) ? pairValue + threeOfAKindValue : 0;
    }}