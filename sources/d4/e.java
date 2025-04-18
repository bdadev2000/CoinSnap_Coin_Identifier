package d4;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import d3.g;
import h4.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements a {
    public int[] a;

    /* renamed from: c, reason: collision with root package name */
    public final g f16838c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f16839d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16840e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f16841f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f16842g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f16843h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f16844i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f16845j;

    /* renamed from: k, reason: collision with root package name */
    public int f16846k;

    /* renamed from: l, reason: collision with root package name */
    public c f16847l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f16848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16849n;

    /* renamed from: o, reason: collision with root package name */
    public int f16850o;

    /* renamed from: p, reason: collision with root package name */
    public int f16851p;

    /* renamed from: q, reason: collision with root package name */
    public int f16852q;

    /* renamed from: r, reason: collision with root package name */
    public int f16853r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f16854s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16837b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f16855t = Bitmap.Config.ARGB_8888;

    public e(g gVar, c cVar, ByteBuffer byteBuffer, int i10) {
        int[] iArr;
        this.f16838c = gVar;
        this.f16847l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f16850o = 0;
                this.f16847l = cVar;
                this.f16846k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f16839d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f16839d.order(ByteOrder.LITTLE_ENDIAN);
                this.f16849n = false;
                Iterator it = cVar.f16827e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f16819g == 3) {
                        this.f16849n = true;
                        break;
                    }
                }
                this.f16851p = highestOneBit;
                int i11 = cVar.f16828f;
                this.f16853r = i11 / highestOneBit;
                int i12 = cVar.f16829g;
                this.f16852q = i12 / highestOneBit;
                this.f16844i = this.f16838c.y(i11 * i12);
                g gVar2 = this.f16838c;
                int i13 = this.f16853r * this.f16852q;
                Object obj = gVar2.f16813d;
                if (((h) obj) == null) {
                    iArr = new int[i13];
                } else {
                    iArr = (int[]) ((h) obj).c(int[].class, i13);
                }
                this.f16845j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f16854s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f16855t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c10 = ((h4.d) this.f16838c.f16812c).c(this.f16853r, this.f16852q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    public final synchronized Bitmap b() {
        b bVar;
        if (this.f16847l.f16825c <= 0 || this.f16846k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f16847l.f16825c + ", framePointer=" + this.f16846k);
            }
            this.f16850o = 1;
        }
        int i10 = this.f16850o;
        if (i10 != 1 && i10 != 2) {
            this.f16850o = 0;
            if (this.f16840e == null) {
                this.f16840e = this.f16838c.y(255);
            }
            b bVar2 = (b) this.f16847l.f16827e.get(this.f16846k);
            int i11 = this.f16846k - 1;
            if (i11 >= 0) {
                bVar = (b) this.f16847l.f16827e.get(i11);
            } else {
                bVar = null;
            }
            int[] iArr = bVar2.f16823k;
            if (iArr == null) {
                iArr = this.f16847l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f16846k);
                }
                this.f16850o = 1;
                return null;
            }
            if (bVar2.f16818f) {
                System.arraycopy(iArr, 0, this.f16837b, 0, iArr.length);
                int[] iArr2 = this.f16837b;
                this.a = iArr2;
                iArr2[bVar2.f16820h] = 0;
                if (bVar2.f16819g == 2 && this.f16846k == 0) {
                    this.f16854s = Boolean.TRUE;
                }
            }
            return d(bVar2, bVar);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f16850o);
        }
        return null;
    }

    public final void c(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f16855t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f16832j == r36.f16820h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(d4.b r36, d4.b r37) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e.d(d4.b, d4.b):android.graphics.Bitmap");
    }
}
