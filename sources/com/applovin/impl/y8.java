package com.applovin.impl;

import com.applovin.impl.d9;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class y8 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9151d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9153f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9154g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9155h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9156i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9157j;

    /* renamed from: k, reason: collision with root package name */
    public final a f9158k;

    /* renamed from: l, reason: collision with root package name */
    private final we f9159l;

    /* loaded from: classes.dex */
    public static class a {
        public final long[] a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f9160b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.f9160b = jArr2;
        }
    }

    private y8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, a aVar, we weVar) {
        this.a = i10;
        this.f9149b = i11;
        this.f9150c = i12;
        this.f9151d = i13;
        this.f9152e = i14;
        this.f9153f = b(i14);
        this.f9154g = i15;
        this.f9155h = i16;
        this.f9156i = a(i16);
        this.f9157j = j3;
        this.f9158k = aVar;
        this.f9159l = weVar;
    }

    private static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static we a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] b3 = yp.b(str, "=");
            if (b3.length != 2) {
                a4.j.w("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new er(b3[0], b3[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public y8 b(List list) {
        return new y8(this.a, this.f9149b, this.f9150c, this.f9151d, this.f9152e, this.f9154g, this.f9155h, this.f9157j, this.f9158k, a(a(list, Collections.emptyList())));
    }

    public long b() {
        long j3 = this.f9157j;
        return j3 == 0 ? C.TIME_UNSET : (j3 * 1000000) / this.f9152e;
    }

    public y8(byte[] bArr, int i10) {
        xg xgVar = new xg(bArr);
        xgVar.c(i10 * 8);
        this.a = xgVar.a(16);
        this.f9149b = xgVar.a(16);
        this.f9150c = xgVar.a(24);
        this.f9151d = xgVar.a(24);
        int a10 = xgVar.a(20);
        this.f9152e = a10;
        this.f9153f = b(a10);
        this.f9154g = xgVar.a(3) + 1;
        int a11 = xgVar.a(5) + 1;
        this.f9155h = a11;
        this.f9156i = a(a11);
        this.f9157j = xgVar.b(36);
        this.f9158k = null;
        this.f9159l = null;
    }

    public y8 a(List list) {
        return new y8(this.a, this.f9149b, this.f9150c, this.f9151d, this.f9152e, this.f9154g, this.f9155h, this.f9157j, this.f9158k, a(a(Collections.emptyList(), list)));
    }

    public long a() {
        long j3;
        long j10;
        int i10 = this.f9151d;
        if (i10 > 0) {
            j3 = (i10 + this.f9150c) / 2;
            j10 = 1;
        } else {
            int i11 = this.a;
            j3 = ((((i11 != this.f9149b || i11 <= 0) ? 4096L : i11) * this.f9154g) * this.f9155h) / 8;
            j10 = 64;
        }
        return j3 + j10;
    }

    public d9 a(byte[] bArr, we weVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i10 = this.f9151d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new d9.b().f(MimeTypes.AUDIO_FLAC).i(i10).c(this.f9154g).n(this.f9152e).a(Collections.singletonList(bArr)).a(a(weVar)).a();
    }

    public we a(we weVar) {
        we weVar2 = this.f9159l;
        return weVar2 == null ? weVar : weVar2.a(weVar);
    }

    public long a(long j3) {
        return yp.b((j3 * this.f9152e) / 1000000, 0L, this.f9157j - 1);
    }

    public y8 a(a aVar) {
        return new y8(this.a, this.f9149b, this.f9150c, this.f9151d, this.f9152e, this.f9154g, this.f9155h, this.f9157j, aVar, this.f9159l);
    }
}
