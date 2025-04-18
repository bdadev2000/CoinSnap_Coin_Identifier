package kf;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes4.dex */
public abstract class b3 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f20708t;
    public final ShapeableImageView u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f20709v;

    public b3(View view, TextView textView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Object obj) {
        super(view, 0, obj);
        this.f20708t = constraintLayout;
        this.u = shapeableImageView;
        this.f20709v = textView;
    }
}
