package N7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.C2824o;

/* loaded from: classes3.dex */
public abstract class h extends i {
    public static List A(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return C2824o.b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return android.support.v4.media.session.a.w(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
