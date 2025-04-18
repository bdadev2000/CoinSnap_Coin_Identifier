package v8;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class t0 {
    public final m9.q a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26284b;

    /* renamed from: c, reason: collision with root package name */
    public final n9.x f26285c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f26286d;

    /* renamed from: e, reason: collision with root package name */
    public s0 f26287e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f26288f;

    /* renamed from: g, reason: collision with root package name */
    public long f26289g;

    public t0(m9.q qVar) {
        this.a = qVar;
        int i10 = qVar.f21715b;
        this.f26284b = i10;
        this.f26285c = new n9.x(32);
        s0 s0Var = new s0(0L, i10);
        this.f26286d = s0Var;
        this.f26287e = s0Var;
        this.f26288f = s0Var;
    }

    public static s0 d(s0 s0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= s0Var.f26273b) {
            s0Var = s0Var.f26275d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (s0Var.f26273b - j3));
            m9.a aVar = s0Var.f26274c;
            byteBuffer.put(aVar.a, ((int) (j3 - s0Var.a)) + aVar.f21642b, min);
            i10 -= min;
            j3 += min;
            if (j3 == s0Var.f26273b) {
                s0Var = s0Var.f26275d;
            }
        }
        return s0Var;
    }

    public static s0 e(s0 s0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= s0Var.f26273b) {
            s0Var = s0Var.f26275d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (s0Var.f26273b - j3));
            m9.a aVar = s0Var.f26274c;
            System.arraycopy(aVar.a, ((int) (j3 - s0Var.a)) + aVar.f21642b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == s0Var.f26273b) {
                s0Var = s0Var.f26275d;
            }
        }
        return s0Var;
    }

    public static s0 f(s0 s0Var, w7.i iVar, v0 v0Var, n9.x xVar) {
        boolean z10;
        if (iVar.c(1073741824)) {
            long j3 = v0Var.f26315b;
            int i10 = 1;
            xVar.D(1);
            s0 e2 = e(s0Var, j3, xVar.a, 1);
            long j10 = j3 + 1;
            byte b3 = xVar.a[0];
            if ((b3 & ByteCompanionObject.MIN_VALUE) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b3 & Byte.MAX_VALUE;
            w7.d dVar = iVar.f26889d;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            s0Var = e(e2, j10, dVar.a, i11);
            long j11 = j10 + i11;
            if (z10) {
                xVar.D(2);
                s0Var = e(s0Var, j11, xVar.a, 2);
                j11 += 2;
                i10 = xVar.A();
            }
            int[] iArr = dVar.f26871d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f26872e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                xVar.D(i12);
                s0Var = e(s0Var, j11, xVar.a, i12);
                j11 += i12;
                xVar.G(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.A();
                    iArr2[i13] = xVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = v0Var.a - ((int) (j11 - v0Var.f26315b));
            }
            y7.z zVar = v0Var.f26316c;
            int i14 = n9.h0.a;
            byte[] bArr2 = zVar.f28014b;
            byte[] bArr3 = dVar.a;
            dVar.f26873f = i10;
            dVar.f26871d = iArr;
            dVar.f26872e = iArr2;
            dVar.f26869b = bArr2;
            dVar.a = bArr3;
            int i15 = zVar.a;
            dVar.f26870c = i15;
            int i16 = zVar.f28015c;
            dVar.f26874g = i16;
            int i17 = zVar.f28016d;
            dVar.f26875h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f26876i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (n9.h0.a >= 24) {
                w7.c cVar = dVar.f26877j;
                cVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = cVar.f26868b;
                pattern.set(i16, i17);
                cVar.a.setPattern(pattern);
            }
            long j12 = v0Var.f26315b;
            int i18 = (int) (j11 - j12);
            v0Var.f26315b = j12 + i18;
            v0Var.a -= i18;
        }
        if (iVar.c(268435456)) {
            xVar.D(4);
            s0 e10 = e(s0Var, v0Var.f26315b, xVar.a, 4);
            int y4 = xVar.y();
            v0Var.f26315b += 4;
            v0Var.a -= 4;
            iVar.g(y4);
            s0 d10 = d(e10, v0Var.f26315b, iVar.f26890f, y4);
            v0Var.f26315b += y4;
            int i19 = v0Var.a - y4;
            v0Var.a = i19;
            ByteBuffer byteBuffer = iVar.f26893i;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                iVar.f26893i.clear();
            } else {
                iVar.f26893i = ByteBuffer.allocate(i19);
            }
            return d(d10, v0Var.f26315b, iVar.f26893i, v0Var.a);
        }
        iVar.g(v0Var.a);
        return d(s0Var, v0Var.f26315b, iVar.f26890f, v0Var.a);
    }

    public final void a(s0 s0Var) {
        if (s0Var.f26274c == null) {
            return;
        }
        m9.q qVar = this.a;
        synchronized (qVar) {
            s0 s0Var2 = s0Var;
            while (s0Var2 != null) {
                m9.a[] aVarArr = qVar.f21719f;
                int i10 = qVar.f21718e;
                qVar.f21718e = i10 + 1;
                m9.a aVar = s0Var2.f26274c;
                aVar.getClass();
                aVarArr[i10] = aVar;
                qVar.f21717d--;
                s0Var2 = s0Var2.f26275d;
                if (s0Var2 == null || s0Var2.f26274c == null) {
                    s0Var2 = null;
                }
            }
            qVar.notifyAll();
        }
        s0Var.f26274c = null;
        s0Var.f26275d = null;
    }

    public final void b(long j3) {
        s0 s0Var;
        if (j3 == -1) {
            return;
        }
        while (true) {
            s0Var = this.f26286d;
            if (j3 < s0Var.f26273b) {
                break;
            }
            m9.q qVar = this.a;
            m9.a aVar = s0Var.f26274c;
            synchronized (qVar) {
                m9.a[] aVarArr = qVar.f21719f;
                int i10 = qVar.f21718e;
                qVar.f21718e = i10 + 1;
                aVarArr[i10] = aVar;
                qVar.f21717d--;
                qVar.notifyAll();
            }
            s0 s0Var2 = this.f26286d;
            s0Var2.f26274c = null;
            s0 s0Var3 = s0Var2.f26275d;
            s0Var2.f26275d = null;
            this.f26286d = s0Var3;
        }
        if (this.f26287e.a < s0Var.a) {
            this.f26287e = s0Var;
        }
    }

    public final int c(int i10) {
        m9.a aVar;
        s0 s0Var = this.f26288f;
        if (s0Var.f26274c == null) {
            m9.q qVar = this.a;
            synchronized (qVar) {
                int i11 = qVar.f21717d + 1;
                qVar.f21717d = i11;
                int i12 = qVar.f21718e;
                if (i12 > 0) {
                    m9.a[] aVarArr = qVar.f21719f;
                    int i13 = i12 - 1;
                    qVar.f21718e = i13;
                    aVar = aVarArr[i13];
                    aVar.getClass();
                    qVar.f21719f[qVar.f21718e] = null;
                } else {
                    m9.a aVar2 = new m9.a(new byte[qVar.f21715b], 0);
                    m9.a[] aVarArr2 = qVar.f21719f;
                    if (i11 > aVarArr2.length) {
                        qVar.f21719f = (m9.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                    }
                    aVar = aVar2;
                }
            }
            s0 s0Var2 = new s0(this.f26288f.f26273b, this.f26284b);
            s0Var.f26274c = aVar;
            s0Var.f26275d = s0Var2;
        }
        return Math.min(i10, (int) (this.f26288f.f26273b - this.f26289g));
    }
}
