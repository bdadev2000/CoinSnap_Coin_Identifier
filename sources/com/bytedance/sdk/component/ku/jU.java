package com.bytedance.sdk.component.ku;

import Q7.n0;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.tG;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class jU {
    private static AtomicInteger KS = new AtomicInteger(0);
    public static final String[] zp = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] lMd = {"tt_pangle", "bd_tracker"};
    private static int jU = 0;
    private static int COT = 0;

    /* loaded from: classes.dex */
    public static class zp {
        public String KS;
        public String jU;
        public String lMd;
        public int zp;

        public zp(String str, int i9, String str2, String str3) {
            this.KS = str;
            this.zp = i9;
            this.jU = str2;
            this.lMd = str3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ThreadModel{times=");
            sb.append(this.zp);
            sb.append(", name='");
            sb.append(this.lMd);
            sb.append("', lastStackStack='");
            return AbstractC2914a.h(sb, this.KS, "'}");
        }

        public void zp(int i9) {
            this.zp = i9;
        }

        public int zp() {
            return this.zp;
        }
    }

    private static void lMd() {
        int i9;
        String str;
        KS YW = HWF.YW();
        if (YW == null) {
            return;
        }
        int i10 = 1;
        int addAndGet = KS.addAndGet(1);
        int i11 = HWF.KS;
        if (i11 >= 0 && addAndGet % i11 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap();
            if (allStackTraces == null) {
                return;
            }
            boolean zp2 = tG.zp();
            int size = allStackTraces.size();
            if (size > COT) {
                COT = size;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i12 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                i13 += i10;
                Thread key = next.getKey();
                StackTraceElement[] value = next.getValue();
                StringBuilder sb = new StringBuilder("\n");
                if (zp2) {
                    sb.append("Thread Name is : " + key.getName());
                    sb.append("\n");
                }
                int length = value.length;
                String str2 = null;
                int i14 = 0;
                while (i14 < length) {
                    String stackTraceElement = value[i14].toString();
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                    if (zp2) {
                        sb.append(stackTraceElement + "\n");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        if (!zp(stackTraceElement, zp)) {
                            str = stackTraceElement;
                            if (!zp(key.getName(), lMd)) {
                            }
                        } else {
                            str = stackTraceElement;
                        }
                        i12++;
                        str2 = str;
                    }
                    i14++;
                    it = it2;
                }
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                if (zp2) {
                    if (!TextUtils.isEmpty(str2)) {
                        StringBuilder c9 = AbstractC2965e.c(str2, "&");
                        c9.append(key.getName());
                        String sb2 = c9.toString();
                        zp zpVar = (zp) hashMap.get(sb2);
                        if (zpVar != null) {
                            i9 = 1;
                            zpVar.zp(zpVar.zp() + 1);
                        } else {
                            i9 = 1;
                            zpVar = new zp(sb2, 1, sb.toString(), key.getName());
                        }
                        hashMap.put(sb2, zpVar);
                    } else {
                        i9 = 1;
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        Log.e("PoolTaskStatistics", "Thread index = " + i13 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                        Log.w("PoolTaskStatistics", sb.toString());
                    }
                } else {
                    i9 = 1;
                }
                i10 = i9;
                it = it3;
            }
            if (i12 > jU) {
                jU = i12;
            }
            if (zp2) {
                StringBuilder p2 = n0.p(i12, "SDK current threads=", ", SDK Max threads=");
                n0.t(p2, jU, ", Application threads = ", size, ", Application max threads = ");
                p2.append(COT);
                Log.e("PoolTaskStatistics", p2.toString());
                Iterator it4 = hashMap.entrySet().iterator();
                while (it4.hasNext()) {
                    Log.i("PoolTaskStatistics", ((zp) ((Map.Entry) it4.next()).getValue()).toString());
                }
            }
            YW.zp(new com.bytedance.sdk.component.ku.lMd.zp(i12, jU, size, COT));
        }
    }

    public static void zp() {
        try {
            lMd();
        } catch (Throwable unused) {
        }
    }

    private static boolean zp(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
