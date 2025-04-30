package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class h implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* renamed from: f, reason: collision with root package name */
    private static h f14531f;

    /* renamed from: a, reason: collision with root package name */
    private float f14532a = 0.0f;
    private final com.iab.omid.library.bytedance2.devicevolume.e b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f14533c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f14534d;

    /* renamed from: e, reason: collision with root package name */
    private c f14535e;

    public h(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.b = eVar;
        this.f14533c = bVar;
    }

    private c a() {
        if (this.f14535e == null) {
            this.f14535e = c.c();
        }
        return this.f14535e;
    }

    public static h c() {
        if (f14531f == null) {
            f14531f = new h(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f14531f;
    }

    public float b() {
        return this.f14532a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f14534d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f14534d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f9) {
        this.f14532a = f9;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f9);
        }
    }

    public void a(Context context) {
        this.f14534d = this.b.a(new Handler(), context, this.f14533c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z8) {
        if (z8) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
