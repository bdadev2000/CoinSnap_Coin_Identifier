package com.applovin.impl;

import com.applovin.impl.a7;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface z6 {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f28307a;

        public a(Throwable th, int i2) {
            super(th);
            this.f28307a = i2;
        }
    }

    static void a(z6 z6Var, z6 z6Var2) {
        if (z6Var == z6Var2) {
            return;
        }
        if (z6Var2 != null) {
            z6Var2.b(null);
        }
        if (z6Var != null) {
            z6Var.a((a7.a) null);
        }
    }

    void a(a7.a aVar);

    boolean a(String str);

    int b();

    void b(a7.a aVar);

    boolean c();

    Map d();

    UUID e();

    z4 f();

    a getError();
}
