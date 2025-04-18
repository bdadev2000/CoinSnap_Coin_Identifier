package com.mbridge.msdk.tracker;

import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u<T> extends com.mbridge.msdk.tracker.network.u<T> {
    private Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private u.b f15545b;

    /* renamed from: c, reason: collision with root package name */
    private w.b<T> f15546c;

    /* renamed from: d, reason: collision with root package name */
    private v f15547d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.e f15548e;

    public u(String str, int i10) {
        super(i10, str);
    }

    public final void a(v vVar) {
        this.f15547d = vVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final z b() {
        if (y.a(this.f15548e)) {
            this.f15548e = new com.mbridge.msdk.tracker.network.e(30000, 5);
        }
        return this.f15548e;
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
        return this.f15545b;
    }

    public u(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public final void a(u.b bVar) {
        this.f15545b = bVar;
    }

    public final void a(Map<String, String> map) {
        this.a = map;
    }

    public final void a(w.b<T> bVar) {
        this.f15546c = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final com.mbridge.msdk.tracker.network.w<T> a(com.mbridge.msdk.tracker.network.r rVar) {
        return this.f15547d.a(rVar);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final Map<String, String> a() {
        return this.a;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final void a(T t5) {
        w.b<T> bVar = this.f15546c;
        this.f15546c = bVar;
        if (bVar != null) {
            bVar.a(t5);
        }
    }
}
