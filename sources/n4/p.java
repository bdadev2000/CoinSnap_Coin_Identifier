package n4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    public static final e4.l f22427f = e4.l.a(e4.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final e4.l f22428g = new e4.l("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, e4.l.f17103e);

    /* renamed from: h, reason: collision with root package name */
    public static final e4.l f22429h;

    /* renamed from: i, reason: collision with root package name */
    public static final e4.l f22430i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.facebook.b f22431j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f22432k;
    public final h4.d a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f22433b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.h f22434c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22435d;

    /* renamed from: e, reason: collision with root package name */
    public final u f22436e;

    static {
        m mVar = n.a;
        Boolean bool = Boolean.FALSE;
        f22429h = e4.l.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f22430i = e4.l.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f22431j = new com.facebook.b(19);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = w4.m.a;
        f22432k = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, h4.d dVar, h4.h hVar) {
        if (u.f22443j == null) {
            synchronized (u.class) {
                if (u.f22443j == null) {
                    u.f22443j = new u();
                }
            }
        }
        this.f22436e = u.f22443j;
        this.f22435d = arrayList;
        com.bumptech.glide.c.l(displayMetrics);
        this.f22433b = displayMetrics;
        com.bumptech.glide.c.l(dVar);
        this.a = dVar;
        com.bumptech.glide.c.l(hVar);
        this.f22434c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(h.c r5, android.graphics.BitmapFactory.Options r6, n4.o r7, h4.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.n()
            int r1 = r5.f18522b
            switch(r1) {
                case 15: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f18523c
            com.bumptech.glide.load.data.n r1 = (com.bumptech.glide.load.data.n) r1
            java.lang.Object r1 = r1.f9710c
            n4.w r1 = (n4.w) r1
            monitor-enter(r1)
            byte[] r2 = r1.f22450b     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f22452d = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = n4.y.f22456b
            r4.lock()
            android.graphics.Bitmap r5 = r5.q(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5a
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5a
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5a
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5d
            r8.a(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            java.util.concurrent.locks.Lock r6 = n4.y.f22456b
            r6.unlock()
            return r5
        L5a:
            r5 = move-exception
            goto L5e
        L5c:
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5e:
            java.util.concurrent.locks.Lock r6 = n4.y.f22456b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.p.c(h.c, android.graphics.BitmapFactory$Options, n4.o, h4.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder n10 = a4.j.n("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        n10.append(str);
        n10.append(", inBitmap: ");
        n10.append(d(options.inBitmap));
        return new IOException(n10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
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

    public final d a(h.c cVar, int i10, int i11, e4.m mVar, o oVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.f22434c.c(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        synchronized (p.class) {
            arrayDeque = f22432k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        e4.b bVar = (e4.b) mVar.c(f22427f);
        e4.n nVar = (e4.n) mVar.c(f22428g);
        n nVar2 = (n) mVar.c(n.f22425f);
        boolean booleanValue = ((Boolean) mVar.c(f22429h)).booleanValue();
        e4.l lVar = f22430i;
        if (mVar.c(lVar) != null && ((Boolean) mVar.c(lVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            d b3 = d.b(b(cVar, options2, nVar2, bVar, nVar, z10, i10, i11, booleanValue, oVar), this.a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f22434c.g(bArr);
            return b3;
        } catch (Throwable th2) {
            f(options2);
            ArrayDeque arrayDeque2 = f22432k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f22434c.g(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0579 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(h.c r37, android.graphics.BitmapFactory.Options r38, n4.n r39, e4.b r40, e4.n r41, boolean r42, int r43, int r44, boolean r45, n4.o r46) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.p.b(h.c, android.graphics.BitmapFactory$Options, n4.n, e4.b, e4.n, boolean, int, int, boolean, n4.o):android.graphics.Bitmap");
    }
}
