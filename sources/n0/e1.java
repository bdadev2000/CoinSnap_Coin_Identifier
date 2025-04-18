package n0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f22265d = new ArrayList();
    public WeakHashMap a = null;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f22266b = null;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f22267c = null;

    public static void b(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            a4.j.t(arrayList.get(size));
            throw null;
        }
    }

    public final View a(View view) {
        View a;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a = a(viewGroup.getChildAt(childCount));
                    }
                } while (a == null);
                return a;
            }
            b(view);
            return null;
        }
        return null;
    }
}
