dataSource {
    pooled = true
    /*
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
    */
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'com.googlecode.hibernate.memcached.MemcachedCacheProvider'
    memcached {
        servers = "127.0.0.1:11211 127.0.0.1:11311 127.0.0.1:11411 127.0.0.1:11511 127.0.0.1:11611"
    }
}

// environment specific settings
environments {
    development {

        dataSource {
            driverClassName = "com.mysql.jdbc.Driver"
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost/medical_history"
            username = "favaloro"
            password = "123456"
        }

        /* --> To see
        hibernate {
            show_sql = true
        }
        <-- */

        /*
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE"
        }
        */



    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb;MVCC=TRUE"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
