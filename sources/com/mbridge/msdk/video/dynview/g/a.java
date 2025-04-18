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

/* loaded from: classes4.dex */
public final class a extends ShapeDrawable {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private float f15750b;

    /* renamed from: c, reason: collision with root package name */
    private float f15751c;

    /* renamed from: d, reason: collision with root package name */
    private int f15752d;

    /* renamed from: e, reason: collision with root package name */
    private int f15753e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f15754f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f15755g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15756h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f15757i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f15758j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0206a implements b {
        private RectShape a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f15759b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f15760c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15761d;

        /* renamed from: e, reason: collision with root package name */
        private int f15762e;

        /* renamed from: f, reason: collision with root package name */
        private int f15763f;

        /* renamed from: g, reason: collision with root package name */
        private int f15764g;

        /* renamed from: h, reason: collision with root package name */
        private float f15765h;

        /* renamed from: i, reason: collision with root package name */
        private float f15766i;

        private C0206a() {
            this.f15763f = 100;
            this.f15764g = 10;
            this.a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f15759b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f15760c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z10) {
            this.f15761d = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f10) {
            this.f15766i = f10;
            return this;
        }

        public final b a(int i10) {
            this.f15762e = i10;
            return this;
        }

        public final b a(float f10) {
            this.f15765h = f10;
            return this;
        }

        public final a a() {
            return new a(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(Bitmap bitmap);

        b a(boolean z10);

        b b(float f10);

        b b(Bitmap bitmap);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.f15750b / bitmap.getWidth(), this.f15751c / bitmap.getHeight());
            if (this.f15758j == null) {
                this.f15758j = new Matrix();
            }
            this.f15758j.reset();
            this.f15758j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f15758j);
        this.f15757i.setShader(bitmapShader);
        canvas.drawPath(path, this.f15757i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a == 1) {
            float f10 = this.f15751c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f15752d + f10) - this.f15753e);
            path.lineTo(this.f15750b, (f10 - this.f15752d) - this.f15753e);
            path.lineTo(this.f15750b, 0.0f);
            if (this.f15756h) {
                try {
                    a(canvas, path);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f15754f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f15754f);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f15752d + f10 + this.f15753e);
            path2.lineTo(0.0f, this.f15751c);
            path2.lineTo(this.f15750b, this.f15751c);
            path2.lineTo(this.f15750b, (f10 - this.f15752d) + this.f15753e);
            if (this.f15756h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f15755g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f15755g);
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f11 = this.f15750b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f15751c);
        path3.lineTo((f11 - this.f15752d) - this.f15753e, this.f15751c);
        path3.lineTo((this.f15752d + f11) - this.f15753e, 0.0f);
        if (this.f15756h) {
            try {
                a(canvas, path3);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f15754f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f15754f);
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f15752d + f11 + this.f15753e, 0.0f);
        path4.lineTo(this.f15750b, 0.0f);
        path4.lineTo(this.f15750b, this.f15751c);
        path4.lineTo((f11 - this.f15752d) + this.f15753e, this.f15751c);
        if (this.f15756h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e15) {
                e15.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f15755g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f15755g);
            } catch (Exception e16) {
                e16.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0206a c0206a) {
        super(c0206a.a);
        this.f15756h = false;
        this.f15754f = c0206a.f15759b;
        this.f15755g = c0206a.f15760c;
        this.f15756h = c0206a.f15761d;
        this.a = c0206a.f15762e;
        this.f15752d = c0206a.f15763f;
        this.f15753e = c0206a.f15764g;
        this.f15750b = c0206a.f15765h;
        this.f15751c = c0206a.f15766i;
        Paint paint = new Paint();
        this.f15757i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15757i.setAntiAlias(true);
        this.f15758j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f15757i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f15757i);
    }

    public static C0206a a() {
        return new C0206a();
    }
}
