package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BackHandlerKt$BackHandler$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(1);
        this.f213a = onBackPressedDispatcher;
        this.f214b = lifecycleOwner;
        this.f215c = backHandlerKt$BackHandler$backCallback$1$1;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f213a;
        LifecycleOwner lifecycleOwner = this.f214b;
        final BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = this.f215c;
        onBackPressedDispatcher.a(lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                e();
            }
        };
    }
}
