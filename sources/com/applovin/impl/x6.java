package com.applovin.impl;

import com.applovin.impl.y6;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x6 {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f12156a;

        public a(Throwable th, int i9) {
            super(th);
            this.f12156a = i9;
        }
    }

    static void a(x6 x6Var, x6 x6Var2) {
        if (x6Var == x6Var2) {
            return;
        }
        if (x6Var2 != null) {
            x6Var2.b(null);
        }
        if (x6Var != null) {
            x6Var.a((y6.a) null);
        }
    }

    void a(y6.a aVar);

    boolean a(String str);

    int b();

    void b(y6.a aVar);

    boolean c();

    Map d();

    UUID e();

    x4 f();

    a getError();
}
