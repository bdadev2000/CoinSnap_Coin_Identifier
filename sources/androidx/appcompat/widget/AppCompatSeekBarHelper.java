package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes2.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    public final SeekBar d;
    public Drawable e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1009f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1010g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1011h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1012i;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f1009f = null;
        this.f1010g = null;
        this.f1011h = false;
        this.f1012i = false;
        this.d = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public final void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.d;
        Context context = seekBar.getContext();
        int[] iArr = androidx.appcompat.R.styleable.f315g;
        TintTypedArray e = TintTypedArray.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        ViewCompat.z(seekBar, seekBar.getContext(), iArr, attributeSet, e.f1237b, R.attr.seekBarStyle);
        Drawable c2 = e.c(0);
        if (c2 != null) {
            seekBar.setThumb(c2);
        }
        Drawable b2 = e.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = b2;
        if (b2 != null) {
            b2.setCallback(seekBar);
            DrawableCompat.h(b2, seekBar.getLayoutDirection());
            if (b2.isStateful()) {
                b2.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        TypedArray typedArray = e.f1237b;
        if (typedArray.hasValue(3)) {
            this.f1010g = DrawableUtils.c(typedArray.getInt(3, -1), this.f1010g);
            this.f1012i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f1009f = e.a(2);
            this.f1011h = true;
        }
        e.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.f1011h || this.f1012i) {
                Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.f1011h) {
                    DrawableCompat.j(mutate, this.f1009f);
                }
                if (this.f1012i) {
                    DrawableCompat.k(this.e, this.f1010g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
