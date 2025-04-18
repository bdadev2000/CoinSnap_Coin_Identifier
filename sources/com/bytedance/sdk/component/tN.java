package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class tN {
    private static volatile Handler Sg;
    private static final Object YFl = new Object();
    private static final LinkedList<Runnable> tN = new LinkedList<>();
    private static Object AlY = new Object();

    /* loaded from: classes.dex */
    public static class YFl extends Handler {
        public YFl(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    tN.tN();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler Sg() {
        Handler handler;
        if (Sg == null) {
            synchronized (YFl) {
                if (Sg == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    Sg = new YFl(handlerThread.getLooper());
                }
                handler = Sg;
            }
            return handler;
        }
        return Sg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN() {
        LinkedList linkedList;
        synchronized (AlY) {
            synchronized (YFl) {
                LinkedList<Runnable> linkedList2 = tN;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                Sg().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    public static void YFl(Runnable runnable, boolean z10) {
        try {
            Handler Sg2 = Sg();
            synchronized (YFl) {
                tN.add(runnable);
                if (z10) {
                    Sg2.sendEmptyMessageDelayed(1, 100L);
                } else {
                    Sg2.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
