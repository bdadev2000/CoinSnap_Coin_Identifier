package androidx.compose.runtime;

import android.view.Choreographer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f13781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f13781a = frameCallback;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DefaultChoreographerFrameClock.f13780b.removeFrameCallback(this.f13781a);
        return b0.f30125a;
    }
}
