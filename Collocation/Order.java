import java.util.LinkedList;

public class Order {

  LinkedList<Candidate> candidates = new LinkedList<Candidate>();


  Candidate hakan1 = new NumericalStudent("hakan", 25, 4, 20, 5, 3, 0, 25, 5);
  Candidate hakan2 = new NumericalStudent("hakan2", 30, 0, 30, 0, 30, 0, 30, 0);
  Candidate hakan3 = new NumericalStudent("hakan3", 0, 0, 0, 0, 0, 0, 0, 0);
  Candidate hakan4 = new VerbalStudent("hakan4", 25, 4, 20, 5, 3, 0, 25, 5);
  Candidate hakan5 = new EqualAgilitylStudent("hakan5", 25, 4, 20, 5, 3, 0, 25, 5);
  Candidate hakan6 = new VerbalStudent("hakan6", 30, 0, 30, 0, 30, 0, 30, 0);
  Candidate hakan7 = new EqualAgilitylStudent("hakan7", 0, 0, 0, 0, 0, 0, 0, 0);
  {
    hakan1.numericalPoint();
    hakan1.equalAgilityPoint();
    hakan1.verbalPoint();
    hakan2.numericalPoint();
    hakan2.equalAgilityPoint();
    hakan2.verbalPoint();
    hakan3.numericalPoint();
    hakan3.verbalPoint();
    hakan3.equalAgilityPoint();
    hakan4.numericalPoint();
    hakan4.equalAgilityPoint();
    hakan4.verbalPoint();
    hakan5.numericalPoint();
    hakan5.equalAgilityPoint();
    hakan5.verbalPoint();
    hakan6.numericalPoint();
    hakan6.verbalPoint();
    hakan6.equalAgilityPoint();
    hakan7.numericalPoint();
    hakan7.equalAgilityPoint();
    hakan7.verbalPoint();
  }


  public void addCandidates() {
    candidates.add(hakan1);
    candidates.add(hakan2);
    candidates.add(hakan3);
    candidates.add(hakan4);
    candidates.add(hakan5);
    candidates.add(hakan6);
    candidates.add(hakan7);



  }


  public LinkedList<Candidate> getCandidates() {
    return this.candidates;
  }

  public void setCandidates(LinkedList<Candidate> candidates) {
    this.candidates = candidates;
  }


  public String orderList() {
    String s = null;
    for (Candidate candidate : candidates) {
      s = s + candidate;
    }
    return s;
  }



}
