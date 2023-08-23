public interface PointCalculater {

  default int numerical(int math, int verbal, int culture, int science) {
    int point = (math * 5) + (verbal * 3) + (culture * 1) + (science * 5);
    return point;
  }

  default int equalAgility(int math, int verbal, int culture, int science){
    int point = (math * 5) + (verbal * 5) + (culture * 3) + (science * 1);
    return point;
  }

  default int verbal(int math, int verbal, int culture, int science) {
    int point = (math * 3) + (verbal * 5) + (culture * 5) + (science * 1);
    return point;
  }

  default int mathScore(int mathTure, int mathFalse){
    int net = (mathTure * 4) - mathFalse;
    return net;
  }

  default int verbalScore(int verbalTrue, int verbalFalse){
    int net = (verbalTrue * 4) - verbalFalse;
    return net;
  }

  default int cultureScore(int cultureTure, int cultureFalse){
    int net = (cultureTure * 4) - cultureFalse;
    return net;
  }

  default int scienceScore(int scienceTure, int scienceFalse){
    int net = (scienceTure * 4) - scienceFalse;
    return net;
  }
}
