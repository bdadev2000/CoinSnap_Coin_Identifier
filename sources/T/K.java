package T;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f2865a;
    public final Class b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2867d;

    public K(int i9, Class cls, int i10, int i11) {
        this.f2865a = i9;
        this.b = cls;
        this.f2867d = i10;
        this.f2866c = i11;
    }

    public abstract Object a(View view);

    public abstract void b(View view, Object obj);

    public final Object c(View view) {
        if (Build.VERSION.SDK_INT >= this.f2866c) {
            return a(view);
        }
        Object tag = view.getTag(this.f2865a);
        if (this.b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void d(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f2866c) {
            b(view, obj);
        } else if (e(c(view), obj)) {
            ViewCompat.ensureAccessibilityDelegateCompat(view);
            view.setTag(this.f2865a, obj);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.f2867d);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
