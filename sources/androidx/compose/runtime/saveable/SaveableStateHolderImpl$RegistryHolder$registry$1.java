package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f14515a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.f14515a = saveableStateHolderImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.f14515a.f14506c;
        return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.a(obj) : true);
    }
}
