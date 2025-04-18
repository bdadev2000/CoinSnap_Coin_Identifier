package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import b1.a2;
import b1.w1;
import g1.f;
import java.util.function.Consumer;
import kotlin.jvm.internal.e;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsNode f16736a;

    /* renamed from: b, reason: collision with root package name */
    public final IntRect f16737b;

    /* renamed from: c, reason: collision with root package name */
    public final ScrollCaptureSessionListener f16738c;
    public final f d;
    public final RelativeScroller e;

    /* loaded from: classes2.dex */
    public interface ScrollCaptureSessionListener {
        void a();

        void b();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, f fVar, ScrollCaptureSessionListener scrollCaptureSessionListener) {
        this.f16736a = semanticsNode;
        this.f16737b = intRect;
        this.f16738c = scrollCaptureSessionListener;
        this.d = new f(fVar.f30606a.u(DisableAnimationMotionDurationScale.f16758a));
        this.e = new RelativeScroller(new ComposeScrollCaptureCallback$scrollTracker$1(this, null), intRect.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r11, android.view.ScrollCaptureSession r12, androidx.compose.ui.unit.IntRect r13, h0.g r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.a(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, android.view.ScrollCaptureSession, androidx.compose.ui.unit.IntRect, h0.g):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        e.v(this.d, w1.f22388b, 0, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final a2 v2 = e.v(this.d, null, 0, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null), 3);
        v2.g0(new ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.a
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                v2.a(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(RectHelper_androidKt.b(this.f16737b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.e.f16761c = 0.0f;
        this.f16738c.a();
        runnable.run();
    }
}
