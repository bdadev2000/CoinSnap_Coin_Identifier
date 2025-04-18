package org.koin.core.component;

import d0.a;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public interface KoinScopeComponent extends KoinComponent {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @a
        public static void closeScope(@NotNull KoinScopeComponent koinScopeComponent) {
            if (koinScopeComponent.getScope().isNotClosed()) {
                koinScopeComponent.getScope().close();
            }
        }

        @NotNull
        public static Koin getKoin(@NotNull KoinScopeComponent koinScopeComponent) {
            return KoinComponent.DefaultImpls.getKoin(koinScopeComponent);
        }
    }

    @a
    void closeScope();

    @NotNull
    Scope getScope();
}
