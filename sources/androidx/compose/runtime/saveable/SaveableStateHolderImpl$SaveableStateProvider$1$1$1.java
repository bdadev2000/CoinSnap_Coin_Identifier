package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SaveableStateHolderImpl$SaveableStateProvider$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f14516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f14518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1$1(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        super(1);
        this.f14516a = saveableStateHolderImpl;
        this.f14517b = obj;
        this.f14518c = registryHolder;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final SaveableStateHolderImpl saveableStateHolderImpl = this.f14516a;
        LinkedHashMap linkedHashMap = saveableStateHolderImpl.f14505b;
        final Object obj2 = this.f14517b;
        if (!(!linkedHashMap.containsKey(obj2))) {
            throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
        }
        saveableStateHolderImpl.f14504a.remove(obj2);
        LinkedHashMap linkedHashMap2 = saveableStateHolderImpl.f14505b;
        final SaveableStateHolderImpl.RegistryHolder registryHolder = this.f14518c;
        linkedHashMap2.put(obj2, registryHolder);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                Map map = saveableStateHolderImpl2.f14504a;
                SaveableStateHolderImpl.RegistryHolder registryHolder2 = SaveableStateHolderImpl.RegistryHolder.this;
                if (registryHolder2.f14513b) {
                    Map d = ((SaveableStateRegistryImpl) registryHolder2.f14514c).d();
                    boolean isEmpty = d.isEmpty();
                    Object obj3 = registryHolder2.f14512a;
                    if (isEmpty) {
                        map.remove(obj3);
                    } else {
                        map.put(obj3, d);
                    }
                }
                saveableStateHolderImpl2.f14505b.remove(obj2);
            }
        };
    }
}
