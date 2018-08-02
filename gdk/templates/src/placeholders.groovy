/*

    Template Placeholders

    $variable         Inserts the value of the variable into the text
    ${groovycode}     Evaluates single line groovy codeand inserts the result into the text
    <%=groovycode%>   Evaluate the groovy code and insert the result into the text
    <%groovycode%>    Evaluate the groovy code

 */
Integer a = 1
Integer b = 2
String c = '!'
println "this contains $b dynamic strings ${a.times('!') }"


