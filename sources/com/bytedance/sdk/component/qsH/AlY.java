package com.bytedance.sdk.component.qsH;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.YoT;
import eb.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import vd.e;

/* loaded from: classes.dex */
public class AlY {
    private static AtomicInteger tN = new AtomicInteger(0);
    public static final String[] YFl = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] Sg = {"tt_pangle", "bd_tracker"};
    private static int AlY = 0;
    private static int wN = 0;

    /* loaded from: classes.dex */
    public static class YFl {
        public String AlY;
        public String Sg;
        public int YFl;
        public String tN;

        public YFl(String str, int i10, String str2, String str3) {
            this.tN = str;
            this.YFl = i10;
            this.AlY = str2;
            this.Sg = str3;
        }

        public void YFl(int i10) {
            this.YFl = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ThreadModel{times=");
            sb2.append(this.YFl);
            sb2.append(", name='");
            sb2.append(this.Sg);
            sb2.append("', lastStackStack='");
            return e.h(sb2, this.tN, "'}");
        }

        public int YFl() {
            return this.YFl;
        }
    }

    private static void Sg() {
        int i10;
        StackTraceElement[] stackTraceElementArr;
        tN NjR = vc.NjR();
        if (NjR == null) {
            return;
        }
        int i11 = 1;
        int addAndGet = tN.addAndGet(1);
        int i12 = vc.tN;
        if (i12 >= 0 && addAndGet % i12 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap();
            if (allStackTraces == null) {
                return;
            }
            boolean YFl2 = YoT.YFl();
            int size = allStackTraces.size();
            if (size > wN) {
                wN = size;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i13 = 0;
            int i14 = 0;
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                i14 += i11;
                Thread key = next.getKey();
                StackTraceElement[] value = next.getValue();
                StringBuilder sb2 = new StringBuilder("\n");
                if (YFl2) {
                    sb2.append("Thread Name is : " + key.getName());
                    sb2.append("\n");
                }
                int length = value.length;
                String str = null;
                int i15 = 0;
                while (i15 < length) {
                    String stackTraceElement = value[i15].toString();
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                    if (YFl2) {
                        sb2.append(stackTraceElement + "\n");
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!YFl(stackTraceElement, YFl)) {
                            stackTraceElementArr = value;
                            if (!YFl(key.getName(), Sg)) {
                            }
                        } else {
                            stackTraceElementArr = value;
                        }
                        i13++;
                        str = stackTraceElement;
                    } else {
                        stackTraceElementArr = value;
                    }
                    i15++;
                    it = it2;
                    value = stackTraceElementArr;
                }
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                if (YFl2) {
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder n10 = j.n(str, "&");
                        n10.append(key.getName());
                        String sb3 = n10.toString();
                        YFl yFl = (YFl) hashMap.get(sb3);
                        if (yFl != null) {
                            i10 = 1;
                            yFl.YFl(yFl.YFl() + 1);
                        } else {
                            i10 = 1;
                            yFl = new YFl(sb3, 1, sb2.toString(), key.getName());
                        }
                        hashMap.put(sb3, yFl);
                    } else {
                        i10 = 1;
                    }
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                        Log.w("PoolTaskStatistics", sb2.toString());
                    }
                    i11 = i10;
                } else {
                    i11 = 1;
                }
                it = it3;
            }
            if (i13 > AlY) {
                AlY = i13;
            }
            if (YFl2) {
                StringBuilder m10 = a4.j.m("SDK current threads=", i13, ", SDK Max threads=");
                a4.j.y(m10, AlY, ", Application threads = ", size, ", Application max threads = ");
                m10.append(wN);
                Log.e("PoolTaskStatistics", m10.toString());
                Iterator it4 = hashMap.entrySet().iterator();
                while (it4.hasNext()) {
                    Log.i("PoolTaskStatistics", ((YFl) ((Map.Entry) it4.next()).getValue()).toString());
                }
            }
            NjR.YFl(new com.bytedance.sdk.component.qsH.Sg.YFl(i13, AlY, size, wN));
        }
    }

    public static void YFl() {
        try {
            Sg();
        } catch (Throwable unused) {
        }
    }

    private static boolean YFl(String str, String[] strArr) {
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
