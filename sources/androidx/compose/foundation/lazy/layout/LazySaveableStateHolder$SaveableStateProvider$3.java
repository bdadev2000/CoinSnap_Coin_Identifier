package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazySaveableStateHolder$SaveableStateProvider$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazySaveableStateHolder f4871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4873c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$3(LazySaveableStateHolder lazySaveableStateHolder, Object obj, p pVar, int i2) {
        super(2);
        this.f4871a = lazySaveableStateHolder;
        this.f4872b = obj;
        this.f4873c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        Object obj3 = this.f4872b;
        p pVar = this.f4873c;
        this.f4871a.f(obj3, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
