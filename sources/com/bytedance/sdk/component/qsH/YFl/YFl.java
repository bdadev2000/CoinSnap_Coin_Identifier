package com.bytedance.sdk.component.qsH.YFl;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.bZ;

/* loaded from: classes.dex */
public class YFl {
    private Handler Sg;
    private final AlY<Sg> YFl;

    /* renamed from: com.bytedance.sdk.component.qsH.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0091YFl {
        private static final YFl YFl = new YFl();
    }

    public Handler Sg() {
        if (this.Sg == null) {
            synchronized (YFl.class) {
                if (this.Sg == null) {
                    this.Sg = YFl("csj_io_handler");
                }
            }
        }
        return this.Sg;
    }

    private YFl() {
        this.YFl = AlY.YFl(2);
    }

    public static YFl YFl() {
        return C0091YFl.YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.qsH.YFl.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.YFl(handler, handler2);
                }
            }, 1000L);
        }
    }

    private Sg Sg(bZ.YFl yFl, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new Sg(handlerThread, yFl);
    }

    public bZ YFl(bZ.YFl yFl, final String str) {
        Sg YFl = this.YFl.YFl();
        if (YFl != null) {
            YFl.YFl(yFl);
            YFl.post(new Runnable() { // from class: com.bytedance.sdk.component.qsH.YFl.YFl.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return YFl;
        }
        return Sg(yFl, str);
    }

    public bZ YFl(String str) {
        return YFl((bZ.YFl) null, str);
    }

    public boolean YFl(bZ bZVar) {
        if (!(bZVar instanceof Sg)) {
            return false;
        }
        Sg sg2 = (Sg) bZVar;
        if (this.YFl.YFl((AlY<Sg>) sg2)) {
            return true;
        }
        sg2.Sg();
        return true;
    }
}
