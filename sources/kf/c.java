package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class c extends androidx.databinding.e {
    public final ViewPager2 A;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20710t;
    public final ImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f20711v;

    /* renamed from: w, reason: collision with root package name */
    public final y0 f20712w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f20713x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f20714y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20715z;

    public c(Object obj, View view, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, y0 y0Var, TextView textView, TextView textView2, TextView textView3, ViewPager2 viewPager2) {
        super(view, 1, obj);
        this.f20710t = frameLayout;
        this.u = imageView;
        this.f20711v = linearLayout;
        this.f20712w = y0Var;
        this.f20713x = textView;
        this.f20714y = textView2;
        this.f20715z = textView3;
        this.A = viewPager2;
    }
}
