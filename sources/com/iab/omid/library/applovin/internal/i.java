package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f14430f;

    /* renamed from: a, reason: collision with root package name */
    private float f14431a = 0.0f;
    private final com.iab.omid.library.applovin.devicevolume.e b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f14432c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f14433d;

    /* renamed from: e, reason: collision with root package name */
    private c f14434e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.b = eVar;
        this.f14432c = bVar;
    }

    private c a() {
        if (this.f14434e == null) {
            this.f14434e = c.c();
        }
        return this.f14434e;
    }

    public static i c() {
        if (f14430f == null) {
            f14430f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f14430f;
    }

    public float b() {
        return this.f14431a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f14433d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f14433d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f9) {
        this.f14431a = f9;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f9);
        }
    }

    public void a(Context context) {
        this.f14433d = this.b.a(new Handler(), context, this.f14432c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z8) {
        if (z8) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
