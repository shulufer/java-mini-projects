public class NumericalStudent extends Candidate {


  public NumericalStudent(String name, int mathTure, int mathFalse, int verbalTrue, int verbalFalse , int cultureTrue, int cultureFalse, int scienceTrue, int scienceFalse) {
    this.name = name;
    this.mathTure = mathTure;
    this.mathFalse = mathFalse;
    this.verbalTrue = verbalTrue;
    this.verbalFalse = verbalFalse;
    this.cultureTrue = cultureTrue;
    this.cutureFalse = cultureFalse;
    this.scienceTrue = scienceTrue;
    this.scienceFalse = scienceFalse;

  }

  public int mathScore(int scienceTure, int scienceFalse){
    int coefficient = 40;
    int net = ((mathTure * 4) - mathFalse) + coefficient;
    return net;
  }

  public int scienceScore(int scienceTure, int scienceFalse){
    int coefficient = 40;
    int net = ((scienceTure * 4) - scienceFalse) + coefficient;
    return net;
  }




}
