package W1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import q4.C2645d;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.h f3586f = N1.h.a(N1.a.f2084d, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final N1.h f3587g = new N1.h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, N1.h.f2088e);

    /* renamed from: h, reason: collision with root package name */
    public static final N1.h f3588h;

    /* renamed from: i, reason: collision with root package name */
    public static final N1.h f3589i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2645d f3590j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f3591k;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.a f3592a;
    public final DisplayMetrics b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.f f3593c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3594d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3595e = w.a();

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, q4.d] */
    static {
        o oVar = o.b;
        Boolean bool = Boolean.FALSE;
        f3588h = N1.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f3589i = N1.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3590j = new Object();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = j2.n.f21025a;
        f3591k = new ArrayDeque(0);
    }

    public q(ArrayList arrayList, DisplayMetrics displayMetrics, Q1.a aVar, Q1.f fVar) {
        this.f3594d = arrayList;
        j2.g.c(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        j2.g.c(aVar, "Argument must not be null");
        this.f3592a = aVar;
        j2.g.c(fVar, "Argument must not be null");
        this.f3593c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(C.c r9, android.graphics.BitmapFactory.Options r10, W1.p r11, Q1.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.f()
            r9.D()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = W1.A.b
            r4.lock()
            android.graphics.Bitmap r9 = r9.m(r10)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r9
        L1f:
            r9 = move-exception
            goto L68
        L21:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = Q7.n0.o(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            r1.append(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L1f
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L52
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L1f
        L52:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L67
            r12.d(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L66
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L66
            java.util.concurrent.locks.Lock r10 = W1.A.b
            r10.unlock()
            return r9
        L66:
            throw r5     // Catch: java.lang.Throwable -> L1f
        L67:
            throw r5     // Catch: java.lang.Throwable -> L1f
        L68:
            java.util.concurrent.locks.Lock r10 = W1.A.b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.q.c(C.c, android.graphics.BitmapFactory$Options, W1.p, Q1.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0320d a(C.c cVar, int i9, int i10, N1.i iVar, p pVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z8;
        byte[] bArr = (byte[]) this.f3593c.c(65536, byte[].class);
        synchronized (q.class) {
            arrayDeque = f3591k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        N1.a aVar = (N1.a) iVar.c(f3586f);
        N1.j jVar = (N1.j) iVar.c(f3587g);
        o oVar = (o) iVar.c(o.f3583g);
        boolean booleanValue = ((Boolean) iVar.c(f3588h)).booleanValue();
        N1.h hVar = f3589i;
        if (iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue()) {
            z8 = true;
        } else {
            z8 = false;
        }
        try {
            C0320d b = C0320d.b(this.f3592a, b(cVar, options2, oVar, aVar, jVar, z8, i9, i10, booleanValue, pVar));
            e(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f3593c.g(bArr);
            return b;
        } catch (Throwable th) {
            e(options2);
            ArrayDeque arrayDeque2 = f3591k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f3593c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(C.c r41, android.graphics.BitmapFactory.Options r42, W1.o r43, N1.a r44, N1.j r45, boolean r46, int r47, int r48, boolean r49, W1.p r50) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.q.b(C.c, android.graphics.BitmapFactory$Options, W1.o, N1.a, N1.j, boolean, int, int, boolean, W1.p):android.graphics.Bitmap");
    }
}
