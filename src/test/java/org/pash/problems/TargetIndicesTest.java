package org.pash.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TargetIndicesTest extends AbstractProblemsTest {

    private TargetIndices probs = new TargetIndices();

    @Test
    @DisplayName("Testing simple problem for now..")
    public void solveProblem () {
        System.out.println("Running Tests");

        int [] arr = {2,7,5,6,4};

        boolean val = probs.solveProblem(arr, 11);
        assertTrue (val);

        val = probs.solveProblem(arr, 9);
        assertEquals (val, true);
    }
}