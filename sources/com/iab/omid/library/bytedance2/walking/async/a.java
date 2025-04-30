package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f14577c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f14578d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f14579e;

    public a(b.InterfaceC0148b interfaceC0148b, HashSet<String> hashSet, JSONObject jSONObject, long j7) {
        super(interfaceC0148b);
        this.f14577c = new HashSet<>(hashSet);
        this.f14578d = jSONObject;
        this.f14579e = j7;
    }
}
