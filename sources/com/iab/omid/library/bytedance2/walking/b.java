package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0160b {
    private JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f12312b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f12312b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0160b
    public JSONObject a() {
        return this.a;
    }

    public void b() {
        this.f12312b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0160b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j3) {
        this.f12312b.b(new f(this, hashSet, jSONObject, j3));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j3) {
        this.f12312b.b(new e(this, hashSet, jSONObject, j3));
    }
}
