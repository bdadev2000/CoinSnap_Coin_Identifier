package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class i0 extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f873b;

    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        p3.a(getContext(), this);
        j0 j0Var = new j0(this);
        this.f873b = j0Var;
        j0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        j0 j0Var = this.f873b;
        Drawable drawable = j0Var.f880e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = j0Var.f879d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f873b.f880e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f873b.d(canvas);
    }
}
