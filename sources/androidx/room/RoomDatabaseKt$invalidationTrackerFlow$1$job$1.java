package androidx.room;

import b1.d0;
import d0.b0;
import d1.q;
import h0.g;
import j0.i;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.p;

@j0.e(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RoomDatabaseKt$invalidationTrackerFlow$1$job$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f21348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f21349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 f21350c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f21351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String[] f21352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f21353h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1$job$1(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1, boolean z2, q qVar, String[] strArr, AtomicBoolean atomicBoolean, g gVar) {
        super(2, gVar);
        this.f21349b = roomDatabase;
        this.f21350c = roomDatabaseKt$invalidationTrackerFlow$1$observer$1;
        this.d = z2;
        this.f21351f = qVar;
        this.f21352g = strArr;
        this.f21353h = atomicBoolean;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.f21349b, this.f21350c, this.d, this.f21351f, this.f21352g, this.f21353h, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((RoomDatabaseKt$invalidationTrackerFlow$1$job$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f21348a;
        RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1 = this.f21350c;
        RoomDatabase roomDatabase = this.f21349b;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
                throw new RuntimeException();
            }
            kotlin.jvm.internal.q.m(obj);
            roomDatabase.getInvalidationTracker().a(roomDatabaseKt$invalidationTrackerFlow$1$observer$1);
            if (this.d) {
                ((d1.p) this.f21351f).b(e0.q.q0(this.f21352g));
            }
            this.f21353h.set(false);
            this.f21348a = 1;
            p0.a.i(this);
            return aVar;
        } catch (Throwable th) {
            roomDatabase.getInvalidationTracker().c(roomDatabaseKt$invalidationTrackerFlow$1$observer$1);
            throw th;
        }
    }
}
