package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0157b {
    private JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f12219b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f12219b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0157b
    public JSONObject a() {
        return this.a;
    }

    public void b() {
        this.f12219b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0157b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j3) {
        this.f12219b.b(new f(this, hashSet, jSONObject, j3));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j3) {
        this.f12219b.b(new e(this, hashSet, jSONObject, j3));
    }
}
