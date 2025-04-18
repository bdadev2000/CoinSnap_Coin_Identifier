package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogWrapper f17598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$1$1(DialogWrapper dialogWrapper) {
        super(1);
        this.f17598a = dialogWrapper;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final DialogWrapper dialogWrapper = this.f17598a;
        dialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                DialogWrapper dialogWrapper2 = DialogWrapper.this;
                dialogWrapper2.dismiss();
                dialogWrapper2.d.d();
            }
        };
    }
}
