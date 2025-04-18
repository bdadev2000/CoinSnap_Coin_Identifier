package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener;
import com.instagram.common.viewpoint.core.C01770o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.0o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01770o {
    public static byte[] A06;
    public static String[] A07 = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public Application A01;
    public UserReturnTracker$UserReturnListener A03;
    public final J7 A05;
    public long A00 = 0;
    public String A04 = null;
    public EnumC01700g A02 = null;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{95, 92, 94, 86, 98, 73, 84, 80, 88, 12, 5, 1, 22, 5, Utf8.REPLACEMENT_BYTE, 20, 9, 13, 5, 17, 11, 10, 29, 17, 19, 27};
    }

    static {
        A03();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public C01770o(J7 j7, final Activity activity, int i2) {
        this.A05 = j7;
        this.A01 = activity.getApplication();
        this.A03 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public C01770o A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                    this.A00 = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static C01770o A00(J7 j7, Activity activity) {
        return A01(j7, activity, Build.VERSION.SDK_INT);
    }

    public static C01770o A01(J7 j7, Activity activity, int i2) {
        if (activity != null && i2 >= 14) {
            return new C01770o(j7, activity, i2);
        }
        return null;
    }

    private void A04(String str, long j2, long j3, EnumC01700g enumC01700g) {
        HashMap hashMap = new HashMap();
        hashMap.put(A02(9, 10, Opcodes.LREM), Long.toString(j2));
        hashMap.put(A02(0, 9, 44), Long.toString(j3));
        if (enumC01700g != null) {
            hashMap.put(A02(19, 7, 111), enumC01700g.name());
        }
        this.A05.AAZ(str, hashMap);
    }

    public final void A05() {
        A04(this.A04, this.A00, System.currentTimeMillis(), this.A02);
        if (this.A01 != null && this.A03 != null) {
            this.A01.unregisterActivityLifecycleCallbacks(this.A03);
            if (A07[1].length() != 0) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "Bj7dFfY1wcZx";
            strArr[0] = "MwUlwbTeTJkw";
            this.A03 = null;
            this.A01 = null;
        }
    }

    public final void A06(EnumC01700g enumC01700g) {
        this.A02 = enumC01700g;
    }

    public final void A07(String str) {
        this.A04 = str;
        if (this.A03 != null && this.A01 != null) {
            this.A00 = System.currentTimeMillis();
            this.A01.registerActivityLifecycleCallbacks(this.A03);
        } else {
            if (A07[2].length() != 10) {
                throw new RuntimeException();
            }
            A07[3] = "P2oyl0IhOniiU9jQCrFtNFHhnuy";
            A04(str, -1L, -1L, EnumC01700g.A05);
        }
    }
}
