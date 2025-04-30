package com.vungle.ads;

import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.C1834c;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19756c;

    public /* synthetic */ L(Object obj, int i9) {
        this.b = i9;
        this.f19756c = obj;
    }

    private final void a() {
        String a6;
        Locale locale;
        String str = (String) this.f19756c;
        String str2 = "0";
        if (!O2.a.b(z2.d.class)) {
            try {
                Bundle bundle = new Bundle();
                C1834c b = AbstractC1839h.b(com.facebook.r.a());
                JSONArray jSONArray = new JSONArray();
                String str3 = Build.MODEL;
                if (str3 == null) {
                    str3 = "";
                }
                jSONArray.put(str3);
                if (b == null) {
                    a6 = null;
                } else {
                    a6 = b.a();
                }
                if (a6 != null) {
                    jSONArray.put(b.a());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put("0");
                if (E2.e.c()) {
                    str2 = "1";
                }
                jSONArray.put(str2);
                try {
                    locale = com.facebook.r.a().getResources().getConfiguration().locale;
                } catch (Exception unused) {
                    locale = null;
                }
                if (locale == null) {
                    locale = Locale.getDefault();
                    G7.j.d(locale, "getDefault()");
                }
                jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                String jSONArray2 = jSONArray.toString();
                G7.j.d(jSONArray2, "extInfoArray.toString()");
                bundle.putString("device_session_id", z2.d.a());
                bundle.putString("extinfo", jSONArray2);
                String str4 = com.facebook.C.f13380j;
                boolean z8 = true;
                JSONObject jSONObject = new com.facebook.C(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, com.facebook.G.f13409c, null).c().b;
                AtomicBoolean atomicBoolean = z2.d.f24513g;
                if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                    z8 = false;
                }
                atomicBoolean.set(z8);
                if (!atomicBoolean.get()) {
                    z2.d.f24511e = null;
                } else {
                    z2.k kVar = z2.d.f24510d;
                    if (kVar != null) {
                        kVar.c();
                    }
                }
                z2.d.f24514h = false;
            } catch (Throwable th) {
                O2.a.a(z2.d.class, th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0633 A[Catch: IOException -> 0x05d6, UnknownHostException -> 0x05d9, TRY_LEAVE, TryCatch #18 {UnknownHostException -> 0x05d9, IOException -> 0x05d6, blocks: (B:138:0x059b, B:140:0x05ac, B:143:0x05dc, B:145:0x05e6, B:149:0x05f6, B:151:0x0633, B:158:0x064f, B:167:0x0656, B:168:0x0659, B:169:0x065a, B:172:0x05ba, B:173:0x05c0, B:175:0x05c6, B:177:0x0677, B:178:0x067e, B:153:0x0641, B:155:0x0647, B:163:0x0653), top: B:137:0x059b, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x040e  */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.L.run():void");
    }
}
