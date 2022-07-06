package Sentences;

public class Sentence
{
    private String sentence;


    public Sentence(String sentence)
    {
        this.sentence = sentence;
    }

    public String getSentence()
    {
        return this.sentence;
    }

    public boolean equals(Sentence s)
    {
        if (this.getSentence() == s.getSentence())
        {
            return true;
        }
        else
        {
            return false;
        }


    }







}
