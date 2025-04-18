package androidx.datastore.preferences;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import b1.b2;
import b1.f0;
import b1.o0;
import g1.f;
import h1.c;
import p0.a;

/* loaded from: classes2.dex */
public final class PreferenceDataStoreDelegateKt {
    public static PreferenceDataStoreSingletonDelegate a(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler) {
        PreferenceDataStoreDelegateKt$preferencesDataStore$1 preferenceDataStoreDelegateKt$preferencesDataStore$1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.f19066a;
        c cVar = o0.f22356b;
        b2 d = a.d();
        cVar.getClass();
        f c2 = a.c(f0.y(cVar, d));
        a.s(str, "name");
        return new PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, preferenceDataStoreDelegateKt$preferencesDataStore$1, c2);
    }
}
