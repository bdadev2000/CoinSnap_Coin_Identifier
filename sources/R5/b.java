package R5;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final b f2740g = new e(0);

    @Override // R5.e
    public final void a(boolean z8) {
        String str;
        Iterator it = Collections.unmodifiableCollection(c.f2741c.f2742a).iterator();
        while (it.hasNext()) {
            T5.a aVar = ((O5.k) it.next()).f2232e;
            if (aVar.b.get() != 0) {
                if (z8) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                i.f2751a.a(aVar.f(), "setState", str, aVar.f3019a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.e
    public final boolean d() {
        Iterator it = Collections.unmodifiableCollection(c.f2741c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((O5.k) it.next()).f2231d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
