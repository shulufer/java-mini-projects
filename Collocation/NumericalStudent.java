public class NumericalStudent extends Candidate {


  public NumericalStudent(String name, int mathTure, int mathFalse, int verbalTrue, int verbalFalse , int cultureTrue, int cultureFalse, int scienceTrue, int scienceFalse) {
    this.name = name;
    this.mathTure = mathTure;
    this.mathFalse = mathFalse;
    this.verbalTrue = verbalTrue;
    this.verbalFalse = verbalFalse;
    this.cultureTrue = cultureTrue;
    this.cultureFalse = cultureFalse;
    this.scienceTrue = scienceTrue;
    this.scienceFalse = scienceFalse;

  }

  public int mathScore(){
    int coefficient = 40;
    math = ((mathTure * 4) - mathFalse) + coefficient;
    return math;
  }

  public int scienceScore(){
    int coefficient = 40;
    science = ((scienceTrue * 4) - scienceFalse) + coefficient;
    return science;
  }




}
