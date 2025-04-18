package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f16474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f16475b;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, q0.a aVar) {
        this.f16474a = aVar;
        this.f16475b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return this.f16475b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(String str, q0.a aVar) {
        return this.f16475b.b(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map d() {
        return this.f16475b.d();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        return this.f16475b.e(str);
    }
}
