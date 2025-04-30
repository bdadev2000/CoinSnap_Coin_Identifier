package com.applovin.impl;

import com.applovin.impl.d9;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12352a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12354d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12356f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12357g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12358h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12359i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12360j;

    /* renamed from: k, reason: collision with root package name */
    public final a f12361k;
    private final we l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f12362a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.f12362a = jArr;
            this.b = jArr2;
        }
    }

    private y8(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j7, a aVar, we weVar) {
        this.f12352a = i9;
        this.b = i10;
        this.f12353c = i11;
        this.f12354d = i12;
        this.f12355e = i13;
        this.f12356f = b(i13);
        this.f12357g = i14;
        this.f12358h = i15;
        this.f12359i = a(i15);
        this.f12360j = j7;
        this.f12361k = aVar;
        this.l = weVar;
    }

    private static int a(int i9) {
        if (i9 == 8) {
            return 1;
        }
        if (i9 == 12) {
            return 2;
        }
        if (i9 == 16) {
            return 4;
        }
        if (i9 != 20) {
            return i9 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i9) {
        switch (i9) {
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
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            String[] b = yp.b(str, "=");
            if (b.length != 2) {
                L.u("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new er(b[0], b[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public y8 b(List list) {
        return new y8(this.f12352a, this.b, this.f12353c, this.f12354d, this.f12355e, this.f12357g, this.f12358h, this.f12360j, this.f12361k, a(a(list, Collections.emptyList())));
    }

    public long b() {
        long j7 = this.f12360j;
        return j7 == 0 ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : (j7 * 1000000) / this.f12355e;
    }

    public y8(byte[] bArr, int i9) {
        xg xgVar = new xg(bArr);
        xgVar.c(i9 * 8);
        this.f12352a = xgVar.a(16);
        this.b = xgVar.a(16);
        this.f12353c = xgVar.a(24);
        this.f12354d = xgVar.a(24);
        int a6 = xgVar.a(20);
        this.f12355e = a6;
        this.f12356f = b(a6);
        this.f12357g = xgVar.a(3) + 1;
        int a9 = xgVar.a(5) + 1;
        this.f12358h = a9;
        this.f12359i = a(a9);
        this.f12360j = xgVar.b(36);
        this.f12361k = null;
        this.l = null;
    }

    public y8 a(List list) {
        return new y8(this.f12352a, this.b, this.f12353c, this.f12354d, this.f12355e, this.f12357g, this.f12358h, this.f12360j, this.f12361k, a(a(Collections.emptyList(), list)));
    }

    public long a() {
        long j7;
        long j9;
        int i9 = this.f12354d;
        if (i9 > 0) {
            j7 = (i9 + this.f12353c) / 2;
            j9 = 1;
        } else {
            int i10 = this.f12352a;
            j7 = ((((i10 != this.b || i10 <= 0) ? 4096L : i10) * this.f12357g) * this.f12358h) / 8;
            j9 = 64;
        }
        return j7 + j9;
    }

    public d9 a(byte[] bArr, we weVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i9 = this.f12354d;
        if (i9 <= 0) {
            i9 = -1;
        }
        return new d9.b().f(MimeTypes.AUDIO_FLAC).i(i9).c(this.f12357g).n(this.f12355e).a(Collections.singletonList(bArr)).a(a(weVar)).a();
    }

    public we a(we weVar) {
        we weVar2 = this.l;
        return weVar2 == null ? weVar : weVar2.a(weVar);
    }

    public long a(long j7) {
        return yp.b((j7 * this.f12355e) / 1000000, 0L, this.f12360j - 1);
    }

    public y8 a(a aVar) {
        return new y8(this.f12352a, this.b, this.f12353c, this.f12354d, this.f12355e, this.f12357g, this.f12358h, this.f12360j, aVar, this.l);
    }
}
