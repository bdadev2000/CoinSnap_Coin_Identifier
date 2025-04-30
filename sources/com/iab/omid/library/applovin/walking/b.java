package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements b.InterfaceC0145b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f14485a;
    private final com.iab.omid.library.applovin.walking.async.c b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0145b
    public JSONObject a() {
        return this.f14485a;
    }

    public void b() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0145b
    public void a(JSONObject jSONObject) {
        this.f14485a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j7) {
        this.b.b(new f(this, hashSet, jSONObject, j7));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j7) {
        this.b.b(new e(this, hashSet, jSONObject, j7));
    }
}
