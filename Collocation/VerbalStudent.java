public class VerbalStudent extends Candidate{

  public VerbalStudent(String name, int mathTure, int mathFalse, int verbalTrue, int verbalFalse , int cultureTrue, int cultureFalse, int scienceTrue, int scienceFalse) {
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

  public void verbalScore(){
    int coefficient = 40;
    verbal = ((verbalTrue * 4) - verbalFalse) + coefficient;
  }

  public void cultureScore(){
    int coefficient = 40;
    culture = ((cultureTrue * 4) - cultureFalse) + coefficient;
  }
}
