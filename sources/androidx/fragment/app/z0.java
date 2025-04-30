package androidx.fragment.app;

import M0.C0223n;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f4814a = new Object();
    public static final G0 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.fragment.app.E0] */
    static {
        G0 g02 = null;
        try {
            g02 = (G0) C0223n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = g02;
    }

    public static final void a(int i9, List list) {
        G7.j.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i9);
        }
    }
}
