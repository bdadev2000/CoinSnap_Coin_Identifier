package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public interface hc {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ic f8121a;
        public final pd b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f8122c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8123d;

        public a(ic icVar, pd pdVar, IOException iOException, int i9) {
            this.f8121a = icVar;
            this.b = pdVar;
            this.f8122c = iOException;
            this.f8123d = i9;
        }
    }

    int a(int i9);

    long a(a aVar);

    default void a(long j7) {
    }
}
