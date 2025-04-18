package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import ee.a;
import ee.c;
import ee.d;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class RoundedImageView extends ImageView {

    /* renamed from: r, reason: collision with root package name */
    public static final Shader.TileMode f12316r = Shader.TileMode.CLAMP;

    /* renamed from: s, reason: collision with root package name */
    public static final ImageView.ScaleType[] f12317s = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: b, reason: collision with root package name */
    public final float[] f12318b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f12319c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f12320d;

    /* renamed from: f, reason: collision with root package name */
    public float f12321f;

    /* renamed from: g, reason: collision with root package name */
    public ColorFilter f12322g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12323h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f12324i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12325j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12326k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12327l;

    /* renamed from: m, reason: collision with root package name */
    public int f12328m;

    /* renamed from: n, reason: collision with root package name */
    public int f12329n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f12330o;

    /* renamed from: p, reason: collision with root package name */
    public Shader.TileMode f12331p;

    /* renamed from: q, reason: collision with root package name */
    public Shader.TileMode f12332q;

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f12318b = fArr;
        this.f12320d = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        this.f12321f = 0.0f;
        this.f12322g = null;
        this.f12323h = false;
        this.f12325j = false;
        this.f12326k = false;
        this.f12327l = false;
        Shader.TileMode tileMode = f12316r;
        this.f12331p = tileMode;
        this.f12332q = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        int i10 = obtainStyledAttributes.getInt(0, -1);
        if (i10 >= 0) {
            setScaleType(f12317s[i10]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        fArr[0] = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        fArr[1] = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        fArr[2] = obtainStyledAttributes.getDimensionPixelSize(5, -1);
        fArr[3] = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            float[] fArr2 = this.f12318b;
            if (fArr2[i11] < 0.0f) {
                fArr2[i11] = 0.0f;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length = this.f12318b.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f12318b[i12] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.f12321f = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f12321f = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        this.f12320d = colorStateList;
        if (colorStateList == null) {
            this.f12320d = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        boolean z11 = obtainStyledAttributes.getBoolean(8, false);
        this.f12327l = z11;
        this.f12326k = obtainStyledAttributes.getBoolean(9, false);
        int i13 = obtainStyledAttributes.getInt(10, -2);
        if (i13 != -2) {
            setTileModeX(a(i13));
            setTileModeY(a(i13));
        }
        int i14 = obtainStyledAttributes.getInt(11, -2);
        if (i14 != -2) {
            setTileModeX(a(i14));
        }
        int i15 = obtainStyledAttributes.getInt(12, -2);
        if (i15 != -2) {
            setTileModeY(a(i15));
        }
        e();
        d(true);
        if (z11) {
            super.setBackgroundDrawable(this.f12319c);
        }
        obtainStyledAttributes.recycle();
    }

    public static Shader.TileMode a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return Shader.TileMode.MIRROR;
            }
            return Shader.TileMode.REPEAT;
        }
        return Shader.TileMode.CLAMP;
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f12318b;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        e();
        d(false);
        invalidate();
    }

    public final void c(Drawable drawable, ImageView.ScaleType scaleType) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (drawable == null) {
            return;
        }
        boolean z13 = false;
        if (drawable instanceof c) {
            c cVar = (c) drawable;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            if (cVar.f17346t != scaleType) {
                cVar.f17346t = scaleType;
                cVar.c();
            }
            float f10 = this.f12321f;
            cVar.f17344r = f10;
            Paint paint = cVar.f17335i;
            paint.setStrokeWidth(f10);
            ColorStateList colorStateList = this.f12320d;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            cVar.f17345s = colorStateList;
            paint.setColor(colorStateList.getColorForState(cVar.getState(), ViewCompat.MEASURED_STATE_MASK));
            cVar.f17343q = this.f12326k;
            Shader.TileMode tileMode = this.f12331p;
            if (cVar.f17338l != tileMode) {
                cVar.f17338l = tileMode;
                cVar.f17340n = true;
                cVar.invalidateSelf();
            }
            Shader.TileMode tileMode2 = this.f12332q;
            if (cVar.f17339m != tileMode2) {
                cVar.f17339m = tileMode2;
                cVar.f17340n = true;
                cVar.invalidateSelf();
            }
            float[] fArr = this.f12318b;
            if (fArr != null) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                float f13 = fArr[2];
                float f14 = fArr[3];
                HashSet hashSet = new HashSet(4);
                hashSet.add(Float.valueOf(f11));
                hashSet.add(Float.valueOf(f12));
                hashSet.add(Float.valueOf(f13));
                hashSet.add(Float.valueOf(f14));
                hashSet.remove(Float.valueOf(0.0f));
                if (hashSet.size() <= 1) {
                    if (!hashSet.isEmpty()) {
                        float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                        if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                            cVar.f17341o = floatValue;
                        } else {
                            throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                        }
                    } else {
                        cVar.f17341o = 0.0f;
                    }
                    if (f11 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean[] zArr = cVar.f17342p;
                    zArr[0] = z10;
                    if (f12 > 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr[1] = z11;
                    if (f13 > 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zArr[2] = z12;
                    if (f14 > 0.0f) {
                        z13 = true;
                    }
                    zArr[3] = z13;
                } else {
                    throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
                }
            }
            Drawable drawable2 = this.f12324i;
            if (drawable2 != null && this.f12323h) {
                Drawable mutate = drawable2.mutate();
                this.f12324i = mutate;
                if (this.f12325j) {
                    mutate.setColorFilter(this.f12322g);
                    return;
                }
                return;
            }
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                c(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f12327l) {
            if (z10) {
                this.f12319c = c.a(this.f12319c);
            }
            c(this.f12319c, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void e() {
        c(this.f12324i, this.f12330o);
    }

    public int getBorderColor() {
        return this.f12320d.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f12320d;
    }

    public float getBorderWidth() {
        return this.f12321f;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f10 = 0.0f;
        for (float f11 : this.f12318b) {
            f10 = Math.max(f11, f10);
        }
        return f10;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f12330o;
    }

    public Shader.TileMode getTileModeX() {
        return this.f12331p;
    }

    public Shader.TileMode getTileModeY() {
        return this.f12332q;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f12319c = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f12319c = drawable;
        d(true);
        super.setBackgroundDrawable(this.f12319c);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.f12329n != i10) {
            this.f12329n = i10;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i11 = this.f12329n;
                if (i11 != 0) {
                    try {
                        drawable = resources.getDrawable(i11);
                    } catch (Exception e2) {
                        Log.w("RoundedImageView", "Unable to find resource: " + this.f12329n, e2);
                        this.f12329n = 0;
                    }
                }
                drawable = c.a(drawable);
            }
            this.f12319c = drawable;
            setBackgroundDrawable(drawable);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f12322g != colorFilter) {
            this.f12322g = colorFilter;
            this.f12325j = true;
            this.f12323h = true;
            Drawable drawable = this.f12324i;
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                this.f12324i = mutate;
                if (this.f12325j) {
                    mutate.setColorFilter(this.f12322g);
                }
            }
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        b(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        b(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c cVar;
        this.f12328m = 0;
        if (bitmap != null) {
            cVar = new c(bitmap);
        } else {
            int i10 = c.u;
            cVar = null;
        }
        this.f12324i = cVar;
        e();
        super.setImageDrawable(this.f12324i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f12328m = 0;
        this.f12324i = c.a(drawable);
        e();
        super.setImageDrawable(this.f12324i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.f12328m != i10) {
            this.f12328m = i10;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i11 = this.f12328m;
                if (i11 != 0) {
                    try {
                        drawable = resources.getDrawable(i11);
                    } catch (Exception e2) {
                        Log.w("RoundedImageView", "Unable to find resource: " + this.f12328m, e2);
                        this.f12328m = 0;
                    }
                }
                drawable = c.a(drawable);
            }
            this.f12324i = drawable;
            e();
            super.setImageDrawable(this.f12324i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.f12326k = z10;
        e();
        d(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f12330o != scaleType) {
            this.f12330o = scaleType;
            switch (d.a[scaleType.ordinal()]) {
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
            e();
            d(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f12331p == tileMode) {
            return;
        }
        this.f12331p = tileMode;
        e();
        d(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f12332q == tileMode) {
            return;
        }
        this.f12332q = tileMode;
        e();
        d(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f12320d.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK);
        }
        this.f12320d = colorStateList;
        e();
        d(false);
        if (this.f12321f > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.f12321f == f10) {
            return;
        }
        this.f12321f = f10;
        e();
        d(false);
        invalidate();
    }
}
