package M0;

import android.view.ViewGroup;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final C0210a f1836a;
    public static final ThreadLocal b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1837c;

    /* JADX WARN: Type inference failed for: r0v0, types: [M0.a, M0.C] */
    static {
        ?? c9 = new C();
        c9.f1840H = false;
        c9.N(new C0217h(2));
        c9.N(new w());
        c9.N(new C0217h(1));
        f1836a = c9;
        b = new ThreadLocal();
        f1837c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, M0.z] */
    public static void a(ViewGroup viewGroup, w wVar) {
        ArrayList arrayList = f1837c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (wVar == null) {
                wVar = f1836a;
            }
            w clone = wVar.clone();
            c(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.b = clone;
            obj.f1941c = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [x.l, java.lang.Object, x.b] */
    public static x.b b() {
        x.b bVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (x.b) weakReference.get()) != null) {
            return bVar;
        }
        ?? lVar = new x.l();
        threadLocal.set(new WeakReference(lVar));
        return lVar;
    }

    public static void c(ViewGroup viewGroup, w wVar) {
        ArrayList arrayList = (ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((w) it.next()).y(viewGroup);
            }
        }
        if (wVar != null) {
            wVar.h(viewGroup, true);
        }
        com.mbridge.msdk.foundation.entity.o.v(viewGroup.getTag(R.id.transition_current_scene));
    }
}
