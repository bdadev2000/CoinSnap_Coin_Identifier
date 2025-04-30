package R5;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f2759d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f2760a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2761c;

    /* JADX WARN: Type inference failed for: r0v0, types: [R5.k, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.b = false;
        obj.f2761c = false;
        f2759d = obj;
    }

    public final void a(boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        if (!z9 && !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f2761c && !this.b) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f2741c.f2742a).iterator();
        while (it.hasNext()) {
            T5.a aVar = ((O5.k) it.next()).f2232e;
            if (!z9 && !z8) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (aVar.b.get() != 0) {
                if (z12) {
                    str = "locked";
                } else {
                    str = "unlocked";
                }
                i.f2751a.a(aVar.f(), "setDeviceLockState", str);
            }
        }
    }
}
