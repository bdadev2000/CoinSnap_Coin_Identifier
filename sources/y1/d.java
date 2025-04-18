package y1;

import android.os.Bundle;
import h.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f27881b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f27882c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27883d;

    /* renamed from: e, reason: collision with root package name */
    public k f27884e;
    public final g a = new g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f27885f = true;

    public final Bundle a(String key) {
        boolean z10;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f27883d) {
            Bundle bundle = this.f27882c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(key);
            Bundle bundle3 = this.f27882c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.f27882c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f27882c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c b() {
        String str;
        c cVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.a.iterator();
        do {
            m.e eVar = (m.e) it;
            if (eVar.hasNext()) {
                Map.Entry components = (Map.Entry) eVar.next();
                Intrinsics.checkNotNullExpressionValue(components, "components");
                str = (String) components.getKey();
                cVar = (c) components.getValue();
            } else {
                return null;
            }
        } while (!Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String key, c provider) {
        boolean z10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.a.b(key, provider)) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(androidx.lifecycle.k.class, "clazz");
        if (this.f27885f) {
            k kVar = this.f27884e;
            if (kVar == null) {
                kVar = new k(this);
            }
            this.f27884e = kVar;
            try {
                androidx.lifecycle.k.class.getDeclaredConstructor(new Class[0]);
                k kVar2 = this.f27884e;
                if (kVar2 != null) {
                    String className = androidx.lifecycle.k.class.getName();
                    Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                    Intrinsics.checkNotNullParameter(className, "className");
                    ((Set) kVar2.f18623b).add(className);
                    return;
                }
                return;
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
