package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class x1 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20923t;
    public final LinearLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final RecyclerView f20924v;

    /* renamed from: w, reason: collision with root package name */
    public final u0 f20925w;

    public x1(Object obj, View view, FrameLayout frameLayout, LinearLayout linearLayout, RecyclerView recyclerView, u0 u0Var) {
        super(view, 1, obj);
        this.f20923t = frameLayout;
        this.u = linearLayout;
        this.f20924v = recyclerView;
        this.f20925w = u0Var;
    }
}
