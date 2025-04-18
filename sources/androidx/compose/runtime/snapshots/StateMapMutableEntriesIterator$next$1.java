package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Map;
import r0.d;

/* loaded from: classes2.dex */
public final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<Object, Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14626a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StateMapMutableEntriesIterator f14628c;

    public StateMapMutableEntriesIterator$next$1(StateMapMutableEntriesIterator stateMapMutableEntriesIterator) {
        this.f14628c = stateMapMutableEntriesIterator;
        Map.Entry entry = stateMapMutableEntriesIterator.d;
        p0.a.p(entry);
        this.f14626a = entry.getKey();
        Map.Entry entry2 = stateMapMutableEntriesIterator.d;
        p0.a.p(entry2);
        this.f14627b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14626a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14627b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        StateMapMutableEntriesIterator stateMapMutableEntriesIterator = this.f14628c;
        if (stateMapMutableEntriesIterator.f14629a.b().d != stateMapMutableEntriesIterator.f14631c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f14627b;
        stateMapMutableEntriesIterator.f14629a.put(this.f14626a, obj);
        this.f14627b = obj;
        return obj2;
    }
}
