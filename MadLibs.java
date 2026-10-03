public class MadLibs {
  /*
  This program generates a mad libbed story
  Author: Seraphim Collins
  Date: 10/2/26

  To use this, have your friends switch out the names, adjectives, nouns, etc. to create a fun story!
  */
  public static void main(String[] args){
    //word variables for our story
    String name1 = "name";
    String adjective1 = "adjective";
    String noun1 = "noun";
    String noun2 = "noun";
    String verb1 = "verb";
    String noun3 = "noun";
    String noun4 = "noun";
    String adjective2 = "adjective";
    String name2 = "name";
    String place1 = "place";
    String noun5 = "noun";
    double number = 7;
    String noun6 = "noun";
    String adjective3 = "adjective";
    
    
    //The template for the story
    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

    //print out the story

    System.out.println(story);
  }       
}
