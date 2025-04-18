package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class j0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f879d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f880e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f881f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f882g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f883h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f884i;

    public j0(SeekBar seekBar) {
        super(seekBar);
        this.f881f = null;
        this.f882g = null;
        this.f883h = false;
        this.f884i = false;
        this.f879d = seekBar;
    }

    @Override // androidx.appcompat.widget.e0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f879d;
        Context context = seekBar.getContext();
        int[] iArr = g.a.f17884g;
        i3 m10 = i3.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) m10.f874b, R.attr.seekBarStyle, 0);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e2 = m10.e(1);
        Drawable drawable = this.f880e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f880e = e2;
        if (e2 != null) {
            e2.setCallback(seekBar);
            h0.b.b(e2, ViewCompat.getLayoutDirection(seekBar));
            if (e2.isStateful()) {
                e2.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f882g = s1.b(m10.h(3, -1), this.f882g);
            this.f884i = true;
        }
        if (m10.l(2)) {
            this.f881f = m10.b(2);
            this.f883h = true;
        }
        m10.o();
        c();
    }

    public final void c() {
        Drawable drawable = this.f880e;
        if (drawable != null) {
            if (this.f883h || this.f884i) {
                Drawable mutate = drawable.mutate();
                this.f880e = mutate;
                if (this.f883h) {
                    h0.a.h(mutate, this.f881f);
                }
                if (this.f884i) {
                    h0.a.i(this.f880e, this.f882g);
                }
                if (this.f880e.isStateful()) {
                    this.f880e.setState(this.f879d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i10;
        if (this.f880e != null) {
            int max = this.f879d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f880e.getIntrinsicWidth();
                int intrinsicHeight = this.f880e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f880e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f880e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
