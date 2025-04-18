package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes3.dex */
public final class ScopeExtKt$emptyState$1 extends r implements a {
    public static final ScopeExtKt$emptyState$1 INSTANCE = new ScopeExtKt$emptyState$1();

    public ScopeExtKt$emptyState$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Bundle invoke() {
        return new Bundle();
    }
}
