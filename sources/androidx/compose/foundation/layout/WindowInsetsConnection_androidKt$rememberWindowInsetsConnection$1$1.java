package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import androidx.compose.runtime.DisposableEffectResult;
import b1.h1;
import b1.k;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsNestedScrollConnection f4136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        super(1);
        this.f4136a = windowInsetsNestedScrollConnection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4136a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Insets currentInsets;
                Insets hiddenStateInsets;
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = WindowInsetsNestedScrollConnection.this;
                k kVar = windowInsetsNestedScrollConnection2.f4169k;
                if (kVar != null) {
                    kVar.m(null, WindowInsetsNestedScrollConnection$dispose$1.f4171a);
                }
                h1 h1Var = windowInsetsNestedScrollConnection2.f4168j;
                if (h1Var != null) {
                    h1Var.a(null);
                }
                WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection2.f4164f;
                if (windowInsetsAnimationController != null) {
                    currentInsets = windowInsetsAnimationController.getCurrentInsets();
                    hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                    windowInsetsAnimationController.finish(!p0.a.g(currentInsets, hiddenStateInsets));
                }
            }
        };
    }
}
