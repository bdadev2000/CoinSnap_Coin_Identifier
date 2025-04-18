package h4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final Bitmap.Config f18749l = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    public final j f18750b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f18751c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.d f18752d;

    /* renamed from: f, reason: collision with root package name */
    public final long f18753f;

    /* renamed from: g, reason: collision with root package name */
    public long f18754g;

    /* renamed from: h, reason: collision with root package name */
    public int f18755h;

    /* renamed from: i, reason: collision with root package name */
    public int f18756i;

    /* renamed from: j, reason: collision with root package name */
    public int f18757j;

    /* renamed from: k, reason: collision with root package name */
    public int f18758k;

    public i(long j3) {
        Bitmap.Config config;
        n nVar = new n();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f18753f = j3;
        this.f18750b = nVar;
        this.f18751c = unmodifiableSet;
        this.f18752d = new z1.d(10);
    }

    @Override // h4.d
    public final synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f18750b.g(bitmap) <= this.f18753f && this.f18751c.contains(bitmap.getConfig())) {
                        int g10 = this.f18750b.g(bitmap);
                        this.f18750b.a(bitmap);
                        this.f18752d.getClass();
                        this.f18757j++;
                        this.f18754g += g10;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f18750b.d(bitmap));
                        }
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            f();
                        }
                        h(this.f18753f);
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f18750b.d(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f18751c.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // h4.d
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            g10.eraseColor(0);
            return g10;
        }
        if (config == null) {
            config = f18749l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h4.d
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 == null) {
            if (config == null) {
                config = f18749l;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return g10;
    }

    @Override // h4.d
    public final void d(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                h(this.f18753f / 2);
                return;
            }
            return;
        }
        e();
    }

    @Override // h4.d
    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f18755h + ", misses=" + this.f18756i + ", puts=" + this.f18757j + ", evictions=" + this.f18758k + ", currentSize=" + this.f18754g + ", maxSize=" + this.f18753f + "\nStrategy=" + this.f18750b);
    }

    public final synchronized Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b3;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        j jVar = this.f18750b;
        if (config != null) {
            config3 = config;
        } else {
            config3 = f18749l;
        }
        b3 = jVar.b(i10, i11, config3);
        if (b3 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f18750b.e(i10, i11, config));
            }
            this.f18756i++;
        } else {
            this.f18755h++;
            this.f18754g -= this.f18750b.g(b3);
            this.f18752d.getClass();
            b3.setHasAlpha(true);
            b3.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f18750b.e(i10, i11, config));
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            f();
        }
        return b3;
    }

    public final synchronized void h(long j3) {
        while (this.f18754g > j3) {
            Bitmap removeLast = this.f18750b.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f18754g = 0L;
                return;
            }
            this.f18752d.getClass();
            this.f18754g -= this.f18750b.g(removeLast);
            this.f18758k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f18750b.d(removeLast));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            removeLast.recycle();
        }
    }
}
