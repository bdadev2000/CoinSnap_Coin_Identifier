package y1;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m.g;

/* loaded from: classes.dex */
public final class e {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final d f27886b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f27887c;

    public e(f fVar) {
        this.a = fVar;
    }

    public final void a() {
        boolean z10;
        f fVar = this.a;
        p lifecycle = fVar.getLifecycle();
        if (((x) lifecycle).f1835d == o.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycle.a(new Recreator(fVar));
            final d dVar = this.f27886b;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            if (!dVar.f27881b) {
                lifecycle.a(new t() { // from class: y1.a
                    @Override // androidx.lifecycle.t
                    public final void a(v vVar, n event) {
                        d this$0 = d.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(vVar, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == n.ON_START) {
                            this$0.f27885f = true;
                        } else if (event == n.ON_STOP) {
                            this$0.f27885f = false;
                        }
                    }
                });
                dVar.f27881b = true;
                this.f27887c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f27887c) {
            a();
        }
        x xVar = (x) this.a.getLifecycle();
        if (!xVar.f1835d.a(o.STARTED)) {
            d dVar = this.f27886b;
            if (dVar.f27881b) {
                if (!dVar.f27883d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    dVar.f27882c = bundle2;
                    dVar.f27883d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + xVar.f1835d).toString());
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        d dVar = this.f27886b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = dVar.f27882c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        g gVar = dVar.a;
        gVar.getClass();
        m.d dVar2 = new m.d(gVar);
        gVar.f21419d.put(dVar2, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(dVar2, "this.components.iteratorWithAdditions()");
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
