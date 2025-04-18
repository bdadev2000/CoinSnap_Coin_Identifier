package t3;

import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.x;

/* loaded from: classes.dex */
public final class l implements b {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f25236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25237c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.c f25238d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.c f25239e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25240f;

    public l(String str, boolean z10, Path.FillType fillType, h4.c cVar, h4.c cVar2, boolean z11) {
        this.f25237c = str;
        this.a = z10;
        this.f25236b = fillType;
        this.f25238d = cVar;
        this.f25239e = cVar2;
        this.f25240f = z11;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new o3.h(xVar, bVar, this);
    }

    public final String toString() {
        return a4.j.l(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, AbstractJsonLexerKt.END_OBJ);
    }
}
