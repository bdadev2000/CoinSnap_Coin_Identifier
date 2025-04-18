package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class a extends androidx.databinding.e {
    public final ViewPager2 A;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20685t;
    public final ImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f20686v;

    /* renamed from: w, reason: collision with root package name */
    public final y0 f20687w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f20688x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f20689y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20690z;

    public a(Object obj, View view, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, y0 y0Var, TextView textView, TextView textView2, TextView textView3, ViewPager2 viewPager2) {
        super(view, 1, obj);
        this.f20685t = frameLayout;
        this.u = imageView;
        this.f20686v = linearLayout;
        this.f20687w = y0Var;
        this.f20688x = textView;
        this.f20689y = textView2;
        this.f20690z = textView3;
        this.A = viewPager2;
    }
}
