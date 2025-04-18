package com.bytedance.adsdk.ugeno.NjR.AlY;

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
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;
import java.util.HashSet;
import vd.e;

/* loaded from: classes.dex */
public class Sg extends Drawable {
    private final Bitmap AlY;
    private final int DSW;
    private float EH;
    private Shader.TileMode GA;
    private final Paint NjR;
    private float Wwa;
    private Shader.TileMode YoT;
    private ImageView.ScaleType aIu;
    private final RectF eT;
    private boolean lG;

    /* renamed from: nc, reason: collision with root package name */
    private final Matrix f10235nc;
    private boolean pDU;
    private ColorStateList qO;
    private final RectF qsH;
    private final boolean[] rkt;
    private final RectF tN;

    /* renamed from: vc, reason: collision with root package name */
    private final int f10236vc;
    private final Paint wN;
    private final RectF YFl = new RectF();
    private final RectF Sg = new RectF();

    /* renamed from: com.bytedance.adsdk.ugeno.NjR.AlY.Sg$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            YFl = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Sg(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.tN = rectF;
        this.qsH = new RectF();
        this.f10235nc = new Matrix();
        this.eT = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.YoT = tileMode;
        this.GA = tileMode;
        this.pDU = true;
        this.EH = 0.0f;
        this.rkt = new boolean[]{true, true, true, true};
        this.lG = false;
        this.Wwa = 0.0f;
        this.qO = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.aIu = ImageView.ScaleType.FIT_CENTER;
        this.AlY = bitmap;
        int width = bitmap.getWidth();
        this.f10236vc = width;
        int height = bitmap.getHeight();
        this.DSW = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.wN = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.NjR = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.qO.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        paint2.setStrokeWidth(this.Wwa);
    }

    public static Bitmap Sg(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
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

    public static Sg YFl(Bitmap bitmap) {
        if (bitmap != null) {
            return new Sg(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.pDU) {
            BitmapShader bitmapShader = new BitmapShader(this.AlY, this.YoT, this.GA);
            Shader.TileMode tileMode = this.YoT;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.GA == tileMode2) {
                bitmapShader.setLocalMatrix(this.f10235nc);
            }
            this.wN.setShader(bitmapShader);
            this.pDU = false;
        }
        if (this.lG) {
            if (this.Wwa > 0.0f) {
                canvas.drawOval(this.Sg, this.wN);
                canvas.drawOval(this.qsH, this.NjR);
                return;
            } else {
                canvas.drawOval(this.Sg, this.wN);
                return;
            }
        }
        if (YFl(this.rkt)) {
            float f10 = this.EH;
            if (this.Wwa > 0.0f) {
                canvas.drawRoundRect(this.Sg, f10, f10, this.wN);
                canvas.drawRoundRect(this.qsH, f10, f10, this.NjR);
                YFl(canvas);
                Sg(canvas);
                return;
            }
            canvas.drawRoundRect(this.Sg, f10, f10, this.wN);
            YFl(canvas);
            return;
        }
        canvas.drawRect(this.Sg, this.wN);
        if (this.Wwa > 0.0f) {
            canvas.drawRect(this.qsH, this.NjR);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.wN.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.wN.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.DSW;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10236vc;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.qO.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.YFl.set(rect);
        YFl();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.qO.getColorForState(iArr, 0);
        if (this.NjR.getColor() != colorForState) {
            this.NjR.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.wN.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.wN.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.wN.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.wN.setFilterBitmap(z10);
        invalidateSelf();
    }

    public static Drawable YFl(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof Sg) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && b1.y(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), YFl(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap Sg = Sg(drawable);
        return Sg != null ? new Sg(Sg) : drawable;
    }

    private void Sg(Canvas canvas) {
        float f10;
        if (Sg(this.rkt) || this.EH == 0.0f) {
            return;
        }
        RectF rectF = this.Sg;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float width = rectF.width() + f11;
        float height = this.Sg.height() + f12;
        float f13 = this.EH;
        float f14 = this.Wwa / 2.0f;
        if (!this.rkt[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.NjR);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.NjR);
        }
        if (!this.rkt[1]) {
            canvas.drawLine((width - f13) - f14, f12, width, f12, this.NjR);
            canvas.drawLine(width, f12 - f14, width, f12 + f13, this.NjR);
        }
        if (this.rkt[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((width - f13) - f14, height, width + f14, height, this.NjR);
            canvas.drawLine(width, height - f10, width, height, this.NjR);
        }
        if (this.rkt[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, height, f11 + f10, height, this.NjR);
        canvas.drawLine(f11, height - f10, f11, height, this.NjR);
    }

    private void YFl() {
        float width;
        float height;
        int i10 = AnonymousClass1.YFl[this.aIu.ordinal()];
        if (i10 == 1) {
            this.qsH.set(this.YFl);
            RectF rectF = this.qsH;
            float f10 = this.Wwa;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.f10235nc.reset();
            this.f10235nc.setTranslate((int) e.b(this.qsH.width(), this.f10236vc, 0.5f, 0.5f), (int) e.b(this.qsH.height(), this.DSW, 0.5f, 0.5f));
        } else if (i10 == 2) {
            this.qsH.set(this.YFl);
            RectF rectF2 = this.qsH;
            float f11 = this.Wwa;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.f10235nc.reset();
            float f12 = 0.0f;
            if (this.qsH.height() * this.f10236vc > this.qsH.width() * this.DSW) {
                width = this.qsH.height() / this.DSW;
                height = 0.0f;
                f12 = (this.qsH.width() - (this.f10236vc * width)) * 0.5f;
            } else {
                width = this.qsH.width() / this.f10236vc;
                height = (this.qsH.height() - (this.DSW * width)) * 0.5f;
            }
            this.f10235nc.setScale(width, width);
            Matrix matrix = this.f10235nc;
            float f13 = this.Wwa;
            matrix.postTranslate((f13 / 2.0f) + ((int) (f12 + 0.5f)), (f13 / 2.0f) + ((int) (height + 0.5f)));
        } else if (i10 == 3) {
            this.f10235nc.reset();
            float min = (((float) this.f10236vc) > this.YFl.width() || ((float) this.DSW) > this.YFl.height()) ? Math.min(this.YFl.width() / this.f10236vc, this.YFl.height() / this.DSW) : 1.0f;
            float width2 = (int) (((this.YFl.width() - (this.f10236vc * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.YFl.height() - (this.DSW * min)) * 0.5f) + 0.5f);
            this.f10235nc.setScale(min, min);
            this.f10235nc.postTranslate(width2, height2);
            this.qsH.set(this.tN);
            this.f10235nc.mapRect(this.qsH);
            RectF rectF3 = this.qsH;
            float f14 = this.Wwa;
            rectF3.inset(f14 / 2.0f, f14 / 2.0f);
            this.f10235nc.setRectToRect(this.tN, this.qsH, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.qsH.set(this.tN);
            this.f10235nc.setRectToRect(this.tN, this.YFl, Matrix.ScaleToFit.END);
            this.f10235nc.mapRect(this.qsH);
            RectF rectF4 = this.qsH;
            float f15 = this.Wwa;
            rectF4.inset(f15 / 2.0f, f15 / 2.0f);
            this.f10235nc.setRectToRect(this.tN, this.qsH, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.qsH.set(this.tN);
            this.f10235nc.setRectToRect(this.tN, this.YFl, Matrix.ScaleToFit.START);
            this.f10235nc.mapRect(this.qsH);
            RectF rectF5 = this.qsH;
            float f16 = this.Wwa;
            rectF5.inset(f16 / 2.0f, f16 / 2.0f);
            this.f10235nc.setRectToRect(this.tN, this.qsH, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.qsH.set(this.tN);
            this.f10235nc.setRectToRect(this.tN, this.YFl, Matrix.ScaleToFit.CENTER);
            this.f10235nc.mapRect(this.qsH);
            RectF rectF6 = this.qsH;
            float f17 = this.Wwa;
            rectF6.inset(f17 / 2.0f, f17 / 2.0f);
            this.f10235nc.setRectToRect(this.tN, this.qsH, Matrix.ScaleToFit.FILL);
        } else {
            this.qsH.set(this.YFl);
            RectF rectF7 = this.qsH;
            float f18 = this.Wwa;
            rectF7.inset(f18 / 2.0f, f18 / 2.0f);
            this.f10235nc.reset();
            this.f10235nc.setRectToRect(this.tN, this.qsH, Matrix.ScaleToFit.FILL);
        }
        this.Sg.set(this.qsH);
        this.pDU = true;
    }

    public Sg Sg(Shader.TileMode tileMode) {
        if (this.GA != tileMode) {
            this.GA = tileMode;
            this.pDU = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean Sg(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private void YFl(Canvas canvas) {
        if (Sg(this.rkt) || this.EH == 0.0f) {
            return;
        }
        RectF rectF = this.Sg;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float width = rectF.width() + f10;
        float height = this.Sg.height() + f11;
        float f12 = this.EH;
        if (!this.rkt[0]) {
            this.eT.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.eT, this.wN);
        }
        if (!this.rkt[1]) {
            this.eT.set(width - f12, f11, width, f12);
            canvas.drawRect(this.eT, this.wN);
        }
        if (!this.rkt[2]) {
            this.eT.set(width - f12, height - f12, width, height);
            canvas.drawRect(this.eT, this.wN);
        }
        if (this.rkt[3]) {
            return;
        }
        this.eT.set(f10, height - f12, f12 + f10, height);
        canvas.drawRect(this.eT, this.wN);
    }

    public Sg YFl(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.EH = floatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
                }
            } else {
                this.EH = 0.0f;
            }
            boolean[] zArr = this.rkt;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public Sg YFl(float f10) {
        this.Wwa = f10;
        this.NjR.setStrokeWidth(f10);
        return this;
    }

    public Sg YFl(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.qO = colorStateList;
        this.NjR.setColor(colorStateList.getColorForState(getState(), ViewCompat.MEASURED_STATE_MASK));
        return this;
    }

    public Sg YFl(boolean z10) {
        this.lG = z10;
        return this;
    }

    public Sg YFl(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.aIu != scaleType) {
            this.aIu = scaleType;
            YFl();
        }
        return this;
    }

    public Sg YFl(Shader.TileMode tileMode) {
        if (this.YoT != tileMode) {
            this.YoT = tileMode;
            this.pDU = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean YFl(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
