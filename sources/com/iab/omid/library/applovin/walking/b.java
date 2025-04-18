package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements b.InterfaceC0161b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f29030a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f29031b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f29031b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0161b
    @VisibleForTesting
    public JSONObject a() {
        return this.f29030a;
    }

    public void b() {
        this.f29031b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0161b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f29030a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f29031b.b(new f(this, hashSet, jSONObject, j2));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f29031b.b(new e(this, hashSet, jSONObject, j2));
    }
}
