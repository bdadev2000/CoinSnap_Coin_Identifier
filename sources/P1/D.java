package P1;

import h5.C2326g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class D implements N1.f {

    /* renamed from: j, reason: collision with root package name */
    public static final C2326g f2279j = new C2326g(50);
    public final Q1.f b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.f f2280c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.f f2281d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2282e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2283f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2284g;

    /* renamed from: h, reason: collision with root package name */
    public final N1.i f2285h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.m f2286i;

    public D(Q1.f fVar, N1.f fVar2, N1.f fVar3, int i9, int i10, N1.m mVar, Class cls, N1.i iVar) {
        this.b = fVar;
        this.f2280c = fVar2;
        this.f2281d = fVar3;
        this.f2282e = i9;
        this.f2283f = i10;
        this.f2286i = mVar;
        this.f2284g = cls;
        this.f2285h = iVar;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        Object e4;
        Q1.f fVar = this.b;
        synchronized (fVar) {
            Q1.e eVar = fVar.b;
            Q1.i iVar = (Q1.i) ((ArrayDeque) eVar.f273c).poll();
            if (iVar == null) {
                iVar = eVar.n();
            }
            Q1.d dVar = (Q1.d) iVar;
            dVar.b = 8;
            dVar.f2472c = byte[].class;
            e4 = fVar.e(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) e4;
        ByteBuffer.wrap(bArr).putInt(this.f2282e).putInt(this.f2283f).array();
        this.f2281d.b(messageDigest);
        this.f2280c.b(messageDigest);
        messageDigest.update(bArr);
        N1.m mVar = this.f2286i;
        if (mVar != null) {
            mVar.b(messageDigest);
        }
        this.f2285h.b(messageDigest);
        C2326g c2326g = f2279j;
        Class cls = this.f2284g;
        byte[] bArr2 = (byte[]) c2326g.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(N1.f.f2087a);
            c2326g.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.b.g(bArr);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        if (this.f2283f != d2.f2283f || this.f2282e != d2.f2282e || !j2.n.b(this.f2286i, d2.f2286i) || !this.f2284g.equals(d2.f2284g) || !this.f2280c.equals(d2.f2280c) || !this.f2281d.equals(d2.f2281d) || !this.f2285h.equals(d2.f2285h)) {
            return false;
        }
        return true;
    }

    @Override // N1.f
    public final int hashCode() {
        int hashCode = ((((this.f2281d.hashCode() + (this.f2280c.hashCode() * 31)) * 31) + this.f2282e) * 31) + this.f2283f;
        N1.m mVar = this.f2286i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.f2285h.b.hashCode() + ((this.f2284g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2280c + ", signature=" + this.f2281d + ", width=" + this.f2282e + ", height=" + this.f2283f + ", decodedResourceClass=" + this.f2284g + ", transformation='" + this.f2286i + "', options=" + this.f2285h + '}';
    }
}
