package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f29024c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0161b interfaceC0161b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0161b);
        this.f29024c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j2;
    }
}
