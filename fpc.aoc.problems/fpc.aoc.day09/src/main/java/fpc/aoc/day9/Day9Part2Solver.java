package fpc.aoc.day9;

import fpc.aoc.api.AOCProblem;
import fpc.aoc.common.NotSolvedYet;
import lombok.NonNull;

import java.util.stream.Stream;

public class Day9Part2Solver extends Day9Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day9Part2Solver().createProblem();
    }

    @Override
    public boolean isSkipped() {
        return true;
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}