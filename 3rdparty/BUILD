jar_library(name='commons-lang',
            jars = [
              jar(org='commons-lang', name='commons-lang', rev='2.5'),
            ])

jar_library(name='libthrift-0.6.1',
            jars = [
              jar(org='org.apache.thrift', name='libthrift', rev='0.6.1')
            ])

target(name='thrift-0.6.1',
       dependencies = [
         ':commons-lang',
         ':libthrift-0.6.1',
         '3rdparty/jvm/org/slf4j:slf4j-api',
       ])