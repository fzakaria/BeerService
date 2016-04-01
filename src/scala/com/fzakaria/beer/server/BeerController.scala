package com.fzakaria.beer.server

import javax.inject.Singleton

import com.fzakaria.beer.server.thriftscala.BeerService
import com.fzakaria.beer.server.thriftscala.BeerService._
import com.twitter.finatra.thrift.Controller
import com.twitter.util.Future

@Singleton
class BeerController extends Controller with BeerService.BaseServiceIface {

  override val addNumbers = handle(AddNumbers) { args: AddNumbers.Args =>
    Future(args.a + args.b)
  }

  override val addStrings = handle(AddStrings) { args: AddStrings.Args =>
    Future.value(
      (args.a.toInt + args.b.toInt).toString)
  }

  override val increment = handle(Increment) { args: Increment.Args =>
    Future.value(args.a + 1)
  }

}
