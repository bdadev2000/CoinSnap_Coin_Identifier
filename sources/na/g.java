package na;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import n0.u0;

/* loaded from: classes3.dex */
public final class g extends ka.i {
    public static final /* synthetic */ int C = 0;
    public f B;

    public g(f fVar) {
        super(fVar);
        this.B = fVar;
    }

    @Override // ka.i
    public final void f(Canvas canvas) {
        if (this.B.f22616w.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            u0.r(canvas, this.B.f22616w);
        } else {
            canvas.clipRect(this.B.f22616w, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // ka.i, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Drawable mutate() {
        o();
        return this;
    }

    public final Drawable o() {
        this.B = new f(this.B);
        return this;
    }

    public final void p(float f10, float f11, float f12, float f13) {
        RectF rectF = this.B.f22616w;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
