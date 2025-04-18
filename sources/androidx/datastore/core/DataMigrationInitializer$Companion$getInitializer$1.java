package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import com.google.zxing.aztec.encoder.Encoder;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$getInitializer$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f18953a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f18955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$getInitializer$1(List list, g gVar) {
        super(2, gVar);
        this.f18955c = list;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.f18955c, gVar);
        dataMigrationInitializer$Companion$getInitializer$1.f18954b = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create((InitializerApi) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f18953a;
        if (i2 == 0) {
            q.m(obj);
            InitializerApi initializerApi = (InitializerApi) this.f18954b;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.f18952a;
            this.f18953a = 1;
            if (DataMigrationInitializer.Companion.a(companion, this.f18955c, initializerApi, this) == aVar) {
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
