package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class FragmentStore {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19803a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19804b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19805c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(Fragment fragment) {
        if (this.f19803a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f19803a) {
            this.f19803a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.f19804b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.f19800c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.f19804b.values()) {
            if (fragmentStateManager != null && (findFragmentByWho = fragmentStateManager.f19800c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f19804b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f19804b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.f19800c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f19803a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f19803a) {
            arrayList = new ArrayList(this.f19803a);
        }
        return arrayList;
    }

    public final void g(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f19800c;
        String str = fragment.mWho;
        HashMap hashMap = this.f19804b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, fragmentStateManager);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.b(fragment);
            } else {
                this.d.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f19800c;
        if (fragment.mRetainInstance) {
            this.d.f(fragment);
        }
        HashMap hashMap = this.f19804b;
        if (hashMap.get(fragment.mWho) == fragmentStateManager && ((FragmentStateManager) hashMap.put(fragment.mWho, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f19805c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
