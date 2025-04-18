package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import e0.x;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f4878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1(SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.f4878a = saveableStateRegistry;
    }

    @Override // q0.a
    public final Object invoke() {
        return new LazySaveableStateHolder(this.f4878a, x.f30219a);
    }
}
