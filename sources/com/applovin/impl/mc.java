package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public interface mc {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final nc f25239a;

        /* renamed from: b, reason: collision with root package name */
        public final ud f25240b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f25241c;
        public final int d;

        public a(nc ncVar, ud udVar, IOException iOException, int i2) {
            this.f25239a = ncVar;
            this.f25240b = udVar;
            this.f25241c = iOException;
            this.d = i2;
        }
    }

    int a(int i2);

    long a(a aVar);

    default void a(long j2) {
    }
}
