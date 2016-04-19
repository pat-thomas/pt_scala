import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension
import akka.actor._
import java.io.File._

object Main extends App {
  var counter = 0
  while(true) {
    println(counter)
    counter += 1
    Thread.sleep(1000)
  }
}

