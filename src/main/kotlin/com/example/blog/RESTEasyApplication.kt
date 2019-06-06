package com.example.blog

import org.springframework.stereotype.Component
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application


@Component
@ApplicationPath("/rest-api/")
class RESTEasyApplication : Application()


