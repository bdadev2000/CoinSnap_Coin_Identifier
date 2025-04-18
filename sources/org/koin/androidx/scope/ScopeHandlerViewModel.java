package org.koin.androidx.scope;

import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes4.dex */
public final class ScopeHandlerViewModel extends ViewModel {

    @Nullable
    private Scope scope;

    @Nullable
    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Scope scope = this.scope;
        if (scope != null && scope.isNotClosed()) {
            scope.getLogger().debug("Closing scope " + this.scope);
            scope.close();
        }
        this.scope = null;
    }

    public final void setScope(@Nullable Scope scope) {
        this.scope = scope;
    }
}
