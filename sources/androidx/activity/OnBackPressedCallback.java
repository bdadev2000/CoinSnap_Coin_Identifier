package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f163a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f164b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public q0.a f165c;

    public OnBackPressedCallback(boolean z2) {
        this.f163a = z2;
    }

    public void a() {
    }

    public abstract void b();

    public void c(BackEventCompat backEventCompat) {
        p0.a.s(backEventCompat, "backEvent");
    }

    public void d(BackEventCompat backEventCompat) {
        p0.a.s(backEventCompat, "backEvent");
    }

    public final void e() {
        Iterator it = this.f164b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }
}
