node{
stage( "git checkout"){
git branch: 'master', url: 'https://github.com/swetha8998/simple_nodejs_app.git'
}
stage( "build" ){
 sh 'echo "compressing the files present " '
sh 'tar -cvf nodeapp.tar package.json server.js'
}
stage ( "approve"){
sh 'echo "in approval stage" '


}
stage ( " deploy "){
sh 'echo "in deployement stage"'

}
}
