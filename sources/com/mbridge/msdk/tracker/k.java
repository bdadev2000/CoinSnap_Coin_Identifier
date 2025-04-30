package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.w;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static x f18130a = null;

    /* renamed from: o, reason: collision with root package name */
    private static volatile String f18131o = "";
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final m f18132c;

    /* renamed from: d, reason: collision with root package name */
    private Context f18133d;

    /* renamed from: e, reason: collision with root package name */
    private w f18134e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f18135f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f18136g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f18137h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f18138i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f18139j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f18140k;
    private volatile j l;
    private volatile r m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f18141n = true;

    /* renamed from: p, reason: collision with root package name */
    private volatile n f18142p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f18143q;

    public k(String str, m mVar) {
        this.b = str;
        this.f18132c = mVar;
    }

    public final String a() {
        if (!y.a((Object) this.f18133d) && !y.a(this.f18134e)) {
            try {
                o().a();
                this.f18141n = false;
                this.f18143q = false;
                if (TextUtils.isEmpty(f18131o)) {
                    f18131o = UUID.randomUUID().toString();
                }
                if (!y.a(f18130a)) {
                    try {
                        f18130a.a(b(), this.b, this.f18132c);
                        t.a().b();
                    } catch (Exception e4) {
                        if (a.f18098a) {
                            Log.e("TrackManager", "track manager start exception", e4);
                        }
                    }
                }
                return f18131o;
            } catch (Exception e9) {
                if (a.f18098a) {
                    Log.e("TrackManager", "start error", e9);
                }
                this.f18141n = true;
            }
        }
        return "";
    }

    public final String b() {
        if (TextUtils.isEmpty(f18131o)) {
            String uuid = UUID.randomUUID().toString();
            f18131o = uuid;
            return uuid;
        }
        return f18131o;
    }

    public final String c() {
        return this.b;
    }

    public final w d() {
        w wVar = this.f18134e;
        if (wVar == null) {
            w a6 = new w.a().a();
            this.f18134e = a6;
            return a6;
        }
        return wVar;
    }

    public final Context e() {
        return this.f18133d;
    }

    public final JSONObject f() {
        JSONObject jSONObject = this.f18135f;
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.f18135f = jSONObject2;
            return jSONObject2;
        }
        return jSONObject;
    }

    public final c g() {
        String str;
        if (y.a(this.f18138i)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18138i)) {
                        Context context = this.f18133d;
                        if (TextUtils.isEmpty(this.b)) {
                            str = "track_manager_default.db";
                        } else {
                            str = "track_manager_" + this.b + ".db";
                        }
                        this.f18138i = new c(new b(context, str, "event_table"), "event_table");
                    }
                } finally {
                }
            }
        }
        return this.f18138i;
    }

    public final l h() {
        if (y.a(this.f18139j)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18139j)) {
                        this.f18139j = new p(new g(g(), o(), i()));
                    }
                } finally {
                }
            }
        }
        return this.f18139j;
    }

    public final j i() {
        if (y.a(this.l)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.l)) {
                        this.l = new j();
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final d j() {
        if (y.a(this.f18140k)) {
            this.f18140k = d().f18321h;
        }
        return this.f18140k;
    }

    public final m k() {
        return this.f18132c;
    }

    public final int l() {
        if (d().f18315a < 0) {
            return 50;
        }
        return d().f18315a;
    }

    public final int m() {
        return Math.max(d().b, 0);
    }

    public final int n() {
        return Math.max(d().f18318e, 0);
    }

    public final r o() {
        if (y.a(this.m)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.m)) {
                        this.m = new r(this);
                    }
                } finally {
                }
            }
        }
        return this.m;
    }

    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f18322i)) {
                    if (!y.a(d().f18320g) && !y.a(d().f18320g.c())) {
                        if (!TextUtils.isEmpty(d().f18320g.b())) {
                            return true;
                        }
                        throw new IllegalStateException("report url is null");
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }

    public final n q() {
        int i9;
        if (y.a(this.f18142p)) {
            synchronized (k.class) {
                try {
                    if (y.a(this.f18142p)) {
                        if (d().f18317d <= 0) {
                            i9 = 2;
                        } else {
                            i9 = d().f18317d;
                        }
                        this.f18142p = new n(i9, d().f18320g, d().f18322i, d().f18316c);
                    }
                } finally {
                }
            }
        }
        return this.f18142p;
    }

    public final boolean r() {
        return this.f18141n;
    }

    public final void s() {
        this.f18143q = true;
    }

    public final boolean t() {
        return !this.f18143q;
    }

    public final void a(Context context) {
        this.f18133d = context;
    }

    public final void a(w wVar) {
        this.f18134e = wVar;
    }

    public final void a(JSONObject jSONObject) {
        this.f18135f = jSONObject;
    }

    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f18323j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e4) {
                if (a.f18098a) {
                    Log.e("TrackManager", "event filter apply exception", e4);
                }
            }
        }
        String a6 = eVar.a();
        if (TextUtils.isEmpty(a6)) {
            return false;
        }
        if (this.f18137h != null) {
            try {
                return !r0.contains(a6);
            } catch (Exception e9) {
                if (a.f18098a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e9);
                }
            }
        }
        List<String> list = this.f18136g;
        if (list != null) {
            try {
                return list.contains(a6);
            } catch (Exception e10) {
                if (a.f18098a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e10);
                }
            }
        }
        return true;
    }
}
