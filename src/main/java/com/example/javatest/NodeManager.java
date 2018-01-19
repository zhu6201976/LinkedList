package com.example.javatest;

/**
 * NodeManager
 * Created by My on 2018/1/19.
 */

class NodeManager {
    private Node root;
    private int currentIndex = 0;

    void add(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            root.addNode(data);
        }
    }

    void delete(int data) {
        if (this.root != null) {
            if (data == this.root.getData()) {
                this.root = this.root.next;
            } else {
                this.root.deleteNode(data);
            }
        }
    }

    void update(int oldData, int newData) {
        if (this.root != null) {
            if (oldData == this.root.getData()) {
                this.root.setData(newData);
            } else {
                this.root.updateNode(oldData, newData);
            }
        }
    }

    void print() {
        if (this.root != null) {
            System.out.print(this.root.data + "-->");
            this.root.printNode();
            System.out.println();
        }
    }

    boolean find(int data) {
        if (this.root != null) {
            if (data == this.root.getData()) {
                return true;
            } else {
                return this.root.findNode(data);
            }
        }
        return false;
    }

    // 往前插入
    void insert(int index, int data) {
        currentIndex = 0;
        if (this.root == null) return;
        if (index == currentIndex) {
            Node newNode = new Node(data);
            newNode.next = this.root;
            this.root = newNode;
        } else {
            this.root.insert(index, data);
        }
    }

    private class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
        }

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
                this.next = new Node(data);
            } else {
                this.next.addNode(data);
            }
        }

        private void deleteNode(int data) {
            if (this.next != null) {
                if (data == this.next.data) {
                    this.next = this.next.next;
                } else {
                    this.next.deleteNode(data);
                }
            }
        }

        private void updateNode(int oldData, int newData) {
            if (this.next != null) {
                if (oldData == this.next.data) {
                    this.next.data = newData;
                } else {
                    this.next.updateNode(oldData, newData);
                }
            }
        }

        private boolean findNode(int data) {
            if (this.next != null) {
                if (data == this.next.data) {
                    return true;
                } else {
                    return this.next.findNode(data);
                }
            }
            return false;
        }

        private void printNode() {
            if (this.next != null) {
                System.out.print(this.next.data + "-->");
                this.next.printNode();
            }
        }

        private void insert(int index, int data) {
            currentIndex++;
            if (index == currentIndex) {
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            } else {
                this.next.insert(index, data);
            }
        }
    }
}
