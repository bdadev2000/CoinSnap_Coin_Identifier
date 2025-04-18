package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazySaveableStateHolder$SaveableStateProvider$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazySaveableStateHolder f4869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$2$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.f4869a = lazySaveableStateHolder;
        this.f4870b = obj;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final LazySaveableStateHolder lazySaveableStateHolder = this.f4869a;
        LinkedHashSet linkedHashSet = lazySaveableStateHolder.f4863c;
        final Object obj2 = this.f4870b;
        linkedHashSet.remove(obj2);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                LazySaveableStateHolder.this.f4863c.add(obj2);
            }
        };
    }
}
