package nd;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f22744d = new i();
    public WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22745b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22746c = false;

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        if (!z11 && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!this.f22746c && !this.f22745b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z12 == z13) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f22727c.a).iterator();
        while (it.hasNext()) {
            pd.a aVar = ((kd.i) it.next()).f20672e;
            if (!z11 && !z10) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (aVar.f23594b.get() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                if (z14) {
                    str = "locked";
                } else {
                    str = "unlocked";
                }
                b6.b.f2297i.a(aVar.f(), "setDeviceLockState", str);
            }
        }
    }
}
