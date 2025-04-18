package s7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class c1 {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f24308b;

    /* renamed from: c, reason: collision with root package name */
    public long f24309c;

    /* renamed from: d, reason: collision with root package name */
    public float f24310d;

    /* renamed from: e, reason: collision with root package name */
    public float f24311e;

    public c1(long j3, long j10, long j11, float f10, float f11) {
        this.a = j3;
        this.f24308b = j10;
        this.f24309c = j11;
        this.f24310d = f10;
        this.f24311e = f11;
    }

    public final d1 a() {
        return new d1(this.a, this.f24308b, this.f24309c, this.f24310d, this.f24311e);
    }

    public c1() {
        this.a = C.TIME_UNSET;
        this.f24308b = C.TIME_UNSET;
        this.f24309c = C.TIME_UNSET;
        this.f24310d = -3.4028235E38f;
        this.f24311e = -3.4028235E38f;
    }

    public c1(d1 d1Var) {
        this.a = d1Var.f24319b;
        this.f24308b = d1Var.f24320c;
        this.f24309c = d1Var.f24321d;
        this.f24310d = d1Var.f24322f;
        this.f24311e = d1Var.f24323g;
    }
}
