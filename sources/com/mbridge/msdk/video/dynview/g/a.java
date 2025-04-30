package com.mbridge.msdk.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes3.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f18610a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f18611c;

    /* renamed from: d, reason: collision with root package name */
    private int f18612d;

    /* renamed from: e, reason: collision with root package name */
    private int f18613e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f18614f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f18615g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18616h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f18617i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f18618j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0194a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f18619a;
        private Bitmap b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f18620c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18621d;

        /* renamed from: e, reason: collision with root package name */
        private int f18622e;

        /* renamed from: f, reason: collision with root package name */
        private int f18623f;

        /* renamed from: g, reason: collision with root package name */
        private int f18624g;

        /* renamed from: h, reason: collision with root package name */
        private float f18625h;

        /* renamed from: i, reason: collision with root package name */
        private float f18626i;

        private C0194a() {
            this.f18623f = 100;
            this.f18624g = 10;
            this.f18619a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f18620c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z8) {
            this.f18621d = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f9) {
            this.f18626i = f9;
            return this;
        }

        public final b a(int i9) {
            this.f18622e = i9;
            return this;
        }

        public final b a(float f9) {
            this.f18625h = f9;
            return this;
        }

        public final a a() {
            return new a(this);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        b a(Bitmap bitmap);

        b a(boolean z8);

        b b(float f9);

        b b(Bitmap bitmap);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.b / bitmap.getWidth(), this.f18611c / bitmap.getHeight());
            if (this.f18618j == null) {
                this.f18618j = new Matrix();
            }
            this.f18618j.reset();
            this.f18618j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f18618j);
        this.f18617i.setShader(bitmapShader);
        canvas.drawPath(path, this.f18617i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18610a == 1) {
            float f9 = this.f18611c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f18612d + f9) - this.f18613e);
            path.lineTo(this.b, (f9 - this.f18612d) - this.f18613e);
            path.lineTo(this.b, 0.0f);
            if (this.f18616h) {
                try {
                    a(canvas, path);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f18614f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f18614f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f18612d + f9 + this.f18613e);
            path2.lineTo(0.0f, this.f18611c);
            path2.lineTo(this.b, this.f18611c);
            path2.lineTo(this.b, (f9 - this.f18612d) + this.f18613e);
            if (this.f18616h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f18615g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f18615g);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f10 = this.b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f18611c);
        path3.lineTo((f10 - this.f18612d) - this.f18613e, this.f18611c);
        path3.lineTo((this.f18612d + f10) - this.f18613e, 0.0f);
        if (this.f18616h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f18614f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f18614f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f18612d + f10 + this.f18613e, 0.0f);
        path4.lineTo(this.b, 0.0f);
        path4.lineTo(this.b, this.f18611c);
        path4.lineTo((f10 - this.f18612d) + this.f18613e, this.f18611c);
        if (this.f18616h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f18615g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f18615g);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0194a c0194a) {
        super(c0194a.f18619a);
        this.f18616h = false;
        this.f18614f = c0194a.b;
        this.f18615g = c0194a.f18620c;
        this.f18616h = c0194a.f18621d;
        this.f18610a = c0194a.f18622e;
        this.f18612d = c0194a.f18623f;
        this.f18613e = c0194a.f18624g;
        this.b = c0194a.f18625h;
        this.f18611c = c0194a.f18626i;
        Paint paint = new Paint();
        this.f18617i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f18617i.setAntiAlias(true);
        this.f18618j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f18617i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f18617i);
    }

    public static C0194a a() {
        return new C0194a();
    }
}
