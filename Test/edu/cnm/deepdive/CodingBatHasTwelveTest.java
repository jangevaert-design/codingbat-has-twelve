package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatHasTwelve.has12;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatHasTwelveTest {

  private int[][] twelveParams = {
      {1, 3, 2},
      {3, 1, 2},
      {3, 1, 4, 5, 2},
      {3, 1, 4, 5, 6},
      {3, 1, 4, 1, 6, 2},
      {2, 1, 4, 1, 6, 2},
      {2, 1, 4, 1, 6},
      {1},
      {2, 1, 3},
      {2, 1, 3, 2},
      {2},
      {3, 2},
      {3, 1, 3, 2},
      {3, 5, 9},
      {3, 5, 1},
      {3, 2, 1},
      {1, 2}
  };

  private boolean[] twelveExpected = {true, true, true, false, true, true, false, false, false, true,
  false, false, true, false, false, false, true};

  @Test
  void twelveTest() {
    for (int i = 0; i < twelveParams.length; i++) {
      boolean actual = has12(twelveParams[i]);
      Assertions.assertEquals(actual, twelveExpected[i]);
    }
  }

}