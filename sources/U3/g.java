package U3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class g extends R3.g {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f3150A = 0;

    /* renamed from: z, reason: collision with root package name */
    public f f3151z;

    public g(f fVar) {
        super(fVar);
        this.f3151z = fVar;
    }

    @Override // R3.g
    public final void f(Canvas canvas) {
        if (this.f3151z.f3149v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f3151z.f3149v);
        } else {
            canvas.clipRect(this.f3151z.f3149v, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // R3.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3151z = new f(this.f3151z);
        return this;
    }

    public final void o(float f9, float f10, float f11, float f12) {
        RectF rectF = this.f3151z.f3149v;
        if (f9 != rectF.left || f10 != rectF.top || f11 != rectF.right || f12 != rectF.bottom) {
            rectF.set(f9, f10, f11, f12);
            invalidateSelf();
        }
    }
}
