package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f16757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(CancellationSignal cancellationSignal) {
        super(1);
        this.f16757a = cancellationSignal;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (((Throwable) obj) != null) {
            this.f16757a.cancel();
        }
        return b0.f30125a;
    }
}
