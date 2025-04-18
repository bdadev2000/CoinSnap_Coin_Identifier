package b9;

import a9.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n9.o;
import n9.x;

/* loaded from: classes3.dex */
public final class c extends i {

    /* renamed from: h, reason: collision with root package name */
    public final int f2349h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2350i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2351j;

    /* renamed from: n, reason: collision with root package name */
    public List f2355n;

    /* renamed from: o, reason: collision with root package name */
    public List f2356o;

    /* renamed from: p, reason: collision with root package name */
    public int f2357p;

    /* renamed from: q, reason: collision with root package name */
    public int f2358q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2359r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2360s;

    /* renamed from: t, reason: collision with root package name */
    public byte f2361t;
    public byte u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2363w;

    /* renamed from: x, reason: collision with root package name */
    public long f2364x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2346y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2347z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final x f2348g = new x();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2353l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public b f2354m = new b(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f2362v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f2352k = 16000000;

    public c(String str, int i10) {
        int i11;
        if (MimeTypes.APPLICATION_MP4CEA608.equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f2349h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        o.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f2351j = 0;
                        this.f2350i = 0;
                    } else {
                        this.f2351j = 1;
                        this.f2350i = 1;
                    }
                } else {
                    this.f2351j = 0;
                    this.f2350i = 1;
                }
            } else {
                this.f2351j = 1;
                this.f2350i = 0;
            }
        } else {
            this.f2351j = 0;
            this.f2350i = 0;
        }
        h(0);
        g();
        this.f2363w = true;
        this.f2364x = C.TIME_UNSET;
    }

    @Override // b9.i
    public final j b() {
        List list = this.f2355n;
        this.f2356o = list;
        list.getClass();
        return new j(list, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x0230. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[SYNTHETIC] */
    @Override // b9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(b9.g r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.c.c(b9.g):void");
    }

    @Override // b9.i, w7.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final m dequeueOutputBuffer() {
        boolean z10;
        m mVar;
        m dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j3 = this.f2352k;
        if (j3 != C.TIME_UNSET) {
            long j10 = this.f2364x;
            if (j10 != C.TIME_UNSET && this.f2406e - j10 >= j3) {
                z10 = true;
                if (!z10 && (mVar = (m) this.f2403b.pollFirst()) != null) {
                    this.f2355n = Collections.emptyList();
                    this.f2364x = C.TIME_UNSET;
                    mVar.f(this.f2406e, b(), Long.MAX_VALUE);
                    return mVar;
                }
            }
        }
        z10 = false;
        return !z10 ? null : null;
    }

    @Override // b9.i
    public final boolean e() {
        return this.f2355n != this.f2356o;
    }

    public final List f() {
        ArrayList arrayList = this.f2353l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            a9.b c10 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f373k);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            a9.b bVar = (a9.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f373k != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    @Override // b9.i, w7.e
    public final void flush() {
        super.flush();
        this.f2355n = null;
        this.f2356o = null;
        h(0);
        this.f2358q = 4;
        this.f2354m.f2345h = 4;
        g();
        this.f2359r = false;
        this.f2360s = false;
        this.f2361t = (byte) 0;
        this.u = (byte) 0;
        this.f2362v = 0;
        this.f2363w = true;
        this.f2364x = C.TIME_UNSET;
    }

    public final void g() {
        b bVar = this.f2354m;
        bVar.f2344g = this.f2357p;
        bVar.a.clear();
        bVar.f2339b.clear();
        bVar.f2340c.setLength(0);
        bVar.f2341d = 15;
        bVar.f2342e = 0;
        bVar.f2343f = 0;
        ArrayList arrayList = this.f2353l;
        arrayList.clear();
        arrayList.add(this.f2354m);
    }

    public final void h(int i10) {
        int i11 = this.f2357p;
        if (i11 == i10) {
            return;
        }
        this.f2357p = i10;
        if (i10 == 3) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f2353l;
                if (i12 < arrayList.size()) {
                    ((b) arrayList.get(i12)).f2344g = i10;
                    i12++;
                } else {
                    return;
                }
            }
        } else {
            g();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f2355n = Collections.emptyList();
            }
        }
    }

    @Override // b9.i, w7.e
    public final void release() {
    }
}
