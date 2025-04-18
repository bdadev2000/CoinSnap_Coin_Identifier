package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f4876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2(q qVar, int i2) {
        super(2);
        this.f4876a = qVar;
        this.f4877b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f4877b | 1);
        LazySaveableStateHolderKt.a(this.f4876a, (Composer) obj, a2);
        return b0.f30125a;
    }
}
