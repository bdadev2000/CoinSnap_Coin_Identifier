package com.bytedance.sdk.openadsdk.rV.zp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.tG;

/* loaded from: classes.dex */
public class QR {
    private static HandlerThread lMd;
    private static zp zp;

    /* loaded from: classes.dex */
    public static class zp extends Handler {
        public zp(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            lMd lmd = (lMd) message.obj;
            if (lmd == null) {
                return;
            }
            int lMd = lmd.lMd();
            if (lMd == 1) {
                lmd.QR();
            } else if (lMd == 2) {
                lmd.ku();
            } else {
                COT.lMd(lmd.Bj());
                return;
            }
            if (lmd.YW()) {
                COT.lMd(lmd.Bj());
            } else if (lmd.vDp()) {
                zp(lmd);
            }
        }

        public void zp(lMd lmd) {
            if (lmd == null) {
                return;
            }
            int intValue = lmd.Bj().intValue();
            if (!hasMessages(intValue)) {
                Message obtain = Message.obtain();
                obtain.what = intValue;
                obtain.obj = lmd;
                sendMessageDelayed(obtain, lmd.HWF());
            }
        }
    }

    public static void lMd(lMd lmd) {
        if (lmd == null || zp == null) {
            return;
        }
        try {
            int intValue = lmd.Bj().intValue();
            if (zp.hasMessages(intValue)) {
                zp.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void zp() {
    }

    public static void zp(lMd lmd) {
        if (lmd == null) {
            return;
        }
        lMd();
        zp zpVar = zp;
        if (zpVar != null) {
            zpVar.zp(lmd);
        }
    }

    public static void lMd() {
        if (zp != null) {
            return;
        }
        try {
            HandlerThread handlerThread = lMd;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (QR.class) {
                try {
                    HandlerThread handlerThread2 = lMd;
                    if (handlerThread2 != null) {
                        if (!handlerThread2.isAlive()) {
                        }
                    }
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    lMd = handlerThread3;
                    handlerThread3.start();
                    zp = new zp(lMd.getLooper());
                } finally {
                }
            }
        } catch (Throwable th) {
            tG.zp("MRC", th.getMessage());
        }
    }
}
