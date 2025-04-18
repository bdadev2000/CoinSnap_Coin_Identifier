package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class h implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* renamed from: f, reason: collision with root package name */
    private static h f12263f;
    private float a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f12264b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f12265c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f12266d;

    /* renamed from: e, reason: collision with root package name */
    private c f12267e;

    public h(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f12264b = eVar;
        this.f12265c = bVar;
    }

    private c a() {
        if (this.f12267e == null) {
            this.f12267e = c.c();
        }
        return this.f12267e;
    }

    public static h c() {
        if (f12263f == null) {
            f12263f = new h(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f12263f;
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f12266d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f12266d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f10) {
        this.a = f10;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f12266d = this.f12264b.a(new Handler(), context, this.f12265c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
