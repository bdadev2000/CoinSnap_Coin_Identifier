package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5132a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5133c;

    /* renamed from: d, reason: collision with root package name */
    public int f5134d;

    /* renamed from: e, reason: collision with root package name */
    public int f5135e;

    /* renamed from: f, reason: collision with root package name */
    public int f5136f;

    /* renamed from: g, reason: collision with root package name */
    public int f5137g;

    /* renamed from: h, reason: collision with root package name */
    public int f5138h;

    /* renamed from: i, reason: collision with root package name */
    public int f5139i;

    /* renamed from: j, reason: collision with root package name */
    public int f5140j;

    /* renamed from: k, reason: collision with root package name */
    public List f5141k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f5141k.size();
        View view2 = null;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((p0) this.f5141k.get(i10)).itemView;
            X x9 = (X) view3.getLayoutParams();
            if (view3 != view && !x9.f4947a.isRemoved() && (layoutPosition = (x9.f4947a.getLayoutPosition() - this.f5134d) * this.f5135e) >= 0 && layoutPosition < i9) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i9 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f5134d = -1;
        } else {
            this.f5134d = ((X) view2.getLayoutParams()).f4947a.getLayoutPosition();
        }
    }

    public final View b(C0525e0 c0525e0) {
        List list = this.f5141k;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = ((p0) this.f5141k.get(i9)).itemView;
                X x9 = (X) view.getLayoutParams();
                if (!x9.f4947a.isRemoved() && this.f5134d == x9.f4947a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = c0525e0.l(this.f5134d, Long.MAX_VALUE).itemView;
        this.f5134d += this.f5135e;
        return view2;
    }
}
