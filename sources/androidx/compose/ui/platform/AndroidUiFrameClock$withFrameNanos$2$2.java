package androidx.compose.ui.platform;

import android.view.Choreographer;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidUiFrameClock$withFrameNanos$2$2 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidUiFrameClock f16389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f16390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f16389a = androidUiFrameClock;
        this.f16390b = frameCallback;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f16389a.f16385a.removeFrameCallback(this.f16390b);
        return b0.f30125a;
    }
}
