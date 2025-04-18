package v2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2.k f25974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25975d = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25976f = false;

    public b(m2.k kVar) {
        this.f25974c = kVar;
    }

    @Override // v2.c
    public final void b() {
        m2.k kVar = this.f25974c;
        WorkDatabase workDatabase = kVar.f21460k;
        workDatabase.beginTransaction();
        try {
            Iterator it = workDatabase.h().i(this.f25975d).iterator();
            while (it.hasNext()) {
                c.a(kVar, (String) it.next());
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (this.f25976f) {
                m2.d.a(kVar.f21459j, kVar.f21460k, kVar.f21462m);
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
