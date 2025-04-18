package y7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import n9.h0;
import s7.p0;

/* loaded from: classes3.dex */
public final class h implements m {

    /* renamed from: b, reason: collision with root package name */
    public final m9.i f27980b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27981c;

    /* renamed from: d, reason: collision with root package name */
    public long f27982d;

    /* renamed from: f, reason: collision with root package name */
    public int f27984f;

    /* renamed from: g, reason: collision with root package name */
    public int f27985g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f27983e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    public final byte[] a = new byte[4096];

    static {
        p0.a("goog.exo.extractor");
    }

    public h(m9.l lVar, long j3, long j10) {
        this.f27980b = lVar;
        this.f27982d = j3;
        this.f27981c = j10;
    }

    @Override // y7.m
    public final boolean advancePeekPosition(int i10, boolean z10) {
        d(i10);
        int i11 = this.f27985g - this.f27984f;
        while (i11 < i10) {
            i11 = e(this.f27983e, this.f27984f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f27985g = this.f27984f + i11;
        }
        this.f27984f += i10;
        return true;
    }

    @Override // y7.m
    public final int b(int i10, int i11, byte[] bArr) {
        int min;
        d(i11);
        int i12 = this.f27985g;
        int i13 = this.f27984f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = e(this.f27983e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f27985g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f27983e, this.f27984f, bArr, i10, min);
        this.f27984f += min;
        return min;
    }

    public final void d(int i10) {
        int i11 = this.f27984f + i10;
        byte[] bArr = this.f27983e;
        if (i11 > bArr.length) {
            this.f27983e = Arrays.copyOf(this.f27983e, h0.h(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f27980b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    public final void f(int i10) {
        byte[] bArr;
        int i11 = this.f27985g - i10;
        this.f27985g = i11;
        this.f27984f = 0;
        byte[] bArr2 = this.f27983e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f27983e = bArr;
    }

    @Override // y7.m
    public final long getLength() {
        return this.f27981c;
    }

    @Override // y7.m
    public final long getPeekPosition() {
        return this.f27982d + this.f27984f;
    }

    @Override // y7.m
    public final long getPosition() {
        return this.f27982d;
    }

    @Override // y7.m
    public final boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f27983e, this.f27984f - i11, bArr, i10, i11);
        return true;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f27985g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f27983e, 0, bArr, i10, min);
            f(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = e(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f27982d += i13;
        }
        return i13;
    }

    @Override // y7.m
    public final void readFully(byte[] bArr, int i10, int i11) {
        readFully(bArr, i10, i11, false);
    }

    @Override // y7.m
    public final void resetPeekPosition() {
        this.f27984f = 0;
    }

    @Override // y7.m
    public final int skip(int i10) {
        int min = Math.min(this.f27985g, i10);
        f(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = e(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f27982d += min;
        }
        return min;
    }

    @Override // y7.m
    public final void skipFully(int i10) {
        int min = Math.min(this.f27985g, i10);
        f(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = e(this.a, -i11, Math.min(i10, this.a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f27982d += i11;
        }
    }

    @Override // y7.m
    public final boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.f27985g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f27983e, 0, bArr, i10, min);
            f(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = e(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.f27982d += i13;
        }
        return i13 != -1;
    }

    @Override // y7.m
    public final void peekFully(byte[] bArr, int i10, int i11) {
        peekFully(bArr, i10, i11, false);
    }

    @Override // y7.m
    public final void advancePeekPosition(int i10) {
        advancePeekPosition(i10, false);
    }
}
