package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public interface Function<F, T> {
    @NullableDecl
    T apply(@NullableDecl F f9);

    boolean equals(@NullableDecl Object obj);
}
