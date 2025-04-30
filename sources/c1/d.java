package C1;

import android.graphics.Path;
import v1.v;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f426a;
    public final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.a f427c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.a f428d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.a f429e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.a f430f;

    /* renamed from: g, reason: collision with root package name */
    public final String f431g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f432h;

    public d(String str, int i9, Path.FillType fillType, B1.a aVar, B1.a aVar2, B1.a aVar3, B1.a aVar4, boolean z8) {
        this.f426a = i9;
        this.b = fillType;
        this.f427c = aVar;
        this.f428d = aVar2;
        this.f429e = aVar3;
        this.f430f = aVar4;
        this.f431g = str;
        this.f432h = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new x1.h(vVar, iVar, bVar, this);
    }
}
