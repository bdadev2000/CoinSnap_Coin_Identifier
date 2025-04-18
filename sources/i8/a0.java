package i8;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class a0 implements y7.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f19207e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19208f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19209g;

    /* renamed from: h, reason: collision with root package name */
    public long f19210h;

    /* renamed from: i, reason: collision with root package name */
    public b8.a f19211i;

    /* renamed from: j, reason: collision with root package name */
    public y7.n f19212j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19213k;
    public final n9.f0 a = new n9.f0(0);

    /* renamed from: c, reason: collision with root package name */
    public final n9.x f19205c = new n9.x(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f19204b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f19206d = new y();

    @Override // y7.l
    public final void a(y7.n nVar) {
        this.f19212j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r17, y7.p r18) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.a0.b(y7.m, y7.p):int");
    }

    @Override // y7.l
    public final boolean d(y7.m mVar) {
        byte[] bArr = new byte[14];
        y7.h hVar = (y7.h) mVar;
        hVar.peekFully(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.advancePeekPosition(bArr[13] & 7, false);
        hVar.peekFully(bArr, 0, 3, false);
        if (1 != (((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8) | (bArr[2] & UByte.MAX_VALUE))) {
            return false;
        }
        return true;
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        long j11;
        boolean z10;
        n9.f0 f0Var = this.a;
        synchronized (f0Var) {
            j11 = f0Var.f22536b;
        }
        boolean z11 = true;
        if (j11 == C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c10 = f0Var.c();
            if (c10 == C.TIME_UNSET || c10 == 0 || c10 == j10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            f0Var.d(j10);
        }
        b8.a aVar = this.f19211i;
        if (aVar != null) {
            aVar.c(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f19204b;
            if (i10 < sparseArray.size()) {
                z zVar = (z) sparseArray.valueAt(i10);
                zVar.f19496f = false;
                zVar.a.seek();
                i10++;
            } else {
                return;
            }
        }
    }
}
