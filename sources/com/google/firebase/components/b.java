package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.IidStore;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28824b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28823a = i2;
        this.f28824b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        IidStore lambda$new$0;
        int i2 = this.f28823a;
        Object obj = this.f28824b;
        switch (i2) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) obj);
                return instantiate;
            default:
                lambda$new$0 = FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
                return lambda$new$0;
        }
    }
}
