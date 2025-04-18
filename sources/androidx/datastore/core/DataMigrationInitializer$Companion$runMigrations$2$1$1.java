package androidx.datastore.core;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f18966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataMigration f18967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration dataMigration, g gVar) {
        super(1, gVar);
        this.f18967b = dataMigration;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.f18967b, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f18966a;
        if (i2 == 0) {
            q.m(obj);
            this.f18966a = 1;
            if (this.f18967b.cleanUp() == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
