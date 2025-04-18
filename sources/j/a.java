package j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.media.d;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import r.f;

/* loaded from: classes4.dex */
public final class a extends Drawable implements Animatable2Compat {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f30835a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f30836b;

    /* renamed from: c, reason: collision with root package name */
    public final f f30837c;

    /* renamed from: i, reason: collision with root package name */
    public Canvas f30841i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f30842j;

    /* renamed from: m, reason: collision with root package name */
    public float f30845m;

    /* renamed from: n, reason: collision with root package name */
    public float f30846n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30847o;

    /* renamed from: p, reason: collision with root package name */
    public long f30848p;

    /* renamed from: q, reason: collision with root package name */
    public long f30849q;

    /* renamed from: s, reason: collision with root package name */
    public Picture f30851s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30853u;
    public final Paint d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f30838f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Rect f30839g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    public final Rect f30840h = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public float f30843k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f30844l = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f30850r = -1;

    /* renamed from: t, reason: collision with root package name */
    public t.a f30852t = t.a.f31364a;

    public a(Movie movie, Bitmap.Config config, f fVar) {
        this.f30835a = movie;
        this.f30836b = config;
        this.f30837c = fVar;
        if (!(!(config == Bitmap.Config.HARDWARE))) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2 = this.f30841i;
        Bitmap bitmap = this.f30842j;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f2 = this.f30843k;
            canvas2.scale(f2, f2);
            Movie movie = this.f30835a;
            Paint paint = this.d;
            movie.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f30851s;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.f30845m, this.f30846n);
                float f3 = this.f30844l;
                canvas.scale(f3, f3);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(save);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f30839g;
        if (p0.a.g(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int width = rect.width();
        int height = rect.height();
        Movie movie = this.f30835a;
        int width2 = movie.width();
        int height2 = movie.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        f fVar = this.f30837c;
        double G = p0.a.G(width2, height2, width, height, fVar);
        if (!this.f30853u && G > 1.0d) {
            G = 1.0d;
        }
        float f2 = (float) G;
        this.f30843k = f2;
        int i2 = (int) (width2 * f2);
        int i3 = (int) (f2 * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, this.f30836b);
        Bitmap bitmap = this.f30842j;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f30842j = createBitmap;
        this.f30841i = new Canvas(createBitmap);
        if (this.f30853u) {
            this.f30844l = 1.0f;
            this.f30845m = 0.0f;
            this.f30846n = 0.0f;
            return;
        }
        float G2 = (float) p0.a.G(i2, i3, width, height, fVar);
        this.f30844l = G2;
        float f3 = width - (i2 * G2);
        float f4 = 2;
        this.f30845m = (f3 / f4) + rect.left;
        this.f30846n = ((height - (G2 * i3)) / f4) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Movie movie = this.f30835a;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z2 = false;
        } else {
            if (this.f30847o) {
                this.f30849q = SystemClock.uptimeMillis();
            }
            int i2 = (int) (this.f30849q - this.f30848p);
            int i3 = i2 / duration;
            int i4 = this.f30850r;
            z2 = i4 == -1 || i3 <= i4;
            if (z2) {
                duration = i2 - (i3 * duration);
            }
        }
        movie.setTime(duration);
        if (this.f30853u) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f30840h;
            rect.set(0, 0, width, height);
            b(rect);
            int save = canvas.save();
            try {
                float f2 = 1 / this.f30843k;
                canvas.scale(f2, f2);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.f30847o && z2) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f30835a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f30835a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        t.a aVar;
        return (this.d.getAlpha() == 255 && ((aVar = this.f30852t) == t.a.f31365b || (aVar == t.a.f31364a && this.f30835a.isOpaque()))) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f30847o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (i2 < 0 || i2 >= 256) {
            throw new IllegalArgumentException(d.i("Invalid alpha: ", i2).toString());
        }
        this.d.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f30847o) {
            return;
        }
        this.f30847o = true;
        this.f30848p = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f30838f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f30847o) {
            this.f30847o = false;
            ArrayList arrayList = this.f30838f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).onAnimationEnd(this);
            }
        }
    }
}
