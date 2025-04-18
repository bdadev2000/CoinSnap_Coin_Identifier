package p4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: b, reason: collision with root package name */
    public final b f23419b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23420c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23421d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23422f;

    /* renamed from: h, reason: collision with root package name */
    public int f23424h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23426j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f23427k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f23428l;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23423g = true;

    /* renamed from: i, reason: collision with root package name */
    public final int f23425i = -1;

    public c(b bVar) {
        com.bumptech.glide.c.l(bVar);
        this.f23419b = bVar;
    }

    public final void a() {
        com.bumptech.glide.c.h("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f23422f);
        h hVar = this.f23419b.a;
        if (((d4.e) hVar.a).f16847l.f16825c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f23420c) {
            this.f23420c = true;
            if (!hVar.f23447j) {
                ArrayList arrayList = hVar.f23440c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !hVar.f23443f) {
                        hVar.f23443f = true;
                        hVar.f23447j = false;
                        hVar.a();
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
        if (this.f23422f) {
            return;
        }
        if (this.f23426j) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f23428l == null) {
                this.f23428l = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f23428l);
            this.f23426j = false;
        }
        h hVar = this.f23419b.a;
        e eVar = hVar.f23446i;
        if (eVar != null) {
            bitmap = eVar.f23436i;
        } else {
            bitmap = hVar.f23449l;
        }
        if (this.f23428l == null) {
            this.f23428l = new Rect();
        }
        Rect rect = this.f23428l;
        if (this.f23427k == null) {
            this.f23427k = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f23427k);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f23419b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f23419b.a.f23453p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f23419b.a.f23452o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f23420c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23426j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f23427k == null) {
            this.f23427k = new Paint(2);
        }
        this.f23427k.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f23427k == null) {
            this.f23427k = new Paint(2);
        }
        this.f23427k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        com.bumptech.glide.c.h("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f23422f);
        this.f23423g = z10;
        if (!z10) {
            this.f23420c = false;
            h hVar = this.f23419b.a;
            ArrayList arrayList = hVar.f23440c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f23443f = false;
            }
        } else if (this.f23421d) {
            a();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f23421d = true;
        this.f23424h = 0;
        if (this.f23423g) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f23421d = false;
        this.f23420c = false;
        h hVar = this.f23419b.a;
        ArrayList arrayList = hVar.f23440c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f23443f = false;
        }
    }
}
