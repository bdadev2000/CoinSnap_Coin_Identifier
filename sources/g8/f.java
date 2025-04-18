package g8;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.NoSuchElementException;
import n9.x;

/* loaded from: classes3.dex */
public final class f implements e {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f18258b;

    /* renamed from: c, reason: collision with root package name */
    public int f18259c;

    /* renamed from: d, reason: collision with root package name */
    public int f18260d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18261e;

    public f() {
        this.a = 0;
        this.f18258b = -1;
        this.f18259c = 0;
        this.f18261e = new int[16];
        this.f18260d = r0.length - 1;
    }

    @Override // g8.e
    public final int a() {
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f18259c;
        Object obj = this.f18261e;
        if (i11 == ((int[]) obj).length) {
            int[] iArr = (int[]) obj;
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i12 = this.a;
                int i13 = length2 - i12;
                System.arraycopy(iArr, i12, iArr2, 0, i13);
                System.arraycopy((int[]) this.f18261e, 0, iArr2, i13, i12);
                this.a = 0;
                this.f18258b = this.f18259c - 1;
                this.f18261e = iArr2;
                this.f18260d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i14 = (this.f18258b + 1) & this.f18260d;
        this.f18258b = i14;
        ((int[]) this.f18261e)[i14] = i10;
        this.f18259c++;
    }

    public final void c() {
        this.a = 0;
        this.f18258b = -1;
        this.f18259c = 0;
    }

    public final int d() {
        int i10 = this.f18259c;
        if (i10 != 0) {
            int[] iArr = (int[]) this.f18261e;
            int i11 = this.a;
            int i12 = iArr[i11];
            this.a = (i11 + 1) & this.f18260d;
            this.f18259c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    @Override // g8.e
    public final int getSampleCount() {
        return this.a;
    }

    @Override // g8.e
    public final int readNextSampleSize() {
        int i10 = this.f18258b;
        if (i10 == 8) {
            return ((x) this.f18261e).v();
        }
        if (i10 == 16) {
            return ((x) this.f18261e).A();
        }
        int i11 = this.f18259c;
        this.f18259c = i11 + 1;
        if (i11 % 2 == 0) {
            int v10 = ((x) this.f18261e).v();
            this.f18260d = v10;
            return (v10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.f18260d & 15;
    }

    public f(b bVar) {
        x xVar = bVar.f18246d;
        this.f18261e = xVar;
        xVar.G(12);
        this.f18258b = ((x) this.f18261e).y() & 255;
        this.a = ((x) this.f18261e).y();
    }
}
