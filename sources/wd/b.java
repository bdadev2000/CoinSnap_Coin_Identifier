package wd;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import vd.i;

/* loaded from: classes4.dex */
public final class b extends nd.e {

    /* renamed from: g, reason: collision with root package name */
    public static final b f26968g = new b();

    public b() {
        super(1);
    }

    @Override // nd.e
    public final void e(boolean z10) {
        boolean z11;
        String str;
        Iterator it = Collections.unmodifiableCollection(c.f26969c.a).iterator();
        while (it.hasNext()) {
            yd.a aVar = ((i) it.next()).f26513e;
            if (aVar.f28167b.get() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (z10) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                ka.e.f20531c.a(aVar.e(), "setState", str, aVar.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.e
    public final boolean f() {
        Iterator it = c.f26969c.a().iterator();
        while (it.hasNext()) {
            View view = (View) ((i) it.next()).f26512d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
