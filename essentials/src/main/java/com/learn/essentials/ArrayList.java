package com.learn.essentials;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author shujathullahmirza
 */

@Component
public class ArrayList {
      
      public Logger logger = Logger.getLogger(ArrayList.class.getName());
      
      public static void main(String[] args) {
            ArrayList a = new ArrayList();
            a.checkArrayList();
            a.checkLinkedList();
      }
      
      /**
       * ArrayList
       *
       */
      public void checkArrayList(){
            
            logger.info("****** ARRAY LIST ******");
            List<String> list = new java.util.ArrayList<String>();
            list.add("1");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("3");
            
            for(String s : list){
                  logger.info(s);
            }
           
      }
      
      
      
      /**
       * LinkedList
       * 
       */
      
      public void checkLinkedList(){
            logger.info("****** LINKED LIST ******");
            LinkedList<String> list = new LinkedList<String>();
            list.add("1");
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("3");
            for(String s : list){
                  logger.info(s);
            }
      }
      

      
      
}
