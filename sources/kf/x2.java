package kf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes4.dex */
public abstract class x2 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f20926t;
    public final ConstraintLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final ShapeableImageView f20927v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f20928w;

    public x2(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Object obj) {
        super(view, 0, obj);
        this.f20926t = imageView;
        this.u = constraintLayout;
        this.f20927v = shapeableImageView;
        this.f20928w = textView;
    }
}
