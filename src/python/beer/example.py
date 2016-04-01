from beer.server import BeerService
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer
from thrift.Thrift import TException


if __name__ == '__main__':
    socket = TSocket.TSocket('localhost', 9090)
    transport = TTransport.TBufferedTransport(socket)
    transport = TTransport.TFramedTransport(transport)
    protocol = TBinaryProtocol.TBinaryProtocol(transport)
    client = BeerService.Client(protocol)
    print "Opening connection!"
    transport.open()
    print "Executing calls!"
    print "client.addNumbers(1, 2)"
    response = client.addNumbers(1, 2)
    print "First response: ", response

    print 'client.addStrings("3", "1")'
    response = client.addStrings("3", "1")
    print "Second response: ", response
