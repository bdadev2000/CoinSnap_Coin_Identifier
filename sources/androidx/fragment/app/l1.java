package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class l1 {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1681b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1682c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public g1 f1683d;

    public final void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        k1 k1Var = (k1) this.f1681b.get(str);
        if (k1Var != null) {
            return k1Var.f1677c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (k1 k1Var : this.f1681b.values()) {
            if (k1Var != null && (findFragmentByWho = k1Var.f1677c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (k1 k1Var : this.f1681b.values()) {
            if (k1Var != null) {
                arrayList.add(k1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (k1 k1Var : this.f1681b.values()) {
            if (k1Var != null) {
                arrayList.add(k1Var.f1677c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(k1 k1Var) {
        boolean z10;
        Fragment fragment = k1Var.f1677c;
        String str = fragment.mWho;
        HashMap hashMap = this.f1681b;
        if (hashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        hashMap.put(fragment.mWho, k1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f1683d.a(fragment);
            } else {
                this.f1683d.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Added fragment to active set " + fragment);
        }
    }

    public final void h(k1 k1Var) {
        Fragment fragment = k1Var.f1677c;
        if (fragment.mRetainInstance) {
            this.f1683d.e(fragment);
        }
        HashMap hashMap = this.f1681b;
        if (hashMap.get(fragment.mWho) == k1Var && ((k1) hashMap.put(fragment.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f1682c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
