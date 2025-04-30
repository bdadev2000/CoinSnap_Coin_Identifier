package a2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333b extends Drawable implements InterfaceC0336e, Animatable {
    public final N0.e b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3923d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3924f;

    /* renamed from: h, reason: collision with root package name */
    public int f3926h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3928j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f3929k;
    public Rect l;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3925g = true;

    /* renamed from: i, reason: collision with root package name */
    public final int f3927i = -1;

    public C0333b(N0.e eVar) {
        j2.g.c(eVar, "Argument must not be null");
        this.b = eVar;
    }

    public final void a() {
        j2.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f3924f);
        C0337f c0337f = (C0337f) this.b.b;
        if (c0337f.f3936a.l.f1953c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f3922c) {
            this.f3922c = true;
            if (!c0337f.f3944j) {
                ArrayList arrayList = c0337f.f3937c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !c0337f.f3940f) {
                        c0337f.f3940f = true;
                        c0337f.f3944j = false;
                        c0337f.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f3924f) {
            return;
        }
        if (this.f3928j) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.l == null) {
                this.l = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.l);
            this.f3928j = false;
        }
        C0337f c0337f = (C0337f) this.b.b;
        C0335d c0335d = c0337f.f3943i;
        if (c0335d != null) {
            bitmap = c0335d.f3935i;
        } else {
            bitmap = c0337f.l;
        }
        if (this.l == null) {
            this.l = new Rect();
        }
        Rect rect = this.l;
        if (this.f3929k == null) {
            this.f3929k = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f3929k);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C0337f) this.b.b).f3948p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C0337f) this.b.b).f3947o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f3922c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3928j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.f3929k == null) {
            this.f3929k = new Paint(2);
        }
        this.f3929k.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3929k == null) {
            this.f3929k = new Paint(2);
        }
        this.f3929k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        j2.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f3924f);
        this.f3925g = z8;
        if (!z8) {
            this.f3922c = false;
            C0337f c0337f = (C0337f) this.b.b;
            ArrayList arrayList = c0337f.f3937c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c0337f.f3940f = false;
            }
        } else if (this.f3923d) {
            a();
        }
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f3923d = true;
        this.f3926h = 0;
        if (this.f3925g) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f3923d = false;
        this.f3922c = false;
        C0337f c0337f = (C0337f) this.b.b;
        ArrayList arrayList = c0337f.f3937c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c0337f.f3940f = false;
        }
    }
}
