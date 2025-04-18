package g4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class i0 implements e4.j {

    /* renamed from: j, reason: collision with root package name */
    public static final w4.i f18092j = new w4.i(50);

    /* renamed from: b, reason: collision with root package name */
    public final h4.h f18093b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.j f18094c;

    /* renamed from: d, reason: collision with root package name */
    public final e4.j f18095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18096e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18097f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f18098g;

    /* renamed from: h, reason: collision with root package name */
    public final e4.m f18099h;

    /* renamed from: i, reason: collision with root package name */
    public final e4.q f18100i;

    public i0(h4.h hVar, e4.j jVar, e4.j jVar2, int i10, int i11, e4.q qVar, Class cls, e4.m mVar) {
        this.f18093b = hVar;
        this.f18094c = jVar;
        this.f18095d = jVar2;
        this.f18096e = i10;
        this.f18097f = i11;
        this.f18100i = qVar;
        this.f18098g = cls;
        this.f18099h = mVar;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        Object e2;
        h4.h hVar = this.f18093b;
        synchronized (hVar) {
            h4.g gVar = (h4.g) hVar.f18744b.h();
            gVar.f18742b = 8;
            gVar.f18743c = byte[].class;
            e2 = hVar.e(gVar, byte[].class);
        }
        byte[] bArr = (byte[]) e2;
        ByteBuffer.wrap(bArr).putInt(this.f18096e).putInt(this.f18097f).array();
        this.f18095d.b(messageDigest);
        this.f18094c.b(messageDigest);
        messageDigest.update(bArr);
        e4.q qVar = this.f18100i;
        if (qVar != null) {
            qVar.b(messageDigest);
        }
        this.f18099h.b(messageDigest);
        w4.i iVar = f18092j;
        Class cls = this.f18098g;
        byte[] bArr2 = (byte[]) iVar.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(e4.j.a);
            iVar.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f18093b.g(bArr);
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f18097f != i0Var.f18097f || this.f18096e != i0Var.f18096e || !w4.m.b(this.f18100i, i0Var.f18100i) || !this.f18098g.equals(i0Var.f18098g) || !this.f18094c.equals(i0Var.f18094c) || !this.f18095d.equals(i0Var.f18095d) || !this.f18099h.equals(i0Var.f18099h)) {
            return false;
        }
        return true;
    }

    @Override // e4.j
    public final int hashCode() {
        int hashCode = ((((this.f18095d.hashCode() + (this.f18094c.hashCode() * 31)) * 31) + this.f18096e) * 31) + this.f18097f;
        e4.q qVar = this.f18100i;
        if (qVar != null) {
            hashCode = (hashCode * 31) + qVar.hashCode();
        }
        return this.f18099h.hashCode() + ((this.f18098g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f18094c + ", signature=" + this.f18095d + ", width=" + this.f18096e + ", height=" + this.f18097f + ", decodedResourceClass=" + this.f18098g + ", transformation='" + this.f18100i + "', options=" + this.f18099h + AbstractJsonLexerKt.END_OBJ;
    }
}
