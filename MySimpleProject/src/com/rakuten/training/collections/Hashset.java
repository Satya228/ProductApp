5. Create a List of random words of random lengths. Sort the words alphabetically and display them.
Sort the words based on the length of the words and display them.


class SortByLen implements Comparator<String> {
  public int compare(String a, String b) {
    return a.length() - b.length();
  }
}

public class RandomWords {

  public static String[] generateRandomWords(int numberOfWords) {
    String[] randomStrings = new String[numberOfWords];
    Random random = new Random();
    for (int i = 0; i < numberOfWords; i++) {
      char[] word =
          new char
              [random.nextInt(8)
                  + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
      for (int j = 0; j < word.length; j++) {
        word[j] = (char) ('a' + random.nextInt(26));
      }
      randomStrings[i] = new String(word);
    }
    return randomStrings;
  }

  public static void main(String[] args) {
    String[] randomWords = generateRandomWords(10);
    List<String> list = Arrays.asList(randomWords);
    Collections.sort(list);
    System.out.println("Alphabetic Sorted Order:" + list);
    Collections.sort(list, new SortByLen());
    System.out.println("Length Wise Sorted Order:" + list);
  }
}

