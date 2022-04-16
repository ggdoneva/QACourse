package Lecture12D1204.Task1;
//Create a Java dictionary.
// The program should get a string out of the user
// and show the explanation and at least one example.

public class Dictionary {

    private String word; //should be taken from the user
    private String explanation;
    private String example;

    public Dictionary(String word, String explanation, String example) {
        this.word = word;
        this.explanation = explanation;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "word='" + word + '\'' +
                ", explanation='" + explanation + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
