pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jbritz/spring-boot-api-example'
                    }
                    branch 'master'
                }
            }
        }
    }
}