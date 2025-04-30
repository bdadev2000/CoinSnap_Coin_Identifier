package com.bytedance.sdk.openadsdk.lMd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.woN;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Bj {
    private static volatile Bj zp;
    private Map<String, Object> HWF;
    private final Handler KS;
    private HandlerThread lMd;
    private final Executor jU = Executors.newCachedThreadPool();
    private lMd COT = lMd.zp();

    /* loaded from: classes.dex */
    public static class lMd {
        public int zp = 300;
        public int lMd = 6000;

        private lMd() {
        }

        public static lMd zp() {
            return new lMd();
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements Serializable, Runnable {
        public Map<String, Object> COT;
        public woN KS;
        public String jU;
        public final AtomicInteger zp = new AtomicInteger(0);
        public final AtomicBoolean lMd = new AtomicBoolean(false);

        public zp(woN won, String str, Map<String, Object> map) {
            this.KS = won;
            this.jU = str;
            this.COT = map;
        }

        public static zp zp(woN won, String str, Map<String, Object> map) {
            return new zp(won, str, map);
        }

        public void lMd() {
            this.zp.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            boolean z8;
            if (this.KS != null && !TextUtils.isEmpty(this.jU)) {
                if (this.lMd.get()) {
                    str = "dpl_success";
                } else {
                    str = "dpl_failed";
                }
                if (this.COT == null) {
                    this.COT = new HashMap();
                }
                woN won = this.KS;
                if (won != null && won.que() == 0) {
                    Map<String, Object> map = this.COT;
                    woN won2 = this.KS;
                    if (won2 != null && !won2.KS()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    map.put("auto_click", Boolean.valueOf(z8));
                }
                this.COT.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.rV.zp().KS()));
                KS.zp(this.KS, this.jU, str, this.COT);
            }
        }

        public zp zp(boolean z8) {
            this.lMd.set(z8);
            return this;
        }

        public int zp() {
            return this.zp.get();
        }
    }

    private Bj() {
        if (this.lMd == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.lMd = handlerThread;
            handlerThread.start();
        }
        this.KS = new Handler(this.lMd.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.lMd.Bj.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                zp zpVar;
                if (message.what == 100) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof zp)) {
                        zpVar = (zp) obj;
                    } else {
                        zpVar = null;
                    }
                    if (zpVar != null) {
                        Bj.this.lMd(zpVar);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
    }

    private void KS(zp zpVar) {
        if (zpVar == null) {
            return;
        }
        this.jU.execute(zpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(zp zpVar) {
        if (zpVar == null) {
            return;
        }
        boolean jU = com.bytedance.sdk.openadsdk.core.rV.zp().jU();
        boolean zp2 = com.bytedance.sdk.openadsdk.core.rV.zp().zp(true);
        if (!jU && zp2) {
            zp(zpVar);
            return;
        }
        if (zpVar.COT == null) {
            zpVar.COT = new HashMap();
        }
        zpVar.COT.put("is_background", Boolean.valueOf(jU));
        zpVar.COT.put("has_focus", Boolean.valueOf(zp2));
        KS(zpVar.zp(true));
    }

    public static Bj zp() {
        if (zp == null) {
            synchronized (Bj.class) {
                try {
                    if (zp == null) {
                        zp = new Bj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public Bj zp(Map<String, Object> map) {
        this.HWF = map;
        return zp();
    }

    public void zp(woN won, String str) {
        Message obtainMessage = this.KS.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = zp.zp(won, str, this.HWF);
        obtainMessage.sendToTarget();
    }

    private void zp(zp zpVar) {
        if (zpVar == null) {
            return;
        }
        zpVar.lMd();
        int zp2 = zpVar.zp();
        lMd lmd = this.COT;
        if (zp2 * lmd.zp > lmd.lMd) {
            KS(zpVar.zp(false));
            return;
        }
        Message obtainMessage = this.KS.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = zpVar;
        this.KS.sendMessageDelayed(obtainMessage, this.COT.zp);
    }
}
