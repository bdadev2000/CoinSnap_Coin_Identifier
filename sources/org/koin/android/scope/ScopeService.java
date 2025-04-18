package org.koin.android.scope;

import android.app.Service;
import d0.h;
import org.jetbrains.annotations.NotNull;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* loaded from: classes4.dex */
public abstract class ScopeService extends Service implements AndroidScopeComponent {

    @NotNull
    private final h scope$delegate = ServiceExtKt.serviceScope(this);

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope$delegate.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ServiceExtKt.destroyServiceScope(this);
    }
}
