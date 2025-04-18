package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageButton;

/* loaded from: classes3.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: a, reason: collision with root package name */
    public float f18161a;

    /* renamed from: b, reason: collision with root package name */
    public float f18162b;

    /* renamed from: c, reason: collision with root package name */
    public float f18163c;
    public Path d;

    /* renamed from: f, reason: collision with root package name */
    public ViewOutlineProvider f18164f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f18165g;

    private void setOverlay(boolean z2) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f18161a;
    }

    public float getRound() {
        return this.f18163c;
    }

    public float getRoundPercent() {
        return this.f18162b;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    public void setBrightness(float f2) {
        throw null;
    }

    public void setContrast(float f2) {
        throw null;
    }

    public void setCrossfade(float f2) {
        this.f18161a = f2;
    }

    @RequiresApi
    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f18163c = f2;
            float f3 = this.f18162b;
            this.f18162b = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z2 = this.f18163c != f2;
        this.f18163c = f2;
        if (f2 != 0.0f) {
            if (this.d == null) {
                this.d = new Path();
            }
            if (this.f18165g == null) {
                this.f18165g = new RectF();
            }
            if (this.f18164f == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterButton imageFilterButton = ImageFilterButton.this;
                        outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.f18163c);
                    }
                };
                this.f18164f = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f18165g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.d.reset();
            Path path = this.d;
            RectF rectF = this.f18165g;
            float f4 = this.f18163c;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f2) {
        boolean z2 = this.f18162b != f2;
        this.f18162b = f2;
        if (f2 != 0.0f) {
            if (this.d == null) {
                this.d = new Path();
            }
            if (this.f18165g == null) {
                this.f18165g = new RectF();
            }
            if (this.f18164f == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterButton imageFilterButton = ImageFilterButton.this;
                        outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r3, r4) * imageFilterButton.f18162b) / 2.0f);
                    }
                };
                this.f18164f = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f18162b) / 2.0f;
            this.f18165g.set(0.0f, 0.0f, width, height);
            this.d.reset();
            this.d.addRoundRect(this.f18165g, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f2) {
        throw null;
    }

    public void setWarmth(float f2) {
        throw null;
    }
}
