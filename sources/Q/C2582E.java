package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: q.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2582E extends SeekBar {
    public final C2583F b;

    public C2582E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        O0.a(this, getContext());
        C2583F c2583f = new C2583F(this);
        this.b = c2583f;
        c2583f.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2583F c2583f = this.b;
        Drawable drawable = c2583f.f22538f;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = c2583f.f22537e;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b.f22538f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.g(canvas);
    }
}
