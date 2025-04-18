package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends a {
    public final HashSet a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1311b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1312c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.a
    public final e b(View view, int i10) {
        Iterator it = this.f1311b.iterator();
        while (it.hasNext()) {
            e b3 = ((a) it.next()).b(view, i10);
            if (b3 != null) {
                return b3;
            }
        }
        if (e()) {
            return b(view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final e c(View[] viewArr, int i10) {
        Iterator it = this.f1311b.iterator();
        while (it.hasNext()) {
            e c10 = ((a) it.next()).c(viewArr, i10);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(viewArr, i10);
        }
        return null;
    }

    public final void d(a aVar) {
        if (this.a.add(aVar.getClass())) {
            this.f1311b.add(aVar);
            Iterator it = aVar.a().iterator();
            while (it.hasNext()) {
                d((a) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1312c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (a.class.isAssignableFrom(cls)) {
                    d((a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            } catch (InstantiationException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            }
        }
        return z10;
    }
}
