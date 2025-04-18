package y7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
import n9.h0;
import s7.q0;
import s7.r0;

/* loaded from: classes3.dex */
public final class s {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27998f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27999g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28000h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28001i;

    /* renamed from: j, reason: collision with root package name */
    public final long f28002j;

    /* renamed from: k, reason: collision with root package name */
    public final r4.c f28003k;

    /* renamed from: l, reason: collision with root package name */
    public final l8.b f28004l;

    public s(byte[] bArr, int i10) {
        c0 c0Var = new c0(bArr, 2, (Object) null);
        c0Var.o(i10 * 8);
        this.a = c0Var.i(16);
        this.f27994b = c0Var.i(16);
        this.f27995c = c0Var.i(24);
        this.f27996d = c0Var.i(24);
        int i11 = c0Var.i(20);
        this.f27997e = i11;
        this.f27998f = d(i11);
        this.f27999g = c0Var.i(3) + 1;
        int i12 = c0Var.i(5) + 1;
        this.f28000h = i12;
        this.f28001i = a(i12);
        int i13 = c0Var.i(4);
        int i14 = c0Var.i(32);
        int i15 = h0.a;
        this.f28002j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.f28003k = null;
        this.f28004l = null;
    }

    public static int a(int i10) {
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

    public static int d(int i10) {
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

    public final long b() {
        long j3 = this.f28002j;
        return j3 == 0 ? C.TIME_UNSET : (j3 * 1000000) / this.f27997e;
    }

    public final r0 c(byte[] bArr, l8.b bVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i10 = this.f27996d;
        if (i10 <= 0) {
            i10 = -1;
        }
        l8.b bVar2 = this.f28004l;
        if (bVar2 != null) {
            if (bVar == null) {
                bVar = bVar2;
            } else {
                bVar = bVar2.a(bVar.f21159b);
            }
        }
        q0 q0Var = new q0();
        q0Var.f24667k = MimeTypes.AUDIO_FLAC;
        q0Var.f24668l = i10;
        q0Var.f24679x = this.f27999g;
        q0Var.f24680y = this.f27997e;
        q0Var.f24669m = Collections.singletonList(bArr);
        q0Var.f24665i = bVar;
        return new r0(q0Var);
    }

    public s(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, r4.c cVar, l8.b bVar) {
        this.a = i10;
        this.f27994b = i11;
        this.f27995c = i12;
        this.f27996d = i13;
        this.f27997e = i14;
        this.f27998f = d(i14);
        this.f27999g = i15;
        this.f28000h = i16;
        this.f28001i = a(i16);
        this.f28002j = j3;
        this.f28003k = cVar;
        this.f28004l = bVar;
    }
}
