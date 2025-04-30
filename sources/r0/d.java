package R0;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.EnumC0504n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.C2475f;
import org.json.JSONArray;
import org.json.JSONObject;
import x.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f2619a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2620c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2621d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2622e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2623f;

    public static ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public l5.d a() {
        return new l5.d((JSONObject) this.b, (Date) this.f2620c, (JSONArray) this.f2621d, (JSONObject) this.f2622e, this.f2619a, (JSONArray) this.f2623f);
    }

    public void c(boolean z8) {
        int currentItem;
        Fragment fragment;
        boolean z9;
        F6.a aVar = (F6.a) this.f2623f;
        if (aVar.f1211j.isStateSaved() || ((ViewPager2) this.f2622e).getScrollState() != 0) {
            return;
        }
        f fVar = aVar.f1212k;
        if (fVar.h() != 0) {
            ArrayList arrayList = aVar.f1217r;
            if (arrayList.size() == 0 || (currentItem = ((ViewPager2) this.f2622e).getCurrentItem()) >= arrayList.size()) {
                return;
            }
            long j7 = currentItem;
            if ((j7 != this.f2619a || z8) && (fragment = (Fragment) fVar.d(null, j7)) != null && fragment.isAdded()) {
                this.f2619a = j7;
                FragmentTransaction beginTransaction = aVar.f1211j.beginTransaction();
                ArrayList arrayList2 = new ArrayList();
                Fragment fragment2 = null;
                for (int i9 = 0; i9 < fVar.h(); i9++) {
                    long e4 = fVar.e(i9);
                    Fragment fragment3 = (Fragment) fVar.i(i9);
                    if (fragment3.isAdded()) {
                        if (e4 != this.f2619a) {
                            beginTransaction.setMaxLifecycle(fragment3, EnumC0504n.f4894f);
                            C2475f c2475f = aVar.f1214o;
                            c2475f.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = ((CopyOnWriteArrayList) c2475f.f21833c).iterator();
                            if (!it.hasNext()) {
                                arrayList2.add(arrayList3);
                            } else {
                                o.v(it.next());
                                throw null;
                            }
                        } else {
                            fragment2 = fragment3;
                        }
                        if (e4 == this.f2619a) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        fragment3.setMenuVisibility(z9);
                    }
                }
                if (fragment2 != null) {
                    beginTransaction.setMaxLifecycle(fragment2, EnumC0504n.f4895g);
                    C2475f c2475f2 = aVar.f1214o;
                    c2475f2.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((CopyOnWriteArrayList) c2475f2.f21833c).iterator();
                    if (!it2.hasNext()) {
                        arrayList2.add(arrayList4);
                    } else {
                        o.v(it2.next());
                        throw null;
                    }
                }
                if (!beginTransaction.isEmpty()) {
                    beginTransaction.commitNow();
                    Collections.reverse(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        List list = (List) it3.next();
                        aVar.f1214o.getClass();
                        C2475f.l(list);
                    }
                }
            }
        }
    }
}
