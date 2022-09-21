package com.example.vac3liveandletlive;

public class LinkedList<F> {

    public Node<F> head = null;

    public void addElement(F e) { //Add element to head of list
        Node<F> fn = new Node<>();
        fn.setContents(e);
        fn.next = head;
        head = fn;
    }


    class Node<N> {

        public Node<N> next = null;
        private N contents; //ADT reference!

        public N getContents() {
            return contents;
        }

        public void setContents(N c) {
            contents = c;
        }

    }

}

