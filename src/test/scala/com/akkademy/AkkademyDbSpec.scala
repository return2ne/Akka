package com.akkademy

import akka.actor.ActorSystem
import org.scalatest.{BeforeAndAfterEach, FunSpecLike, Matchers}
import com.akkademy.messages.SetRequest
import akka.testkit.TestActorRef

/**
  * Created by liebeu96 on 2017. 2. 21..
  */
class AkkademyDbSpec extends FunSpecLike with Matchers with BeforeAndAfterEach {
  implicit val system = ActorSystem()
  describe("akkademyDb") {
    describe("given SetRequest") {
      it("should place key/value into map") {
        val actorRef = TestActorRef(new AkkademyDb)
        actorRef ! SetRequest("key", "value")
        val akkademyDb = actorRef.underlyingActor
        akkademyDb.map.get("key") should equal(Some("value"))
      }
    }
  }
}
