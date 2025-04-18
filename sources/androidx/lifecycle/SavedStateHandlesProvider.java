package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import b1.f0;
import d0.p;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f20101a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20102b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f20103c;
    public final p d;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        p0.a.s(savedStateRegistry, "savedStateRegistry");
        p0.a.s(viewModelStoreOwner, "viewModelStoreOwner");
        this.f20101a = savedStateRegistry;
        this.d = f0.t(new SavedStateHandlesProvider$viewModel$2(viewModelStoreOwner));
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f20103c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).f20105b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((SavedStateHandle) entry.getValue()).e.a();
            if (!p0.a.g(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f20102b = false;
        return bundle;
    }

    public final void b() {
        if (this.f20102b) {
            return;
        }
        Bundle a2 = this.f20101a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f20103c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a2 != null) {
            bundle.putAll(a2);
        }
        this.f20103c = bundle;
        this.f20102b = true;
    }
}
