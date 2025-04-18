package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class p0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2007b;

    public final void a(o1 o1Var) {
        View view = o1Var.itemView;
        this.a = view.getLeft();
        this.f2007b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
