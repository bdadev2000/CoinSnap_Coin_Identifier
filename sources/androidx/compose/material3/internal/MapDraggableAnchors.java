package androidx.compose.material3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13018a;

    public MapDraggableAnchors(Map map) {
        this.f13018a = map;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final Object a(float f2, boolean z2) {
        T next;
        Iterator<T> it = this.f13018a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f3 = z2 ? floatValue - f2 : f2 - floatValue;
                if (f3 < 0.0f) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f4 = z2 ? floatValue2 - f2 : f2 - floatValue2;
                    if (f4 < 0.0f) {
                        f4 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f3, f4) > 0) {
                        next = next2;
                        f3 = f4;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final Object b(float f2) {
        T next;
        Iterator<T> it = this.f13018a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f2 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f2 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final boolean c(Object obj) {
        return this.f13018a.containsKey(obj);
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float d() {
        Float valueOf;
        Collection values = this.f13018a.values();
        p0.a.s(values, "<this>");
        Iterator<T> it = values.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float e(Object obj) {
        Float f2 = (Float) this.f13018a.get(obj);
        if (f2 != null) {
            return f2.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return p0.a.g(this.f13018a, ((MapDraggableAnchors) obj).f13018a);
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final float f() {
        Float valueOf;
        Collection values = this.f13018a.values();
        p0.a.s(values, "<this>");
        Iterator<T> it = values.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material3.internal.DraggableAnchors
    public final int getSize() {
        return this.f13018a.size();
    }

    public final int hashCode() {
        return this.f13018a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f13018a + ')';
    }
}
