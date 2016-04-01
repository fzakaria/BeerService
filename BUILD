#########################################
# The binary, the "runnable" part       #
#          BEER SERVICE                 #
#########################################
jvm_app(name='beer-server',
  dependencies = [
    ':beer-server-bin'
  ],
  bundles = [
  ]
)

jvm_binary(name = 'beer-server-bin',
  dependencies = [
    'src/scala/com/fzakaria/beer/server:beer-server',
    '3rdparty/jvm/com/twitter/finatra:finatra-slf4j',
    '3rdparty/jvm/ch/qos/logback:logback-classic',
  ],
  resources=[
    'src/resources:logging-resources',
    'src/resources:client-whitelist',
  ],
  main = 'com.fzakaria.beer.server.BeerServerMain',
  basename = 'beer-server',
)


python_binary(name = "beer-client-python",
  dependencies = [
    'thrift/com/fzakaria/beer:beer-python'
  ],
  source='src/python/beer/example.py'
)