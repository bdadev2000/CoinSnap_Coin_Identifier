package G0;

import G7.j;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0504n;
import java.util.Map;
import s.C2687d;
import s.C2689f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f1248a;
    public final e b = new e();

    /* renamed from: c, reason: collision with root package name */
    public boolean f1249c;

    public f(g gVar) {
        this.f1248a = gVar;
    }

    public final void a() {
        g gVar = this.f1248a;
        AbstractC0505o lifecycle = gVar.getLifecycle();
        if (((C0513x) lifecycle).f4904d == EnumC0504n.f4892c) {
            lifecycle.a(new b(gVar));
            e eVar = this.b;
            eVar.getClass();
            if (!eVar.b) {
                lifecycle.a(new f.e(eVar, 2));
                eVar.b = true;
                this.f1249c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        boolean z8;
        Bundle bundle2;
        if (!this.f1249c) {
            a();
        }
        C0513x c0513x = (C0513x) this.f1248a.getLifecycle();
        if (c0513x.f4904d.compareTo(EnumC0504n.f4894f) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            e eVar = this.b;
            if (eVar.b) {
                if (!eVar.f1245d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    eVar.f1244c = bundle2;
                    eVar.f1245d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + c0513x.f4904d).toString());
    }

    public final void c(Bundle bundle) {
        j.e(bundle, "outBundle");
        e eVar = this.b;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f1244c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2689f c2689f = eVar.f1243a;
        c2689f.getClass();
        C2687d c2687d = new C2687d(c2689f);
        c2689f.f22960d.put(c2687d, Boolean.FALSE);
        while (c2687d.hasNext()) {
            Map.Entry entry = (Map.Entry) c2687d.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
