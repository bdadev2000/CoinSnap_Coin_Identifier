package com.bytedance.adsdk.ugeno.component.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class RoundImageView extends ImageView implements IAnimation {
    static final /* synthetic */ boolean lMd = true;
    private Drawable Bj;
    private final float[] COT;
    private Drawable HWF;
    private float KS;
    private int KVG;
    private ColorStateList QR;
    private ColorFilter YW;
    private com.bytedance.adsdk.ugeno.lMd cz;
    private int dQp;
    private boolean dT;
    private float ku;
    private Shader.TileMode pvr;
    private boolean rV;
    private boolean tG;
    private boolean vDp;
    private Shader.TileMode vwr;
    private ImageView.ScaleType woN;
    public static final Shader.TileMode zp = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] jU = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.bytedance.adsdk.ugeno.component.image.RoundImageView$1, reason: invalid class name */
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
                zp[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zp[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zp[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundImageView(Context context) {
        super(context);
        this.COT = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.QR = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.ku = 0.0f;
        this.YW = null;
        this.dT = false;
        this.vDp = false;
        this.tG = false;
        this.rV = false;
        Shader.TileMode tileMode = zp;
        this.vwr = tileMode;
        this.pvr = tileMode;
    }

    private void KS() {
        zp(this.Bj, this.woN);
    }

    private void jU() {
        Drawable drawable = this.Bj;
        if (drawable != null && this.dT) {
            Drawable mutate = drawable.mutate();
            this.Bj = mutate;
            if (this.vDp) {
                mutate.setColorFilter(this.YW);
            }
        }
    }

    private Drawable lMd() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i9 = this.KVG;
        if (i9 != 0) {
            try {
                drawable = resources.getDrawable(i9);
            } catch (Exception e4) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.KVG, e4);
                this.KVG = 0;
            }
        }
        return zp.zp(drawable);
    }

    private Drawable zp() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i9 = this.dQp;
        if (i9 != 0) {
            try {
                drawable = resources.getDrawable(i9);
            } catch (Exception e4) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.dQp, e4);
                this.dQp = 0;
            }
        }
        return zp.zp(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.QR.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.QR;
    }

    public float getBorderWidth() {
        return this.ku;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f9 = 0.0f;
        for (float f10 : this.COT) {
            f9 = Math.max(f10, f9);
        }
        return f9;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.KS;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.woN;
    }

    public Shader.TileMode getTileModeX() {
        return this.vwr;
    }

    public Shader.TileMode getTileModeY() {
        return this.pvr;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.zp(canvas, this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.zp(i9, i10, i11, i12);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            int[] zp2 = lmd.zp(i9, i10);
            super.onMeasure(zp2[0], zp2[1]);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        com.bytedance.adsdk.ugeno.lMd lmd = this.cz;
        if (lmd != null) {
            lmd.lMd(i9, i10, i11, i11);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        ColorDrawable colorDrawable = new ColorDrawable(i9);
        this.HWF = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.HWF = drawable;
        zp(true);
        super.setBackgroundDrawable(this.HWF);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        if (this.KVG != i9) {
            this.KVG = i9;
            Drawable lMd2 = lMd();
            this.HWF = lMd2;
            setBackgroundDrawable(lMd2);
        }
    }

    public void setBorderColor(int i9) {
        setBorderColor(ColorStateList.valueOf(i9));
    }

    public void setBorderWidth(int i9) {
        setBorderWidth(getResources().getDimension(i9));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.YW != colorFilter) {
            this.YW = colorFilter;
            this.vDp = true;
            this.dT = true;
            jU();
            invalidate();
        }
    }

    public void setCornerRadius(float f9) {
        zp(f9, f9, f9, f9);
    }

    public void setCornerRadiusDimen(int i9) {
        float dimension = getResources().getDimension(i9);
        zp(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.dQp = 0;
        this.Bj = zp.zp(bitmap);
        KS();
        super.setImageDrawable(this.Bj);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.dQp = 0;
        this.Bj = zp.zp(drawable);
        KS();
        super.setImageDrawable(this.Bj);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        if (this.dQp != i9) {
            this.dQp = i9;
            this.Bj = zp();
            KS();
            super.setImageDrawable(this.Bj);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z8) {
        this.tG = z8;
        KS();
        zp(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f9) {
        this.KS = f9;
        postInvalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!lMd && scaleType == null) {
            throw new AssertionError();
        }
        if (this.woN != scaleType) {
            this.woN = scaleType;
            switch (AnonymousClass1.zp[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            KS();
            zp(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.vwr == tileMode) {
            return;
        }
        this.vwr = tileMode;
        KS();
        zp(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.pvr == tileMode) {
            return;
        }
        this.pvr = tileMode;
        KS();
        zp(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.QR.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.QR = colorStateList;
        KS();
        zp(false);
        if (this.ku > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f9) {
        if (this.ku == f9) {
            return;
        }
        this.ku = f9;
        KS();
        zp(false);
        invalidate();
    }

    private void zp(boolean z8) {
        if (this.rV) {
            if (z8) {
                this.HWF = zp.zp(this.HWF);
            }
            zp(this.HWF, ImageView.ScaleType.FIT_XY);
        }
    }

    private void zp(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof zp) {
            zp zpVar = (zp) drawable;
            zpVar.zp(scaleType).zp(this.ku).zp(this.QR).zp(this.tG).zp(this.vwr).lMd(this.pvr);
            float[] fArr = this.COT;
            if (fArr != null) {
                zpVar.zp(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            jU();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i9 = 0; i9 < numberOfLayers; i9++) {
                zp(layerDrawable.getDrawable(i9), scaleType);
            }
        }
    }

    public void zp(float f9, float f10, float f11, float f12) {
        float[] fArr = this.COT;
        if (fArr[0] == f9 && fArr[1] == f10 && fArr[2] == f12 && fArr[3] == f11) {
            return;
        }
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[3] = f11;
        fArr[2] = f12;
        KS();
        zp(false);
        invalidate();
    }

    public void zp(com.bytedance.adsdk.ugeno.lMd lmd) {
        this.cz = lmd;
    }
}
