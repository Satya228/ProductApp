public void mapDemo() {
    Map<String, String> empMap = new HashMap<>();
    empMap.put("E1234", "Steve Jobs");
    empMap.put("E2345", "Bill Gates");
    empMap.put("E3456", "Larry Ellison");
    empMap.put("E4567", "Jeff Bezos");
    empMap.put("E8765	Mark", "Zuckerberg");
    empMap.put("E6789", "Larry Page");
    Scanner s = new Scanner(System.in);
    while (true) {
      System.out.println("Enter an emp id (or 'quit'): ");
      String input = s.nextLine();
      if (input.equalsIgnoreCase("quit")) {
        break;
      }
      if (empMap.containsKey(input)) {
        System.out.println(empMap.get(input));
      } else {
        System.out.println("No such employee!");
      }
    }
  }

  public static void main(String[] args) {
    CollectionsDemo demo = new CollectionsDemo();
    /*List<Circle> circles = demo.buildCircleList();
    System.out.println("There are " + circles.size() + " circles.");
    demo.removeSmallCircles(circles);
    System.out.println("There are " + circles.size() + " circles.");*/
    // demo.mapDemo();
    demo.setDemo();
  }

  private void setDemo() { 
	  Set<String> words = new HashSet<>();
	  Scanner s = new Scanner(System.in);
	    while (true) {
	      System.out.println("Enter a word (or 'quit'): ");
	      String input = s.nextLine();	
	      if (input.equalsIgnoreCase("quit")) {
	          break;
	      }
	      if(!words.add(input)) {
	    	  System.out.println("That's a duplicate!" ); 
	      }
	    }
	    System.out.println("All words: " );
	    System.out.println(words); 
	      
  }
}
