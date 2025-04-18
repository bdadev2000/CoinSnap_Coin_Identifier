package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.u;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.a;

/* loaded from: classes2.dex */
public final class MutablePreferences extends Preferences {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19088a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19089b;

    public MutablePreferences(Map map, boolean z2) {
        a.s(map, "preferencesMap");
        this.f19088a = map;
        this.f19089b = new AtomicBoolean(z2);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Map a() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.f19088a);
        a.r(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final Object b(Preferences.Key key) {
        a.s(key, SDKConstants.PARAM_KEY);
        return this.f19088a.get(key);
    }

    public final void c() {
        if (!(!this.f19089b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void d(Preferences.Key key, Object obj) {
        a.s(key, SDKConstants.PARAM_KEY);
        c();
        Map map = this.f19088a;
        if (obj == null) {
            c();
            map.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                map.put(key, obj);
                return;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(u.e1((Iterable) obj));
            a.r(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, unmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutablePreferences)) {
            return false;
        }
        return a.g(this.f19088a, ((MutablePreferences) obj).f19088a);
    }

    public final int hashCode() {
        return this.f19088a.hashCode();
    }

    public final String toString() {
        return u.K0(this.f19088a.entrySet(), ",\n", "{\n", "\n}", MutablePreferences$toString$1.f19090a, 24);
    }

    public /* synthetic */ MutablePreferences(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
