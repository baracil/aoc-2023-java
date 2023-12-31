package fpc.aoc.day6;

import fpc.aoc.api.AOCProblem;
import lombok.NonNull;

import java.util.List;

public class Day6Part1Solver extends Day6Solver {

  public static @NonNull AOCProblem<?> provider() {
    return new Day6Part1Solver().createProblem();
  }


  @Override
  public @NonNull Long solve(@NonNull List<String> input) {

    return Race.parsePart1(input).stream().mapToLong(Race::nbWins)
      .reduce(1, (i1, i2) -> i1 * i2);
  }
}
