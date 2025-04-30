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
    public static boolean b = false;

    /* renamed from: t, reason: collision with root package name */
    private static int f5675t = 2;

    /* renamed from: a, reason: collision with root package name */
    c f5676a;

    /* renamed from: c, reason: collision with root package name */
    private int f5677c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f5678d;

    /* renamed from: e, reason: collision with root package name */
    private int f5679e;

    /* renamed from: f, reason: collision with root package name */
    private int f5680f;

    /* renamed from: g, reason: collision with root package name */
    private f f5681g;

    /* renamed from: h, reason: collision with root package name */
    private b f5682h;

    /* renamed from: i, reason: collision with root package name */
    private long f5683i;

    /* renamed from: j, reason: collision with root package name */
    private long f5684j;

    /* renamed from: k, reason: collision with root package name */
    private int f5685k;
    private long l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f5686n;

    /* renamed from: o, reason: collision with root package name */
    private com.apm.insight.b.e f5687o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f5688p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5689q;

    /* renamed from: r, reason: collision with root package name */
    private final u f5690r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f5691s;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f5692u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f5700a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5701c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5702d;

        /* renamed from: e, reason: collision with root package name */
        int f5703e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f5704f;

        private a() {
        }

        public void a() {
            this.f5700a = -1L;
            this.b = -1L;
            this.f5701c = -1L;
            this.f5703e = -1;
            this.f5704f = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f5705a;
        a b;

        /* renamed from: c, reason: collision with root package name */
        final List<a> f5706c;

        /* renamed from: d, reason: collision with root package name */
        private int f5707d = 0;

        public b(int i9) {
            this.f5705a = i9;
            this.f5706c = new ArrayList(i9);
        }

        public a a() {
            a aVar = this.b;
            if (aVar == null) {
                return new a();
            }
            this.b = null;
            return aVar;
        }

        public void a(a aVar) {
            int i9;
            int size = this.f5706c.size();
            int i10 = this.f5705a;
            if (size < i10) {
                this.f5706c.add(aVar);
                i9 = this.f5706c.size();
            } else {
                int i11 = this.f5707d % i10;
                this.f5707d = i11;
                a aVar2 = this.f5706c.set(i11, aVar);
                aVar2.a();
                this.b = aVar2;
                i9 = this.f5707d + 1;
            }
            this.f5707d = i9;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        long f5708a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5709c;

        /* renamed from: d, reason: collision with root package name */
        long f5710d;

        /* renamed from: e, reason: collision with root package name */
        long f5711e;
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public long f5712a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5713c;

        /* renamed from: d, reason: collision with root package name */
        int f5714d;

        /* renamed from: e, reason: collision with root package name */
        int f5715e;

        /* renamed from: f, reason: collision with root package name */
        long f5716f;

        /* renamed from: g, reason: collision with root package name */
        long f5717g;

        /* renamed from: h, reason: collision with root package name */
        String f5718h;

        /* renamed from: i, reason: collision with root package name */
        public String f5719i;

        /* renamed from: j, reason: collision with root package name */
        String f5720j;

        /* renamed from: k, reason: collision with root package name */
        d f5721k;

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, h.a(this.f5718h));
                jSONObject.put("cpuDuration", this.f5717g);
                jSONObject.put("duration", this.f5716f);
                jSONObject.put("type", this.f5714d);
                jSONObject.put("count", this.f5715e);
                jSONObject.put("messageCount", this.f5715e);
                jSONObject.put("lastDuration", this.b - this.f5713c);
                jSONObject.put("start", this.f5712a);
                jSONObject.put(TtmlNode.END, this.b);
                a(jSONObject);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            return jSONObject;
        }

        public void b() {
            this.f5714d = -1;
            this.f5715e = -1;
            this.f5716f = -1L;
            this.f5718h = null;
            this.f5720j = null;
            this.f5721k = null;
            this.f5719i = null;
        }

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f5720j);
            jSONObject.put("sblock_uuid", this.f5720j);
            jSONObject.put("belong_frame", this.f5721k != null);
            d dVar = this.f5721k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f5713c - (dVar.f5708a / 1000000));
                jSONObject.put("doFrameTime", (this.f5721k.b / 1000000) - this.f5713c);
                d dVar2 = this.f5721k;
                jSONObject.put("inputHandlingTime", (dVar2.f5709c / 1000000) - (dVar2.b / 1000000));
                d dVar3 = this.f5721k;
                jSONObject.put("animationsTime", (dVar3.f5710d / 1000000) - (dVar3.f5709c / 1000000));
                d dVar4 = this.f5721k;
                jSONObject.put("performTraversalsTime", (dVar4.f5711e / 1000000) - (dVar4.f5710d / 1000000));
                jSONObject.put("drawTime", this.b - (this.f5721k.f5711e / 1000000));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        int f5722a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        e f5723c;

        /* renamed from: d, reason: collision with root package name */
        List<e> f5724d = new ArrayList();

        public f(int i9) {
            this.f5722a = i9;
        }

        public e a(int i9) {
            e eVar = this.f5723c;
            if (eVar != null) {
                eVar.f5714d = i9;
                this.f5723c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f5714d = i9;
            return eVar2;
        }

        public List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            if (this.f5724d.size() == this.f5722a) {
                for (int i10 = this.b; i10 < this.f5724d.size(); i10++) {
                    arrayList.add(this.f5724d.get(i10));
                }
                while (i9 < this.b - 1) {
                    arrayList.add(this.f5724d.get(i9));
                    i9++;
                }
            } else {
                while (i9 < this.f5724d.size()) {
                    arrayList.add(this.f5724d.get(i9));
                    i9++;
                }
            }
            return arrayList;
        }

        public void a(e eVar) {
            int i9;
            int size = this.f5724d.size();
            int i10 = this.f5722a;
            if (size < i10) {
                this.f5724d.add(eVar);
                i9 = this.f5724d.size();
            } else {
                int i11 = this.b % i10;
                this.b = i11;
                e eVar2 = this.f5724d.set(i11, eVar);
                eVar2.b();
                this.f5723c = eVar2;
                i9 = this.b + 1;
            }
            this.b = i9;
        }
    }

    public h(int i9) {
        this(i9, false);
    }

    private static long a(int i9) {
        if (i9 < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.g.a(i9);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static /* synthetic */ int f(h hVar) {
        int i9 = hVar.f5677c;
        hVar.f5677c = i9 + 1;
        return i9;
    }

    public JSONArray c() {
        List<e> a6;
        JSONArray jSONArray = new JSONArray();
        try {
            a6 = this.f5681g.a();
        } catch (Throwable unused) {
        }
        if (a6 == null) {
            return jSONArray;
        }
        int i9 = 0;
        for (e eVar : a6) {
            if (eVar != null) {
                i9++;
                jSONArray.put(eVar.a().put("id", i9));
            }
        }
        return jSONArray;
    }

    public h(int i9, boolean z8) {
        this.f5677c = 0;
        this.f5678d = 0;
        this.f5679e = 100;
        this.f5680f = 200;
        this.f5683i = -1L;
        this.f5684j = -1L;
        this.f5685k = -1;
        this.l = -1L;
        this.f5688p = false;
        this.f5689q = false;
        this.f5691s = false;
        this.f5692u = new Runnable() { // from class: com.apm.insight.b.h.2

            /* renamed from: c, reason: collision with root package name */
            private long f5695c;
            private long b = 0;

            /* renamed from: d, reason: collision with root package name */
            private int f5696d = -1;

            /* renamed from: e, reason: collision with root package name */
            private int f5697e = 0;

            /* renamed from: f, reason: collision with root package name */
            private int f5698f = 0;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a6 = h.this.f5682h.a();
                if (this.f5696d == h.this.f5678d) {
                    this.f5697e++;
                } else {
                    this.f5697e = 0;
                    this.f5698f = 0;
                    this.f5695c = uptimeMillis;
                }
                this.f5696d = h.this.f5678d;
                int i10 = this.f5697e;
                if (i10 > 0 && i10 - this.f5698f >= h.f5675t && this.b != 0 && uptimeMillis - this.f5695c > 700 && h.this.f5691s) {
                    a6.f5704f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f5698f = this.f5697e;
                }
                a6.f5702d = h.this.f5691s;
                a6.f5701c = (uptimeMillis - this.b) - 300;
                a6.f5700a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.b = uptimeMillis2;
                a6.b = uptimeMillis2 - uptimeMillis;
                a6.f5703e = h.this.f5678d;
                h.this.f5690r.a(h.this.f5692u, 300L);
                h.this.f5682h.a(a6);
            }
        };
        this.f5676a = new c() { // from class: com.apm.insight.b.h.1
        };
        if (!z8 && !b) {
            this.f5690r = null;
            return;
        }
        u uVar = new u("looper_monitor");
        this.f5690r = uVar;
        uVar.b();
        this.f5682h = new b(300);
        uVar.a(this.f5692u, 300L);
    }

    private void e() {
        this.f5679e = 100;
        this.f5680f = 300;
    }

    public e a(long j7) {
        e eVar = new e();
        eVar.f5718h = this.f5686n;
        eVar.f5719i = this.m;
        eVar.f5716f = j7 - this.f5684j;
        eVar.f5717g = a(this.f5685k) - this.l;
        eVar.f5715e = this.f5677c;
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
        if (this.f5688p) {
            return;
        }
        this.f5688p = true;
        e();
        this.f5681g = new f(this.f5679e);
        this.f5687o = new com.apm.insight.b.e() { // from class: com.apm.insight.b.h.3
            @Override // com.apm.insight.b.e
            public void a(String str) {
                h.this.f5691s = true;
                h.this.f5686n = str;
                super.a(str);
                h.this.a(true, com.apm.insight.b.e.f5669a);
            }

            @Override // com.apm.insight.b.e
            public void b(String str) {
                super.b(str);
                h.f(h.this);
                h.this.a(false, com.apm.insight.b.e.f5669a);
                h hVar = h.this;
                hVar.m = hVar.f5686n;
                h.this.f5686n = "no message running";
                h.this.f5691s = false;
            }

            @Override // com.apm.insight.b.e
            public boolean a() {
                return true;
            }
        };
        i.a();
        i.a(this.f5687o);
        k.a(k.a());
    }

    private void a(int i9, long j7, String str) {
        a(i9, j7, str, true);
    }

    private void a(int i9, long j7, String str, boolean z8) {
        this.f5689q = true;
        e a6 = this.f5681g.a(i9);
        a6.f5716f = j7 - this.f5683i;
        if (z8) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a6.f5717g = currentThreadTimeMillis - this.l;
            this.l = currentThreadTimeMillis;
        } else {
            a6.f5717g = -1L;
        }
        a6.f5715e = this.f5677c;
        a6.f5718h = str;
        a6.f5719i = this.m;
        a6.f5712a = this.f5683i;
        a6.b = j7;
        a6.f5713c = this.f5684j;
        this.f5681g.a(a6);
        this.f5677c = 0;
        this.f5683i = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z8, long j7) {
        h hVar;
        String str;
        boolean z9;
        int i9;
        int i10 = this.f5678d + 1;
        this.f5678d = i10;
        this.f5678d = i10 & 65535;
        this.f5689q = false;
        if (this.f5683i < 0) {
            this.f5683i = j7;
        }
        if (this.f5684j < 0) {
            this.f5684j = j7;
        }
        if (this.f5685k < 0) {
            this.f5685k = Process.myTid();
            this.l = SystemClock.currentThreadTimeMillis();
        }
        long j9 = j7 - this.f5683i;
        int i11 = this.f5680f;
        if (j9 > i11) {
            long j10 = this.f5684j;
            if (j7 - j10 > i11) {
                int i12 = this.f5677c;
                if (z8) {
                    if (i12 == 0) {
                        a(1, j7, "no message running");
                    } else {
                        a(9, j10, this.m);
                        str = "no message running";
                        z9 = false;
                        i9 = 1;
                    }
                } else if (i12 == 0) {
                    str = this.f5686n;
                    z9 = true;
                    i9 = 8;
                } else {
                    hVar = this;
                    hVar.a(9, j10, this.m, false);
                    str = this.f5686n;
                    z9 = true;
                    i9 = 8;
                    hVar.a(i9, j7, str, z9);
                }
                hVar = this;
                hVar.a(i9, j7, str, z9);
            } else {
                a(9, j7, this.f5686n);
            }
        }
        this.f5684j = j7;
    }
}
