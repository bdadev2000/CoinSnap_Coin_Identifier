package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavBackStackEntryProviderKt$SaveableStateProvider$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f20581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f20582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$SaveableStateProvider$1(SaveableStateHolder saveableStateHolder, p pVar, int i2) {
        super(2);
        this.f20581a = saveableStateHolder;
        this.f20582b = pVar;
        this.f20583c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f20583c | 1);
        NavBackStackEntryProviderKt.b(this.f20581a, this.f20582b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
