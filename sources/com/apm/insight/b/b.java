package com.apm.insight.b;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.r;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    static volatile boolean a = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f2958f;

    /* renamed from: c, reason: collision with root package name */
    private c f2960c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f2961d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f2962e;

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f2966j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f2967k;

    /* renamed from: p, reason: collision with root package name */
    private JSONArray f2972p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f2973q;

    /* renamed from: t, reason: collision with root package name */
    private JSONArray f2976t;
    private JSONArray u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f2977v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2978w;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f2980y;

    /* renamed from: g, reason: collision with root package name */
    private long f2963g = -1;

    /* renamed from: h, reason: collision with root package name */
    private File f2964h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2965i = true;

    /* renamed from: l, reason: collision with root package name */
    private String f2968l = AppLovinMediationProvider.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    private String f2969m = AppLovinMediationProvider.UNKNOWN;

    /* renamed from: n, reason: collision with root package name */
    private String f2970n = AppLovinMediationProvider.UNKNOWN;

    /* renamed from: o, reason: collision with root package name */
    private String f2971o = "npth_inner_default";

    /* renamed from: r, reason: collision with root package name */
    private int f2974r = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f2975s = -1;

    /* renamed from: x, reason: collision with root package name */
    private final Object f2979x = new Object();

    /* renamed from: z, reason: collision with root package name */
    private long f2981z = -1;
    private long A = 0;
    private final Runnable B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;

    /* renamed from: b, reason: collision with root package name */
    Pattern f2959b = null;
    private File E = null;

    public b(Context context) {
        this.f2961d = context;
    }

    private static String a(float f10) {
        return f10 <= 0.0f ? "0%" : f10 <= 0.1f ? "0% - 10%" : f10 <= 0.3f ? "10% - 30%" : f10 <= 0.6f ? "30% - 60%" : f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private String c(long j3) {
        long j10 = j3 - com.apm.insight.i.j();
        return j10 < 30000 ? "0 - 30s" : j10 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "30s - 1min" : j10 < 120000 ? "1min - 2min" : j10 < 300000 ? "2min - 5min" : j10 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j10 < 1800000 ? "10min - 30min" : j10 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private boolean g() {
        boolean z10 = !com.apm.insight.l.a.a(this.f2961d);
        if (!z10 || com.apm.insight.runtime.a.b.d().e() > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            return z10;
        }
        return false;
    }

    private File h() {
        if (this.E == null) {
            this.E = new File(this.f2961d.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.c(this.f2961d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void d() {
        if (f2958f) {
            return;
        }
        synchronized (this.f2979x) {
            if (f2958f) {
                return;
            }
            this.B.run();
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.h.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        this.f2981z = SystemClock.uptimeMillis();
        this.f2980y = true;
    }

    public void f() {
        File h10 = h();
        try {
            int intValue = Integer.decode(com.apm.insight.l.h.c(h10.getAbsolutePath())).intValue();
            this.C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.h.a(h10);
        }
    }

    private static String a(float f10, float f11) {
        return f11 > 0.0f ? a(f10 / f11) : f10 > 0.0f ? "100%" : "0%";
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = com.apm.insight.l.k.a(NotificationCompat.FLAG_LOCAL_ONLY, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f2974r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < a10.length(); i10++) {
                sb2.append(a10.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void b() {
        if (this.f2962e) {
            this.f2962e = false;
            c cVar = this.f2960c;
            if (cVar != null) {
                cVar.b();
            }
            this.f2960c = null;
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = com.apm.insight.l.k.a(NotificationCompat.FLAG_LOCAL_ONLY, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f2974r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a10);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void b(long j3) {
        if (this.A != this.f2981z) {
            try {
                this.f2975s = System.currentTimeMillis();
                this.u = g.b().c();
                this.f2976t = k.a(100, j3);
                this.f2967k = g.b().a(j3).a();
                JSONObject jSONObject = new JSONObject();
                this.f2977v = jSONObject;
                com.apm.insight.l.a.a(this.f2961d, jSONObject);
                this.f2978w = g();
                this.f2965i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f2963g = this.f2975s;
                String b3 = n.b();
                File file = new File(new File(n.f(this.f2961d), b3), "trace_" + com.apm.insight.l.a.c(this.f2961d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.h.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b3);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray b10 = com.apm.insight.l.h.b(file.getAbsolutePath());
                    this.f2972p = b10;
                    a(b10);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
                if (this.f2966j == null) {
                    this.f2966j = d.a(true);
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.f2963g = this.f2975s;
                String b11 = n.b();
                File file2 = new File(new File(n.f(this.f2961d), b11), "trace" + com.apm.insight.l.a.c(this.f2961d).replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.h.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b11);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray b12 = com.apm.insight.l.h.b(file2.getAbsolutePath());
                    this.f2972p = b12;
                    a(b12);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th4);
                }
                if (this.f2966j == null) {
                    this.f2966j = d.a(true);
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a().a("NPTH_CATCH", th5);
            }
        }
        long j10 = this.f2981z;
        this.A = j10;
        this.f2981z = -1L;
        if (j10 == -1) {
            this.A = (-1) - 1;
        }
    }

    public void c() {
        c cVar = this.f2960c;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : o.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    }

    public void a() {
        if (this.f2962e) {
            return;
        }
        this.f2960c = new c(this);
        this.f2963g = com.apm.insight.i.j();
        this.f2962e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f0, code lost:
    
        if (r7 != 5) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a0 A[LOOP:2: B:95:0x01da->B:124:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0395 A[EDGE_INSN: B:125:0x0395->B:18:0x0395 BREAK  A[LOOP:2: B:95:0x01da->B:124:0x02a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03b7 A[EDGE_INSN: B:23:0x03b7->B:24:0x03b7 BREAK  A[LOOP:0: B:2:0x0039->B:8:0x039f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r26, org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String optString = jSONArray.optString(i10);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.f2959b == null) {
                    this.f2959b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.f2959b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                int intValue = Integer.decode(split[1]).intValue();
                int intValue2 = Integer.decode(split[2]).intValue();
                return new int[]{intValue, intValue2, intValue + intValue2};
            }
        }
        return null;
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a10;
        String e2 = vd.e.e("npth_anr_", str);
        if (hashMap.isEmpty()) {
            str2 = eb.j.k(e2, "_total");
            a10 = "not found";
        } else {
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    f10 += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    f11 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    f12 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    f13 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    f14 += entry.getValue().floatValue();
                }
            }
            float f15 = f10 + f11 + f12 + f13 + f14;
            jSONObject.put(eb.j.k(e2, "_total"), b(f15));
            jSONObject.put(e2 + "_kernel_user_ratio", a(f11, f15));
            str2 = e2 + "_iowait_user_ratio";
            a10 = a(f12, f15);
        }
        jSONObject.put(str2, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.json.JSONArray r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03df A[Catch: all -> 0x0483, TRY_ENTER, TryCatch #3 {all -> 0x0483, blocks: (B:45:0x017f, B:48:0x01fc, B:50:0x0201, B:53:0x020a, B:55:0x020e, B:57:0x0214, B:58:0x021c, B:78:0x03df, B:79:0x0408, B:81:0x040c, B:82:0x0412, B:93:0x0467, B:114:0x021a), top: B:44:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0408 A[Catch: all -> 0x0483, TryCatch #3 {all -> 0x0483, blocks: (B:45:0x017f, B:48:0x01fc, B:50:0x0201, B:53:0x020a, B:55:0x020e, B:57:0x0214, B:58:0x021c, B:78:0x03df, B:79:0x0408, B:81:0x040c, B:82:0x0412, B:93:0x0467, B:114:0x021a), top: B:44:0x017f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    private boolean a(long j3) {
        if (this.f2980y) {
            this.f2980y = false;
            b(j3);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray c10 = com.apm.insight.runtime.a.c();
            if (c10 != null) {
                this.D = new LinkedList();
                this.f2971o = c10.optString(0);
                for (int i10 = 1; i10 < c10.length(); i10++) {
                    try {
                        this.D.add(Pattern.compile(c10.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.D.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
