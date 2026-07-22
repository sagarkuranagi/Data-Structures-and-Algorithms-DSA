public class BrowserNavigationHistoryManager {
   public void visit(string url){
    
    Node newNode = new Node(url);
    current.next = newNode;
    newNode.prev = current;
    current = newNode;
    size++;

    if(size > capacity){
        head = head.next;
        head.prev = null;
        size--;
    }
   }
   public String back(int Steps){
    while(current.prev != null && Steps > 0){
        current = current.prev;
        Steps--;
    }
    return current.url;
   }

    public String Forward(int Steps){
        while(current.next != null && Steps > 0){
            current = current.next;
            Steps--;
        } 
        return current.url;
    }

    public static void main(String[] args){
        BrowserNavigationHistoryManager browser = new BrowserNavigationHistoryManager(homepage:"sjvit.edu.in", capacity:5);
        browser.visit("google.com");
        browser.visit(url: "linkedin.com");

        System.out.println('current:' + browser.back(steps:1));
        System.out.println('current:' + browser.forward(steps:1));

        browser.visit(url:leetcode.com);
    }