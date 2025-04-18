package t3;

import android.graphics.Path;
import m3.x;

/* loaded from: classes.dex */
public final class d implements b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f25196b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f25197c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.c f25198d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.c f25199e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.c f25200f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25201g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25202h;

    public d(String str, int i10, Path.FillType fillType, h4.c cVar, h4.c cVar2, h4.c cVar3, h4.c cVar4, boolean z10) {
        this.a = i10;
        this.f25196b = fillType;
        this.f25197c = cVar;
        this.f25198d = cVar2;
        this.f25199e = cVar3;
        this.f25200f = cVar4;
        this.f25201g = str;
        this.f25202h = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new o3.i(xVar, jVar, bVar, this);
    }
}
