package nd;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final b f22726g = new b();

    public b() {
        super(0);
    }

    @Override // nd.e
    public final void e(boolean z10) {
        boolean z11;
        String str;
        Iterator it = Collections.unmodifiableCollection(c.f22727c.a).iterator();
        while (it.hasNext()) {
            pd.a aVar = ((kd.i) it.next()).f20672e;
            if (aVar.f23594b.get() != 0) {
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
                b6.b.f2297i.a(aVar.f(), "setState", str, aVar.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.e
    public final boolean f() {
        Iterator it = c.f22727c.a().iterator();
        while (it.hasNext()) {
            View view = (View) ((kd.i) it.next()).f20671d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
