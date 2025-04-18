package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.instagram.common.viewpoint.core.C0608Im;
import com.instagram.common.viewpoint.core.C0663Kw;
import com.instagram.common.viewpoint.core.C1044Zr;
import com.instagram.common.viewpoint.core.C1045Zs;
import com.instagram.common.viewpoint.core.C8E;
import com.instagram.common.viewpoint.core.C8F;
import com.instagram.common.viewpoint.core.ExecutorC0690Lx;
import com.instagram.common.viewpoint.core.InterfaceC0661Ks;
import com.instagram.common.viewpoint.core.RunnableC0660Kr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1044Zr A02;
    public static byte[] A03;
    public static String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final C0663Kw A05;
    public static final List<InterfaceC0661Ks> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 2, 35, 69, 86, 75, 88, 75, 86, 91, 28, 2, -90, -102, -20, -33, -32, -76, -102, 6, 40, 57, 46, 59, 46, 57, 62, -27, 41, 46, 56, 40, 55, 42, 53, 38, 51, 40, 46, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, 92, 111, 107, 23, 96, 106, 23, 101, 102, 107, 23, 56, 103, 103, 99, 96, 90, 88, 107, 96, 102, 101, 37, -3, 41, 40, 29, 47, 44, 44, 31, 40, 46, -38, 39, 41, 30, 35, 32, 35, 29, 27, 46, 35, 41, 40, -38, 31, 50, 29, 31, 42, 46, 35, 41, 40, -38, 46, 34, 44, 41, 49, 40, 30, 47, 44, 35, 40, 33, -38, 44, 31, 33, 35, 45, 46, 31, 44, -5, 29, 46, 35, 48, 35, 46, 51, -3, 27, 38, 38, 28, 27, 29, 37, 45, 6, 35, 45, 46, 31, 40, 31, 44, 45, 74, 66, -2, Utf8.REPLACEMENT_BYTE, 65, 82, 71, 84, 71, 82, 87, -2, 81, 82, Utf8.REPLACEMENT_BYTE, 82, 67, 24, -2, 24, 41, 61, 59, 45, 44, -24, 41, 43, 60, 49, 62, 49, 60, 65, -24, 49, 59, -24, 54, 55, 60, -24, 58, 45, 59, 61, 53, 45, 44, -10, 44, Utf8.REPLACEMENT_BYTE, 77, 20, -6, 23, 25, 42, 21, 43, 42, 31, 34, -35, -20, -27, 58, 57, 12, 46, Utf8.REPLACEMENT_BYTE, 52, 65, 52, Utf8.REPLACEMENT_BYTE, 68, 14, 61, 48, 44, Utf8.REPLACEMENT_BYTE, 48, 47};
        if (A04[0].charAt(5) != 'm') {
            throw new RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized void A04(C1044Zr c1044Zr, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = c1044Zr;
            A01 = c1044Zr.getApplicationContext();
            if (A01 instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            c1044Zr.A07().AA0(A01(208, 8, 61), C8E.A02, new C8F(A01(72, 80, 65)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1044Zr);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                c1044Zr.A07().AA0(A01(216, 3, 3), C8E.A0d, new C8F(A01(42, 30, 126)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = C0663Kw.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized android.app.Activity A00() {
        /*
            java.lang.Class<com.facebook.ads.internal.util.activity.ActivityUtils> r8 = com.facebook.ads.internal.util.activity.ActivityUtils.class
            monitor-enter(r8)
            r6 = 0
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A08     // Catch: java.lang.Throwable -> La0
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La0
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> La0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La0
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> La0
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> La0
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> La0
        L2d:
            r5 = 0
            r7 = 1
            if (r6 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La0
            r0 = 28
            if (r1 >= r0) goto L38
            goto L3a
        L38:
            r1 = 0
            goto L3b
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L41
            android.app.Activity r5 = com.instagram.common.viewpoint.core.AbstractC0658Kp.A00()     // Catch: java.lang.Throwable -> La0
        L41:
            com.facebook.ads.redexgen.X.Zr r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9a
            if (r1 == 0) goto L9a
            if (r6 == r5) goto L9a
            r2 = 19
            r1 = 23
            r0 = 76
            java.lang.String r1 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            r3 = 203(0xcb, float:2.84E-43)
            r2 = 5
            r0 = 97
            java.lang.String r0 = A01(r3, r2, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r4 = r0.append(r6)     // Catch: java.lang.Throwable -> La0
            r3 = 12
            r2 = 7
            r0 = 1
            java.lang.String r0 = A01(r3, r2, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.8F r2 = new com.facebook.ads.redexgen.X.8F     // Catch: java.lang.Throwable -> La0
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> La0
            r2.A05(r7)     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.Zr r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La0
            com.facebook.ads.redexgen.X.8D r4 = r0.A07()     // Catch: java.lang.Throwable -> La0
            r3 = 208(0xd0, float:2.91E-43)
            r1 = 8
            r0 = 61
            java.lang.String r0 = A01(r3, r1, r0)     // Catch: java.lang.Throwable -> La0
            int r1 = com.instagram.common.viewpoint.core.C8E.A03     // Catch: java.lang.Throwable -> La0
            r4.AA0(r0, r1, r2)     // Catch: java.lang.Throwable -> La0
        L9a:
            if (r6 == 0) goto L9e
            monitor-exit(r8)
            return r6
        L9e:
            monitor-exit(r8)
            return r5
        La0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.activity.ActivityUtils.A00():android.app.Activity");
    }

    public static void A03(C1045Zs c1045Zs) {
        if (!C0608Im.A1f(c1045Zs) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        RunnableC0660Kr runnableC0660Kr = new RunnableC0660Kr(c1045Zs);
        synchronized (A07) {
            A07.add(runnableC0660Kr);
        }
        ExecutorC0690Lx.A01.A01().postDelayed(runnableC0660Kr, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<InterfaceC0661Ks> it = A06.iterator();
        boolean hasNext = it.hasNext();
        String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (hasNext) {
            it.next();
            throw new NullPointerException(A01(219, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            C8F c8f = new C8F(A01(Opcodes.IRETURN, 31, 79), A01(Opcodes.DCMPG, 20, 101) + num + A01(0, 12, 105) + activity);
            c8f.A05(0);
            A02.A07().AA0(A01(208, 8, 61), C8E.A03, c8f);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ExecutorC0690Lx.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
