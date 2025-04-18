package org.koin.android.scope;

import android.app.Service;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes3.dex */
public final class ServiceExtKt$serviceScope$1 extends r implements a {
    final /* synthetic */ Service $this_serviceScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceExtKt$serviceScope$1(Service service) {
        super(0);
        this.$this_serviceScope = service;
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        return ServiceExtKt.createServiceScope(this.$this_serviceScope);
    }
}
