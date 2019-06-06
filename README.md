# springboot-resteasy-exposed-sample
SpringBoot sample app using RestEasy &amp; Exposed written in Kotlin

Note that this project is only intended as a sample learning tool.  It's not at the state to be used as a base production application

## Build
Build using maven through IDE.

## Running.
In project base directory, run the command below replacing the placeholder values with your environment sql server

java -Dsqlserver.url={sqlserver host} -Dsqlserver.instance={sqlserver instance} -Dsqlserver.db.name={sqlserver dbname} -Dsqlserver.db.username={sqlserver username} -Dsqlserver.db.password={sqlserver password} -jar .\target\blog-0.0.1-SNAPSHOT.jar

