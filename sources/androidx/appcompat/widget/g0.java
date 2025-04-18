package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class g0 extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f869b;

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        p3.a(getContext(), this);
        e0 e0Var = new e0(this);
        this.f869b = e0Var;
        e0Var.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = this.f869b.f860b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
