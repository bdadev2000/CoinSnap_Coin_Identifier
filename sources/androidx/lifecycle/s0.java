package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 implements y1.c {
    public final y1.d a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1820b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1821c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f1822d;

    public s0(y1.d savedStateRegistry, e1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.a = savedStateRegistry;
        this.f1822d = LazyKt.lazy(new r0(viewModelStoreOwner, 0));
    }

    @Override // y1.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1821c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((t0) this.f1822d.getValue()).a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((q0) entry.getValue()).f1817e.a();
            if (!Intrinsics.areEqual(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f1820b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f1820b) {
            Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f1821c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a != null) {
                bundle.putAll(a);
            }
            this.f1821c = bundle;
            this.f1820b = true;
        }
    }
}
