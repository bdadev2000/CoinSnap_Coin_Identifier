package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 f16352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(Context context, AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) {
        super(1);
        this.f16351a = context;
        this.f16352b = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Context context = this.f16351a;
        Context applicationContext = context.getApplicationContext();
        final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = this.f16352b;
        applicationContext.registerComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                context.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
            }
        };
    }
}
