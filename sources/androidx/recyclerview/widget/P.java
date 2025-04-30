package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f4937a;
    public int b;

    public final void a(p0 p0Var) {
        View view = p0Var.itemView;
        this.f4937a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
