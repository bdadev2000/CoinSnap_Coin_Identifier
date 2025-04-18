package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class c0 extends androidx.databinding.e {
    public final ViewPager2 A;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20716t;
    public final ImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f20717v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f20718w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f20719x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f20720y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20721z;

    public c0(Object obj, View view, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewPager2 viewPager2) {
        super(view, 0, obj);
        this.f20716t = frameLayout;
        this.u = imageView;
        this.f20717v = linearLayout;
        this.f20718w = textView;
        this.f20719x = textView2;
        this.f20720y = textView3;
        this.f20721z = textView4;
        this.A = viewPager2;
    }
}
