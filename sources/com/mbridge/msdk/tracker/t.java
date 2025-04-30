package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile t f18304d;
    private m b;

    /* renamed from: c, reason: collision with root package name */
    private w f18306c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f18307e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f18308f = 30000;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f18309g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    Handler f18305a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.tracker.t.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    t.this.c();
                    t.this.f18305a.removeMessages(1);
                    t.this.d();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    };

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f18305a.sendEmptyMessageDelayed(1, this.f18308f);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final synchronized void b() {
        if (this.f18307e) {
            return;
        }
        this.f18307e = true;
        d();
    }

    public final void c() {
        m[] d2 = m.d();
        if (d2.length == 0) {
            return;
        }
        try {
            for (m mVar : d2) {
                String c9 = mVar.c();
                if (!"monitor".equals(c9)) {
                    String b = mVar.b();
                    long[] h6 = mVar.h();
                    long j7 = h6[1];
                    if (j7 != 0) {
                        long j9 = h6[0];
                        if (this.f18309g.containsKey(c9)) {
                            if ((j9 + "").equals(this.f18309g.get(c9))) {
                            }
                        }
                        this.f18309g.put(c9, j9 + "");
                        if (this.b != null) {
                            try {
                                e eVar = new e("event_lib_monitor");
                                eVar.b(1);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("key", "m_report_rate");
                                jSONObject.put("task_name", c9);
                                jSONObject.put("task_count", j7);
                                jSONObject.put("task_session_id", b);
                                jSONObject.put("task_ts", j9);
                                eVar.a(jSONObject);
                                this.b.a(eVar);
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(Context context, w wVar, int i9, JSONObject jSONObject) {
        this.f18306c = wVar;
        this.f18308f = i9;
        m a6 = m.a("monitor", context, wVar);
        this.b = a6;
        if (a6 != null) {
            a6.a(jSONObject);
            this.b.a();
        }
        b();
    }

    public static t a() {
        if (f18304d == null) {
            synchronized (t.class) {
                try {
                    if (f18304d == null) {
                        f18304d = new t();
                    }
                } finally {
                }
            }
        }
        return f18304d;
    }
}
