package androidx.compose.ui.platform;

import android.view.KeyEvent;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidComposeView$dispatchKeyEvent$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent f16248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$dispatchKeyEvent$1(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        super(0);
        this.f16247a = androidComposeView;
        this.f16248b = keyEvent;
    }

    @Override // q0.a
    public final Object invoke() {
        boolean dispatchKeyEvent;
        dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent(this.f16248b);
        return Boolean.valueOf(dispatchKeyEvent);
    }
}
