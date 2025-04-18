package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class o0 extends androidx.databinding.e {
    public final RelativeLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ViewPager2 F;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f20847t;
    public final FrameLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f20848v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f20849w;

    /* renamed from: x, reason: collision with root package name */
    public final y0 f20850x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f20851y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerView f20852z;

    public o0(Object obj, View view, LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout2, y0 y0Var, RecyclerView recyclerView, RecyclerView recyclerView2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewPager2 viewPager2) {
        super(view, 1, obj);
        this.f20847t = linearLayout;
        this.u = frameLayout;
        this.f20848v = imageView;
        this.f20849w = linearLayout2;
        this.f20850x = y0Var;
        this.f20851y = recyclerView;
        this.f20852z = recyclerView2;
        this.A = relativeLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = viewPager2;
    }
}
