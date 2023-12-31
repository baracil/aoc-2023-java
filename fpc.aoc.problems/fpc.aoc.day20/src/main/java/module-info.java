import fpc.aoc.api.AOCProblem;
import fpc.aoc.day20.Day20Part1Solver;
import fpc.aoc.day20.Day20Part2Solver;

module fpc.aoc.day20 {
    requires static lombok;


    requires fpc.aoc.input;

    exports fpc.aoc.day20;
  exports fpc.aoc.day20.model;
  exports fpc.aoc.day20.model.state;

  provides AOCProblem with Day20Part1Solver, Day20Part2Solver;
}
