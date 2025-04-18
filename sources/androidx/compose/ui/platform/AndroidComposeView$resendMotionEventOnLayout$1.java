package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.f16258a = androidComposeView;
    }

    @Override // q0.a
    public final Object invoke() {
        int actionMasked;
        AndroidComposeView androidComposeView = this.f16258a;
        MotionEvent motionEvent = androidComposeView.f16223q0;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            androidComposeView.f16225r0 = SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.f16231u0);
        }
        return b0.f30125a;
    }
}
