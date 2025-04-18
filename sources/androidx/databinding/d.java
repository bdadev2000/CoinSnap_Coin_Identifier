package androidx.databinding;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class d implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1315b;

    public d(e eVar) {
        this.f1315b = eVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f1315b.f1319f.run();
    }
}
