package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public boolean f19486c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19487d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19488e;
    public final n9.f0 a = new n9.f0(0);

    /* renamed from: f, reason: collision with root package name */
    public long f19489f = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    public long f19490g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f19491h = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final n9.x f19485b = new n9.x();

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long c(n9.x xVar) {
        int i10 = xVar.f22599b;
        if (xVar.f22600c - i10 < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        boolean z10 = false;
        xVar.d(bArr, 0, 9);
        xVar.G(i10);
        byte b3 = bArr[0];
        if ((b3 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z10 = true;
        }
        if (!z10) {
            return C.TIME_UNSET;
        }
        long j3 = b3;
        long j10 = ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j11 = bArr[2];
        return j10 | (((j11 & 248) >> 3) << 15) | ((j11 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(y7.m mVar) {
        byte[] bArr = n9.h0.f22548f;
        n9.x xVar = this.f19485b;
        xVar.getClass();
        xVar.E(bArr, bArr.length);
        this.f19486c = true;
        mVar.resetPeekPosition();
    }
}
