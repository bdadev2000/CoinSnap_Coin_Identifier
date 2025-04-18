package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo
/* loaded from: classes3.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1309f = new HashMap();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final SafeIterableMap.Entry a(Object obj) {
        return (SafeIterableMap.Entry) this.f1309f.get(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object b(Object obj, Object obj2) {
        SafeIterableMap.Entry a2 = a(obj);
        if (a2 != null) {
            return a2.f1314b;
        }
        HashMap hashMap = this.f1309f;
        SafeIterableMap.Entry entry = new SafeIterableMap.Entry(obj, obj2);
        this.d++;
        SafeIterableMap.Entry entry2 = this.f1311b;
        if (entry2 == null) {
            this.f1310a = entry;
            this.f1311b = entry;
        } else {
            entry2.f1315c = entry;
            entry.d = entry2;
            this.f1311b = entry;
        }
        hashMap.put(obj, entry);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object c(Object obj) {
        Object c2 = super.c(obj);
        this.f1309f.remove(obj);
        return c2;
    }

    public final Map.Entry d(Object obj) {
        HashMap hashMap = this.f1309f;
        if (hashMap.containsKey(obj)) {
            return ((SafeIterableMap.Entry) hashMap.get(obj)).d;
        }
        return null;
    }
}
