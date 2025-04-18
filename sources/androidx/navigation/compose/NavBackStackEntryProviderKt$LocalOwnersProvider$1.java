package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class NavBackStackEntryProviderKt$LocalOwnersProvider$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f20576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f20577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$1(SaveableStateHolder saveableStateHolder, p pVar) {
        super(2);
        this.f20576a = saveableStateHolder;
        this.f20577b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            NavBackStackEntryProviderKt.b(this.f20576a, this.f20577b, composer, 0);
        }
        return b0.f30125a;
    }
}
