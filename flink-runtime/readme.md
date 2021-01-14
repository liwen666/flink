#启动单例
StandaloneSessionClusterEntrypoint
TaskManagerRunner

#VM参数配置
防止日志不打印控制台，需要修改日志配置文件的追加项
 StandaloneSessionClusterEntrypoint   			 
-Xms1024m -Xmx1024m -Dlog.file=D:\\flink-learning\\flink\\flink-runtime\\tmp\\log\\local.log -Dlog4j.configuration=file:D:\\flink-learning\\flink\\flink-runtime\\log4j.properties -Dlogback.configurationFile=file:D:\\flink-learning\\flink\\flink-runtime\\logback1.xml 
TaskManagerRunner

-Dlog.file=D:\\flink-learning\\flink\\flink-runtime\\tmp\\log\\flink-root-taskexecutor-1-Single.log  -Dlog4j.configuration=file:D:\\flink-learning\\flink\\flink-runtime\\log4j.properties  -Dlog4j.configurationFile=file:D:\\flink-learning\\flink\\flink-runtime\\log4j.properties  -Dlogback.configurationFile=file:D:\\flink-learning\\flink\\flink-runtime\\logback1.xml

#Program arguments，内容如下：
StandaloneSessionClusterEntrypoint
--configDir D:\\flink-learning\\flink\\flink-runtime\\ --executionMode cluster  
TaskManagerRunner
--configDir D:\\flink-learning\\flink\\flink-runtime

--configDir D:\flink-learning\flink\flink-runtime  --taskmanager.cpu.cores 1.0
