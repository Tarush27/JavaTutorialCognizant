


/*
Given the following classes:

class Shape { */
/* ... *//*

}

class Circle extends Shape { */
/* ... *//*

}

class Rectangle extends Shape { */
/* ... *//*

}

class Node<T> { */
/* ... *//*

}
    Will the
    following code compile?If not,why?
        Node<Circle> nc=new Node<>();
        Node<Shape>  ns=nc;
        Answer:No.Because Node<Circle> is not a subtype of Node<Shape>.
*/
package generics;

class Node<T> {
    public static void main(String[] args) {
     /*   Node<Circle> nc=new Node<>();
        Node<Shape>  ns=nc;*/
    }
}

class Shape {

}

class Circle extends Shape {

}

class Rectangle extends Shape {

}