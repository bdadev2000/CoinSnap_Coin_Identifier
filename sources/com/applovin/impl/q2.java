package com.applovin.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q2 implements zh {

    /* renamed from: a, reason: collision with root package name */
    private final o8 f26154a;

    /* renamed from: b, reason: collision with root package name */
    private k8 f26155b;

    /* renamed from: c, reason: collision with root package name */
    private l8 f26156c;

    public q2(o8 o8Var) {
        this.f26154a = o8Var;
    }

    @Override // com.applovin.impl.zh
    public void a(g5 g5Var, Uri uri, Map map, long j2, long j3, m8 m8Var) {
        b6 b6Var = new b6(g5Var, j2, j3);
        this.f26156c = b6Var;
        if (this.f26155b != null) {
            return;
        }
        k8[] a2 = this.f26154a.a(uri, map);
        if (a2.length == 1) {
            this.f26155b = a2[0];
        } else {
            int length = a2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                k8 k8Var = a2[i2];
                try {
                } catch (EOFException unused) {
                    b1.b(this.f26155b != null || b6Var.f() == j2);
                    b6Var.b();
                } catch (Throwable th) {
                    b1.b(this.f26155b != null || b6Var.f() == j2);
                    b6Var.b();
                    throw th;
                }
                if (k8Var.a(b6Var)) {
                    this.f26155b = k8Var;
                    b1.b(true);
                    b6Var.b();
                    break;
                } else {
                    b1.b(this.f26155b != null || b6Var.f() == j2);
                    b6Var.b();
                    i2++;
                }
            }
            if (this.f26155b == null) {
                throw new rp(android.support.v4.media.d.r(new StringBuilder("None of the available extractors ("), xp.b(a2), ") could read the stream."), (Uri) b1.a(uri));
            }
        }
        this.f26155b.a(m8Var);
    }

    @Override // com.applovin.impl.zh
    public long b() {
        l8 l8Var = this.f26156c;
        if (l8Var != null) {
            return l8Var.f();
        }
        return -1L;
    }

    @Override // com.applovin.impl.zh
    public void c() {
        k8 k8Var = this.f26155b;
        if (k8Var instanceof of) {
            ((of) k8Var).c();
        }
    }

    @Override // com.applovin.impl.zh
    public int a(th thVar) {
        return ((k8) b1.a(this.f26155b)).a((l8) b1.a(this.f26156c), thVar);
    }

    @Override // com.applovin.impl.zh
    public void a() {
        k8 k8Var = this.f26155b;
        if (k8Var != null) {
            k8Var.a();
            this.f26155b = null;
        }
        this.f26156c = null;
    }

    @Override // com.applovin.impl.zh
    public void a(long j2, long j3) {
        ((k8) b1.a(this.f26155b)).a(j2, j3);
    }
}
