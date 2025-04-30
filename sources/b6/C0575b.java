package b6;

import Z5.h;
import android.view.View;
import d6.AbstractC2191a;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0575b extends R5.e {

    /* renamed from: g, reason: collision with root package name */
    public static final C0575b f5336g = new R5.e(1);

    @Override // R5.e
    public final void a(boolean z8) {
        String str;
        Iterator it = Collections.unmodifiableCollection(c.f5337c.f5338a).iterator();
        while (it.hasNext()) {
            AbstractC2191a abstractC2191a = ((h) it.next()).f3901e;
            if (abstractC2191a.b.get() != 0) {
                if (z8) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                g.f5341a.a(abstractC2191a.e(), "setState", str, abstractC2191a.f19912a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R5.e
    public final boolean d() {
        Iterator it = Collections.unmodifiableCollection(c.f5337c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((h) it.next()).f3900d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
