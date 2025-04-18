package kf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class k0 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f20802t;
    public final ImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f20803v;

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f20804w;

    public k0(Object obj, View view, TextView textView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView) {
        super(view, 0, obj);
        this.f20802t = textView;
        this.u = imageView;
        this.f20803v = imageView2;
        this.f20804w = recyclerView;
    }
}
