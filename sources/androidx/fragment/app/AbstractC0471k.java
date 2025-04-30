package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0471k {

    /* renamed from: a, reason: collision with root package name */
    public final L0 f4731a;

    public AbstractC0471k(L0 l02) {
        G7.j.e(l02, "operation");
        this.f4731a = l02;
    }

    public final boolean a() {
        int i9;
        L0 l02 = this.f4731a;
        View view = l02.f4667c.mView;
        if (view != null) {
            i9 = com.bumptech.glide.d.G(view);
        } else {
            i9 = 0;
        }
        int i10 = l02.f4666a;
        if (i9 != i10 && (i9 == 2 || i10 == 2)) {
            return false;
        }
        return true;
    }
}
