package com.bytedance.adsdk.ugeno.NjR.AlY;

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
import com.bytedance.adsdk.ugeno.YFl.vc;
import com.bytedance.adsdk.ugeno.YFl.wN;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class YFl extends ImageView implements wN, IAnimation {
    static final /* synthetic */ boolean Sg = true;
    private ColorStateList DSW;
    private int EH;
    private boolean GA;
    private ColorFilter NjR;
    private Shader.TileMode Wwa;
    private boolean YoT;
    private com.bytedance.adsdk.ugeno.tN aIu;
    private Drawable eT;
    private ImageView.ScaleType lG;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10237nc;
    private boolean pDU;
    private Shader.TileMode qO;
    private float qsH;
    private int rkt;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private Drawable f10238vc;
    private final float[] wN;
    private vc wXo;
    public static final Shader.TileMode YFl = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] AlY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.bytedance.adsdk.ugeno.NjR.AlY.YFl$1, reason: invalid class name */
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
                YFl[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                YFl[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public YFl(Context context) {
        super(context);
        this.wN = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.DSW = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.qsH = 0.0f;
        this.NjR = null;
        this.f10237nc = false;
        this.YoT = false;
        this.GA = false;
        this.pDU = false;
        Shader.TileMode tileMode = YFl;
        this.Wwa = tileMode;
        this.qO = tileMode;
        this.wXo = new vc(this);
    }

    private void AlY() {
        Drawable drawable = this.eT;
        if (drawable != null && this.f10237nc) {
            Drawable mutate = drawable.mutate();
            this.eT = mutate;
            if (this.YoT) {
                mutate.setColorFilter(this.NjR);
            }
        }
    }

    private Drawable Sg() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.rkt;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.rkt, e2);
                this.rkt = 0;
            }
        }
        return Sg.YFl(drawable);
    }

    private Drawable YFl() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.EH;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e2) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.EH, e2);
                this.EH = 0;
            }
        }
        return Sg.YFl(drawable);
    }

    private void tN() {
        YFl(this.eT, this.lG);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.DSW.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.DSW;
    }

    public float getBorderRadius() {
        return this.wXo.YFl();
    }

    public float getBorderWidth() {
        return this.qsH;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f10 = 0.0f;
        for (float f11 : this.wN) {
            f10 = Math.max(f11, f10);
        }
        return f10;
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.tN;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.lG;
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN
    public float getShine() {
        return this.wXo.getShine();
    }

    public Shader.TileMode getTileModeX() {
        return this.Wwa;
    }

    public Shader.TileMode getTileModeY() {
        return this.qO;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            tNVar.YFl(canvas, this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            tNVar.YFl(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            int[] YFl2 = tNVar.YFl(i10, i11);
            super.onMeasure(YFl2[0], YFl2[1]);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.tN tNVar = this.aIu;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f10238vc = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f10238vc = drawable;
        YFl(true);
        super.setBackgroundDrawable(this.f10238vc);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.rkt != i10) {
            this.rkt = i10;
            Drawable Sg2 = Sg();
            this.f10238vc = Sg2;
            setBackgroundDrawable(Sg2);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        vc vcVar = this.wXo;
        if (vcVar != null) {
            vcVar.YFl(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.NjR != colorFilter) {
            this.NjR = colorFilter;
            this.YoT = true;
            this.f10237nc = true;
            AlY();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        YFl(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        YFl(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.EH = 0;
        this.eT = Sg.YFl(bitmap);
        tN();
        super.setImageDrawable(this.eT);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.EH = 0;
        this.eT = Sg.YFl(drawable);
        tN();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.EH != i10) {
            this.EH = i10;
            this.eT = YFl();
            tN();
            super.setImageDrawable(this.eT);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.GA = z10;
        tN();
        YFl(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.tN = f10;
        vc vcVar = this.wXo;
        if (vcVar != null) {
            vcVar.Sg(f10);
        }
        postInvalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!Sg && scaleType == null) {
            throw new AssertionError();
        }
        if (this.lG != scaleType) {
            this.lG = scaleType;
            switch (AnonymousClass1.YFl[scaleType.ordinal()]) {
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
            tN();
            YFl(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        vc vcVar = this.wXo;
        if (vcVar != null) {
            vcVar.tN(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.Wwa == tileMode) {
            return;
        }
        this.Wwa = tileMode;
        tN();
        YFl(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.qO == tileMode) {
            return;
        }
        this.qO = tileMode;
        tN();
        YFl(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.DSW.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.DSW = colorStateList;
        tN();
        YFl(false);
        if (this.qsH > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.qsH == f10) {
            return;
        }
        this.qsH = f10;
        tN();
        YFl(false);
        invalidate();
    }

    private void YFl(boolean z10) {
        if (this.pDU) {
            if (z10) {
                this.f10238vc = Sg.YFl(this.f10238vc);
            }
            YFl(this.f10238vc, ImageView.ScaleType.FIT_XY);
        }
    }

    private void YFl(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof Sg) {
            Sg sg2 = (Sg) drawable;
            sg2.YFl(scaleType).YFl(this.qsH).YFl(this.DSW).YFl(this.GA).YFl(this.Wwa).Sg(this.qO);
            float[] fArr = this.wN;
            if (fArr != null) {
                sg2.YFl(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            AlY();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                YFl(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void YFl(float f10, float f11, float f12, float f13) {
        float[] fArr = this.wN;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        tN();
        YFl(false);
        invalidate();
    }

    public void YFl(com.bytedance.adsdk.ugeno.tN tNVar) {
        this.aIu = tNVar;
    }
}
