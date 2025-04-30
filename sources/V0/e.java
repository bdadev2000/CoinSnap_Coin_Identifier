package V0;

import androidx.work.o;
import androidx.work.p;
import com.facebook.appevents.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: o, reason: collision with root package name */
    public static final String f3401o = o.g("WorkContinuationImpl");

    /* renamed from: j, reason: collision with root package name */
    public final k f3402j;

    /* renamed from: k, reason: collision with root package name */
    public final List f3403k;
    public final ArrayList l;
    public final ArrayList m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f3404n;

    public e(k kVar, List list) {
        this.f3402j = kVar;
        this.f3403k = list;
        this.l = new ArrayList(list.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            String uuid = ((p) list.get(i9)).f5248a.toString();
            this.l.add(uuid);
            this.m.add(uuid);
        }
    }

    public static HashSet x(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
