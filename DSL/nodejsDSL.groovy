job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/DiegoAbarcaRodriguez/nodejsapp.git', 'master') { node ->
            node / gitConfigName('DiegoAbarcaRodriguez')
            node / gitConfigEmail('abarcarodriguezdiego@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    
}
