package d0;

import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0510u;
import java.lang.ref.WeakReference;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2157d implements InterfaceC0510u {
    public final WeakReference b;

    public C2157d(AbstractC2158e abstractC2158e) {
        this.b = new WeakReference(abstractC2158e);
    }

    @E(EnumC0503m.ON_START)
    public void onStart() {
        AbstractC2158e abstractC2158e = (AbstractC2158e) this.b.get();
        if (abstractC2158e != null) {
            abstractC2158e.G();
        }
    }
}
