package com.applovin.impl;

import com.applovin.impl.ro;
import com.applovin.impl.xi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class wi {
    private final n0 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8771b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f8772c;

    /* renamed from: d, reason: collision with root package name */
    private a f8773d;

    /* renamed from: e, reason: collision with root package name */
    private a f8774e;

    /* renamed from: f, reason: collision with root package name */
    private a f8775f;

    /* renamed from: g, reason: collision with root package name */
    private long f8776g;

    public wi(n0 n0Var) {
        this.a = n0Var;
        int c10 = n0Var.c();
        this.f8771b = c10;
        this.f8772c = new yg(32);
        a aVar = new a(0L, c10);
        this.f8773d = aVar;
        this.f8774e = aVar;
        this.f8775f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f8778c) {
            a aVar2 = this.f8775f;
            int i10 = (((int) (aVar2.a - aVar.a)) / this.f8771b) + (aVar2.f8778c ? 1 : 0);
            m0[] m0VarArr = new m0[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                m0VarArr[i11] = aVar.f8779d;
                aVar = aVar.a();
            }
            this.a.a(m0VarArr);
        }
    }

    private int b(int i10) {
        a aVar = this.f8775f;
        if (!aVar.f8778c) {
            aVar.a(this.a.b(), new a(this.f8775f.f8777b, this.f8771b));
        }
        return Math.min(i10, (int) (this.f8775f.f8777b - this.f8776g));
    }

    public void c() {
        this.f8774e = this.f8773d;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8777b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8778c;

        /* renamed from: d, reason: collision with root package name */
        public m0 f8779d;

        /* renamed from: e, reason: collision with root package name */
        public a f8780e;

        public a(long j3, int i10) {
            this.a = j3;
            this.f8777b = j3 + i10;
        }

        public a a() {
            this.f8779d = null;
            a aVar = this.f8780e;
            this.f8780e = null;
            return aVar;
        }

        public void a(m0 m0Var, a aVar) {
            this.f8779d = m0Var;
            this.f8780e = aVar;
            this.f8778c = true;
        }

        public int a(long j3) {
            return ((int) (j3 - this.a)) + this.f8779d.f5937b;
        }
    }

    private static a b(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        if (n5Var.h()) {
            aVar = a(aVar, n5Var, bVar, ygVar);
        }
        if (n5Var.c()) {
            ygVar.d(4);
            a a10 = a(aVar, bVar.f9044b, ygVar.c(), 4);
            int A = ygVar.A();
            bVar.f9044b += 4;
            bVar.a -= 4;
            n5Var.g(A);
            a a11 = a(a10, bVar.f9044b, n5Var.f6351c, A);
            bVar.f9044b += A;
            int i10 = bVar.a - A;
            bVar.a = i10;
            n5Var.h(i10);
            return a(a11, bVar.f9044b, n5Var.f6354g, bVar.a);
        }
        n5Var.g(bVar.a);
        return a(aVar, bVar.f9044b, n5Var.f6351c, bVar.a);
    }

    public void a(long j3) {
        a aVar;
        if (j3 == -1) {
            return;
        }
        while (true) {
            aVar = this.f8773d;
            if (j3 < aVar.f8777b) {
                break;
            }
            this.a.a(aVar.f8779d);
            this.f8773d = this.f8773d.a();
        }
        if (this.f8774e.a < aVar.a) {
            this.f8774e = aVar;
        }
    }

    private static a a(a aVar, long j3) {
        while (j3 >= aVar.f8777b) {
            aVar = aVar.f8780e;
        }
        return aVar;
    }

    public long a() {
        return this.f8776g;
    }

    public void a(n5 n5Var, xi.b bVar) {
        b(this.f8774e, n5Var, bVar, this.f8772c);
    }

    private void a(int i10) {
        long j3 = this.f8776g + i10;
        this.f8776g = j3;
        a aVar = this.f8775f;
        if (j3 == aVar.f8777b) {
            this.f8775f = aVar.f8780e;
        }
    }

    private static a a(a aVar, long j3, ByteBuffer byteBuffer, int i10) {
        a a10 = a(aVar, j3);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a10.f8777b - j3));
            byteBuffer.put(a10.f8779d.a, a10.a(j3), min);
            i10 -= min;
            j3 += min;
            if (j3 == a10.f8777b) {
                a10 = a10.f8780e;
            }
        }
        return a10;
    }

    public void b(n5 n5Var, xi.b bVar) {
        this.f8774e = b(this.f8774e, n5Var, bVar, this.f8772c);
    }

    private static a a(a aVar, long j3, byte[] bArr, int i10) {
        a a10 = a(aVar, j3);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (a10.f8777b - j3));
            System.arraycopy(a10.f8779d.a, a10.a(j3), bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == a10.f8777b) {
                a10 = a10.f8780e;
            }
        }
        return a10;
    }

    public void b() {
        a(this.f8773d);
        a aVar = new a(0L, this.f8771b);
        this.f8773d = aVar;
        this.f8774e = aVar;
        this.f8775f = aVar;
        this.f8776g = 0L;
        this.a.a();
    }

    private static a a(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        long j3 = bVar.f9044b;
        int i10 = 1;
        ygVar.d(1);
        a a10 = a(aVar, j3, ygVar.c(), 1);
        long j10 = j3 + 1;
        byte b3 = ygVar.c()[0];
        boolean z10 = (b3 & ByteCompanionObject.MIN_VALUE) != 0;
        int i11 = b3 & Byte.MAX_VALUE;
        y4 y4Var = n5Var.f6350b;
        byte[] bArr = y4Var.a;
        if (bArr == null) {
            y4Var.a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a a11 = a(a10, j10, y4Var.a, i11);
        long j11 = j10 + i11;
        if (z10) {
            ygVar.d(2);
            a11 = a(a11, j11, ygVar.c(), 2);
            j11 += 2;
            i10 = ygVar.C();
        }
        int i12 = i10;
        int[] iArr = y4Var.f9123d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = y4Var.f9124e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            ygVar.d(i13);
            a11 = a(a11, j11, ygVar.c(), i13);
            j11 += i13;
            ygVar.f(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = ygVar.C();
                iArr4[i14] = ygVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.a - ((int) (j11 - bVar.f9044b));
        }
        ro.a aVar2 = (ro.a) yp.a(bVar.f9045c);
        y4Var.a(i12, iArr2, iArr4, aVar2.f7386b, y4Var.a, aVar2.a, aVar2.f7387c, aVar2.f7388d);
        long j12 = bVar.f9044b;
        int i15 = (int) (j11 - j12);
        bVar.f9044b = j12 + i15;
        bVar.a -= i15;
        return a11;
    }

    public int a(e5 e5Var, int i10, boolean z10) {
        int b3 = b(i10);
        a aVar = this.f8775f;
        int a10 = e5Var.a(aVar.f8779d.a, aVar.a(this.f8776g), b3);
        if (a10 != -1) {
            a(a10);
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(yg ygVar, int i10) {
        while (i10 > 0) {
            int b3 = b(i10);
            a aVar = this.f8775f;
            ygVar.a(aVar.f8779d.a, aVar.a(this.f8776g), b3);
            i10 -= b3;
            a(b3);
        }
    }
}
