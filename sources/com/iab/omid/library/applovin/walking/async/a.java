package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f12212c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f12213d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f12214e;

    public a(b.InterfaceC0157b interfaceC0157b, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(interfaceC0157b);
        this.f12212c = new HashSet<>(hashSet);
        this.f12213d = jSONObject;
        this.f12214e = j3;
    }
}
