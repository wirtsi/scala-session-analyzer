import java.io.File

import com.github.tototoshi.csv._
import scala.collection.parallel.CollectionConverters._


object SessionCruncher extends App {
  val reader = CSVReader.open(new File("/tmp/data.csv"))
  val data_par = reader.all().par.map(identity)
  val reader2 = CSVReader.open(new File("/tmp/data.csv"))
  val data_seq = reader2.all().map(identity)

  time {
    data_par.groupBy(_  (0)).mapValues(_.map(_ (1).toInt).reduce(_ + _))
  }
  time {
    data_par.groupBy(_  (0)).mapValues(_.map(_ (1).toInt).reduce(_ + _))
  }
  time {
    data_par.groupBy(_  (0)).mapValues(_.map(_ (1).toInt).reduce(_ + _))
  }
  time {
    data_par.groupBy(_  (0)).mapValues(_.map(_ (1).toInt).reduce(_ + _))
  }
  time {
    data_par.groupBy(_  (0)).mapValues(_.map(_ (1).toInt).reduce(_ + _))
  }
  time {
    data_seq.groupMapReduce(_ (0))(_ (1).toInt)(_ + _)
  }
  time {
    data_seq.groupMapReduce(_ (0))(_ (1).toInt)(_ + _)
  }
  time {
    data_seq.groupMapReduce(_ (0))(_ (1).toInt)(_ + _)
  }
  time {
    data_seq.groupMapReduce(_ (0))(_ (1).toInt)(_ + _)
  }
  time {
    data_seq.groupMapReduce(_ (0))(_ (1).toInt)(_ + _)
  }


  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000 / 1000 + "ms")
    result
  }

}