package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: q.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2580C extends RatingBar {
    public final C2578A b;

    public C2580C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        O0.a(this, getContext());
        C2578A c2578a = new C2578A(this);
        this.b = c2578a;
        c2578a.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Bitmap bitmap = (Bitmap) this.b.f22506c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i9, 0), getMeasuredHeight());
        }
    }
}
