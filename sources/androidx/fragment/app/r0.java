package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 extends androidx.lifecycle.b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f4775i = new q0(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4778e;
    public final HashMap b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4776c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4777d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4779f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4780g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4781h = false;

    public r0(boolean z8) {
        this.f4778e = z8;
    }

    @Override // androidx.lifecycle.b0
    public final void d() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "onCleared called for " + this);
        }
        this.f4779f = true;
    }

    public final void e(Fragment fragment) {
        if (this.f4781h) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Updating retained Fragments: Added " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.b.equals(r0Var.b) && this.f4776c.equals(r0Var.f4776c) && this.f4777d.equals(r0Var.f4777d)) {
            return true;
        }
        return false;
    }

    public final void f(Fragment fragment, boolean z8) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Clearing non-config state for " + fragment);
        }
        h(fragment.mWho, z8);
    }

    public final void g(String str, boolean z8) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z8);
    }

    public final void h(String str, boolean z8) {
        HashMap hashMap = this.f4776c;
        r0 r0Var = (r0) hashMap.get(str);
        if (r0Var != null) {
            if (z8) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r0Var.f4776c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r0Var.g((String) it.next(), true);
                }
            }
            r0Var.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f4777d;
        androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) hashMap2.get(str);
        if (f0Var != null) {
            f0Var.a();
            hashMap2.remove(str);
        }
    }

    public final int hashCode() {
        return this.f4777d.hashCode() + ((this.f4776c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final C0480o0 i() {
        HashMap hashMap = this.b;
        boolean isEmpty = hashMap.isEmpty();
        HashMap hashMap2 = this.f4776c;
        HashMap hashMap3 = this.f4777d;
        if (isEmpty && hashMap2.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            C0480o0 i9 = ((r0) entry.getValue()).i();
            if (i9 != null) {
                hashMap4.put((String) entry.getKey(), i9);
            }
        }
        this.f4780g = true;
        if (hashMap.isEmpty() && hashMap4.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        return new C0480o0(new ArrayList(hashMap.values()), hashMap4, new HashMap(hashMap3));
    }

    public final void j(Fragment fragment) {
        if (this.f4781h) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(fragment.mWho) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final void k(C0480o0 c0480o0) {
        HashMap hashMap = this.b;
        hashMap.clear();
        HashMap hashMap2 = this.f4776c;
        hashMap2.clear();
        HashMap hashMap3 = this.f4777d;
        hashMap3.clear();
        if (c0480o0 != null) {
            Collection<Fragment> collection = c0480o0.f4746a;
            if (collection != null) {
                for (Fragment fragment : collection) {
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
            Map map = c0480o0.b;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    r0 r0Var = new r0(this.f4778e);
                    r0Var.k((C0480o0) entry.getValue());
                    hashMap2.put((String) entry.getKey(), r0Var);
                }
            }
            Map map2 = c0480o0.f4747c;
            if (map2 != null) {
                hashMap3.putAll(map2);
            }
        }
        this.f4780g = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4776c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4777d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
