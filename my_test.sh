for ((i=1;i<=22;i++)); do
    echo $i;
    java Language.Tiger.TigerCompiler Antlr/Tiger/mytest/test$i.tig;
done;