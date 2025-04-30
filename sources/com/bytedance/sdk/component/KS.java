package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class KS {
    private static volatile Handler lMd;
    private static final Object zp = new Object();
    private static final LinkedList<Runnable> KS = new LinkedList<>();
    private static Object jU = new Object();

    /* loaded from: classes.dex */
    public static class zp extends Handler {
        public zp(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    KS.KS();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS() {
        LinkedList linkedList;
        synchronized (jU) {
            try {
                synchronized (zp) {
                    LinkedList<Runnable> linkedList2 = KS;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    lMd().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Handler lMd() {
        Handler handler;
        if (lMd == null) {
            synchronized (zp) {
                try {
                    if (lMd == null) {
                        HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                        handlerThread.start();
                        lMd = new zp(handlerThread.getLooper());
                    }
                    handler = lMd;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return handler;
        }
        return lMd;
    }

    public static void zp(Runnable runnable, boolean z8) {
        try {
            Handler lMd2 = lMd();
            synchronized (zp) {
                try {
                    KS.add(runnable);
                    if (z8) {
                        lMd2.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        lMd2.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
