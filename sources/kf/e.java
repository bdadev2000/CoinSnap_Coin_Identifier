package kf;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class e extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f20733t;
    public final EditText u;

    /* renamed from: v, reason: collision with root package name */
    public final FrameLayout f20734v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f20735w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f20736x;

    /* renamed from: y, reason: collision with root package name */
    public final RecyclerView f20737y;

    /* renamed from: z, reason: collision with root package name */
    public final y0 f20738z;

    public e(Object obj, View view, ImageView imageView, EditText editText, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, y0 y0Var) {
        super(view, 1, obj);
        this.f20733t = imageView;
        this.u = editText;
        this.f20734v = frameLayout;
        this.f20735w = linearLayout;
        this.f20736x = linearLayout2;
        this.f20737y = recyclerView;
        this.f20738z = y0Var;
    }
}
