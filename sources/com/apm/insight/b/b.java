package com.apm.insight.b;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.l.l;
import com.apm.insight.l.o;
import com.apm.insight.nativecrash.NativeImpl;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile boolean f5630a = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5631f;

    /* renamed from: c, reason: collision with root package name */
    private c f5637c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f5638d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5639e;

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f5643j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f5644k;

    /* renamed from: p, reason: collision with root package name */
    private JSONArray f5647p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f5648q;

    /* renamed from: t, reason: collision with root package name */
    private JSONArray f5651t;

    /* renamed from: u, reason: collision with root package name */
    private JSONArray f5652u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f5653v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5654w;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f5656y;

    /* renamed from: g, reason: collision with root package name */
    private long f5640g = -1;

    /* renamed from: h, reason: collision with root package name */
    private File f5641h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5642i = true;
    private String l = AppLovinMediationProvider.UNKNOWN;
    private String m = AppLovinMediationProvider.UNKNOWN;

    /* renamed from: n, reason: collision with root package name */
    private String f5645n = AppLovinMediationProvider.UNKNOWN;

    /* renamed from: o, reason: collision with root package name */
    private String f5646o = "npth_inner_default";

    /* renamed from: r, reason: collision with root package name */
    private int f5649r = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f5650s = -1;

    /* renamed from: x, reason: collision with root package name */
    private final Object f5655x = new Object();

    /* renamed from: z, reason: collision with root package name */
    private long f5657z = -1;

    /* renamed from: A, reason: collision with root package name */
    private long f5632A = 0;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f5633B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private int f5634C = 0;

    /* renamed from: D, reason: collision with root package name */
    private List<Pattern> f5635D = null;
    Pattern b = null;

    /* renamed from: E, reason: collision with root package name */
    private File f5636E = null;

    public b(Context context) {
        this.f5638d = context;
    }

    private static String a(float f9) {
        return f9 <= 0.0f ? "0%" : f9 <= 0.1f ? "0% - 10%" : f9 <= 0.3f ? "10% - 30%" : f9 <= 0.6f ? "30% - 60%" : f9 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String b(float f9) {
        return a(f9 / 100.0f);
    }

    private String c(long j7) {
        long j9 = j7 - com.apm.insight.i.j();
        return j9 < 30000 ? "0 - 30s" : j9 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "30s - 1min" : j9 < 120000 ? "1min - 2min" : j9 < 300000 ? "2min - 5min" : j9 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j9 < 1800000 ? "10min - 30min" : j9 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private boolean g() {
        boolean z8 = !com.apm.insight.l.a.a(this.f5638d);
        if (!z8 || com.apm.insight.runtime.a.b.d().e() > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            return z8;
        }
        return false;
    }

    private File h() {
        if (this.f5636E == null) {
            this.f5636E = new File(this.f5638d.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.c(this.f5638d).replaceAll(":", "_"));
        }
        return this.f5636E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void d() {
        if (f5631f) {
            return;
        }
        synchronized (this.f5655x) {
            try {
                if (f5631f) {
                    return;
                }
                this.f5633B.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.i.a(h(), String.valueOf(this.f5634C + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
        this.f5657z = SystemClock.uptimeMillis();
        this.f5656y = true;
    }

    public void f() {
        File h6 = h();
        try {
            int intValue = Integer.decode(com.apm.insight.l.i.c(h6.getAbsolutePath())).intValue();
            this.f5634C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.i.a(h6);
        }
    }

    private static String a(float f9, float f10) {
        return f10 > 0.0f ? a(f9 / f10) : f9 > 0.0f ? "100%" : "0%";
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a6 = l.a(NotificationCompat.FLAG_LOCAL_ONLY, 128, jSONArray);
        if (a6.length() != jSONArray.length()) {
            this.f5649r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < a6.length(); i9++) {
                sb.append(a6.getString(i9));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void b() {
        if (this.f5639e) {
            this.f5639e = false;
            c cVar = this.f5637c;
            if (cVar != null) {
                cVar.b();
            }
            this.f5637c = null;
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a6 = l.a(NotificationCompat.FLAG_LOCAL_ONLY, 128, jSONArray);
        if (a6.length() != jSONArray.length()) {
            this.f5649r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a6);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void b(long j7) {
        if (this.f5632A != this.f5657z) {
            try {
                this.f5650s = System.currentTimeMillis();
                this.f5652u = g.b().c();
                this.f5651t = k.a(100, j7);
                this.f5644k = g.b().a(j7).a();
                JSONObject jSONObject = new JSONObject();
                this.f5653v = jSONObject;
                com.apm.insight.l.a.a(this.f5638d, jSONObject);
                this.f5654w = g();
                this.f5642i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f5640g = this.f5650s;
                String b = o.b();
                File file = new File(new File(o.f(this.f5638d), b), "trace_" + com.apm.insight.l.a.c(this.f5638d).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.i.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray b8 = com.apm.insight.l.i.b(file.getAbsolutePath());
                    this.f5647p = b8;
                    a(b8);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
                if (this.f5643j == null) {
                    this.f5643j = d.a(true);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.f5640g = this.f5650s;
                String b9 = o.b();
                File file2 = new File(new File(o.f(this.f5638d), b9), "trace" + com.apm.insight.l.a.c(this.f5638d).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.i.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b9);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray b10 = com.apm.insight.l.i.b(file2.getAbsolutePath());
                    this.f5647p = b10;
                    a(b10);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th3);
                }
                if (this.f5643j == null) {
                    this.f5643j = d.a(true);
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a().a("NPTH_CATCH", th4);
            }
        }
        long j9 = this.f5657z;
        this.f5632A = j9;
        this.f5657z = -1L;
        if (j9 == -1) {
            this.f5632A = (-1) - 1;
        }
    }

    public void c() {
        c cVar = this.f5637c;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.o.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }

    public void a() {
        if (this.f5639e) {
            return;
        }
        this.f5637c = new c(this);
        this.f5640g = com.apm.insight.i.j();
        this.f5639e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r3 != 5) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c9 A[LOOP:2: B:95:0x01fb->B:124:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e A[EDGE_INSN: B:125:0x008e->B:43:0x008e BREAK  A[LOOP:2: B:95:0x01fb->B:124:0x02c9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03da A[EDGE_INSN: B:22:0x03da->B:23:0x03da BREAK  A[LOOP:0: B:2:0x0044->B:8:0x03df], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r29, org.json.JSONObject r30) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) {
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String optString = jSONArray.optString(i9);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.b == null) {
                    this.b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.b.split(optString.substring(indexOf));
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
        String a6;
        String d2 = AbstractC2914a.d("npth_anr_", str);
        if (hashMap.isEmpty()) {
            str2 = d2 + "_total";
            a6 = "not found";
        } else {
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    f9 = entry.getValue().floatValue() + f9;
                } else if (key.endsWith("kernel")) {
                    f10 = entry.getValue().floatValue() + f10;
                } else if (key.endsWith("iowait")) {
                    f11 = entry.getValue().floatValue() + f11;
                } else if (key.endsWith("irq")) {
                    f12 = entry.getValue().floatValue() + f12;
                } else if (key.endsWith("softirq")) {
                    f13 = entry.getValue().floatValue() + f13;
                }
            }
            float f14 = f9 + f10 + f11 + f12 + f13;
            jSONObject.put(com.mbridge.msdk.foundation.entity.o.j(d2, "_total"), b(f14));
            jSONObject.put(d2 + "_kernel_user_ratio", a(f10, f14));
            str2 = d2 + "_iowait_user_ratio";
            a6 = a(f11, f14);
        }
        jSONObject.put(str2, a6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0187, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.json.JSONArray r17) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0203 A[Catch: all -> 0x01f9, TryCatch #6 {all -> 0x01f9, blocks: (B:45:0x017e, B:48:0x01fe, B:50:0x0203, B:53:0x020c, B:55:0x0210, B:57:0x0216, B:58:0x021e, B:75:0x03e1, B:76:0x040a, B:78:0x040e, B:79:0x0414, B:90:0x0469, B:110:0x021c), top: B:44:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0394 A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #7 {all -> 0x027d, blocks: (B:107:0x0277, B:61:0x0281, B:64:0x033d, B:67:0x0363, B:69:0x0394, B:96:0x03a7, B:99:0x03b1, B:101:0x03b7, B:73:0x03a1), top: B:106:0x0277, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e1 A[Catch: all -> 0x01f9, TRY_ENTER, TryCatch #6 {all -> 0x01f9, blocks: (B:45:0x017e, B:48:0x01fe, B:50:0x0203, B:53:0x020c, B:55:0x0210, B:57:0x0216, B:58:0x021e, B:75:0x03e1, B:76:0x040a, B:78:0x040e, B:79:0x0414, B:90:0x0469, B:110:0x021c), top: B:44:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x040a A[Catch: all -> 0x01f9, TryCatch #6 {all -> 0x01f9, blocks: (B:45:0x017e, B:48:0x01fe, B:50:0x0203, B:53:0x020c, B:55:0x0210, B:57:0x0216, B:58:0x021e, B:75:0x03e1, B:76:0x040a, B:78:0x040e, B:79:0x0414, B:90:0x0469, B:110:0x021c), top: B:44:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b1 A[Catch: all -> 0x027d, TryCatch #7 {all -> 0x027d, blocks: (B:107:0x0277, B:61:0x0281, B:64:0x033d, B:67:0x0363, B:69:0x0394, B:96:0x03a7, B:99:0x03b1, B:101:0x03b7, B:73:0x03a1), top: B:106:0x0277, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    private boolean a(long j7) {
        if (this.f5656y) {
            this.f5656y = false;
            b(j7);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.f5635D == null) {
            JSONArray c9 = com.apm.insight.runtime.a.c();
            if (c9 != null) {
                this.f5635D = new LinkedList();
                this.f5646o = c9.optString(0);
                for (int i9 = 1; i9 < c9.length(); i9++) {
                    try {
                        this.f5635D.add(Pattern.compile(c9.optString(i9)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f5635D == null) {
                LinkedList linkedList = new LinkedList();
                this.f5635D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f5635D.add(Pattern.compile("^default_npth_thread$"));
                this.f5635D.add(Pattern.compile("^RenderThread$"));
                this.f5635D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f5635D.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
