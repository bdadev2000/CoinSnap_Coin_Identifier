package androidx.recyclerview.widget;

import android.database.Observable;

/* loaded from: classes.dex */
public final class k0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void c(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
        }
    }

    public final void d(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
        }
    }

    public final void e(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
        }
    }

    public final void f(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((l0) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
