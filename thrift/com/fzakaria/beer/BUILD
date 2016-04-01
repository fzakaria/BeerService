java_thrift_library(name='beer-scala',
  compiler='scrooge', # default compiler does not gen Scala; Scrooge does
  language='scala',
  rpc_style='finagle',
  sources=globs('*.thrift')
)

python_thrift_library(name='beer-python',
  sources=globs('*.thrift'),
)