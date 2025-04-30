package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import t7.AbstractC2712a;
import t7.C2724m;

/* loaded from: classes.dex */
public final class W implements G0.d {

    /* renamed from: a, reason: collision with root package name */
    public final G0.e f4871a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4872c;

    /* renamed from: d, reason: collision with root package name */
    public final C2724m f4873d;

    public W(G0.e eVar, g0 g0Var) {
        G7.j.e(eVar, "savedStateRegistry");
        G7.j.e(g0Var, "viewModelStoreOwner");
        this.f4871a = eVar;
        this.f4873d = AbstractC2712a.d(new a8.e(g0Var, 1));
    }

    @Override // G0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4872c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((X) this.f4873d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((S) entry.getValue()).f4865e.a();
            if (!G7.j.a(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle a6 = this.f4871a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f4872c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a6 != null) {
                bundle.putAll(a6);
            }
            this.f4872c = bundle;
            this.b = true;
        }
    }
}
