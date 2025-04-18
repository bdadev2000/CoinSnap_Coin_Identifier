package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public int f2088b;

    /* renamed from: c, reason: collision with root package name */
    public int f2089c;

    /* renamed from: d, reason: collision with root package name */
    public int f2090d;

    /* renamed from: e, reason: collision with root package name */
    public int f2091e;

    /* renamed from: f, reason: collision with root package name */
    public int f2092f;

    /* renamed from: g, reason: collision with root package name */
    public int f2093g;

    /* renamed from: j, reason: collision with root package name */
    public int f2096j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2098l;
    public boolean a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f2094h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f2095i = 0;

    /* renamed from: k, reason: collision with root package name */
    public List f2097k = null;

    public final void a(View view) {
        int a;
        int size = this.f2097k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((o1) this.f2097k.get(i11)).itemView;
            w0 w0Var = (w0) view3.getLayoutParams();
            if (view3 != view && !w0Var.c() && (a = (w0Var.a() - this.f2090d) * this.f2091e) >= 0 && a < i10) {
                view2 = view3;
                if (a == 0) {
                    break;
                } else {
                    i10 = a;
                }
            }
        }
        if (view2 == null) {
            this.f2090d = -1;
        } else {
            this.f2090d = ((w0) view2.getLayoutParams()).a();
        }
    }

    public final View b(d1 d1Var) {
        List list = this.f2097k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((o1) this.f2097k.get(i10)).itemView;
                w0 w0Var = (w0) view.getLayoutParams();
                if (!w0Var.c() && this.f2090d == w0Var.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d10 = d1Var.d(this.f2090d);
        this.f2090d += this.f2091e;
        return d10;
    }
}
