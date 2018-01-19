package com.example.javatest;

/**
 * NodeManager
 * Created by My on 2018/1/19.
 */

class NodeManager {
    private Node root;

    void add(int data) {
        if (this.root == null) {
            this.root = new Node();
            this.root.setData(data);
        } else {
            root.addNode(data);
        }
    }

    void delete(int data) {
        if (this.root != null) {
            if (data==this.root.getData()) {
                this.root = this.root.next;
            } else {
                this.root.deleteNode(data);
            }
        }
    }

    void update(int oldData, int newData) {
        if (this.root != null) {
            if (oldData==this.root.getData()) {
                this.root.setData(oldData);
            } else {
                this.root.updateNode(oldData, newData);
            }
        }
    }

    void print() {
        if (this.root != null) {
            System.out.print(this.root.data);
            System.out.print("-->");
            this.root.printNode();
        }
    }

    boolean find(int data) {
        if (this.root != null) {
            if (data==this.root.getData()) {
                return true;
            } else {
                return this.root.findNode(data);
            }
        }
        return false;
    }

    private class Node {
        private Node next;
        private int data;

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }

        int getData() {
            return data;
        }

        void setData(int data) {
            this.data = data;
        }

        private void addNode(int data) {
            if (this.next == null) {
                this.next = new Node();
                this.next.setData(data);
            } else {
                this.next.addNode(data);
            }
        }

        private void deleteNode(int data) {
            if (this.next != null) {
                if (data==this.next.getData()) {
                    this.next = this.next.next;
                } else {
                    this.next.deleteNode(data);
                }
            }
        }

        private void updateNode(int oldData, int newData) {
            if (this.next != null) {
                if (oldData==this.next.data) {
                    this.next.data = newData;
                } else {
                    this.next.updateNode(oldData, newData);
                }
            }
        }

        private boolean findNode(int data) {
            if (this.next != null) {
                if (data==this.next.data) {
                    return true;
                } else {
                    return this.next.findNode(data);
                }
            }
            return false;
        }

        private void printNode() {
            if (this.next != null) {
                System.out.print(this.next.data);
                System.out.print("-->");
                this.next.printNode();
            }
        }
    }
}
