package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c {
    public static String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12973b = false;

    public static void a() {
        boolean z10 = false;
        if (!af.a().a("cronet_env_check", false)) {
            return;
        }
        try {
            GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.m().c());
            GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.m().c(), 11925000);
            try {
                String b3 = b();
                if (!TextUtils.isEmpty(b3)) {
                    z10 = true;
                }
                f12973b = z10;
                if (!z10) {
                    return;
                }
                a = b3;
            } catch (Throwable th2) {
                ad.b("CronetEnvCheckUtil", th2.getMessage());
            }
        } catch (Throwable th3) {
            ad.b("CronetEnvCheckUtil", th3.getMessage());
            f12973b = false;
        }
    }

    private static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb2 = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.m().c().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.m().c()).getClass().getName())) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(pair.first);
                    }
                } catch (Throwable th2) {
                    ad.b("CronetEnvCheckUtil", th2.getMessage());
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            ad.b("CronetEnvCheckUtil", th3.getMessage());
            return "";
        }
    }
}
