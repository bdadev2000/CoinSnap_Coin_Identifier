package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b1.d0;
import java.util.List;
import q0.a;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory {
    public static PreferenceDataStore a(ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, d0 d0Var, a aVar) {
        p0.a.s(list, "migrations");
        p0.a.s(d0Var, "scope");
        return new PreferenceDataStore(DataStoreFactory.a(replaceFileCorruptionHandler, list, d0Var, new PreferenceDataStoreFactory$create$delegate$1(aVar)));
    }
}
