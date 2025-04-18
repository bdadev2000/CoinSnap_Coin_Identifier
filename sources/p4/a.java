package p4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e4.m;
import e4.o;
import g4.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final z1.d f23413f = new z1.d(21);

    /* renamed from: g, reason: collision with root package name */
    public static final kc.c f23414g = new kc.c(23);
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23415b;

    /* renamed from: c, reason: collision with root package name */
    public final kc.c f23416c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.d f23417d;

    /* renamed from: e, reason: collision with root package name */
    public final d3.g f23418e;

    public a(Context context, ArrayList arrayList, h4.d dVar, h4.h hVar) {
        z1.d dVar2 = f23413f;
        this.a = context.getApplicationContext();
        this.f23415b = arrayList;
        this.f23417d = dVar2;
        this.f23418e = new d3.g(29, dVar, hVar);
        this.f23416c = f23414g;
    }

    public static int d(d4.c cVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(cVar.f16829g / i11, cVar.f16828f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder n10 = a4.j.n("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i10, "x");
            n10.append(i11);
            n10.append("], actual dimens: [");
            n10.append(cVar.f16828f);
            n10.append("x");
            n10.append(cVar.f16829g);
            n10.append("]");
            Log.v("BufferGifDecoder", n10.toString());
        }
        return max;
    }

    @Override // e4.o
    public final boolean a(Object obj, m mVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) mVar.c(i.f23454b)).booleanValue() && com.facebook.appevents.o.o(this.f23415b, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, m mVar) {
        d4.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        kc.c cVar = this.f23416c;
        synchronized (cVar) {
            d4.d dVar2 = (d4.d) ((Queue) cVar.f20640c).poll();
            if (dVar2 == null) {
                dVar2 = new d4.d();
            }
            dVar = dVar2;
            dVar.f16834b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.f16835c = new d4.c();
            dVar.f16836d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f16834b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f16834b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            o4.c c10 = c(byteBuffer, i10, i11, dVar, mVar);
            kc.c cVar2 = this.f23416c;
            synchronized (cVar2) {
                dVar.f16834b = null;
                dVar.f16835c = null;
                ((Queue) cVar2.f20640c).offer(dVar);
            }
            return c10;
        } catch (Throwable th2) {
            kc.c cVar3 = this.f23416c;
            synchronized (cVar3) {
                dVar.f16834b = null;
                dVar.f16835c = null;
                ((Queue) cVar3.f20640c).offer(dVar);
                throw th2;
            }
        }
    }

    public final o4.c c(ByteBuffer byteBuffer, int i10, int i11, d4.d dVar, m mVar) {
        Bitmap.Config config;
        int i12 = w4.g.f26732b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            d4.c b3 = dVar.b();
            if (b3.f16825c > 0 && b3.f16824b == 0) {
                if (mVar.c(i.a) == e4.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b3, i10, i11);
                z1.d dVar2 = this.f23417d;
                d3.g gVar = this.f23418e;
                dVar2.getClass();
                d4.e eVar = new d4.e(gVar, b3, byteBuffer, d10);
                eVar.c(config);
                eVar.f16846k = (eVar.f16846k + 1) % eVar.f16847l.f16825c;
                Bitmap b10 = eVar.b();
                if (b10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + w4.g.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                return new o4.c(new c(new b(new h(com.bumptech.glide.b.a(this.a), eVar, i10, i11, m4.c.f21626b, b10))), 1);
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + w4.g.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + w4.g.a(elapsedRealtimeNanos));
            }
        }
    }
}
