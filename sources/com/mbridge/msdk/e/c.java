package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f15331a = "";
    private static boolean b = false;

    public static void a() {
        if (!af.a().a("cronet_env_check", false)) {
            return;
        }
        try {
            GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.m().c());
            GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.m().c(), 11925000);
            try {
                String b8 = b();
                boolean z8 = !TextUtils.isEmpty(b8);
                b = z8;
                if (!z8) {
                    return;
                }
                f15331a = b8;
            } catch (Throwable th) {
                ad.b("CronetEnvCheckUtil", th.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("CronetEnvCheckUtil", th2.getMessage());
            b = false;
        }
    }

    private static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.m().c().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.m().c()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    ad.b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            ad.b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }
}
