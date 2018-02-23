package practicalfour.experiment;

import practicalfour.data.ResultsTable;
import practicalfour.repeat.Repeater;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Gregory M. Kapfhammer
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a Repeater in an experiment. */
  public ResultsTable run(Repeater repeat);

}
