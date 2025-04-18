package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f12169f;
    private float a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f12170b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f12171c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f12172d;

    /* renamed from: e, reason: collision with root package name */
    private c f12173e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f12170b = eVar;
        this.f12171c = bVar;
    }

    private c a() {
        if (this.f12173e == null) {
            this.f12173e = c.c();
        }
        return this.f12173e;
    }

    public static i c() {
        if (f12169f == null) {
            f12169f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f12169f;
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f12172d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f12172d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f12172d = this.f12170b.a(new Handler(), context, this.f12171c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
