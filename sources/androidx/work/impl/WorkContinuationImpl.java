package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes3.dex */
public class WorkContinuationImpl extends WorkContinuation {

    /* renamed from: j, reason: collision with root package name */
    public static final String f21940j = Logger.e("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f21941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21942b;

    /* renamed from: c, reason: collision with root package name */
    public final ExistingWorkPolicy f21943c;
    public final List d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f21944f;

    /* renamed from: g, reason: collision with root package name */
    public final List f21945g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21946h;

    /* renamed from: i, reason: collision with root package name */
    public OperationImpl f21947i;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, List list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.f21870a;
        this.f21941a = workManagerImpl;
        this.f21942b = null;
        this.f21943c = existingWorkPolicy;
        this.d = list;
        this.f21945g = null;
        this.e = new ArrayList(list.size());
        this.f21944f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String uuid = ((WorkRequest) list.get(i2)).f21904a.toString();
            this.e.add(uuid);
            this.f21944f.add(uuid);
        }
    }

    public static boolean a(WorkContinuationImpl workContinuationImpl, HashSet hashSet) {
        hashSet.addAll(workContinuationImpl.e);
        HashSet b2 = b(workContinuationImpl);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (b2.contains((String) it.next())) {
                return true;
            }
        }
        List list = workContinuationImpl.f21945g;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (a((WorkContinuationImpl) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(workContinuationImpl.e);
        return false;
    }

    public static HashSet b(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List list = workContinuationImpl.f21945g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((WorkContinuationImpl) it.next()).e);
            }
        }
        return hashSet;
    }
}
