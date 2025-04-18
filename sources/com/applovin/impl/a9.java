package com.applovin.impl;

import com.applovin.impl.f9;
import com.google.common.primitives.UnsignedBytes;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22713c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22714f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22715g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22716h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22717i;

    /* renamed from: j, reason: collision with root package name */
    public final long f22718j;

    /* renamed from: k, reason: collision with root package name */
    public final a f22719k;

    /* renamed from: l, reason: collision with root package name */
    private final bf f22720l;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f22721a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f22722b;

        public a(long[] jArr, long[] jArr2) {
            this.f22721a = jArr;
            this.f22722b = jArr2;
        }
    }

    private a9(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, a aVar, bf bfVar) {
        this.f22711a = i2;
        this.f22712b = i3;
        this.f22713c = i4;
        this.d = i5;
        this.e = i6;
        this.f22714f = b(i6);
        this.f22715g = i7;
        this.f22716h = i8;
        this.f22717i = a(i8);
        this.f22718j = j2;
        this.f22719k = aVar;
        this.f22720l = bfVar;
    }

    private static int a(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i2) {
        switch (i2) {
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

    private static bf a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String[] b2 = xp.b(str, ImpressionLog.R);
            if (b2.length != 2) {
                androidx.compose.foundation.text.input.a.x("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new dr(b2[0], b2[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bf(arrayList);
    }

    public a9 b(List list) {
        return new a9(this.f22711a, this.f22712b, this.f22713c, this.d, this.e, this.f22715g, this.f22716h, this.f22718j, this.f22719k, a(a(list, Collections.emptyList())));
    }

    public a9(byte[] bArr, int i2) {
        ah ahVar = new ah(bArr);
        ahVar.c(i2 * 8);
        this.f22711a = ahVar.a(16);
        this.f22712b = ahVar.a(16);
        this.f22713c = ahVar.a(24);
        this.d = ahVar.a(24);
        int a2 = ahVar.a(20);
        this.e = a2;
        this.f22714f = b(a2);
        this.f22715g = ahVar.a(3) + 1;
        int a3 = ahVar.a(5) + 1;
        this.f22716h = a3;
        this.f22717i = a(a3);
        this.f22718j = ahVar.b(36);
        this.f22719k = null;
        this.f22720l = null;
    }

    public long b() {
        long j2 = this.f22718j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.e;
    }

    public a9 a(List list) {
        return new a9(this.f22711a, this.f22712b, this.f22713c, this.d, this.e, this.f22715g, this.f22716h, this.f22718j, this.f22719k, a(a(Collections.emptyList(), list)));
    }

    public long a() {
        long j2;
        long j3;
        int i2 = this.d;
        if (i2 > 0) {
            j2 = (i2 + this.f22713c) / 2;
            j3 = 1;
        } else {
            int i3 = this.f22711a;
            j2 = ((((i3 != this.f22712b || i3 <= 0) ? 4096L : i3) * this.f22715g) * this.f22716h) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public f9 a(byte[] bArr, bf bfVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i2 = this.d;
        if (i2 <= 0) {
            i2 = -1;
        }
        return new f9.b().f("audio/flac").i(i2).c(this.f22715g).n(this.e).a(Collections.singletonList(bArr)).a(a(bfVar)).a();
    }

    public bf a(bf bfVar) {
        bf bfVar2 = this.f22720l;
        return bfVar2 == null ? bfVar : bfVar2.a(bfVar);
    }

    public long a(long j2) {
        return xp.b((j2 * this.e) / 1000000, 0L, this.f22718j - 1);
    }

    public a9 a(a aVar) {
        return new a9(this.f22711a, this.f22712b, this.f22713c, this.d, this.e, this.f22715g, this.f22716h, this.f22718j, aVar, this.f22720l);
    }
}
