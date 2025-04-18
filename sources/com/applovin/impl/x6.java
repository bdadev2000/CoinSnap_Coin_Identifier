package com.applovin.impl;

import com.applovin.impl.y6;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x6 {

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public final int a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.a = i10;
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
