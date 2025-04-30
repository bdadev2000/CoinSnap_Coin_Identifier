package androidx.lifecycle;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class a0 implements Runnable {
    public final C0513x b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0503m f4879c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4880d;

    public a0(C0513x c0513x, EnumC0503m enumC0503m) {
        G7.j.e(c0513x, "registry");
        G7.j.e(enumC0503m, NotificationCompat.CATEGORY_EVENT);
        this.b = c0513x;
        this.f4879c = enumC0503m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f4880d) {
            this.b.e(this.f4879c);
            this.f4880d = true;
        }
    }
}
