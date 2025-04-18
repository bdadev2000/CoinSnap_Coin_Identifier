package androidx.compose.ui.platform;

import android.view.Choreographer;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidUiFrameClock$withFrameNanos$2$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f16387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f16388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f16387a = androidUiDispatcher;
        this.f16388b = frameCallback;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidUiDispatcher androidUiDispatcher = this.f16387a;
        Choreographer.FrameCallback frameCallback = this.f16388b;
        synchronized (androidUiDispatcher.f16375f) {
            androidUiDispatcher.f16377h.remove(frameCallback);
        }
        return b0.f30125a;
    }
}
