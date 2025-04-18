package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f28831b;

    public /* synthetic */ e(ComponentRegistrar componentRegistrar, int i2) {
        this.f28830a = i2;
        this.f28831b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i2 = this.f28830a;
        ComponentRegistrar componentRegistrar = this.f28831b;
        switch (i2) {
            case 0:
                return ComponentRuntime.b(componentRegistrar);
            default:
                return ComponentRuntime.Builder.a(componentRegistrar);
        }
    }
}
