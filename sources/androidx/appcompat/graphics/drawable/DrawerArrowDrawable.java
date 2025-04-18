package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f579m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f580a;

    /* renamed from: b, reason: collision with root package name */
    public final float f581b;

    /* renamed from: c, reason: collision with root package name */
    public final float f582c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f583f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f584g;

    /* renamed from: h, reason: collision with root package name */
    public final int f585h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f586i;

    /* renamed from: j, reason: collision with root package name */
    public float f587j;

    /* renamed from: k, reason: collision with root package name */
    public final float f588k;

    /* renamed from: l, reason: collision with root package name */
    public final int f589l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f580a = paint;
        this.f584g = new Path();
        this.f586i = false;
        this.f589l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.f322n, com.cooldev.gba.emulator.gameboy.R.attr.drawerArrowStyle, com.cooldev.gba.emulator.gameboy.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f588k = (float) (Math.cos(f579m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f583f != z2) {
            this.f583f = z2;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.e) {
            this.e = round;
            invalidateSelf();
        }
        this.f585h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f582c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f581b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f2, float f3, float f4) {
        return d.a(f3, f2, f4, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z2 = false;
        int i2 = this.f589l;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? DrawableCompat.d(this) == 0 : DrawableCompat.d(this) == 1))) {
            z2 = true;
        }
        float f2 = this.f581b;
        float sqrt = (float) Math.sqrt(f2 * f2 * 2.0f);
        float f3 = this.f587j;
        float f4 = this.f582c;
        float a2 = a(f4, sqrt, f3);
        float a3 = a(f4, this.d, this.f587j);
        float round = Math.round(a(0.0f, this.f588k, this.f587j));
        float a4 = a(0.0f, f579m, this.f587j);
        float a5 = a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f587j);
        double d = a2;
        double d2 = a4;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(Math.sin(d2) * d);
        Path path = this.f584g;
        path.rewind();
        float f5 = this.e;
        Paint paint = this.f580a;
        float a6 = a(paint.getStrokeWidth() + f5, -this.f588k, this.f587j);
        float f6 = (-a3) / 2.0f;
        path.moveTo(f6 + round, 0.0f);
        path.rLineTo(a3 - (round * 2.0f), 0.0f);
        path.moveTo(f6, a6);
        path.rLineTo(round2, round3);
        path.moveTo(f6, -a6);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.e + ((((int) (height - (2.0f * r8))) / 4) * 2));
        if (this.f583f) {
            canvas.rotate(a5 * (this.f586i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f585h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f585h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Paint paint = this.f580a;
        if (i2 != paint.getAlpha()) {
            paint.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f580a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
