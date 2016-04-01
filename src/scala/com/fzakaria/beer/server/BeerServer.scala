package com.fzakaria.beer.server

import com.twitter.finatra.thrift.ThriftServer
import com.twitter.finatra.thrift.filters._
import com.twitter.finatra.thrift.modules.ClientIdWhitelistModule
import com.twitter.finatra.thrift.routing.ThriftRouter

object BeerServerMain extends BeerServer

class BeerServer extends ThriftServer {

  override val defaultFinatraThriftPort: String = ":9090"

  override val modules = Seq(
    ClientIdWhitelistModule)
  override def configureThrift(router: ThriftRouter) {
    router
      .filter[LoggingMDCFilter]
      .filter[TraceIdMDCFilter]
      .filter[ThriftMDCFilter]
      .filter[AccessLoggingFilter]
      .filter[StatsFilter]
      .add[BeerController]
  }
}