package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidComposeView$snapshotObserver$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f16261a = androidComposeView;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        q0.a aVar = (q0.a) obj;
        AndroidComposeView androidComposeView = this.f16261a;
        Handler handler = androidComposeView.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
        } else {
            Handler handler2 = androidComposeView.getHandler();
            if (handler2 != null) {
                handler2.post(new e(aVar, 0));
            }
        }
        return b0.f30125a;
    }
}
