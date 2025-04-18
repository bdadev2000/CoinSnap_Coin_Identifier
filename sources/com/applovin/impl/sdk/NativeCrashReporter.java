package com.applovin.impl.sdk;

import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sj;
import com.applovin.impl.yp;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NativeCrashReporter implements e.d {

    /* renamed from: a */
    private static boolean f26520a;

    /* renamed from: b */
    private static boolean f26521b;

    /* renamed from: c */
    private static final NativeCrashReporter f26522c = new NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public /* synthetic */ void b(e.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
        JsonUtils.putString(jSONObject, "ad_format", bVar.g());
        JsonUtils.putString(jSONObject, BrandSafetyEvent.ad, bVar.c());
        JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
        JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
        JsonUtils.putString(jSONObject, "bcode", bVar.e());
        JsonUtils.putString(jSONObject, "creative_id", bVar.f());
        JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
        updateAdInfo(bVar.h(), jSONObject.toString());
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z2);

    private native void removeAdInfo(int i2);

    private native void updateAdInfo(int i2, String str);

    public static void a(j jVar) {
        if (jVar == null) {
            return;
        }
        if (!((Boolean) jVar.a(sj.G4)).booleanValue() && !yp.i(j.l())) {
            if (f26521b) {
                try {
                    e j2 = jVar.j();
                    NativeCrashReporter nativeCrashReporter = f26522c;
                    j2.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    jVar.J();
                    if (n.a()) {
                        jVar.J().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    jVar.E().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List c2 = jVar.c(sj.H4);
            int[] iArr = new int[c2.size()];
            for (int i2 = 0; i2 < c2.size(); i2++) {
                try {
                    iArr[i2] = Integer.parseInt((String) c2.get(i2));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(j.l().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, jVar);
            } else if (!file.mkdir()) {
                jVar.J();
                if (n.a()) {
                    jVar.J().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f26522c;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) jVar.a(sj.I4)).booleanValue());
                HashSet hashSet = new HashSet();
                hashSet.add(e.c.SHOW);
                hashSet.add(e.c.CLICK);
                hashSet.add(e.c.SHOW_ERROR);
                hashSet.add(e.c.DESTROY);
                jVar.j().a(nativeCrashReporter2, hashSet);
            } catch (Throwable th2) {
                jVar.J();
                if (n.a()) {
                    jVar.J().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                jVar.E().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private static boolean a() {
        if (!f26520a) {
            f26520a = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f26521b = true;
            } catch (Throwable th) {
                n.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f26521b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:9|(8:11|12|13|(1:15)(4:33|(4:36|(2:38|39)(2:41|42)|40|34)|43|44)|16|17|(2:19|(2:21|22)(1:24))(1:25)|23))|51|(1:53)|16|17|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        r17.J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        if (com.applovin.impl.sdk.n.a() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        r17.J().a("NativeCrashReporter", "Failed to delete native crash report: " + r6.getAbsolutePath(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:17:0x00b9, B:19:0x00bf, B:21:0x00c8), top: B:16:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.io.File r16, com.applovin.impl.sdk.j r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.j):void");
    }

    @Override // com.applovin.impl.sdk.e.d
    public void a(e.b bVar) {
        if (bVar.i() == e.c.DESTROY) {
            removeAdInfo(bVar.h());
        } else {
            yp.a((Runnable) new androidx.core.content.res.a(12, this, bVar));
        }
    }
}
