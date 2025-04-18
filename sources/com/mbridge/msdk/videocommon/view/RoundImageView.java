package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.MBImageView;

/* loaded from: classes4.dex */
public class RoundImageView extends MBImageView {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f16449b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f16450c;

    /* renamed from: d, reason: collision with root package name */
    private int f16451d;

    /* renamed from: e, reason: collision with root package name */
    private Matrix f16452e;

    /* renamed from: f, reason: collision with root package name */
    private BitmapShader f16453f;

    /* renamed from: g, reason: collision with root package name */
    private int f16454g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f16455h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16452e = new Matrix();
        Paint paint = new Paint();
        this.f16450c = paint;
        paint.setAntiAlias(true);
        this.f16449b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th2) {
            ad.b("View", th2.getMessage());
            return null;
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (a = a(drawable)) != null && !a.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f16453f = new BitmapShader(a, tileMode, tileMode);
                    int i10 = this.a;
                    float f10 = 1.0f;
                    if (i10 == 0) {
                        f10 = (this.f16454g * 1.0f) / Math.min(a.getWidth(), a.getHeight());
                    } else if (i10 == 1) {
                        f10 = Math.max((getWidth() * 1.0f) / a.getWidth(), (getHeight() * 1.0f) / a.getHeight());
                    }
                    this.f16452e.setScale(f10, f10);
                    this.f16453f.setLocalMatrix(this.f16452e);
                    this.f16450c.setShader(this.f16453f);
                }
            } catch (Throwable th2) {
                ad.b("RoundImageView", th2.getMessage());
            }
            if (this.a == 1) {
                RectF rectF = this.f16455h;
                int i11 = this.f16449b;
                canvas.drawRoundRect(rectF, i11, i11, this.f16450c);
            } else {
                int i12 = this.f16451d;
                canvas.drawCircle(i12, i12, i12, this.f16450c);
            }
        } catch (Throwable th3) {
            ad.b("RoundImageView", th3.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f16454g = min;
            this.f16451d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.a = bundle.getInt("state_type");
            this.f16449b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.a);
        bundle.putInt("state_border_radius", this.f16449b);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.a == 1) {
            this.f16455h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int a = ai.a(getContext(), i10);
        if (this.f16449b != a) {
            this.f16449b = a;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.a != i10) {
            this.a = i10;
            if (i10 != 1 && i10 != 0) {
                this.a = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16452e = new Matrix();
        Paint paint = new Paint();
        this.f16450c = paint;
        paint.setAntiAlias(true);
        this.f16449b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f16452e = new Matrix();
        Paint paint = new Paint();
        this.f16450c = paint;
        paint.setAntiAlias(true);
        this.f16449b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }
}
