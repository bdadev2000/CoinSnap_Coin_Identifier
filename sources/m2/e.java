package m2;

import androidx.work.a0;
import androidx.work.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends p6.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f21444l = p.g("WorkContinuationImpl");

    /* renamed from: f, reason: collision with root package name */
    public final k f21445f;

    /* renamed from: g, reason: collision with root package name */
    public final List f21446g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21447h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f21448i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f21449j;

    /* renamed from: k, reason: collision with root package name */
    public d3.g f21450k;

    public e(k kVar, List list) {
        this.f21445f = kVar;
        this.f21446g = list;
        this.f21447h = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((a0) list.get(i10)).a.toString();
            this.f21447h.add(uuid);
            this.f21448i.add(uuid);
        }
    }

    public static boolean E(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f21447h);
        HashSet F = F(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (F.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f21447h);
        return false;
    }

    public static HashSet F(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
