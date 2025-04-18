package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2166b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2167c;

    /* renamed from: d, reason: collision with root package name */
    public final h.c f2168d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2169e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f2170f;

    /* renamed from: g, reason: collision with root package name */
    public final x2.a f2171g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f2172h;

    /* renamed from: i, reason: collision with root package name */
    public final x f2173i;

    /* renamed from: j, reason: collision with root package name */
    public final j f2174j;

    public WorkerParameters(UUID uuid, h hVar, List list, h.c cVar, int i10, ExecutorService executorService, x2.a aVar, c0 c0Var, v2.o oVar, v2.n nVar) {
        this.a = uuid;
        this.f2166b = hVar;
        this.f2167c = new HashSet(list);
        this.f2168d = cVar;
        this.f2169e = i10;
        this.f2170f = executorService;
        this.f2171g = aVar;
        this.f2172h = c0Var;
        this.f2173i = oVar;
        this.f2174j = nVar;
    }
}
