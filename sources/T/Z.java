package T;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2873d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2874a;
    public SparseArray b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2875c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2874a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a6 = a(viewGroup.getChildAt(childCount));
                    if (a6 != null) {
                        return a6;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                com.mbridge.msdk.foundation.entity.o.v(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
