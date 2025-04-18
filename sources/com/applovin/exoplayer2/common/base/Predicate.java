package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public interface Predicate<T> {
    @CanIgnoreReturnValue
    boolean apply(@NullableDecl T t2);

    boolean equals(@NullableDecl Object obj);
}
