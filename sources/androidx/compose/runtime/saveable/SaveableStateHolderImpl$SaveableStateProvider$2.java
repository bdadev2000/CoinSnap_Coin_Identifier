package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SaveableStateHolderImpl$SaveableStateProvider$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f14519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14521c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, p pVar, int i2) {
        super(2);
        this.f14519a = saveableStateHolderImpl;
        this.f14520b = obj;
        this.f14521c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        Object obj3 = this.f14520b;
        p pVar = this.f14521c;
        this.f14519a.f(obj3, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
