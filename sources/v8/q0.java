package v8;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* loaded from: classes3.dex */
public final class q0 implements y {
    public final m9.k a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.core.app.h f26253b;

    /* renamed from: c, reason: collision with root package name */
    public x7.j f26254c;

    /* renamed from: d, reason: collision with root package name */
    public ac.e f26255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26256e;

    public q0(m9.k kVar, y7.o oVar) {
        androidx.core.app.h hVar = new androidx.core.app.h(oVar, 25);
        x7.j jVar = new x7.j();
        ac.e eVar = new ac.e();
        this.a = kVar;
        this.f26253b = hVar;
        this.f26254c = jVar;
        this.f26255d = eVar;
        this.f26256e = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    @Override // v8.y
    public final a a(s7.j1 j1Var) {
        j1Var.f24453c.getClass();
        Object obj = j1Var.f24453c.f24349j;
        return new r0(j1Var, this.a, this.f26253b, this.f26254c.b(j1Var), this.f26255d, this.f26256e);
    }

    @Override // v8.y
    public final y b(ac.e eVar) {
        if (eVar != null) {
            this.f26255d = eVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // v8.y
    public final y c(x7.j jVar) {
        if (jVar != null) {
            this.f26254c = jVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
