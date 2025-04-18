package kf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class g1 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f20767t;
    public final RecyclerView u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f20768v;

    /* renamed from: w, reason: collision with root package name */
    public final View f20769w;

    public g1(Object obj, View view, ImageView imageView, RecyclerView recyclerView, TextView textView, View view2) {
        super(view, 0, obj);
        this.f20767t = imageView;
        this.u = recyclerView;
        this.f20768v = textView;
        this.f20769w = view2;
    }
}
