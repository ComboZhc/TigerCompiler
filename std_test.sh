for ((i=29;i<=30;i++)); do
    echo $i;
    java Language.Tiger.TigerCompiler Antlr/Tiger/test/test$i.tig;
done;
java Language.Tiger.TigerCompiler Antlr/Tiger/test/merge.tig;
java Language.Tiger.TigerCompiler Antlr/Tiger/test/queens.tig;