package com.applovin.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import x0.AbstractC2914a;

/* renamed from: com.applovin.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733o2 implements wh {

    /* renamed from: a, reason: collision with root package name */
    private final m8 f9381a;
    private i8 b;

    /* renamed from: c, reason: collision with root package name */
    private j8 f9382c;

    public C0733o2(m8 m8Var) {
        this.f9381a = m8Var;
    }

    @Override // com.applovin.impl.wh
    public void a(e5 e5Var, Uri uri, Map map, long j7, long j9, k8 k8Var) {
        z5 z5Var = new z5(e5Var, j7, j9);
        this.f9382c = z5Var;
        if (this.b != null) {
            return;
        }
        i8[] a6 = this.f9381a.a(uri, map);
        if (a6.length == 1) {
            this.b = a6[0];
        } else {
            int length = a6.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                i8 i8Var = a6[i9];
                try {
                } catch (EOFException unused) {
                    AbstractC0669a1.b(this.b != null || z5Var.f() == j7);
                    z5Var.b();
                } catch (Throwable th) {
                    AbstractC0669a1.b(this.b != null || z5Var.f() == j7);
                    z5Var.b();
                    throw th;
                }
                if (i8Var.a(z5Var)) {
                    this.b = i8Var;
                    AbstractC0669a1.b(true);
                    z5Var.b();
                    break;
                } else {
                    AbstractC0669a1.b(this.b != null || z5Var.f() == j7);
                    z5Var.b();
                    i9++;
                }
            }
            if (this.b == null) {
                throw new sp(AbstractC2914a.h(new StringBuilder("None of the available extractors ("), yp.b(a6), ") could read the stream."), (Uri) AbstractC0669a1.a(uri));
            }
        }
        this.b.a(k8Var);
    }

    @Override // com.applovin.impl.wh
    public long b() {
        j8 j8Var = this.f9382c;
        if (j8Var != null) {
            return j8Var.f();
        }
        return -1L;
    }

    @Override // com.applovin.impl.wh
    public void c() {
        i8 i8Var = this.b;
        if (i8Var instanceof jf) {
            ((jf) i8Var).c();
        }
    }

    @Override // com.applovin.impl.wh
    public int a(qh qhVar) {
        return ((i8) AbstractC0669a1.a(this.b)).a((j8) AbstractC0669a1.a(this.f9382c), qhVar);
    }

    @Override // com.applovin.impl.wh
    public void a() {
        i8 i8Var = this.b;
        if (i8Var != null) {
            i8Var.a();
            this.b = null;
        }
        this.f9382c = null;
    }

    @Override // com.applovin.impl.wh
    public void a(long j7, long j9) {
        ((i8) AbstractC0669a1.a(this.b)).a(j7, j9);
    }
}
