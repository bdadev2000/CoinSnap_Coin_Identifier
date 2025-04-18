package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public interface hc {

    /* loaded from: classes.dex */
    public static final class a {
        public final ic a;

        /* renamed from: b, reason: collision with root package name */
        public final pd f5144b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f5145c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5146d;

        public a(ic icVar, pd pdVar, IOException iOException, int i10) {
            this.a = icVar;
            this.f5144b = pdVar;
            this.f5145c = iOException;
            this.f5146d = i10;
        }
    }

    int a(int i10);

    long a(a aVar);

    default void a(long j3) {
    }
}
