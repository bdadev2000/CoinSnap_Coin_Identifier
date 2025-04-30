package M1;

import Q1.f;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1965a;

    /* renamed from: c, reason: collision with root package name */
    public final E1.d f1966c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f1967d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f1968e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f1969f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f1970g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f1971h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f1972i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1973j;

    /* renamed from: k, reason: collision with root package name */
    public int f1974k;
    public b l;
    public Bitmap m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1975n;

    /* renamed from: o, reason: collision with root package name */
    public int f1976o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1977p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1978q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1979r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f1980s;
    public final int[] b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f1981t = Bitmap.Config.ARGB_8888;

    public d(E1.d dVar, b bVar, ByteBuffer byteBuffer, int i9) {
        byte[] bArr;
        int[] iArr;
        this.f1966c = dVar;
        this.l = new b();
        synchronized (this) {
            try {
                if (i9 > 0) {
                    int highestOneBit = Integer.highestOneBit(i9);
                    this.f1976o = 0;
                    this.l = bVar;
                    this.f1974k = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.f1967d = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.f1967d.order(ByteOrder.LITTLE_ENDIAN);
                    this.f1975n = false;
                    Iterator it = bVar.f1955e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((a) it.next()).f1947g == 3) {
                            this.f1975n = true;
                            break;
                        }
                    }
                    this.f1977p = highestOneBit;
                    int i10 = bVar.f1956f;
                    this.f1979r = i10 / highestOneBit;
                    int i11 = bVar.f1957g;
                    this.f1978q = i11 / highestOneBit;
                    int i12 = i10 * i11;
                    f fVar = (f) this.f1966c.f974d;
                    if (fVar == null) {
                        bArr = new byte[i12];
                    } else {
                        bArr = (byte[]) fVar.c(i12, byte[].class);
                    }
                    this.f1972i = bArr;
                    E1.d dVar2 = this.f1966c;
                    int i13 = this.f1979r * this.f1978q;
                    f fVar2 = (f) dVar2.f974d;
                    if (fVar2 == null) {
                        iArr = new int[i13];
                    } else {
                        iArr = (int[]) fVar2.c(i13, int[].class);
                    }
                    this.f1973j = iArr;
                } else {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f1980s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f1981t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap b = ((Q1.a) this.f1966c.f973c).b(this.f1979r, this.f1978q, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.d.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.f1981t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f1960j == r34.f1948h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(M1.a r34, M1.a r35) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.d.d(M1.a, M1.a):android.graphics.Bitmap");
    }
}
