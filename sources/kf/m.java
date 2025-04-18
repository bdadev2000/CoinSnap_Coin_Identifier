package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class m extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f20821t;
    public final FrameLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f20822v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f20823w;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f20824x;

    public m(Object obj, View view, TextView textView, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, RecyclerView recyclerView) {
        super(view, 0, obj);
        this.f20821t = textView;
        this.u = frameLayout;
        this.f20822v = imageView;
        this.f20823w = imageView2;
        this.f20824x = recyclerView;
    }
}
