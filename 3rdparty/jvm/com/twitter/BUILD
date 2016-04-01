jar_library(name='finagle-thrift',
  jars=[
    scala_jar(org='com.twitter', name='finagle-thrift', rev='6.34.0',
        excludes=[
          exclude(org = 'org.apache.thrift', name = 'libthrift'),
        ]),
  ],
  dependencies=[
    '3rdparty:thrift-0.6.1',
  ],
)

jar_library(name='scrooge-core',
  jars=[
    scala_jar(org='com.twitter', name='scrooge-core', rev='4.5.0',
        excludes=[
          exclude(org = 'org.apache.thrift', name = 'libthrift'),
        ]),
  ],
  dependencies=[
    '3rdparty:thrift-0.6.1',
  ],
)