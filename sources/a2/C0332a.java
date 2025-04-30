package a2;

import N1.i;
import N1.k;
import P1.B;
import Q7.n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j5.C2400c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332a implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final R3.e f3916f = new R3.e(13);

    /* renamed from: g, reason: collision with root package name */
    public static final C2400c f3917g = new C2400c(23);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3918a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final C2400c f3919c;

    /* renamed from: d, reason: collision with root package name */
    public final R3.e f3920d;

    /* renamed from: e, reason: collision with root package name */
    public final E1.d f3921e;

    public C0332a(Context context, ArrayList arrayList, Q1.a aVar, Q1.f fVar) {
        R3.e eVar = f3916f;
        this.f3918a = context.getApplicationContext();
        this.b = arrayList;
        this.f3920d = eVar;
        this.f3921e = new E1.d(19, aVar, fVar);
        this.f3919c = f3917g;
    }

    public static int d(M1.b bVar, int i9, int i10) {
        int highestOneBit;
        int min = Math.min(bVar.f1957g / i10, bVar.f1956f / i9);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder o3 = n0.o(max, i9, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            o3.append(i10);
            o3.append("], actual dimens: [");
            o3.append(bVar.f1956f);
            o3.append("x");
            o3.append(bVar.f1957g);
            o3.append("]");
            Log.v("BufferGifDecoder", o3.toString());
        }
        return max;
    }

    @Override // N1.k
    public final boolean a(Object obj, i iVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) iVar.c(AbstractC0338g.b)).booleanValue() && z2.i.k(this.b, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // N1.k
    public final B b(Object obj, int i9, int i10, i iVar) {
        M1.c cVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C2400c c2400c = this.f3919c;
        synchronized (c2400c) {
            try {
                M1.c cVar2 = (M1.c) ((ArrayDeque) c2400c.f21107c).poll();
                if (cVar2 == null) {
                    cVar2 = new M1.c();
                }
                cVar = cVar2;
                cVar.b = null;
                Arrays.fill(cVar.f1962a, (byte) 0);
                cVar.f1963c = new M1.b();
                cVar.f1964d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                cVar.b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                cVar.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i9, i10, cVar, iVar);
        } finally {
            this.f3919c.o(cVar);
        }
    }

    public final Y1.b c(ByteBuffer byteBuffer, int i9, int i10, M1.c cVar, i iVar) {
        Bitmap.Config config;
        int i11 = j2.i.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i12 = 2;
        try {
            M1.b b = cVar.b();
            if (b.f1953c > 0 && b.b == 0) {
                if (iVar.c(AbstractC0338g.f3949a) == N1.a.f2083c) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                        if (Log.isLoggable("BufferGifDecoder", i12)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j2.i.a(elapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d2 = d(b, i9, i10);
                R3.e eVar = this.f3920d;
                E1.d dVar = this.f3921e;
                eVar.getClass();
                M1.d dVar2 = new M1.d(dVar, b, byteBuffer, d2);
                dVar2.c(config);
                dVar2.f1974k = (dVar2.f1974k + 1) % dVar2.l.f1953c;
                Bitmap b8 = dVar2.b();
                if (b8 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j2.i.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                Y1.b bVar = new Y1.b(new C0333b(new N0.e(new C0337f(com.bumptech.glide.b.a(this.f3918a), dVar2, i9, i10, b8), 1)), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j2.i.a(elapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + j2.i.a(elapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i12 = 2;
        }
    }
}
