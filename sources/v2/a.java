package v2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.k f25972d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25973f;

    public /* synthetic */ a(m2.k kVar, Object obj, int i10) {
        this.f25971c = i10;
        this.f25972d = kVar;
        this.f25973f = obj;
    }

    @Override // v2.c
    public final void b() {
        WorkDatabase workDatabase;
        int i10 = this.f25971c;
        Object obj = this.f25973f;
        m2.k kVar = this.f25972d;
        switch (i10) {
            case 0:
                workDatabase = kVar.f21460k;
                workDatabase.beginTransaction();
                try {
                    c.a(kVar, ((UUID) obj).toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    m2.d.a(kVar.f21459j, kVar.f21460k, kVar.f21462m);
                    return;
                } finally {
                }
            default:
                workDatabase = kVar.f21460k;
                workDatabase.beginTransaction();
                try {
                    Iterator it = workDatabase.h().j((String) obj).iterator();
                    while (it.hasNext()) {
                        c.a(kVar, (String) it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    m2.d.a(kVar.f21459j, kVar.f21460k, kVar.f21462m);
                    return;
                } finally {
                }
        }
    }
}
