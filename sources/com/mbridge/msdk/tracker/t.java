package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile t f15539d;

    /* renamed from: b, reason: collision with root package name */
    private m f15540b;

    /* renamed from: c, reason: collision with root package name */
    private w f15541c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f15542e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f15543f = 30000;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f15544g = new HashMap<>();
    Handler a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.tracker.t.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    t.this.c();
                    t.this.a.removeMessages(1);
                    t.this.d();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    };

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.a.sendEmptyMessageDelayed(1, this.f15543f);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized void b() {
        if (this.f15542e) {
            return;
        }
        this.f15542e = true;
        d();
    }

    public final void c() {
        m[] d10 = m.d();
        if (d10.length == 0) {
            return;
        }
        try {
            for (m mVar : d10) {
                String c10 = mVar.c();
                if (!"monitor".equals(c10)) {
                    String b3 = mVar.b();
                    long[] h10 = mVar.h();
                    long j3 = h10[1];
                    if (j3 != 0) {
                        long j10 = h10[0];
                        if (this.f15544g.containsKey(c10)) {
                            if ((j10 + "").equals(this.f15544g.get(c10))) {
                            }
                        }
                        this.f15544g.put(c10, j10 + "");
                        if (this.f15540b != null) {
                            try {
                                e eVar = new e("event_lib_monitor");
                                eVar.b(1);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("key", "m_report_rate");
                                jSONObject.put("task_name", c10);
                                jSONObject.put("task_count", j3);
                                jSONObject.put("task_session_id", b3);
                                jSONObject.put("task_ts", j10);
                                eVar.a(jSONObject);
                                this.f15540b.a(eVar);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void a(Context context, w wVar, int i10, JSONObject jSONObject) {
        this.f15541c = wVar;
        this.f15543f = i10;
        m a = m.a("monitor", context, wVar);
        this.f15540b = a;
        if (a != null) {
            a.a(jSONObject);
            this.f15540b.a();
        }
        b();
    }

    public static t a() {
        if (f15539d == null) {
            synchronized (t.class) {
                if (f15539d == null) {
                    f15539d = new t();
                }
            }
        }
        return f15539d;
    }
}
