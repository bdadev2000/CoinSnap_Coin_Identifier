package C1;

import Q7.n0;
import android.graphics.Path;
import v1.v;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f465a;
    public final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    public final String f466c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.a f467d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.a f468e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f469f;

    public l(String str, boolean z8, Path.FillType fillType, B1.a aVar, B1.a aVar2, boolean z9) {
        this.f466c = str;
        this.f465a = z8;
        this.b = fillType;
        this.f467d = aVar;
        this.f468e = aVar2;
        this.f469f = z9;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new x1.g(vVar, bVar, this);
    }

    public final String toString() {
        return n0.n(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f465a, '}');
    }
}
