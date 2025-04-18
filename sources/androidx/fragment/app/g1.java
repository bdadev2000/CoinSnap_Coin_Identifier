package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g1 extends androidx.lifecycle.x0 {

    /* renamed from: h, reason: collision with root package name */
    public static final f1 f1636h = new f1(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1639d;
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1637b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1638c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1640e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1641f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1642g = false;

    public g1(boolean z10) {
        this.f1639d = z10;
    }

    public final void a(Fragment fragment) {
        if (this.f1642g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.a;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void b(Fragment fragment) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Clearing non-config state for " + fragment);
        }
        c(fragment.mWho);
    }

    public final void c(String str) {
        HashMap hashMap = this.f1637b;
        g1 g1Var = (g1) hashMap.get(str);
        if (g1Var != null) {
            g1Var.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1638c;
        androidx.lifecycle.d1 d1Var = (androidx.lifecycle.d1) hashMap2.get(str);
        if (d1Var != null) {
            d1Var.a();
            hashMap2.remove(str);
        }
    }

    public final d1 d() {
        HashMap hashMap = this.a;
        boolean isEmpty = hashMap.isEmpty();
        HashMap hashMap2 = this.f1637b;
        HashMap hashMap3 = this.f1638c;
        if (isEmpty && hashMap2.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            d1 d10 = ((g1) entry.getValue()).d();
            if (d10 != null) {
                hashMap4.put((String) entry.getKey(), d10);
            }
        }
        this.f1641f = true;
        if (hashMap.isEmpty() && hashMap4.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        return new d1(new ArrayList(hashMap.values()), hashMap4, new HashMap(hashMap3));
    }

    public final void e(Fragment fragment) {
        boolean z10;
        if (this.f1642g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.a.remove(fragment.mWho) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1.class != obj.getClass()) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.a.equals(g1Var.a) && this.f1637b.equals(g1Var.f1637b) && this.f1638c.equals(g1Var.f1638c)) {
            return true;
        }
        return false;
    }

    public final void f(d1 d1Var) {
        HashMap hashMap = this.a;
        hashMap.clear();
        HashMap hashMap2 = this.f1637b;
        hashMap2.clear();
        HashMap hashMap3 = this.f1638c;
        hashMap3.clear();
        if (d1Var != null) {
            Collection<Fragment> collection = d1Var.a;
            if (collection != null) {
                for (Fragment fragment : collection) {
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
            Map map = d1Var.f1607b;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    g1 g1Var = new g1(this.f1639d);
                    g1Var.f((d1) entry.getValue());
                    hashMap2.put((String) entry.getKey(), g1Var);
                }
            }
            Map map2 = d1Var.f1608c;
            if (map2 != null) {
                hashMap3.putAll(map2);
            }
        }
        this.f1641f = false;
    }

    public final int hashCode() {
        return this.f1638c.hashCode() + ((this.f1637b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.x0
    public final void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "onCleared called for " + this);
        }
        this.f1640e = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f1637b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f1638c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
