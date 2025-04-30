package com.bytedance.sdk.component.ku.zp;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.RCv;

/* loaded from: classes.dex */
public class zp {
    private Handler lMd;
    private final jU<lMd> zp;

    /* renamed from: com.bytedance.sdk.component.ku.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0088zp {
        private static final zp zp = new zp();
    }

    public Handler lMd() {
        if (this.lMd == null) {
            synchronized (zp.class) {
                try {
                    if (this.lMd == null) {
                        this.lMd = zp("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.lMd;
    }

    private zp() {
        this.zp = jU.zp(2);
    }

    public static zp zp() {
        return C0088zp.zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.ku.zp.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.zp(handler, handler2);
                }
            }, 1000L);
        }
    }

    private lMd lMd(RCv.zp zpVar, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new lMd(handlerThread, zpVar);
    }

    public RCv zp(RCv.zp zpVar, final String str) {
        lMd zp = this.zp.zp();
        if (zp != null) {
            zp.zp(zpVar);
            zp.post(new Runnable() { // from class: com.bytedance.sdk.component.ku.zp.zp.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return zp;
        }
        return lMd(zpVar, str);
    }

    public RCv zp(String str) {
        return zp((RCv.zp) null, str);
    }

    public boolean zp(RCv rCv) {
        if (!(rCv instanceof lMd)) {
            return false;
        }
        lMd lmd = (lMd) rCv;
        if (this.zp.zp((jU<lMd>) lmd)) {
            return true;
        }
        lmd.lMd();
        return true;
    }
}
