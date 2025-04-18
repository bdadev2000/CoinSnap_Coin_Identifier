package org.koin.core.scope;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface ScopeCallback {
    void onScopeClose(@NotNull Scope scope);
}
