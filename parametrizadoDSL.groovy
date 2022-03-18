job('DSL_2_job') {
  description('description changed to new one')
  parameters {
     booleanParam('FLAG', true)
     choiceParam('OPTION', ['option 1 (default)', 'option 2', 'option 3'])
   
 }   
  triggers {
        githubPush()
    }
  scm {
    git('https://github.com/Faridlpz/CursoGit.git','main') { node -> 
    
    node / gitConfigName('jenkins')  
    node / gitConfiEmail('neymarchespirito@outook.com') 
    }
  }
  steps{
  	shell("echo 'Hello wordl'")
  	
  }
  
}
