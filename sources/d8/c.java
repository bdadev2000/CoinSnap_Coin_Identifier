package d8;

import v8.u0;
import y7.m;

/* loaded from: classes3.dex */
public final class c implements m {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16911b;

    public c(m mVar, long j3) {
        boolean z10;
        this.a = mVar;
        if (mVar.getPosition() >= j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.f16911b = j3;
    }

    @Override // y7.m
    public final boolean advancePeekPosition(int i10, boolean z10) {
        return this.a.advancePeekPosition(i10, z10);
    }

    @Override // y7.m
    public final int b(int i10, int i11, byte[] bArr) {
        return this.a.b(i10, i11, bArr);
    }

    @Override // y7.m
    public final long getLength() {
        return this.a.getLength() - this.f16911b;
    }

    @Override // y7.m
    public final long getPeekPosition() {
        return this.a.getPeekPosition() - this.f16911b;
    }

    @Override // y7.m
    public final long getPosition() {
        return this.a.getPosition() - this.f16911b;
    }

    @Override // y7.m
    public final boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.a.peekFully(bArr, i10, i11, z10);
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        return this.a.read(bArr, i10, i11);
    }

    @Override // y7.m
    public final boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.a.readFully(bArr, i10, i11, z10);
    }

    @Override // y7.m
    public final void resetPeekPosition() {
        this.a.resetPeekPosition();
    }

    @Override // y7.m
    public final int skip(int i10) {
        return this.a.skip(i10);
    }

    @Override // y7.m
    public final void skipFully(int i10) {
        this.a.skipFully(i10);
    }

    @Override // y7.m
    public final void advancePeekPosition(int i10) {
        this.a.advancePeekPosition(i10);
    }

    @Override // y7.m
    public final void peekFully(byte[] bArr, int i10, int i11) {
        this.a.peekFully(bArr, i10, i11);
    }

    @Override // y7.m
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.a.readFully(bArr, i10, i11);
    }
}
