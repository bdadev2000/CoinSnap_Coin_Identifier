package g4;

import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class x implements e4.j {

    /* renamed from: b, reason: collision with root package name */
    public final Object f18180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18182d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f18183e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f18184f;

    /* renamed from: g, reason: collision with root package name */
    public final e4.j f18185g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f18186h;

    /* renamed from: i, reason: collision with root package name */
    public final e4.m f18187i;

    /* renamed from: j, reason: collision with root package name */
    public int f18188j;

    public x(Object obj, e4.j jVar, int i10, int i11, w4.c cVar, Class cls, Class cls2, e4.m mVar) {
        com.bumptech.glide.c.l(obj);
        this.f18180b = obj;
        if (jVar != null) {
            this.f18185g = jVar;
            this.f18181c = i10;
            this.f18182d = i11;
            com.bumptech.glide.c.l(cVar);
            this.f18186h = cVar;
            if (cls != null) {
                this.f18183e = cls;
                if (cls2 != null) {
                    this.f18184f = cls2;
                    com.bumptech.glide.c.l(mVar);
                    this.f18187i = mVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f18180b.equals(xVar.f18180b) || !this.f18185g.equals(xVar.f18185g) || this.f18182d != xVar.f18182d || this.f18181c != xVar.f18181c || !this.f18186h.equals(xVar.f18186h) || !this.f18183e.equals(xVar.f18183e) || !this.f18184f.equals(xVar.f18184f) || !this.f18187i.equals(xVar.f18187i)) {
            return false;
        }
        return true;
    }

    @Override // e4.j
    public final int hashCode() {
        if (this.f18188j == 0) {
            int hashCode = this.f18180b.hashCode();
            this.f18188j = hashCode;
            int hashCode2 = ((((this.f18185g.hashCode() + (hashCode * 31)) * 31) + this.f18181c) * 31) + this.f18182d;
            this.f18188j = hashCode2;
            int hashCode3 = this.f18186h.hashCode() + (hashCode2 * 31);
            this.f18188j = hashCode3;
            int hashCode4 = this.f18183e.hashCode() + (hashCode3 * 31);
            this.f18188j = hashCode4;
            int hashCode5 = this.f18184f.hashCode() + (hashCode4 * 31);
            this.f18188j = hashCode5;
            this.f18188j = this.f18187i.hashCode() + (hashCode5 * 31);
        }
        return this.f18188j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f18180b + ", width=" + this.f18181c + ", height=" + this.f18182d + ", resourceClass=" + this.f18183e + ", transcodeClass=" + this.f18184f + ", signature=" + this.f18185g + ", hashCode=" + this.f18188j + ", transformations=" + this.f18186h + ", options=" + this.f18187i + AbstractJsonLexerKt.END_OBJ;
    }
}
