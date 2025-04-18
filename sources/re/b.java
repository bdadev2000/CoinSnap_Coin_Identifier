package re;

import he.g;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f24108g;

    /* renamed from: h, reason: collision with root package name */
    public final a f24109h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24110i;

    public b(int i10, a aVar) {
        super(byte[].class, i10);
        if (aVar != null) {
            this.f24109h = aVar;
            this.f24110i = 0;
        } else {
            this.f24108g = new LinkedBlockingQueue(i10);
            this.f24110i = 1;
        }
    }

    @Override // re.d
    public final void b(Object obj, boolean z10) {
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == this.f24116b) {
            if (this.f24110i == 0) {
                ((g) this.f24109h).f0(bArr);
            } else {
                this.f24108g.offer(bArr);
            }
        }
    }

    @Override // re.d
    public final void c() {
        super.c();
        if (this.f24110i == 1) {
            this.f24108g.clear();
        }
    }

    @Override // re.d
    public final void d(int i10, ze.b bVar, ne.a aVar) {
        super.d(i10, bVar, aVar);
        int i11 = this.f24116b;
        for (int i12 = 0; i12 < this.a; i12++) {
            if (this.f24110i == 0) {
                ((g) this.f24109h).f0(new byte[i11]);
            } else {
                this.f24108g.offer(new byte[i11]);
            }
        }
    }
}
