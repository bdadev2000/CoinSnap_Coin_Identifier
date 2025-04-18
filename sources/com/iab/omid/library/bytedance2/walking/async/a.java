package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f12305c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f12306d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f12307e;

    public a(b.InterfaceC0160b interfaceC0160b, HashSet<String> hashSet, JSONObject jSONObject, long j3) {
        super(interfaceC0160b);
        this.f12305c = new HashSet<>(hashSet);
        this.f12306d = jSONObject;
        this.f12307e = j3;
    }
}
