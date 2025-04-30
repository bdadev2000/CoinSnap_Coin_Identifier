package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;

/* renamed from: q.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2583F extends C2578A {

    /* renamed from: e, reason: collision with root package name */
    public final SeekBar f22537e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f22538f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f22539g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22540h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22541i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22542j;

    public C2583F(SeekBar seekBar) {
        super(seekBar);
        this.f22539g = null;
        this.f22540h = null;
        this.f22541i = false;
        this.f22542j = false;
        this.f22537e = seekBar;
    }

    @Override // q.C2578A
    public final void b(AttributeSet attributeSet, int i9) {
        super.b(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f22537e;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC2379a.f20947g;
        l5.k i10 = l5.k.i(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) i10.b, R.attr.seekBarStyle, 0);
        Drawable f9 = i10.f(0);
        if (f9 != null) {
            seekBar.setThumb(f9);
        }
        Drawable e4 = i10.e(1);
        Drawable drawable = this.f22538f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f22538f = e4;
        if (e4 != null) {
            e4.setCallback(seekBar);
            M.b.b(e4, seekBar.getLayoutDirection());
            if (e4.isStateful()) {
                e4.setState(seekBar.getDrawableState());
            }
            f();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) i10.b;
        if (typedArray.hasValue(3)) {
            this.f22540h = AbstractC2610l0.c(typedArray.getInt(3, -1), this.f22540h);
            this.f22542j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f22539g = i10.d(2);
            this.f22541i = true;
        }
        i10.j();
        f();
    }

    public final void f() {
        Drawable drawable = this.f22538f;
        if (drawable != null) {
            if (this.f22541i || this.f22542j) {
                Drawable mutate = drawable.mutate();
                this.f22538f = mutate;
                if (this.f22541i) {
                    M.a.h(mutate, this.f22539g);
                }
                if (this.f22542j) {
                    M.a.i(this.f22538f, this.f22540h);
                }
                if (this.f22538f.isStateful()) {
                    this.f22538f.setState(this.f22537e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i9;
        if (this.f22538f != null) {
            int max = this.f22537e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f22538f.getIntrinsicWidth();
                int intrinsicHeight = this.f22538f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i9 = intrinsicWidth / 2;
                } else {
                    i9 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f22538f.setBounds(-i9, -i10, i9, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f22538f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
