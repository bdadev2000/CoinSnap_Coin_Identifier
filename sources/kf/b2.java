package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class b2 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20704t;
    public final LinearLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final y0 f20705v;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f20706w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f20707x;

    public b2(Object obj, View view, FrameLayout frameLayout, LinearLayout linearLayout, y0 y0Var, RelativeLayout relativeLayout, RecyclerView recyclerView) {
        super(view, 1, obj);
        this.f20704t = frameLayout;
        this.u = linearLayout;
        this.f20705v = y0Var;
        this.f20706w = relativeLayout;
        this.f20707x = recyclerView;
    }
}
