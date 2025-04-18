package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f20579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f20580c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, p pVar, int i2) {
        super(2);
        this.f20578a = navBackStackEntry;
        this.f20579b = saveableStateHolder;
        this.f20580c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        SaveableStateHolder saveableStateHolder = this.f20579b;
        p pVar = this.f20580c;
        NavBackStackEntryProviderKt.a(this.f20578a, saveableStateHolder, pVar, (Composer) obj, a2);
        return b0.f30125a;
    }
}
