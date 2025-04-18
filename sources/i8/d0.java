package i8;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f19246d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19247e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19248f;
    public final int a = 112800;

    /* renamed from: b, reason: collision with root package name */
    public final n9.f0 f19244b = new n9.f0(0);

    /* renamed from: g, reason: collision with root package name */
    public long f19249g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f19250h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f19251i = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final n9.x f19245c = new n9.x();

    public final void a(y7.m mVar) {
        byte[] bArr = n9.h0.f22548f;
        n9.x xVar = this.f19245c;
        xVar.getClass();
        xVar.E(bArr, bArr.length);
        this.f19246d = true;
        mVar.resetPeekPosition();
    }
}
