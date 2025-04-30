package a5;

import B4.d;
import D0.i;
import G5.c;
import G7.j;
import L4.f;
import N1.l;
import P1.B;
import Q.g;
import a2.C0333b;
import a2.C0337f;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.N0;
import androidx.work.o;
import c2.InterfaceC0602m;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.C1849l;
import com.facebook.H;
import com.facebook.I;
import com.facebook.InterfaceC1826d;
import com.facebook.J;
import com.facebook.appevents.e;
import com.facebook.appevents.h;
import com.facebook.internal.G;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.facebook.internal.z;
import j2.AbstractC2384b;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import r8.k;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0398b implements d, C0.d, c, A5.d, Q1.a, l, N0, InterfaceC0602m, InterfaceC1826d, G, k2.c, OnEventTrackingSucceededListener {
    public static C0398b b;

    public static byte[][] B(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i9 = 0; i9 < bArr.length; i9++) {
            int length = (bArr.length - i9) - 1;
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                bArr2[i10][length] = bArr[i9][i10];
            }
        }
        return bArr2;
    }

    public static final void r(e eVar, com.facebook.appevents.b bVar) {
        boolean z8;
        String str = com.facebook.appevents.l.f13492c;
        i iVar = h.f13483a;
        if (!O2.a.b(h.class)) {
            try {
                j.e(bVar, "accessTokenAppId");
                h.b.execute(new A4.d(28, bVar, eVar));
            } catch (Throwable th) {
                O2.a.a(h.class, th);
            }
        }
        r rVar = r.f13653a;
        boolean b8 = r.b(p.OnDevicePostInstallEventProcessing);
        String str2 = eVar.f13480f;
        boolean z9 = eVar.f13478c;
        boolean z10 = false;
        if (b8 && G2.b.a()) {
            String str3 = bVar.b;
            if (!O2.a.b(G2.b.class)) {
                try {
                    j.e(str3, "applicationId");
                    G2.b bVar2 = G2.b.f1264a;
                    if (!O2.a.b(bVar2)) {
                        if (z9) {
                            try {
                                if (G2.b.b.contains(str2)) {
                                    z8 = true;
                                    if (!(!z9) || z8) {
                                        com.facebook.r.c().execute(new A4.d(3, str3, eVar));
                                    }
                                }
                            } catch (Throwable th2) {
                                O2.a.a(bVar2, th2);
                            }
                        }
                        z8 = false;
                        if (!(!z9)) {
                        }
                        com.facebook.r.c().execute(new A4.d(3, str3, eVar));
                    }
                } catch (Throwable th3) {
                    O2.a.a(G2.b.class, th3);
                }
            }
        }
        if (!z9) {
            if (!O2.a.b(com.facebook.appevents.l.class)) {
                try {
                    z10 = com.facebook.appevents.l.f13496g;
                } catch (Throwable th4) {
                    O2.a.a(com.facebook.appevents.l.class, th4);
                }
            }
            if (!z10) {
                if (j.a(str2, "fb_mobile_activate_app")) {
                    if (!O2.a.b(com.facebook.appevents.l.class)) {
                        try {
                            com.facebook.appevents.l.f13496g = true;
                            return;
                        } catch (Throwable th5) {
                            O2.a.a(com.facebook.appevents.l.class, th5);
                            return;
                        }
                    }
                    return;
                }
                f fVar = z.f13680c;
                f.l(H.f13413f, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    public static D5.b s(byte[][] bArr, int i9) {
        int i10 = i9 * 2;
        int length = bArr[0].length + i10;
        int length2 = bArr.length + i10;
        D5.b bVar = new D5.b(length, length2);
        int[] iArr = bVar.f748f;
        int length3 = iArr.length;
        for (int i11 = 0; i11 < length3; i11++) {
            iArr[i11] = 0;
        }
        int i12 = (length2 - i9) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    bVar.b(i14 + i9, i12);
                }
            }
            i13++;
            i12--;
        }
        return bVar;
    }

    public static com.facebook.appevents.j u() {
        com.facebook.appevents.j jVar;
        synchronized (com.facebook.appevents.l.c()) {
            jVar = null;
            if (!O2.a.b(com.facebook.appevents.l.class)) {
                try {
                    jVar = com.facebook.appevents.j.b;
                } catch (Throwable th) {
                    O2.a.a(com.facebook.appevents.l.class, th);
                }
            }
        }
        return jVar;
    }

    public static String v() {
        R3.e eVar = new R3.e(21);
        if (!com.facebook.r.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(com.facebook.r.a()).build();
            try {
                build.startConnection(new E1.d(22, build, eVar));
            } catch (Exception unused) {
            }
        }
        return com.facebook.r.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C0398b.x(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void y() {
        synchronized (com.facebook.appevents.l.c()) {
            if (com.facebook.appevents.l.b() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!O2.a.b(com.facebook.appevents.l.class)) {
                try {
                    com.facebook.appevents.l.f13493d = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    O2.a.a(com.facebook.appevents.l.class, th);
                }
            }
            C2.b bVar = new C2.b(14);
            ScheduledThreadPoolExecutor b8 = com.facebook.appevents.l.b();
            if (b8 != null) {
                b8.scheduleAtFixedRate(bVar, 0L, 86400L, TimeUnit.SECONDS);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public boolean A(CharSequence charSequence) {
        return charSequence instanceof R.e;
    }

    @Override // C0.d
    public void a(int i9, Serializable serializable) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 != 6 && i9 != 7 && i9 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override // Q1.a
    public Bitmap b(int i9, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i9, i10, config);
    }

    @Override // com.facebook.internal.G
    public void c(JSONObject jSONObject) {
        String optString;
        Uri uri;
        Uri uri2 = null;
        if (jSONObject == null) {
            optString = null;
        } else {
            optString = jSONObject.optString("id");
        }
        if (optString == null) {
            Log.w("I", "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        String optString4 = jSONObject.optString("first_name");
        String optString5 = jSONObject.optString("middle_name");
        String optString6 = jSONObject.optString("last_name");
        String optString7 = jSONObject.optString("name");
        if (optString2 != null) {
            uri = Uri.parse(optString2);
        } else {
            uri = null;
        }
        if (optString3 != null) {
            uri2 = Uri.parse(optString3);
        }
        J.f13424d.u().a(new I(optString, optString4, optString5, optString6, optString7, uri, uri2), true);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.facebook.InterfaceC1826d
    public String e() {
        return "fb_extend_sso_token";
    }

    @Override // B4.d
    public B4.b f(r6.b bVar, JSONObject jSONObject) {
        o oVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            oVar = new o(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            oVar = new o(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        o oVar2 = oVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        B4.a aVar = new B4.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j7 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            bVar.getClass();
            currentTimeMillis = (j7 * 1000) + System.currentTimeMillis();
        }
        return new B4.b(currentTimeMillis, oVar2, aVar, optDouble, optDouble2, optInt2);
    }

    @Override // C0.d
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.facebook.internal.G
    public void h(C1849l c1849l) {
        Log.e("I", j.j(c1849l, "Got unexpected exception: "));
    }

    @Override // k2.c
    public void i(Object obj) {
        ((List) obj).clear();
    }

    @Override // G5.c
    public void j(G5.d dVar) {
        boolean z8;
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!dVar.b()) {
                break;
            }
            sb.append(dVar.a());
            int i9 = dVar.f1278a + 1;
            dVar.f1278a = i9;
            if (k.t(dVar.f1280d, i9, 5) != 5) {
                dVar.b = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        StringBuilder sb2 = (StringBuilder) dVar.f1282f;
        int length2 = sb2.length() + length + 1;
        dVar.d(length2);
        if (((G5.f) dVar.f1283g).b - length2 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (dVar.b() || z8) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length3 = sb.length();
        for (int i10 = 0; i10 < length3; i10++) {
            int length4 = (((sb2.length() + 1) * 149) % 255) + 1 + sb.charAt(i10);
            if (length4 > 255) {
                length4 -= 256;
            }
            dVar.e((char) length4);
        }
    }

    @Override // Q1.a
    public Bitmap k(int i9, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i9, i10, config);
    }

    @Override // com.facebook.InterfaceC1826d
    public String l() {
        return "oauth/access_token";
    }

    @Override // N1.b
    public boolean m(Object obj, File file, N1.i iVar) {
        try {
            AbstractC2384b.d(((C0337f) ((C0333b) ((B) obj).get()).b.b).f3936a.f1967d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e4) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e4);
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bb, code lost:
    
        r11 = (r11 - r4) - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e3, code lost:
    
        r11 = r11 - r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0420 A[LOOP:12: B:214:0x041e->B:215:0x0420, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04d8  */
    @Override // A5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D5.b n(java.lang.String r24, int r25, java.util.EnumMap r26) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C0398b.n(java.lang.String, int, java.util.EnumMap):D5.b");
    }

    @Override // com.adjust.sdk.OnEventTrackingSucceededListener
    public void onFinishedEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
        Log.d("MiaAdjust", "Event success callback called!");
        Log.d("MiaAdjust", "Event success data: " + adjustEventSuccess.toString());
    }

    @Override // N1.l
    public int p(N1.i iVar) {
        return 1;
    }

    public void t(M7.b bVar, List list) {
        j.e(bVar, "kClass");
        j.e(list, "typeArgumentsSerializers");
    }

    public int w(Object obj) {
        return ((g) obj).f2462c;
    }

    public boolean z(Object obj) {
        return ((g) obj).f2463d;
    }

    @Override // Q1.a
    public void q() {
    }

    @Override // Q1.a
    public void o(int i9) {
    }
}
