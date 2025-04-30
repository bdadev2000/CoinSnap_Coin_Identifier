package androidx.databinding;

import android.util.Log;
import android.view.View;
import d0.AbstractC2154a;
import d0.AbstractC2158e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC2154a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f4491a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4492c = new CopyOnWriteArrayList();

    @Override // d0.AbstractC2154a
    public final AbstractC2158e b(View view, int i9) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            AbstractC2158e b = ((AbstractC2154a) it.next()).b(view, i9);
            if (b != null) {
                return b;
            }
        }
        if (e()) {
            return b(view, i9);
        }
        return null;
    }

    @Override // d0.AbstractC2154a
    public final AbstractC2158e c(View[] viewArr, int i9) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            AbstractC2158e c9 = ((AbstractC2154a) it.next()).c(viewArr, i9);
            if (c9 != null) {
                return c9;
            }
        }
        if (e()) {
            return c(viewArr, i9);
        }
        return null;
    }

    public final void d(AbstractC2154a abstractC2154a) {
        if (this.f4491a.add(abstractC2154a.getClass())) {
            this.b.add(abstractC2154a);
            Iterator it = abstractC2154a.a().iterator();
            while (it.hasNext()) {
                d((AbstractC2154a) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4492c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC2154a.class.isAssignableFrom(cls)) {
                    d((AbstractC2154a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z8 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e4) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e4);
            } catch (InstantiationException e9) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e9);
            }
        }
        return z8;
    }
}
