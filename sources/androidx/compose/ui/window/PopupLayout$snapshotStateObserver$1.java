package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class PopupLayout$snapshotStateObserver$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$snapshotStateObserver$1(PopupLayout popupLayout) {
        super(1);
        this.f17697a = popupLayout;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final q0.a aVar = (q0.a) obj;
        PopupLayout popupLayout = this.f17697a;
        Handler handler = popupLayout.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
        } else {
            Handler handler2 = popupLayout.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.a.this.invoke();
                    }
                });
            }
        }
        return b0.f30125a;
    }
}
