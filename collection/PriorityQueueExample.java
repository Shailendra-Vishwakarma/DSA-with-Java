package com.collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(5);
		pq.add(10);
		pq.add(34);
		System.out.println(pq);
		System.out.println(pq.size());
		while(!pq.isEmpty())
		{
			System.out.println(pq.peek());
			pq.poll();
			}
				
	}

}
