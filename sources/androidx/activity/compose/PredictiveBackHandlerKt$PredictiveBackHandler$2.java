package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 f240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$2(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) {
        super(1);
        this.f238a = onBackPressedDispatcher;
        this.f239b = lifecycleOwner;
        this.f240c = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f238a;
        LifecycleOwner lifecycleOwner = this.f239b;
        final PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = this.f240c;
        onBackPressedDispatcher.a(lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                e();
            }
        };
    }
}
