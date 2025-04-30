package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4801a = new ArrayList();
    public final HashMap b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4802c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public r0 f4803d;

    public final void a(Fragment fragment) {
        if (!this.f4801a.contains(fragment)) {
            synchronized (this.f4801a) {
                this.f4801a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        w0 w0Var = (w0) this.b.get(str);
        if (w0Var != null) {
            return w0Var.f4797c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (w0 w0Var : this.b.values()) {
            if (w0Var != null && (findFragmentByWho = w0Var.f4797c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (w0 w0Var : this.b.values()) {
            if (w0Var != null) {
                arrayList.add(w0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (w0 w0Var : this.b.values()) {
            if (w0Var != null) {
                arrayList.add(w0Var.f4797c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f4801a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4801a) {
            arrayList = new ArrayList(this.f4801a);
        }
        return arrayList;
    }

    public final void g(w0 w0Var) {
        Fragment fragment = w0Var.f4797c;
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, w0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f4803d.e(fragment);
            } else {
                this.f4803d.j(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Added fragment to active set " + fragment);
        }
    }

    public final void h(w0 w0Var) {
        Fragment fragment = w0Var.f4797c;
        if (fragment.mRetainInstance) {
            this.f4803d.j(fragment);
        }
        HashMap hashMap = this.b;
        if (hashMap.get(fragment.mWho) == w0Var && ((w0) hashMap.put(fragment.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.f4802c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
