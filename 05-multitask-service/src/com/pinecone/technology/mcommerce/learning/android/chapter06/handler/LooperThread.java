package com.pinecone.technology.mcommerce.learning.android.chapter06.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class LooperThread extends Thread {
	public Handler mHandler;

	public void run() {
		Looper.prepare();
		mHandler = new Handler() {
			public void handleMessage(Message msg) {
				// process incoming messages here
			}
		};
		Looper.loop();
	}
}
