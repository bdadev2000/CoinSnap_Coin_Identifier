package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.YoT;

/* loaded from: classes.dex */
public class DSW {
    private static HandlerThread Sg;
    private static YFl YFl;

    /* loaded from: classes.dex */
    public static class YFl extends Handler {
        public YFl(Looper looper) {
            super(looper);
        }

        public void YFl(Sg sg2) {
            if (sg2 == null) {
                return;
            }
            int intValue = sg2.eT().intValue();
            if (!hasMessages(intValue)) {
                Message obtain = Message.obtain();
                obtain.what = intValue;
                obtain.obj = sg2;
                sendMessageDelayed(obtain, sg2.vc());
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Sg sg2 = (Sg) message.obj;
            if (sg2 == null) {
                return;
            }
            int Sg = sg2.Sg();
            if (Sg == 1) {
                sg2.DSW();
            } else if (Sg == 2) {
                sg2.qsH();
            } else {
                wN.Sg(sg2.eT());
                return;
            }
            if (sg2.NjR()) {
                wN.Sg(sg2.eT());
            } else if (sg2.YoT()) {
                YFl(sg2);
            }
        }
    }

    public static void Sg(Sg sg2) {
        if (sg2 == null || YFl == null) {
            return;
        }
        try {
            int intValue = sg2.eT().intValue();
            if (YFl.hasMessages(intValue)) {
                YFl.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void YFl() {
    }

    public static void YFl(Sg sg2) {
        if (sg2 == null) {
            return;
        }
        Sg();
        YFl yFl = YFl;
        if (yFl != null) {
            yFl.YFl(sg2);
        }
    }

    public static void Sg() {
        if (YFl != null) {
            return;
        }
        try {
            HandlerThread handlerThread = Sg;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (DSW.class) {
                HandlerThread handlerThread2 = Sg;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    Sg = handlerThread3;
                    handlerThread3.start();
                    YFl = new YFl(Sg.getLooper());
                }
            }
        } catch (Throwable th2) {
            YoT.YFl("MRC", th2.getMessage());
        }
    }
}
