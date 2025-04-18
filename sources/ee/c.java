package ee;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import vd.e;

/* loaded from: classes4.dex */
public final class c extends Drawable {
    public static final /* synthetic */ int u = 0;
    public final RectF a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f17328b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f17329c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f17330d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f17331e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17332f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17333g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f17334h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f17335i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f17336j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f17337k;

    /* renamed from: l, reason: collision with root package name */
    public Shader.TileMode f17338l;

    /* renamed from: m, reason: collision with root package name */
    public Shader.TileMode f17339m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17340n;

    /* renamed from: o, reason: collision with root package name */
    public float f17341o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f17342p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17343q;

    /* renamed from: r, reason: collision with root package name */
    public float f17344r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f17345s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f17346t;

    public c(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f17329c = rectF;
        this.f17334h = new RectF();
        this.f17336j = new Matrix();
        this.f17337k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f17338l = tileMode;
        this.f17339m = tileMode;
        this.f17340n = true;
        this.f17341o = 0.0f;
        this.f17342p = new boolean[]{true, true, true, true};
        this.f17343q = false;
        this.f17344r = 0.0f;
        this.f17345s = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f17346t = ImageView.ScaleType.FIT_CENTER;
        this.f17330d = bitmap;
        int width = bitmap.getWidth();
        this.f17332f = width;
        int height = bitmap.getHeight();
        this.f17333g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f17331e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f17335i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f17345s.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.f17344r);
    }

    public static Drawable a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable != null) {
            if (drawable instanceof c) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), a(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    bitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                return new c(bitmap);
            }
            return drawable;
        }
        return drawable;
    }

    public final void b(Canvas canvas) {
        boolean z10;
        boolean[] zArr = this.f17342p;
        int length = zArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (zArr[i10]) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 || this.f17341o == 0.0f) {
            return;
        }
        RectF rectF = this.f17328b;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width() + f10;
        float height = rectF.height() + f11;
        float f12 = this.f17341o;
        boolean z11 = zArr[0];
        Paint paint = this.f17331e;
        RectF rectF2 = this.f17337k;
        if (!z11) {
            rectF2.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(rectF2, paint);
        }
        if (!zArr[1]) {
            rectF2.set(width - f12, f11, width, f12);
            canvas.drawRect(rectF2, paint);
        }
        if (!zArr[2]) {
            rectF2.set(width - f12, height - f12, width, height);
            canvas.drawRect(rectF2, paint);
        }
        if (!zArr[3]) {
            rectF2.set(f10, height - f12, f12 + f10, height);
            canvas.drawRect(rectF2, paint);
        }
    }

    public final void c() {
        float width;
        float height;
        float min;
        int i10 = b.a[this.f17346t.ordinal()];
        int i11 = this.f17333g;
        int i12 = this.f17332f;
        RectF rectF = this.a;
        Matrix matrix = this.f17336j;
        RectF rectF2 = this.f17334h;
        if (i10 != 1) {
            if (i10 != 2) {
                RectF rectF3 = this.f17329c;
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                rectF2.set(rectF3);
                                matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
                                matrix.mapRect(rectF2);
                                float f10 = this.f17344r;
                                rectF2.inset(f10 / 2.0f, f10 / 2.0f);
                                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                            } else {
                                rectF2.set(rectF);
                                float f11 = this.f17344r;
                                rectF2.inset(f11 / 2.0f, f11 / 2.0f);
                                matrix.reset();
                                matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                            }
                        } else {
                            rectF2.set(rectF3);
                            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.START);
                            matrix.mapRect(rectF2);
                            float f12 = this.f17344r;
                            rectF2.inset(f12 / 2.0f, f12 / 2.0f);
                            matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        rectF2.set(rectF3);
                        matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.END);
                        matrix.mapRect(rectF2);
                        float f13 = this.f17344r;
                        rectF2.inset(f13 / 2.0f, f13 / 2.0f);
                        matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    matrix.reset();
                    if (i12 <= rectF.width() && i11 <= rectF.height()) {
                        min = 1.0f;
                    } else {
                        min = Math.min(rectF.width() / i12, rectF.height() / i11);
                    }
                    float width2 = (int) (((rectF.width() - (i12 * min)) * 0.5f) + 0.5f);
                    float height2 = (int) (((rectF.height() - (i11 * min)) * 0.5f) + 0.5f);
                    matrix.setScale(min, min);
                    matrix.postTranslate(width2, height2);
                    rectF2.set(rectF3);
                    matrix.mapRect(rectF2);
                    float f14 = this.f17344r;
                    rectF2.inset(f14 / 2.0f, f14 / 2.0f);
                    matrix.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
                }
            } else {
                rectF2.set(rectF);
                float f15 = this.f17344r;
                rectF2.inset(f15 / 2.0f, f15 / 2.0f);
                matrix.reset();
                float f16 = 0.0f;
                if (rectF2.height() * i12 > rectF2.width() * i11) {
                    width = rectF2.height() / i11;
                    float width3 = (rectF2.width() - (i12 * width)) * 0.5f;
                    height = 0.0f;
                    f16 = width3;
                } else {
                    width = rectF2.width() / i12;
                    height = (rectF2.height() - (i11 * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                float f17 = (int) (f16 + 0.5f);
                float f18 = this.f17344r;
                matrix.postTranslate((f18 / 2.0f) + f17, (f18 / 2.0f) + ((int) (height + 0.5f)));
            }
        } else {
            rectF2.set(rectF);
            float f19 = this.f17344r;
            rectF2.inset(f19 / 2.0f, f19 / 2.0f);
            matrix.reset();
            matrix.setTranslate((int) e.b(rectF2.width(), i12, 0.5f, 0.5f), (int) e.b(rectF2.height(), i11, 0.5f, 0.5f));
        }
        this.f17328b.set(rectF2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        boolean z11;
        boolean z12 = this.f17340n;
        Paint paint = this.f17331e;
        if (z12) {
            BitmapShader bitmapShader = new BitmapShader(this.f17330d, this.f17338l, this.f17339m);
            Shader.TileMode tileMode = this.f17338l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f17339m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f17336j);
            }
            paint.setShader(bitmapShader);
            this.f17340n = false;
        }
        boolean z13 = this.f17343q;
        RectF rectF = this.f17334h;
        Paint paint2 = this.f17335i;
        RectF rectF2 = this.f17328b;
        if (z13) {
            if (this.f17344r > 0.0f) {
                canvas.drawOval(rectF2, paint);
                canvas.drawOval(rectF, paint2);
                return;
            } else {
                canvas.drawOval(rectF2, paint);
                return;
            }
        }
        boolean[] zArr = this.f17342p;
        int length = zArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (zArr[i10]) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            float f10 = this.f17341o;
            if (this.f17344r > 0.0f) {
                canvas.drawRoundRect(rectF2, f10, f10, paint);
                canvas.drawRoundRect(rectF, f10, f10, paint2);
                b(canvas);
                int length2 = zArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (zArr[i11]) {
                            z11 = false;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (!z11 && this.f17341o != 0.0f) {
                    float f11 = rectF2.left;
                    float f12 = rectF2.top;
                    float width = rectF2.width() + f11;
                    float height = rectF2.height() + f12;
                    float f13 = this.f17341o;
                    float f14 = this.f17344r / 2.0f;
                    if (!zArr[0]) {
                        canvas.drawLine(f11 - f14, f12, f11 + f13, f12, paint2);
                        canvas.drawLine(f11, f12 - f14, f11, f12 + f13, paint2);
                    }
                    if (!zArr[1]) {
                        canvas.drawLine((width - f13) - f14, f12, width, f12, paint2);
                        canvas.drawLine(width, f12 - f14, width, f12 + f13, paint2);
                    }
                    if (!zArr[2]) {
                        canvas.drawLine((width - f13) - f14, height, width + f14, height, paint2);
                        canvas.drawLine(width, height - f13, width, height, paint2);
                    }
                    if (!zArr[3]) {
                        canvas.drawLine(f11 - f14, height, f11 + f13, height, paint2);
                        canvas.drawLine(f11, height - f13, f11, height, paint2);
                        return;
                    }
                    return;
                }
                return;
            }
            canvas.drawRoundRect(rectF2, f10, f10, paint);
            b(canvas);
            return;
        }
        canvas.drawRect(rectF2, paint);
        if (this.f17344r > 0.0f) {
            canvas.drawRect(rectF, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17331e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f17331e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f17333g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f17332f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f17345s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f17345s.getColorForState(iArr, 0);
        Paint paint = this.f17335i;
        if (paint.getColor() != colorForState) {
            paint.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17331e.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17331e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f17331e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f17331e.setFilterBitmap(z10);
        invalidateSelf();
    }
}
