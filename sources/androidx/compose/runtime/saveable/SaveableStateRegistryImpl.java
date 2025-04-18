package androidx.compose.runtime.saveable;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import b1.f0;
import e0.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final l f14523a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14524b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14525c;

    public SaveableStateRegistryImpl(Map map, l lVar) {
        this.f14523a = lVar;
        this.f14524b = map != null ? e0.z(map) : new LinkedHashMap();
        this.f14525c = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return ((Boolean) this.f14523a.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(final String str, final a aVar) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f14529a;
        int length = str.length();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = true;
                break;
            }
            if (!p0.a.o0(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        if (!(!z2)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        LinkedHashMap linkedHashMap = this.f14525c;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(str, obj);
        }
        ((List) obj).add(aVar);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public final void unregister() {
                SaveableStateRegistryImpl saveableStateRegistryImpl = SaveableStateRegistryImpl.this;
                LinkedHashMap linkedHashMap2 = saveableStateRegistryImpl.f14525c;
                String str2 = str;
                List list = (List) linkedHashMap2.remove(str2);
                if (list != null) {
                    list.remove(aVar);
                }
                if (list == null || !(!list.isEmpty())) {
                    return;
                }
                saveableStateRegistryImpl.f14525c.put(str2, list);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map d() {
        LinkedHashMap z2 = e0.z(this.f14524b);
        for (Map.Entry entry : this.f14525c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!a(invoke)) {
                        throw new IllegalStateException(RememberSaveableKt.a(invoke).toString());
                    }
                    z2.put(str, f0.b(invoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object invoke2 = ((a) list.get(i2)).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException(RememberSaveableKt.a(invoke2).toString());
                    }
                    arrayList.add(invoke2);
                }
                z2.put(str, arrayList);
            }
        }
        return z2;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        LinkedHashMap linkedHashMap = this.f14524b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
