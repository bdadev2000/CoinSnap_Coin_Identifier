package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28832a;

    public /* synthetic */ g(int i2) {
        this.f28832a = i2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f28832a) {
            case 0:
                return OptionalProvider.a();
            default:
                return Collections.emptySet();
        }
    }
}
