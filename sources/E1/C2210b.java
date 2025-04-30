package e1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2210b extends AbstractRunnableC2211c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0.k f20026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20027d = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f20028f = false;

    public C2210b(V0.k kVar) {
        this.f20026c = kVar;
    }

    @Override // e1.AbstractRunnableC2211c
    public final void b() {
        V0.k kVar = this.f20026c;
        WorkDatabase workDatabase = kVar.f3418c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().h(this.f20027d).iterator();
            while (it.hasNext()) {
                AbstractRunnableC2211c.a(kVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f20028f) {
                V0.d.a(kVar.b, kVar.f3418c, kVar.f3420e);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
