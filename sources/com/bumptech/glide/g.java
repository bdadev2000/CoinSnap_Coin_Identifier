package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import g4.q;
import g4.r;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f9663k = new a();
    public final h4.h a;

    /* renamed from: b, reason: collision with root package name */
    public final q f9664b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.b f9665c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.c f9666d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9667e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f9668f;

    /* renamed from: g, reason: collision with root package name */
    public final r f9669g;

    /* renamed from: h, reason: collision with root package name */
    public final kc.c f9670h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9671i;

    /* renamed from: j, reason: collision with root package name */
    public s4.f f9672j;

    public g(Context context, h4.h hVar, h3.a aVar, com.facebook.b bVar, v3.c cVar, r.b bVar2, List list, r rVar, kc.c cVar2, int i10) {
        super(context.getApplicationContext());
        this.a = hVar;
        this.f9665c = bVar;
        this.f9666d = cVar;
        this.f9667e = list;
        this.f9668f = bVar2;
        this.f9669g = rVar;
        this.f9670h = cVar2;
        this.f9671i = i10;
        this.f9664b = new q(aVar);
    }

    public final k a() {
        return (k) this.f9664b.get();
    }
}
