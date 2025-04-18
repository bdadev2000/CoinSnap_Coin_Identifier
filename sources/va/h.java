package va;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import db.s;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes3.dex */
public final class h implements db.d {

    /* renamed from: c, reason: collision with root package name */
    public static final h f26397c = new h(0);

    /* renamed from: d, reason: collision with root package name */
    public static final h f26398d = new h(1);

    /* renamed from: f, reason: collision with root package name */
    public static final h f26399f = new h(2);

    /* renamed from: g, reason: collision with root package name */
    public static final h f26400g = new h(3);

    /* renamed from: h, reason: collision with root package name */
    public static final h f26401h = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public static final h f26402i = new h(6);

    /* renamed from: j, reason: collision with root package name */
    public static final h f26403j = new h(7);

    /* renamed from: k, reason: collision with root package name */
    public static final h f26404k = new h(8);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26405b;

    public /* synthetic */ h(int i10) {
        this.f26405b = i10;
    }

    public final CoroutineDispatcher a(ob.c cVar) {
        switch (this.f26405b) {
            case 0:
                Object e2 = cVar.e(new s(cb.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e2);
            case 1:
                Object e10 = cVar.e(new s(cb.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e10);
            case 2:
                Object e11 = cVar.e(new s(cb.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e11);
            case 3:
                Object e12 = cVar.e(new s(cb.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e12);
            case 4:
            default:
                Object e13 = cVar.e(new s(cb.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e13);
            case 5:
                Object e14 = cVar.e(new s(cb.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e14, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e14);
            case 6:
                Object e15 = cVar.e(new s(cb.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e15, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e15);
            case 7:
                Object e16 = cVar.e(new s(cb.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e16, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return ExecutorsKt.from((Executor) e16);
        }
    }

    @Override // db.d
    public final Object c(ob.c cVar) {
        switch (this.f26405b) {
            case 0:
                return a(cVar);
            case 1:
                return a(cVar);
            case 2:
                return a(cVar);
            case 3:
                return a(cVar);
            case 4:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
            case 5:
                return a(cVar);
            case 6:
                return a(cVar);
            case 7:
                return a(cVar);
            default:
                return a(cVar);
        }
    }
}
