package com.bytedance.sdk.openadsdk.core.jU;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.COT;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class zp {
    private static volatile long KS;
    private static volatile boolean lMd;
    private static volatile zp zp;
    private Handler COT;
    private final Queue<C0108zp> jU = new LinkedList();
    private final COT HWF = KVG.jU();

    /* renamed from: com.bytedance.sdk.openadsdk.core.jU.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0108zp {
        private final String lMd;
        private final long zp;

        private C0108zp(long j7, String str) {
            this.zp = j7;
            this.lMd = str;
        }
    }

    private zp() {
    }

    private synchronized boolean lMd(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int RCv = this.HWF.RCv();
        long ox = this.HWF.ox();
        if (this.jU.size() > 0 && this.jU.size() >= RCv) {
            long abs = Math.abs(currentTimeMillis - this.jU.peek().zp);
            if (abs <= ox) {
                lMd(ox - abs);
                return true;
            }
            this.jU.poll();
            this.jU.offer(new C0108zp(currentTimeMillis, str));
        } else {
            this.jU.offer(new C0108zp(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized String KS() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            for (C0108zp c0108zp : this.jU) {
                if (hashMap.containsKey(c0108zp.lMd)) {
                    hashMap.put(c0108zp.lMd, Integer.valueOf(((Integer) hashMap.get(c0108zp.lMd)).intValue() + 1));
                } else {
                    hashMap.put(c0108zp.lMd, 1);
                }
            }
            str = "";
            int i9 = Integer.MIN_VALUE;
            for (String str2 : hashMap.keySet()) {
                int intValue = ((Integer) hashMap.get(str2)).intValue();
                if (i9 < intValue) {
                    str = str2;
                    i9 = intValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static zp zp() {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public synchronized boolean zp(String str) {
        try {
            if (lMd(str)) {
                zp(true);
                zp(KS);
            } else {
                zp(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lMd;
    }

    private synchronized void zp(long j7) {
        try {
            if (this.COT == null) {
                this.COT = new Handler(Looper.getMainLooper());
            }
            this.COT.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jU.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.zp(false);
                }
            }, j7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean lMd() {
        return lMd;
    }

    private synchronized void lMd(long j7) {
        KS = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zp(boolean z8) {
        lMd = z8;
    }
}
