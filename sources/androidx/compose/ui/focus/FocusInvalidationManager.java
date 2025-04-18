package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.n;
import q0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FocusInvalidationManager {

    /* renamed from: a, reason: collision with root package name */
    public final l f14836a;

    /* renamed from: b, reason: collision with root package name */
    public final a f14837b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableScatterSet f14838c;
    public final MutableScatterSet d;
    public final MutableScatterSet e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableScatterSet f14839f;

    public FocusInvalidationManager(a aVar, l lVar) {
        this.f14836a = lVar;
        this.f14837b = aVar;
        int i2 = ScatterSetKt.f1605a;
        this.f14838c = new MutableScatterSet();
        this.d = new MutableScatterSet();
        this.e = new MutableScatterSet();
        this.f14839f = new MutableScatterSet();
    }

    public final boolean a() {
        return this.f14838c.c() || this.e.c() || this.d.c();
    }

    public final void b(MutableScatterSet mutableScatterSet, Object obj) {
        if (mutableScatterSet.d(obj) && this.f14838c.d + this.d.d + this.e.d == 1) {
            this.f14836a.invoke(new n(0, this, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0));
        }
    }
}
