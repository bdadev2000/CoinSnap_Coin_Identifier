package kf;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes4.dex */
public abstract class j2 extends androidx.databinding.e {

    /* renamed from: t, reason: collision with root package name */
    public final ShapeableImageView f20798t;
    public final ConstraintLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f20799v;

    public j2(View view, TextView textView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Object obj) {
        super(view, 0, obj);
        this.f20798t = shapeableImageView;
        this.u = constraintLayout;
        this.f20799v = textView;
    }
}
