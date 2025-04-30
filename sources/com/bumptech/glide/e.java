package com.bumptech.glide;

import P1.n;
import a5.C0398b;
import android.content.Context;
import android.content.ContextWrapper;
import c2.p;
import f2.C2267e;
import h2.C2317b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f12809k;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.f f12810a;
    public final P1.m b;

    /* renamed from: c, reason: collision with root package name */
    public final L4.f f12811c;

    /* renamed from: d, reason: collision with root package name */
    public final C0398b f12812d;

    /* renamed from: e, reason: collision with root package name */
    public final List f12813e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f12814f;

    /* renamed from: g, reason: collision with root package name */
    public final n f12815g;

    /* renamed from: h, reason: collision with root package name */
    public final f f12816h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12817i;

    /* renamed from: j, reason: collision with root package name */
    public C2267e f12818j;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.b = C2317b.f20581a;
        f12809k = obj;
    }

    public e(Context context, Q1.f fVar, p pVar, L4.f fVar2, C0398b c0398b, x.b bVar, List list, n nVar, f fVar3) {
        super(context.getApplicationContext());
        this.f12810a = fVar;
        this.f12811c = fVar2;
        this.f12812d = c0398b;
        this.f12813e = list;
        this.f12814f = bVar;
        this.f12815g = nVar;
        this.f12816h = fVar3;
        this.f12817i = 4;
        this.b = new P1.m(pVar);
    }

    public final i a() {
        return (i) this.b.get();
    }
}
