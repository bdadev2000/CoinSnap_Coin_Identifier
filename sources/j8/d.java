package j8;

import y7.a0;
import y7.l;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class d implements l {
    public n a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f19805b;

    /* renamed from: e, reason: collision with root package name */
    public b f19808e;

    /* renamed from: c, reason: collision with root package name */
    public int f19806c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f19807d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f19809f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f19810g = -1;

    @Override // y7.l
    public final void a(n nVar) {
        this.a = nVar;
        this.f19805b = nVar.track(0, 1);
        nVar.endTracks();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0180, code lost:
    
        if (r2 != 65534) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0185, code lost:
    
        if (r3 == 32) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r27, y7.p r28) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.d.b(y7.m, y7.p):int");
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        return com.bumptech.glide.c.i(mVar);
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        int i10;
        if (j3 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f19806c = i10;
        b bVar = this.f19808e;
        if (bVar != null) {
            bVar.c(j10);
        }
    }
}
