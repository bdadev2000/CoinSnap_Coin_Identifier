package com.applovin.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes.dex */
public final class o2 implements wh {
    private final m8 a;

    /* renamed from: b, reason: collision with root package name */
    private i8 f6451b;

    /* renamed from: c, reason: collision with root package name */
    private j8 f6452c;

    public o2(m8 m8Var) {
        this.a = m8Var;
    }

    @Override // com.applovin.impl.wh
    public void a(e5 e5Var, Uri uri, Map map, long j3, long j10, k8 k8Var) {
        z5 z5Var = new z5(e5Var, j3, j10);
        this.f6452c = z5Var;
        if (this.f6451b != null) {
            return;
        }
        i8[] a = this.a.a(uri, map);
        if (a.length == 1) {
            this.f6451b = a[0];
        } else {
            int length = a.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                i8 i8Var = a[i10];
                try {
                } catch (EOFException unused) {
                    a1.b(this.f6451b != null || z5Var.f() == j3);
                    z5Var.b();
                } catch (Throwable th2) {
                    a1.b(this.f6451b != null || z5Var.f() == j3);
                    z5Var.b();
                    throw th2;
                }
                if (i8Var.a(z5Var)) {
                    this.f6451b = i8Var;
                    a1.b(true);
                    z5Var.b();
                    break;
                } else {
                    a1.b(this.f6451b != null || z5Var.f() == j3);
                    z5Var.b();
                    i10++;
                }
            }
            if (this.f6451b == null) {
                throw new sp(vd.e.h(new StringBuilder("None of the available extractors ("), yp.b(a), ") could read the stream."), (Uri) a1.a(uri));
            }
        }
        this.f6451b.a(k8Var);
    }

    @Override // com.applovin.impl.wh
    public long b() {
        j8 j8Var = this.f6452c;
        if (j8Var != null) {
            return j8Var.f();
        }
        return -1L;
    }

    @Override // com.applovin.impl.wh
    public void c() {
        i8 i8Var = this.f6451b;
        if (i8Var instanceof jf) {
            ((jf) i8Var).c();
        }
    }

    @Override // com.applovin.impl.wh
    public int a(qh qhVar) {
        return ((i8) a1.a(this.f6451b)).a((j8) a1.a(this.f6452c), qhVar);
    }

    @Override // com.applovin.impl.wh
    public void a() {
        i8 i8Var = this.f6451b;
        if (i8Var != null) {
            i8Var.a();
            this.f6451b = null;
        }
        this.f6452c = null;
    }

    @Override // com.applovin.impl.wh
    public void a(long j3, long j10) {
        ((i8) a1.a(this.f6451b)).a(j3, j10);
    }
}
