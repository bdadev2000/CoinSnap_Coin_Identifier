package e1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2209a extends AbstractRunnableC2211c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V0.k f20024d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20025f;

    public C2209a(V0.k kVar, UUID uuid) {
        this.f20023c = 0;
        this.f20024d = kVar;
        this.f20025f = uuid;
    }

    @Override // e1.AbstractRunnableC2211c
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f20023c) {
            case 0:
                V0.k kVar = this.f20024d;
                workDatabase = kVar.f3418c;
                workDatabase.c();
                try {
                    AbstractRunnableC2211c.a(kVar, ((UUID) this.f20025f).toString());
                    workDatabase.h();
                    workDatabase.f();
                    V0.d.a(kVar.b, kVar.f3418c, kVar.f3420e);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                V0.k kVar2 = this.f20024d;
                workDatabase = kVar2.f3418c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().i((String) this.f20025f).iterator();
                    while (it.hasNext()) {
                        AbstractRunnableC2211c.a(kVar2, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    V0.d.a(kVar2.b, kVar2.f3418c, kVar2.f3420e);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    public C2209a(V0.k kVar) {
        this.f20023c = 1;
        this.f20024d = kVar;
        this.f20025f = "offline_ping_sender_work";
    }
}
