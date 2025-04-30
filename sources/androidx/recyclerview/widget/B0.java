package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f4925a;
    public final z0 b;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.z0, java.lang.Object] */
    public B0(A0 a02) {
        this.f4925a = a02;
        ?? obj = new Object();
        obj.f5142a = 0;
        this.b = obj;
    }

    public final View a(int i9, int i10, int i11, int i12) {
        int i13;
        A0 a02 = this.f4925a;
        int b = a02.b();
        int c9 = a02.c();
        if (i10 > i9) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i9 != i10) {
            View d2 = a02.d(i9);
            int a6 = a02.a(d2);
            int e4 = a02.e(d2);
            z0 z0Var = this.b;
            z0Var.b = b;
            z0Var.f5143c = c9;
            z0Var.f5144d = a6;
            z0Var.f5145e = e4;
            if (i11 != 0) {
                z0Var.f5142a = i11;
                if (z0Var.a()) {
                    return d2;
                }
            }
            if (i12 != 0) {
                z0Var.f5142a = i12;
                if (z0Var.a()) {
                    view = d2;
                }
            }
            i9 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        A0 a02 = this.f4925a;
        int b = a02.b();
        int c9 = a02.c();
        int a6 = a02.a(view);
        int e4 = a02.e(view);
        z0 z0Var = this.b;
        z0Var.b = b;
        z0Var.f5143c = c9;
        z0Var.f5144d = a6;
        z0Var.f5145e = e4;
        z0Var.f5142a = 24579;
        return z0Var.a();
    }
}
