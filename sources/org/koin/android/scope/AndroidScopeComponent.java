package org.koin.android.scope;

import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;

/* loaded from: classes4.dex */
public interface AndroidScopeComponent {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onCloseScope(@NotNull AndroidScopeComponent androidScopeComponent) {
        }
    }

    @NotNull
    Scope getScope();

    void onCloseScope();
}
