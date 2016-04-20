import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension
import akka.actor._
import java.io._
import play.api.libs.ws.ning.NingWSClient
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {
  val wsClient = NingWSClient()

  def writeToFile(pw: PrintWriter, text: String) = {
    pw.write(text)
  }

  def simpleGet(url: String) = {
    wsClient
      .url(url)
      .get()
      .map { wsResponse =>
        println(wsResponse.body)
      }
  }

  simpleGet("http://utphilly.com")
  simpleGet("http://johnnybrendas.com")
  simpleGet("http://bootandsaddlephilly.com")
}

