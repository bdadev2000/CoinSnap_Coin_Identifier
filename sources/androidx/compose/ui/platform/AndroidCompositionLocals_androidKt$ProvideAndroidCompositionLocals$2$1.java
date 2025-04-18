package androidx.compose.ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisposableSaveableStateRegistry f16340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.f16340a = disposableSaveableStateRegistry;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.f16340a;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                DisposableSaveableStateRegistry.this.f16474a.invoke();
            }
        };
    }
}
