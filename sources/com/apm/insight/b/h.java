package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.u;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2997b = false;

    /* renamed from: t, reason: collision with root package name */
    private static int f2998t = 2;
    c a;

    /* renamed from: c, reason: collision with root package name */
    private int f2999c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f3000d;

    /* renamed from: e, reason: collision with root package name */
    private int f3001e;

    /* renamed from: f, reason: collision with root package name */
    private int f3002f;

    /* renamed from: g, reason: collision with root package name */
    private f f3003g;

    /* renamed from: h, reason: collision with root package name */
    private b f3004h;

    /* renamed from: i, reason: collision with root package name */
    private long f3005i;

    /* renamed from: j, reason: collision with root package name */
    private long f3006j;

    /* renamed from: k, reason: collision with root package name */
    private int f3007k;

    /* renamed from: l, reason: collision with root package name */
    private long f3008l;

    /* renamed from: m, reason: collision with root package name */
    private String f3009m;

    /* renamed from: n, reason: collision with root package name */
    private String f3010n;

    /* renamed from: o, reason: collision with root package name */
    private com.apm.insight.b.e f3011o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f3012p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3013q;

    /* renamed from: r, reason: collision with root package name */
    private final u f3014r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f3015s;
    private Runnable u;

    /* loaded from: classes.dex */
    public static class a {
        long a;

        /* renamed from: b, reason: collision with root package name */
        long f3022b;

        /* renamed from: c, reason: collision with root package name */
        long f3023c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3024d;

        /* renamed from: e, reason: collision with root package name */
        int f3025e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f3026f;

        private a() {
        }

        public void a() {
            this.a = -1L;
            this.f3022b = -1L;
            this.f3023c = -1L;
            this.f3025e = -1;
            this.f3026f = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        a f3027b;

        /* renamed from: c, reason: collision with root package name */
        final List<a> f3028c;

        /* renamed from: d, reason: collision with root package name */
        private int f3029d = 0;

        public b(int i10) {
            this.a = i10;
            this.f3028c = new ArrayList(i10);
        }

        public a a() {
            a aVar = this.f3027b;
            if (aVar == null) {
                return new a();
            }
            this.f3027b = null;
            return aVar;
        }

        public void a(a aVar) {
            int i10;
            int size = this.f3028c.size();
            int i11 = this.a;
            if (size < i11) {
                this.f3028c.add(aVar);
                i10 = this.f3028c.size();
            } else {
                int i12 = this.f3029d % i11;
                this.f3029d = i12;
                a aVar2 = this.f3028c.set(i12, aVar);
                aVar2.a();
                this.f3027b = aVar2;
                i10 = this.f3029d + 1;
            }
            this.f3029d = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d {
        long a;

        /* renamed from: b, reason: collision with root package name */
        long f3030b;

        /* renamed from: c, reason: collision with root package name */
        long f3031c;

        /* renamed from: d, reason: collision with root package name */
        long f3032d;

        /* renamed from: e, reason: collision with root package name */
        long f3033e;
    }

    /* loaded from: classes.dex */
    public static class e {
        public long a;

        /* renamed from: b, reason: collision with root package name */
        long f3034b;

        /* renamed from: c, reason: collision with root package name */
        long f3035c;

        /* renamed from: d, reason: collision with root package name */
        int f3036d;

        /* renamed from: e, reason: collision with root package name */
        int f3037e;

        /* renamed from: f, reason: collision with root package name */
        long f3038f;

        /* renamed from: g, reason: collision with root package name */
        long f3039g;

        /* renamed from: h, reason: collision with root package name */
        String f3040h;

        /* renamed from: i, reason: collision with root package name */
        public String f3041i;

        /* renamed from: j, reason: collision with root package name */
        String f3042j;

        /* renamed from: k, reason: collision with root package name */
        d f3043k;

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, h.a(this.f3040h));
                jSONObject.put("cpuDuration", this.f3039g);
                jSONObject.put("duration", this.f3038f);
                jSONObject.put("type", this.f3036d);
                jSONObject.put("count", this.f3037e);
                jSONObject.put("messageCount", this.f3037e);
                jSONObject.put("lastDuration", this.f3034b - this.f3035c);
                jSONObject.put("start", this.a);
                jSONObject.put(TtmlNode.END, this.f3034b);
                a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        public void b() {
            this.f3036d = -1;
            this.f3037e = -1;
            this.f3038f = -1L;
            this.f3040h = null;
            this.f3042j = null;
            this.f3043k = null;
            this.f3041i = null;
        }

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f3042j);
            jSONObject.put("sblock_uuid", this.f3042j);
            jSONObject.put("belong_frame", this.f3043k != null);
            d dVar = this.f3043k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f3035c - (dVar.a / 1000000));
                jSONObject.put("doFrameTime", (this.f3043k.f3030b / 1000000) - this.f3035c);
                d dVar2 = this.f3043k;
                jSONObject.put("inputHandlingTime", (dVar2.f3031c / 1000000) - (dVar2.f3030b / 1000000));
                d dVar3 = this.f3043k;
                jSONObject.put("animationsTime", (dVar3.f3032d / 1000000) - (dVar3.f3031c / 1000000));
                d dVar4 = this.f3043k;
                jSONObject.put("performTraversalsTime", (dVar4.f3033e / 1000000) - (dVar4.f3032d / 1000000));
                jSONObject.put("drawTime", this.f3034b - (this.f3043k.f3033e / 1000000));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f3044b;

        /* renamed from: c, reason: collision with root package name */
        e f3045c;

        /* renamed from: d, reason: collision with root package name */
        List<e> f3046d = new ArrayList();

        public f(int i10) {
            this.a = i10;
        }

        public e a(int i10) {
            e eVar = this.f3045c;
            if (eVar != null) {
                eVar.f3036d = i10;
                this.f3045c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f3036d = i10;
            return eVar2;
        }

        public List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f3046d.size() == this.a) {
                for (int i11 = this.f3044b; i11 < this.f3046d.size(); i11++) {
                    arrayList.add(this.f3046d.get(i11));
                }
                while (i10 < this.f3044b - 1) {
                    arrayList.add(this.f3046d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f3046d.size()) {
                    arrayList.add(this.f3046d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }

        public void a(e eVar) {
            int i10;
            int size = this.f3046d.size();
            int i11 = this.a;
            if (size < i11) {
                this.f3046d.add(eVar);
                i10 = this.f3046d.size();
            } else {
                int i12 = this.f3044b % i11;
                this.f3044b = i12;
                e eVar2 = this.f3046d.set(i12, eVar);
                eVar2.b();
                this.f3045c = eVar2;
                i10 = this.f3044b + 1;
            }
            this.f3044b = i10;
        }
    }

    public h(int i10) {
        this(i10, false);
    }

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.g.a(i10);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static /* synthetic */ int f(h hVar) {
        int i10 = hVar.f2999c;
        hVar.f2999c = i10 + 1;
        return i10;
    }

    public JSONArray c() {
        List<e> a10;
        JSONArray jSONArray = new JSONArray();
        try {
            a10 = this.f3003g.a();
        } catch (Throwable unused) {
        }
        if (a10 == null) {
            return jSONArray;
        }
        int i10 = 0;
        for (e eVar : a10) {
            if (eVar != null) {
                i10++;
                jSONArray.put(eVar.a().put("id", i10));
            }
        }
        return jSONArray;
    }

    public h(int i10, boolean z10) {
        this.f2999c = 0;
        this.f3000d = 0;
        this.f3001e = 100;
        this.f3002f = 200;
        this.f3005i = -1L;
        this.f3006j = -1L;
        this.f3007k = -1;
        this.f3008l = -1L;
        this.f3012p = false;
        this.f3013q = false;
        this.f3015s = false;
        this.u = new Runnable() { // from class: com.apm.insight.b.h.2

            /* renamed from: c, reason: collision with root package name */
            private long f3017c;

            /* renamed from: b, reason: collision with root package name */
            private long f3016b = 0;

            /* renamed from: d, reason: collision with root package name */
            private int f3018d = -1;

            /* renamed from: e, reason: collision with root package name */
            private int f3019e = 0;

            /* renamed from: f, reason: collision with root package name */
            private int f3020f = 0;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a10 = h.this.f3004h.a();
                if (this.f3018d == h.this.f3000d) {
                    this.f3019e++;
                } else {
                    this.f3019e = 0;
                    this.f3020f = 0;
                    this.f3017c = uptimeMillis;
                }
                this.f3018d = h.this.f3000d;
                int i11 = this.f3019e;
                if (i11 > 0 && i11 - this.f3020f >= h.f2998t && this.f3016b != 0 && uptimeMillis - this.f3017c > 700 && h.this.f3015s) {
                    a10.f3026f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f3020f = this.f3019e;
                }
                a10.f3024d = h.this.f3015s;
                a10.f3023c = (uptimeMillis - this.f3016b) - 300;
                a10.a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f3016b = uptimeMillis2;
                a10.f3022b = uptimeMillis2 - uptimeMillis;
                a10.f3025e = h.this.f3000d;
                h.this.f3014r.a(h.this.u, 300L);
                h.this.f3004h.a(a10);
            }
        };
        this.a = new c() { // from class: com.apm.insight.b.h.1
        };
        if (!z10 && !f2997b) {
            this.f3014r = null;
            return;
        }
        u uVar = new u("looper_monitor");
        this.f3014r = uVar;
        uVar.b();
        this.f3004h = new b(300);
        uVar.a(this.u, 300L);
    }

    private void e() {
        this.f3001e = 100;
        this.f3002f = 300;
    }

    public e a(long j3) {
        e eVar = new e();
        eVar.f3040h = this.f3010n;
        eVar.f3041i = this.f3009m;
        eVar.f3038f = j3 - this.f3006j;
        eVar.f3039g = a(this.f3007k) - this.f3008l;
        eVar.f3037e = this.f2999c;
        return eVar;
    }

    public void b() {
        a();
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public void a() {
        if (this.f3012p) {
            return;
        }
        this.f3012p = true;
        e();
        this.f3003g = new f(this.f3001e);
        this.f3011o = new com.apm.insight.b.e() { // from class: com.apm.insight.b.h.3
            @Override // com.apm.insight.b.e
            public void a(String str) {
                h.this.f3015s = true;
                h.this.f3010n = str;
                super.a(str);
                h.this.a(true, com.apm.insight.b.e.a);
            }

            @Override // com.apm.insight.b.e
            public void b(String str) {
                super.b(str);
                h.f(h.this);
                h.this.a(false, com.apm.insight.b.e.a);
                h hVar = h.this;
                hVar.f3009m = hVar.f3010n;
                h.this.f3010n = "no message running";
                h.this.f3015s = false;
            }

            @Override // com.apm.insight.b.e
            public boolean a() {
                return true;
            }
        };
        i.a();
        i.a(this.f3011o);
        k.a(k.a());
    }

    private void a(int i10, long j3, String str) {
        a(i10, j3, str, true);
    }

    private void a(int i10, long j3, String str, boolean z10) {
        this.f3013q = true;
        e a10 = this.f3003g.a(i10);
        a10.f3038f = j3 - this.f3005i;
        if (z10) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a10.f3039g = currentThreadTimeMillis - this.f3008l;
            this.f3008l = currentThreadTimeMillis;
        } else {
            a10.f3039g = -1L;
        }
        a10.f3037e = this.f2999c;
        a10.f3040h = str;
        a10.f3041i = this.f3009m;
        a10.a = this.f3005i;
        a10.f3034b = j3;
        a10.f3035c = this.f3006j;
        this.f3003g.a(a10);
        this.f2999c = 0;
        this.f3005i = j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, long j3) {
        h hVar;
        int i10;
        String str;
        boolean z11;
        int i11 = this.f3000d + 1;
        this.f3000d = i11;
        this.f3000d = i11 & 65535;
        this.f3013q = false;
        if (this.f3005i < 0) {
            this.f3005i = j3;
        }
        if (this.f3006j < 0) {
            this.f3006j = j3;
        }
        if (this.f3007k < 0) {
            this.f3007k = Process.myTid();
            this.f3008l = SystemClock.currentThreadTimeMillis();
        }
        long j10 = j3 - this.f3005i;
        int i12 = this.f3002f;
        if (j10 > i12) {
            long j11 = this.f3006j;
            if (j3 - j11 > i12) {
                int i13 = this.f2999c;
                if (z10) {
                    if (i13 == 0) {
                        a(1, j3, "no message running");
                    } else {
                        a(9, j11, this.f3009m);
                        i10 = 1;
                        str = "no message running";
                        z11 = false;
                    }
                } else if (i13 == 0) {
                    i10 = 8;
                    str = this.f3010n;
                    z11 = true;
                } else {
                    hVar = this;
                    hVar.a(9, j11, this.f3009m, false);
                    i10 = 8;
                    str = this.f3010n;
                    z11 = true;
                    hVar.a(i10, j3, str, z11);
                }
                hVar = this;
                hVar.a(i10, j3, str, z11);
            } else {
                a(9, j3, this.f3010n);
            }
        }
        this.f3006j = j3;
    }
}
