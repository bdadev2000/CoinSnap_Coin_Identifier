package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u<T> extends com.mbridge.msdk.tracker.network.u<T> {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f18311a;
    private u.b b;

    /* renamed from: c, reason: collision with root package name */
    private w.b<T> f18312c;

    /* renamed from: d, reason: collision with root package name */
    private v f18313d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.e f18314e;

    public u(String str, int i9) {
        super(i9, str);
    }

    public final void a(v vVar) {
        this.f18313d = vVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (y.a(this.f18314e)) {
            this.f18314e = new com.mbridge.msdk.tracker.network.e(30000, 5);
        }
        return this.f18314e;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Charset", "UTF-8");
        return hashMap;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final boolean d() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final u.b e() {
        return this.b;
    }

    public u(String str, int i9, int i10) {
        super(i9, str, i10);
    }

    public final void a(u.b bVar) {
        this.b = bVar;
    }

    public final void a(Map<String, String> map) {
        this.f18311a = map;
    }

    public final void a(w.b<T> bVar) {
        this.f18312c = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final com.mbridge.msdk.tracker.network.w<T> a(com.mbridge.msdk.tracker.network.r rVar) {
        return this.f18313d.a(rVar);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        return this.f18311a;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final void a(T t9) {
        w.b<T> bVar = this.f18312c;
        this.f18312c = bVar;
        if (bVar != null) {
            bVar.a(t9);
        }
    }
}
