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

/* loaded from: classes3.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f19483a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f19484c;

    /* renamed from: d, reason: collision with root package name */
    private int f19485d;

    /* renamed from: e, reason: collision with root package name */
    private Matrix f19486e;

    /* renamed from: f, reason: collision with root package name */
    private BitmapShader f19487f;

    /* renamed from: g, reason: collision with root package name */
    private int f19488g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f19489h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f19486e = new Matrix();
        Paint paint = new Paint();
        this.f19484c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19483a = 1;
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
        } catch (Throwable th) {
            ad.b("View", th.getMessage());
            return null;
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a6;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (a6 = a(drawable)) != null && !a6.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f19487f = new BitmapShader(a6, tileMode, tileMode);
                    int i9 = this.f19483a;
                    float f9 = 1.0f;
                    if (i9 == 0) {
                        f9 = (this.f19488g * 1.0f) / Math.min(a6.getWidth(), a6.getHeight());
                    } else if (i9 == 1) {
                        f9 = Math.max((getWidth() * 1.0f) / a6.getWidth(), (getHeight() * 1.0f) / a6.getHeight());
                    }
                    this.f19486e.setScale(f9, f9);
                    this.f19487f.setLocalMatrix(this.f19486e);
                    this.f19484c.setShader(this.f19487f);
                }
            } catch (Throwable th) {
                ad.b("RoundImageView", th.getMessage());
            }
            if (this.f19483a == 1) {
                RectF rectF = this.f19489h;
                int i10 = this.b;
                canvas.drawRoundRect(rectF, i10, i10, this.f19484c);
            } else {
                int i11 = this.f19485d;
                canvas.drawCircle(i11, i11, i11, this.f19484c);
            }
        } catch (Throwable th2) {
            ad.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f19483a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f19488g = min;
            this.f19485d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f19483a = bundle.getInt("state_type");
            this.b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f19483a);
        bundle.putInt("state_border_radius", this.b);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.f19483a == 1) {
            this.f19489h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i9) {
        int a6 = ai.a(getContext(), i9);
        if (this.b != a6) {
            this.b = a6;
            invalidate();
        }
    }

    public void setType(int i9) {
        if (this.f19483a != i9) {
            this.f19483a = i9;
            if (i9 != 1 && i9 != 0) {
                this.f19483a = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19486e = new Matrix();
        Paint paint = new Paint();
        this.f19484c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19483a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f19486e = new Matrix();
        Paint paint = new Paint();
        this.f19484c = paint;
        paint.setAntiAlias(true);
        this.b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f19483a = 1;
    }
}
