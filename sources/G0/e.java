package G0;

import G7.j;
import android.os.Bundle;
import androidx.lifecycle.C0500j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import s.C2685b;
import s.C2686c;
import s.C2689f;

/* loaded from: classes.dex */
public final class e {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1244c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1245d;

    /* renamed from: e, reason: collision with root package name */
    public a f1246e;

    /* renamed from: a, reason: collision with root package name */
    public final C2689f f1243a = new C2689f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1247f = true;

    public final Bundle a(String str) {
        if (this.f1245d) {
            Bundle bundle = this.f1244c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f1244c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f1244c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f1244c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f1243a.iterator();
        do {
            C2685b c2685b = (C2685b) it;
            if (c2685b.hasNext()) {
                Map.Entry entry = (Map.Entry) c2685b.next();
                j.d(entry, "components");
                str = (String) entry.getKey();
                dVar = (d) entry.getValue();
            } else {
                return null;
            }
        } while (!j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d dVar) {
        Object obj;
        j.e(str, "key");
        j.e(dVar, "provider");
        C2689f c2689f = this.f1243a;
        C2686c b = c2689f.b(str);
        if (b != null) {
            obj = b.f22954c;
        } else {
            C2686c c2686c = new C2686c(str, dVar);
            c2689f.f22961f++;
            C2686c c2686c2 = c2689f.f22959c;
            if (c2686c2 == null) {
                c2689f.b = c2686c;
                c2689f.f22959c = c2686c;
            } else {
                c2686c2.f22955d = c2686c;
                c2686c.f22956f = c2686c2;
                c2689f.f22959c = c2686c;
            }
            obj = null;
        }
        if (((d) obj) == null) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f1247f) {
            a aVar = this.f1246e;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f1246e = aVar;
            try {
                C0500j.class.getDeclaredConstructor(null);
                a aVar2 = this.f1246e;
                if (aVar2 != null) {
                    ((LinkedHashSet) aVar2.b).add(C0500j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e4) {
                throw new IllegalArgumentException("Class " + C0500j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
