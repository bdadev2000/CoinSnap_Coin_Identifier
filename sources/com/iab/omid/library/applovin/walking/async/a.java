package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f14478c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f14479d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f14480e;

    public a(b.InterfaceC0145b interfaceC0145b, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(interfaceC0145b);
        this.f14478c = new HashSet<>(hashSet);
        this.f14479d = jSONObject;
        this.f14480e = j7;
    }
}
