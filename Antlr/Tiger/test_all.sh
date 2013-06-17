java org.antlr.v4.Tool Tiger.g4
javac TigerLexer.java TigerListener.java TigerParser.java TigerBaseListener.java 
for ((i=1;i<=49;i++)); do
    echo $i;
    java org.antlr.v4.runtime.misc.TestRig Tiger program test/test$i.tig;
done;