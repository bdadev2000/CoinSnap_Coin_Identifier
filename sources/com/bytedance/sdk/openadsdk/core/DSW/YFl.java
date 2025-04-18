package com.bytedance.sdk.openadsdk.core.DSW;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.vc;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class YFl {
    private static volatile boolean Sg;
    private static volatile YFl YFl;
    private static volatile long tN;
    private final Queue<C0110YFl> AlY = new LinkedList();

    /* renamed from: vc, reason: collision with root package name */
    private final vc f10626vc = lG.AlY();
    private Handler wN;

    /* renamed from: com.bytedance.sdk.openadsdk.core.DSW.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0110YFl {
        private final String Sg;
        private final long YFl;

        private C0110YFl(long j3, String str) {
            this.YFl = j3;
            this.Sg = str;
        }
    }

    private YFl() {
    }

    private synchronized boolean Sg(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int bZ = this.f10626vc.bZ();
        long VOe = this.f10626vc.VOe();
        if (this.AlY.size() > 0 && this.AlY.size() >= bZ) {
            long abs = Math.abs(currentTimeMillis - this.AlY.peek().YFl);
            if (abs <= VOe) {
                Sg(VOe - abs);
                return true;
            }
            this.AlY.poll();
            this.AlY.offer(new C0110YFl(currentTimeMillis, str));
        } else {
            this.AlY.offer(new C0110YFl(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized String tN() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0110YFl c0110YFl : this.AlY) {
            if (hashMap.containsKey(c0110YFl.Sg)) {
                hashMap.put(c0110YFl.Sg, Integer.valueOf(((Integer) hashMap.get(c0110YFl.Sg)).intValue() + 1));
            } else {
                hashMap.put(c0110YFl.Sg, 1);
            }
        }
        str = "";
        int i10 = Integer.MIN_VALUE;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i10 < intValue) {
                str = str2;
                i10 = intValue;
            }
        }
        return str;
    }

    public static YFl YFl() {
        if (YFl == null) {
            synchronized (YFl.class) {
                if (YFl == null) {
                    YFl = new YFl();
                }
            }
        }
        return YFl;
    }

    public synchronized boolean YFl(String str) {
        if (Sg(str)) {
            YFl(true);
            YFl(tN);
        } else {
            YFl(false);
        }
        return Sg;
    }

    private synchronized void YFl(long j3) {
        if (this.wN == null) {
            this.wN = new Handler(Looper.getMainLooper());
        }
        this.wN.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.DSW.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                YFl.this.YFl(false);
            }
        }, j3);
    }

    public synchronized boolean Sg() {
        return Sg;
    }

    private synchronized void Sg(long j3) {
        tN = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void YFl(boolean z10) {
        Sg = z10;
    }
}
