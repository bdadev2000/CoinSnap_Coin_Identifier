package Q1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j2.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import q4.C2645d;

/* loaded from: classes.dex */
public final class g implements a {
    public static final Bitmap.Config l = Bitmap.Config.ARGB_8888;
    public final h b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2479c;

    /* renamed from: d, reason: collision with root package name */
    public final C2645d f2480d;

    /* renamed from: f, reason: collision with root package name */
    public final long f2481f;

    /* renamed from: g, reason: collision with root package name */
    public long f2482g;

    /* renamed from: h, reason: collision with root package name */
    public int f2483h;

    /* renamed from: i, reason: collision with root package name */
    public int f2484i;

    /* renamed from: j, reason: collision with root package name */
    public int f2485j;

    /* renamed from: k, reason: collision with root package name */
    public int f2486k;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, q4.d] */
    public g(long j7) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i9 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i9 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f2481f = j7;
        this.b = lVar;
        this.f2479c = unmodifiableSet;
        this.f2480d = new Object();
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f2483h + ", misses=" + this.f2484i + ", puts=" + this.f2485j + ", evictions=" + this.f2486k + ", currentSize=" + this.f2482g + ", maxSize=" + this.f2481f + "\nStrategy=" + this.b);
    }

    @Override // Q1.a
    public final Bitmap b(int i9, int i10, Bitmap.Config config) {
        Bitmap c9 = c(i9, i10, config);
        if (c9 == null) {
            if (config == null) {
                config = l;
            }
            return Bitmap.createBitmap(i9, i10, config);
        }
        return c9;
    }

    public final synchronized Bitmap c(int i9, int i10, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            h hVar = this.b;
            if (config != null) {
                config3 = config;
            } else {
                config3 = l;
            }
            b = ((l) hVar).b(i9, i10, config3);
            if (b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((l) this.b).getClass();
                    sb.append(l.c(n.d(config) * i9 * i10, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f2484i++;
            } else {
                this.f2483h++;
                long j7 = this.f2482g;
                ((l) this.b).getClass();
                this.f2482g = j7 - n.c(b);
                this.f2480d.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((l) this.b).getClass();
                sb2.append(l.c(n.d(config) * i9 * i10, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // Q1.a
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.b).getClass();
                        if (n.c(bitmap) <= this.f2481f && this.f2479c.contains(bitmap.getConfig())) {
                            ((l) this.b).getClass();
                            int c9 = n.c(bitmap);
                            ((l) this.b).e(bitmap);
                            this.f2480d.getClass();
                            this.f2485j++;
                            this.f2482g += c9;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                                ((l) this.b).getClass();
                                sb.append(l.c(n.c(bitmap), bitmap.getConfig()));
                                Log.v("LruBitmapPool", sb.toString());
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                a();
                            }
                            e(this.f2481f);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                        ((l) this.b).getClass();
                        sb2.append(l.c(n.c(bitmap), bitmap.getConfig()));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f2479c.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(long j7) {
        while (this.f2482g > j7) {
            try {
                l lVar = (l) this.b;
                Bitmap bitmap = (Bitmap) lVar.b.A();
                if (bitmap != null) {
                    lVar.a(Integer.valueOf(n.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f2482g = 0L;
                    return;
                }
                this.f2480d.getClass();
                long j9 = this.f2482g;
                ((l) this.b).getClass();
                this.f2482g = j9 - n.c(bitmap);
                this.f2486k++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    ((l) this.b).getClass();
                    sb.append(l.c(n.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.a
    public final Bitmap k(int i9, int i10, Bitmap.Config config) {
        Bitmap c9 = c(i9, i10, config);
        if (c9 != null) {
            c9.eraseColor(0);
            return c9;
        }
        if (config == null) {
            config = l;
        }
        return Bitmap.createBitmap(i9, i10, config);
    }

    @Override // Q1.a
    public final void o(int i9) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i9);
        }
        if (i9 < 40 && i9 < 20) {
            if (i9 >= 20 || i9 == 15) {
                e(this.f2481f / 2);
                return;
            }
            return;
        }
        q();
    }

    @Override // Q1.a
    public final void q() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}
