package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import p0.a;

/* loaded from: classes3.dex */
public final class MutableCreationExtras extends CreationExtras {
    public /* synthetic */ MutableCreationExtras(int i2) {
        this(CreationExtras.Empty.f20236b);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final Object a(CreationExtras.Key key) {
        return this.f20235a.get(key);
    }

    public MutableCreationExtras(CreationExtras creationExtras) {
        a.s(creationExtras, "initialExtras");
        this.f20235a.putAll(creationExtras.f20235a);
    }
}
