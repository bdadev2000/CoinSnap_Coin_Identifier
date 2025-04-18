package kf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes4.dex */
public abstract class l2 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f20818t;
    public final ShapeableImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f20819v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f20820w;

    public l2(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Object obj) {
        super(view, 0, obj);
        this.f20818t = imageView;
        this.u = shapeableImageView;
        this.f20819v = constraintLayout;
        this.f20820w = textView;
    }
}
