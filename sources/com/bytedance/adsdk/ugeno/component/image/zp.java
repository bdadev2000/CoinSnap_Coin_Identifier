package com.bytedance.adsdk.ugeno.component.image;

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
import java.util.HashSet;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp extends Drawable {
    private final RectF Bj;
    private final Paint COT;
    private final int HWF;
    private final RectF KS;
    private final boolean[] KVG;
    private final int QR;
    private final Paint YW;
    private ImageView.ScaleType cz;
    private float dQp;
    private final Matrix dT;
    private final Bitmap jU;
    private final RectF ku;
    private ColorStateList pvr;
    private boolean rV;
    private Shader.TileMode tG;
    private Shader.TileMode vDp;
    private float vwr;
    private boolean woN;
    private final RectF zp = new RectF();
    private final RectF lMd = new RectF();

    /* renamed from: com.bytedance.adsdk.ugeno.component.image.zp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            zp = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zp[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zp[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zp[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zp[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public zp(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.KS = rectF;
        this.ku = new RectF();
        this.dT = new Matrix();
        this.Bj = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.vDp = tileMode;
        this.tG = tileMode;
        this.rV = true;
        this.dQp = 0.0f;
        this.KVG = new boolean[]{true, true, true, true};
        this.woN = false;
        this.vwr = 0.0f;
        this.pvr = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.cz = ImageView.ScaleType.FIT_CENTER;
        this.jU = bitmap;
        int width = bitmap.getWidth();
        this.HWF = width;
        int height = bitmap.getHeight();
        this.QR = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.COT = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.YW = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.pvr.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.vwr);
    }

    public static Bitmap lMd(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static zp zp(Bitmap bitmap) {
        if (bitmap != null) {
            return new zp(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.rV) {
            BitmapShader bitmapShader = new BitmapShader(this.jU, this.vDp, this.tG);
            Shader.TileMode tileMode = this.vDp;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.tG == tileMode2) {
                bitmapShader.setLocalMatrix(this.dT);
            }
            this.COT.setShader(bitmapShader);
            this.rV = false;
        }
        if (this.woN) {
            if (this.vwr > 0.0f) {
                canvas.drawOval(this.lMd, this.COT);
                canvas.drawOval(this.ku, this.YW);
                return;
            } else {
                canvas.drawOval(this.lMd, this.COT);
                return;
            }
        }
        if (zp(this.KVG)) {
            float f9 = this.dQp;
            if (this.vwr > 0.0f) {
                canvas.drawRoundRect(this.lMd, f9, f9, this.COT);
                canvas.drawRoundRect(this.ku, f9, f9, this.YW);
                zp(canvas);
                lMd(canvas);
                return;
            }
            canvas.drawRoundRect(this.lMd, f9, f9, this.COT);
            zp(canvas);
            return;
        }
        canvas.drawRect(this.lMd, this.COT);
        if (this.vwr > 0.0f) {
            canvas.drawRect(this.ku, this.YW);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.COT.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.COT.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.QR;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.HWF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.pvr.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.zp.set(rect);
        zp();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.pvr.getColorForState(iArr, 0);
        if (this.YW.getColor() != colorForState) {
            this.YW.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.COT.setAlpha(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.COT.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z8) {
        this.COT.setDither(z8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z8) {
        this.COT.setFilterBitmap(z8);
        invalidateSelf();
    }

    public static Drawable zp(Drawable drawable) {
        if (drawable == null || (drawable instanceof zp)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            Drawable.ConstantState constantState = drawable.mutate().getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i9 = 0; i9 < numberOfLayers; i9++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i9), zp(layerDrawable.getDrawable(i9)));
            }
            return layerDrawable;
        }
        Bitmap lMd = lMd(drawable);
        return lMd != null ? new zp(lMd) : drawable;
    }

    private void lMd(Canvas canvas) {
        float f9;
        if (lMd(this.KVG) || this.dQp == 0.0f) {
            return;
        }
        RectF rectF = this.lMd;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width() + f10;
        float height = this.lMd.height() + f11;
        float f12 = this.dQp;
        float f13 = this.vwr / 2.0f;
        if (!this.KVG[0]) {
            canvas.drawLine(f10 - f13, f11, f10 + f12, f11, this.YW);
            canvas.drawLine(f10, f11 - f13, f10, f11 + f12, this.YW);
        }
        if (!this.KVG[1]) {
            canvas.drawLine((width - f12) - f13, f11, width, f11, this.YW);
            canvas.drawLine(width, f11 - f13, width, f11 + f12, this.YW);
        }
        if (this.KVG[2]) {
            f9 = f12;
        } else {
            f9 = f12;
            canvas.drawLine((width - f12) - f13, height, width + f13, height, this.YW);
            canvas.drawLine(width, height - f9, width, height, this.YW);
        }
        if (this.KVG[3]) {
            return;
        }
        canvas.drawLine(f10 - f13, height, f10 + f9, height, this.YW);
        canvas.drawLine(f10, height - f9, f10, height, this.YW);
    }

    private void zp() {
        float width;
        float height;
        int i9 = AnonymousClass1.zp[this.cz.ordinal()];
        if (i9 == 1) {
            this.ku.set(this.zp);
            RectF rectF = this.ku;
            float f9 = this.vwr;
            rectF.inset(f9 / 2.0f, f9 / 2.0f);
            this.dT.reset();
            this.dT.setTranslate((int) AbstractC2914a.a(this.ku.width(), this.HWF, 0.5f, 0.5f), (int) AbstractC2914a.a(this.ku.height(), this.QR, 0.5f, 0.5f));
        } else if (i9 == 2) {
            this.ku.set(this.zp);
            RectF rectF2 = this.ku;
            float f10 = this.vwr;
            rectF2.inset(f10 / 2.0f, f10 / 2.0f);
            this.dT.reset();
            float f11 = 0.0f;
            if (this.ku.height() * this.HWF > this.ku.width() * this.QR) {
                width = this.ku.height() / this.QR;
                height = 0.0f;
                f11 = (this.ku.width() - (this.HWF * width)) * 0.5f;
            } else {
                width = this.ku.width() / this.HWF;
                height = (this.ku.height() - (this.QR * width)) * 0.5f;
            }
            this.dT.setScale(width, width);
            Matrix matrix = this.dT;
            float f12 = this.vwr;
            matrix.postTranslate((f12 / 2.0f) + ((int) (f11 + 0.5f)), (f12 / 2.0f) + ((int) (height + 0.5f)));
        } else if (i9 == 3) {
            this.dT.reset();
            float min = (((float) this.HWF) > this.zp.width() || ((float) this.QR) > this.zp.height()) ? Math.min(this.zp.width() / this.HWF, this.zp.height() / this.QR) : 1.0f;
            float width2 = (int) (((this.zp.width() - (this.HWF * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.zp.height() - (this.QR * min)) * 0.5f) + 0.5f);
            this.dT.setScale(min, min);
            this.dT.postTranslate(width2, height2);
            this.ku.set(this.KS);
            this.dT.mapRect(this.ku);
            RectF rectF3 = this.ku;
            float f13 = this.vwr;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.dT.setRectToRect(this.KS, this.ku, Matrix.ScaleToFit.FILL);
        } else if (i9 == 5) {
            this.ku.set(this.KS);
            this.dT.setRectToRect(this.KS, this.zp, Matrix.ScaleToFit.END);
            this.dT.mapRect(this.ku);
            RectF rectF4 = this.ku;
            float f14 = this.vwr;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.dT.setRectToRect(this.KS, this.ku, Matrix.ScaleToFit.FILL);
        } else if (i9 == 6) {
            this.ku.set(this.KS);
            this.dT.setRectToRect(this.KS, this.zp, Matrix.ScaleToFit.START);
            this.dT.mapRect(this.ku);
            RectF rectF5 = this.ku;
            float f15 = this.vwr;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.dT.setRectToRect(this.KS, this.ku, Matrix.ScaleToFit.FILL);
        } else if (i9 != 7) {
            this.ku.set(this.KS);
            this.dT.setRectToRect(this.KS, this.zp, Matrix.ScaleToFit.CENTER);
            this.dT.mapRect(this.ku);
            RectF rectF6 = this.ku;
            float f16 = this.vwr;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.dT.setRectToRect(this.KS, this.ku, Matrix.ScaleToFit.FILL);
        } else {
            this.ku.set(this.zp);
            RectF rectF7 = this.ku;
            float f17 = this.vwr;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.dT.reset();
            this.dT.setRectToRect(this.KS, this.ku, Matrix.ScaleToFit.FILL);
        }
        this.lMd.set(this.ku);
        this.rV = true;
    }

    public zp lMd(Shader.TileMode tileMode) {
        if (this.tG != tileMode) {
            this.tG = tileMode;
            this.rV = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean lMd(boolean[] zArr) {
        for (boolean z8 : zArr) {
            if (z8) {
                return false;
            }
        }
        return true;
    }

    private void zp(Canvas canvas) {
        if (lMd(this.KVG) || this.dQp == 0.0f) {
            return;
        }
        RectF rectF = this.lMd;
        float f9 = rectF.left;
        float f10 = rectF.top;
        float width = rectF.width() + f9;
        float height = this.lMd.height() + f10;
        float f11 = this.dQp;
        if (!this.KVG[0]) {
            this.Bj.set(f9, f10, f9 + f11, f10 + f11);
            canvas.drawRect(this.Bj, this.COT);
        }
        if (!this.KVG[1]) {
            this.Bj.set(width - f11, f10, width, f11);
            canvas.drawRect(this.Bj, this.COT);
        }
        if (!this.KVG[2]) {
            this.Bj.set(width - f11, height - f11, width, height);
            canvas.drawRect(this.Bj, this.COT);
        }
        if (this.KVG[3]) {
            return;
        }
        this.Bj.set(f9, height - f11, f11 + f9, height);
        canvas.drawRect(this.Bj, this.COT);
    }

    public zp zp(float f9, float f10, float f11, float f12) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f9));
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.dQp = floatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
                }
            } else {
                this.dQp = 0.0f;
            }
            boolean[] zArr = this.KVG;
            zArr[0] = f9 > 0.0f;
            zArr[1] = f10 > 0.0f;
            zArr[2] = f11 > 0.0f;
            zArr[3] = f12 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public zp zp(float f9) {
        this.vwr = f9;
        this.YW.setStrokeWidth(f9);
        return this;
    }

    public zp zp(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.pvr = colorStateList;
        this.YW.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public zp zp(boolean z8) {
        this.woN = z8;
        return this;
    }

    public zp zp(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.cz != scaleType) {
            this.cz = scaleType;
            zp();
        }
        return this;
    }

    public zp zp(Shader.TileMode tileMode) {
        if (this.vDp != tileMode) {
            this.vDp = tileMode;
            this.rV = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean zp(boolean[] zArr) {
        for (boolean z8 : zArr) {
            if (z8) {
                return true;
            }
        }
        return false;
    }
}
