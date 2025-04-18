package j8;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import n9.h0;
import n9.x;
import s7.q0;
import s7.r0;
import s7.x1;
import y7.a0;
import y7.n;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f19785m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f19786n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final n a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f19787b;

    /* renamed from: c, reason: collision with root package name */
    public final u7.b f19788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19789d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f19790e;

    /* renamed from: f, reason: collision with root package name */
    public final x f19791f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19792g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f19793h;

    /* renamed from: i, reason: collision with root package name */
    public int f19794i;

    /* renamed from: j, reason: collision with root package name */
    public long f19795j;

    /* renamed from: k, reason: collision with root package name */
    public int f19796k;

    /* renamed from: l, reason: collision with root package name */
    public long f19797l;

    public a(n nVar, a0 a0Var, u7.b bVar) {
        this.a = nVar;
        this.f19787b = a0Var;
        this.f19788c = bVar;
        int max = Math.max(1, bVar.f25538d / 10);
        this.f19792g = max;
        x xVar = new x((byte[]) bVar.f25536b);
        xVar.n();
        int n10 = xVar.n();
        this.f19789d = n10;
        int i10 = bVar.f25537c;
        int i11 = bVar.f25540f;
        int i12 = (((i11 - (i10 * 4)) * 8) / (bVar.f25541g * i10)) + 1;
        if (n10 == i12) {
            int i13 = h0.a;
            int i14 = ((max + n10) - 1) / n10;
            this.f19790e = new byte[i11 * i14];
            this.f19791f = new x(n10 * 2 * i10 * i14);
            int i15 = bVar.f25538d;
            int i16 = ((bVar.f25540f * i15) * 8) / n10;
            q0 q0Var = new q0();
            q0Var.f24667k = MimeTypes.AUDIO_RAW;
            q0Var.f24662f = i16;
            q0Var.f24663g = i16;
            q0Var.f24668l = max * 2 * i10;
            q0Var.f24679x = bVar.f25537c;
            q0Var.f24680y = i15;
            q0Var.f24681z = 2;
            this.f19793h = new r0(q0Var);
            return;
        }
        throw x1.a("Expected frames per block: " + i12 + "; got: " + n10, null);
    }

    @Override // j8.b
    public final void a(int i10, long j3) {
        this.a.d(new f(this.f19788c, this.f19789d, i10, j3));
        this.f19787b.f(this.f19793h);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:4:0x004b). Please report as a decompilation issue!!! */
    @Override // j8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(y7.m r23, long r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.a.b(y7.m, long):boolean");
    }

    @Override // j8.b
    public final void c(long j3) {
        this.f19794i = 0;
        this.f19795j = j3;
        this.f19796k = 0;
        this.f19797l = 0L;
    }

    public final void d(int i10) {
        long j3 = this.f19795j;
        long j10 = this.f19797l;
        u7.b bVar = this.f19788c;
        long M = j3 + h0.M(j10, 1000000L, bVar.f25538d);
        int i11 = i10 * 2 * bVar.f25537c;
        this.f19787b.d(M, 1, i11, this.f19796k - i11, null);
        this.f19797l += i10;
        this.f19796k -= i11;
    }
}
