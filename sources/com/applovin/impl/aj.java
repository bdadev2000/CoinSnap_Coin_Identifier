package com.applovin.impl;

import com.applovin.impl.bj;
import com.applovin.impl.qo;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class aj {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f22894a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22895b;

    /* renamed from: c, reason: collision with root package name */
    private final bh f22896c;
    private a d;
    private a e;

    /* renamed from: f, reason: collision with root package name */
    private a f22897f;

    /* renamed from: g, reason: collision with root package name */
    private long f22898g;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f22899a;

        /* renamed from: b, reason: collision with root package name */
        public final long f22900b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22901c;
        public m0 d;
        public a e;

        public a(long j2, int i2) {
            this.f22899a = j2;
            this.f22900b = j2 + i2;
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void a(m0 m0Var, a aVar) {
            this.d = m0Var;
            this.e = aVar;
            this.f22901c = true;
        }

        public int a(long j2) {
            return ((int) (j2 - this.f22899a)) + this.d.f25173b;
        }
    }

    public aj(n0 n0Var) {
        this.f22894a = n0Var;
        int c2 = n0Var.c();
        this.f22895b = c2;
        this.f22896c = new bh(32);
        a aVar = new a(0L, c2);
        this.d = aVar;
        this.e = aVar;
        this.f22897f = aVar;
    }

    private int b(int i2) {
        a aVar = this.f22897f;
        if (!aVar.f22901c) {
            aVar.a(this.f22894a.b(), new a(this.f22897f.f22900b, this.f22895b));
        }
        return Math.min(i2, (int) (this.f22897f.f22900b - this.f22898g));
    }

    public long a() {
        return this.f22898g;
    }

    public void c() {
        this.e = this.d;
    }

    private void a(a aVar) {
        if (aVar.f22901c) {
            a aVar2 = this.f22897f;
            int i2 = (((int) (aVar2.f22899a - aVar.f22899a)) / this.f22895b) + (aVar2.f22901c ? 1 : 0);
            m0[] m0VarArr = new m0[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                m0VarArr[i3] = aVar.d;
                aVar = aVar.a();
            }
            this.f22894a.a(m0VarArr);
        }
    }

    private static a b(a aVar, p5 p5Var, bj.b bVar, bh bhVar) {
        if (p5Var.h()) {
            aVar = a(aVar, p5Var, bVar, bhVar);
        }
        if (p5Var.c()) {
            bhVar.d(4);
            a a2 = a(aVar, bVar.f23103b, bhVar.c(), 4);
            int A = bhVar.A();
            bVar.f23103b += 4;
            bVar.f23102a -= 4;
            p5Var.g(A);
            a a3 = a(a2, bVar.f23103b, p5Var.f25963c, A);
            bVar.f23103b += A;
            int i2 = bVar.f23102a - A;
            bVar.f23102a = i2;
            p5Var.h(i2);
            return a(a3, bVar.f23103b, p5Var.f25965g, bVar.f23102a);
        }
        p5Var.g(bVar.f23102a);
        return a(aVar, bVar.f23103b, p5Var.f25963c, bVar.f23102a);
    }

    public void a(long j2) {
        a aVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j2 < aVar.f22900b) {
                break;
            }
            this.f22894a.a(aVar.d);
            this.d = this.d.a();
        }
        if (this.e.f22899a < aVar.f22899a) {
            this.e = aVar;
        }
    }

    private static a a(a aVar, long j2) {
        while (j2 >= aVar.f22900b) {
            aVar = aVar.e;
        }
        return aVar;
    }

    public void a(p5 p5Var, bj.b bVar) {
        b(this.e, p5Var, bVar, this.f22896c);
    }

    private void a(int i2) {
        long j2 = this.f22898g + i2;
        this.f22898g = j2;
        a aVar = this.f22897f;
        if (j2 == aVar.f22900b) {
            this.f22897f = aVar.e;
        }
    }

    private static a a(a aVar, long j2, ByteBuffer byteBuffer, int i2) {
        a a2 = a(aVar, j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (a2.f22900b - j2));
            byteBuffer.put(a2.d.f25172a, a2.a(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == a2.f22900b) {
                a2 = a2.e;
            }
        }
        return a2;
    }

    private static a a(a aVar, long j2, byte[] bArr, int i2) {
        a a2 = a(aVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (a2.f22900b - j2));
            System.arraycopy(a2.d.f25172a, a2.a(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == a2.f22900b) {
                a2 = a2.e;
            }
        }
        return a2;
    }

    public void b(p5 p5Var, bj.b bVar) {
        this.e = b(this.e, p5Var, bVar, this.f22896c);
    }

    public void b() {
        a(this.d);
        a aVar = new a(0L, this.f22895b);
        this.d = aVar;
        this.e = aVar;
        this.f22897f = aVar;
        this.f22898g = 0L;
        this.f22894a.a();
    }

    private static a a(a aVar, p5 p5Var, bj.b bVar, bh bhVar) {
        long j2 = bVar.f23103b;
        int i2 = 1;
        bhVar.d(1);
        a a2 = a(aVar, j2, bhVar.c(), 1);
        long j3 = j2 + 1;
        byte b2 = bhVar.c()[0];
        boolean z2 = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i3 = b2 & Byte.MAX_VALUE;
        a5 a5Var = p5Var.f25962b;
        byte[] bArr = a5Var.f22682a;
        if (bArr == null) {
            a5Var.f22682a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a a3 = a(a2, j3, a5Var.f22682a, i3);
        long j4 = j3 + i3;
        if (z2) {
            bhVar.d(2);
            a3 = a(a3, j4, bhVar.c(), 2);
            j4 += 2;
            i2 = bhVar.C();
        }
        int i4 = i2;
        int[] iArr = a5Var.d;
        if (iArr == null || iArr.length < i4) {
            iArr = new int[i4];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = a5Var.e;
        if (iArr3 == null || iArr3.length < i4) {
            iArr3 = new int[i4];
        }
        int[] iArr4 = iArr3;
        if (z2) {
            int i5 = i4 * 6;
            bhVar.d(i5);
            a3 = a(a3, j4, bhVar.c(), i5);
            j4 += i5;
            bhVar.f(0);
            for (int i6 = 0; i6 < i4; i6++) {
                iArr2[i6] = bhVar.C();
                iArr4[i6] = bhVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f23102a - ((int) (j4 - bVar.f23103b));
        }
        qo.a aVar2 = (qo.a) xp.a(bVar.f23104c);
        a5Var.a(i4, iArr2, iArr4, aVar2.f26204b, a5Var.f22682a, aVar2.f26203a, aVar2.f26205c, aVar2.d);
        long j5 = bVar.f23103b;
        int i7 = (int) (j4 - j5);
        bVar.f23103b = j5 + i7;
        bVar.f23102a -= i7;
        return a3;
    }

    public int a(g5 g5Var, int i2, boolean z2) {
        int b2 = b(i2);
        a aVar = this.f22897f;
        int a2 = g5Var.a(aVar.d.f25172a, aVar.a(this.f22898g), b2);
        if (a2 != -1) {
            a(a2);
            return a2;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(bh bhVar, int i2) {
        while (i2 > 0) {
            int b2 = b(i2);
            a aVar = this.f22897f;
            bhVar.a(aVar.d.f25172a, aVar.a(this.f22898g), b2);
            i2 -= b2;
            a(b2);
        }
    }
}
