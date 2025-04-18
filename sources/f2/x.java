package f2;

import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class x {
    public static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f17664b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f17665c = new ArrayList();

    public static void a(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = f17665c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (tVar == null) {
                tVar = a;
            }
            t clone = tVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).y(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            a4.j.t(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                w wVar = new w(viewGroup, clone);
                viewGroup.addOnAttachStateChangeListener(wVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
            }
        }
    }

    public static r.b b() {
        r.b bVar;
        ThreadLocal threadLocal = f17664b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (r.b) weakReference.get()) != null) {
            return bVar;
        }
        r.b bVar2 = new r.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
