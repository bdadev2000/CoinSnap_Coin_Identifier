package t3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m3.x;
import o3.q;

/* loaded from: classes.dex */
public final class i implements b {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f25229b;

    /* renamed from: c, reason: collision with root package name */
    public final s3.a f25230c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25231d;

    /* renamed from: e, reason: collision with root package name */
    public final s3.d f25232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25233f;

    public i(String str, s3.a aVar, s3.a aVar2, s3.c cVar, boolean z10) {
        this.f25229b = str;
        this.f25230c = aVar;
        this.f25232e = aVar2;
        this.f25233f = cVar;
        this.f25231d = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        switch (this.a) {
            case 0:
                return new o3.p(xVar, bVar, this);
            default:
                return new q(xVar, bVar, this);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.f25232e + ", size=" + ((s3.d) this.f25233f) + AbstractJsonLexerKt.END_OBJ;
            default:
                return super.toString();
        }
    }

    public i(String str, s3.d dVar, h4.c cVar, s3.a aVar, boolean z10) {
        this.f25229b = str;
        this.f25232e = dVar;
        this.f25233f = cVar;
        this.f25230c = aVar;
        this.f25231d = z10;
    }
}
