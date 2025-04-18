package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class w extends androidx.databinding.e {
    public final TextView A;
    public final TextView B;
    public final ViewPager2 C;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f20909t;
    public final ImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f20910v;

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f20911w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f20912x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f20913y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20914z;

    public w(Object obj, View view, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewPager2 viewPager2) {
        super(view, 0, obj);
        this.f20909t = frameLayout;
        this.u = imageView;
        this.f20910v = linearLayout;
        this.f20911w = recyclerView;
        this.f20912x = recyclerView2;
        this.f20913y = textView;
        this.f20914z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = viewPager2;
    }
}
