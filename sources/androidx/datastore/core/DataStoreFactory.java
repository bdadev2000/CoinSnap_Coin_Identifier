package androidx.datastore.core;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b1.d0;
import b1.f0;
import java.util.List;
import q0.a;

/* loaded from: classes3.dex */
public final class DataStoreFactory {
    /* JADX WARN: Multi-variable type inference failed */
    public static SingleProcessDataStore a(ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, d0 d0Var, a aVar) {
        p0.a.s(list, "migrations");
        p0.a.s(d0Var, "scope");
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler2 = new Object();
        }
        return new SingleProcessDataStore(aVar, f0.u(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), replaceFileCorruptionHandler2, d0Var);
    }
}
