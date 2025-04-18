package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.w;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k {
    private static x a = null;

    /* renamed from: o, reason: collision with root package name */
    private static volatile String f15387o = "";

    /* renamed from: b, reason: collision with root package name */
    private final String f15388b;

    /* renamed from: c, reason: collision with root package name */
    private final m f15389c;

    /* renamed from: d, reason: collision with root package name */
    private Context f15390d;

    /* renamed from: e, reason: collision with root package name */
    private w f15391e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f15392f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f15393g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f15394h;

    /* renamed from: i, reason: collision with root package name */
    private volatile c f15395i;

    /* renamed from: j, reason: collision with root package name */
    private volatile l f15396j;

    /* renamed from: k, reason: collision with root package name */
    private volatile d f15397k;

    /* renamed from: l, reason: collision with root package name */
    private volatile j f15398l;

    /* renamed from: m, reason: collision with root package name */
    private volatile r f15399m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f15400n = true;

    /* renamed from: p, reason: collision with root package name */
    private volatile n f15401p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f15402q;

    public k(String str, m mVar) {
        this.f15388b = str;
        this.f15389c = mVar;
    }

    public final String a() {
        if (!y.a((Object) this.f15390d) && !y.a(this.f15391e)) {
            try {
                o().a();
                this.f15400n = false;
                this.f15402q = false;
                if (TextUtils.isEmpty(f15387o)) {
                    f15387o = UUID.randomUUID().toString();
                }
                if (!y.a(a)) {
                    try {
                        a.a(b(), this.f15388b, this.f15389c);
                        t.a().b();
                    } catch (Exception e2) {
                        if (a.a) {
                            Log.e("TrackManager", "track manager start exception", e2);
                        }
                    }
                }
                return f15387o;
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f15400n = true;
            }
        }
        return "";
    }

    public final String b() {
        if (!TextUtils.isEmpty(f15387o)) {
            return f15387o;
        }
        String uuid = UUID.randomUUID().toString();
        f15387o = uuid;
        return uuid;
    }

    public final String c() {
        return this.f15388b;
    }

    public final w d() {
        w wVar = this.f15391e;
        if (wVar != null) {
            return wVar;
        }
        w a10 = new w.a().a();
        this.f15391e = a10;
        return a10;
    }

    public final Context e() {
        return this.f15390d;
    }

    public final JSONObject f() {
        JSONObject jSONObject = this.f15392f;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f15392f = jSONObject2;
        return jSONObject2;
    }

    public final c g() {
        String format;
        if (y.a(this.f15395i)) {
            synchronized (k.class) {
                if (y.a(this.f15395i)) {
                    Context context = this.f15390d;
                    if (TextUtils.isEmpty(this.f15388b)) {
                        format = String.format("track_manager_%s.db", "default");
                    } else {
                        format = String.format("track_manager_%s.db", this.f15388b);
                    }
                    this.f15395i = new c(new b(context, format, "event_table"), "event_table");
                }
            }
        }
        return this.f15395i;
    }

    public final l h() {
        if (y.a(this.f15396j)) {
            synchronized (k.class) {
                if (y.a(this.f15396j)) {
                    this.f15396j = new p(new g(g(), o(), i()));
                }
            }
        }
        return this.f15396j;
    }

    public final j i() {
        if (y.a(this.f15398l)) {
            synchronized (k.class) {
                if (y.a(this.f15398l)) {
                    this.f15398l = new j();
                }
            }
        }
        return this.f15398l;
    }

    public final d j() {
        if (y.a(this.f15397k)) {
            this.f15397k = d().f15555h;
        }
        return this.f15397k;
    }

    public final m k() {
        return this.f15389c;
    }

    public final int l() {
        if (d().a < 0) {
            return 50;
        }
        return d().a;
    }

    public final int m() {
        return Math.max(d().f15549b, 0);
    }

    public final int n() {
        return Math.max(d().f15552e, 0);
    }

    public final r o() {
        if (y.a(this.f15399m)) {
            synchronized (k.class) {
                if (y.a(this.f15399m)) {
                    this.f15399m = new r(this);
                }
            }
        }
        return this.f15399m;
    }

    public final boolean p() throws IllegalStateException {
        if (!y.a(d())) {
            if (!y.a(j())) {
                if (!y.a(d().f15556i)) {
                    if (!y.a(d().f15554g) && !y.a(d().f15554g.c())) {
                        if (!TextUtils.isEmpty(d().f15554g.b())) {
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
        int i10;
        if (y.a(this.f15401p)) {
            synchronized (k.class) {
                if (y.a(this.f15401p)) {
                    if (d().f15551d <= 0) {
                        i10 = 2;
                    } else {
                        i10 = d().f15551d;
                    }
                    this.f15401p = new n(i10, d().f15554g, d().f15556i, d().f15550c);
                }
            }
        }
        return this.f15401p;
    }

    public final boolean r() {
        return this.f15400n;
    }

    public final void s() {
        this.f15402q = true;
    }

    public final boolean t() {
        return !this.f15402q;
    }

    public final void a(Context context) {
        this.f15390d = context;
    }

    public final void a(w wVar) {
        this.f15391e = wVar;
    }

    public final void a(JSONObject jSONObject) {
        this.f15392f = jSONObject;
    }

    public final boolean a(e eVar) {
        if (y.a(eVar)) {
            return false;
        }
        f fVar = d().f15557j;
        if (y.b(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e2) {
                if (a.a) {
                    Log.e("TrackManager", "event filter apply exception", e2);
                }
            }
        }
        String a10 = eVar.a();
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        if (this.f15394h != null) {
            try {
                return !r0.contains(a10);
            } catch (Exception e10) {
                if (a.a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e10);
                }
            }
        }
        List<String> list = this.f15393g;
        if (list != null) {
            try {
                return list.contains(a10);
            } catch (Exception e11) {
                if (a.a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e11);
                }
            }
        }
        return true;
    }
}
