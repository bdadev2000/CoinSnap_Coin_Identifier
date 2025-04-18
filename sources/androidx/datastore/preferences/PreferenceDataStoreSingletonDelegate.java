package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import b1.d0;
import java.util.List;
import p0.a;
import q0.l;
import t0.b;
import x0.n;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreSingletonDelegate implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19067a;

    /* renamed from: b, reason: collision with root package name */
    public final ReplaceFileCorruptionHandler f19068b;

    /* renamed from: c, reason: collision with root package name */
    public final l f19069c;
    public final d0 d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public volatile PreferenceDataStore f19070f;

    public PreferenceDataStoreSingletonDelegate(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, l lVar, d0 d0Var) {
        a.s(str, "name");
        this.f19067a = str;
        this.f19068b = replaceFileCorruptionHandler;
        this.f19069c = lVar;
        this.d = d0Var;
        this.e = new Object();
    }

    @Override // t0.b
    public final Object getValue(Object obj, n nVar) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        a.s(context, "thisRef");
        a.s(nVar, "property");
        PreferenceDataStore preferenceDataStore2 = this.f19070f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.e) {
            try {
                if (this.f19070f == null) {
                    Context applicationContext = context.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f19068b;
                    l lVar = this.f19069c;
                    a.r(applicationContext, "applicationContext");
                    this.f19070f = PreferenceDataStoreFactory.a(replaceFileCorruptionHandler, (List) lVar.invoke(applicationContext), this.d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                preferenceDataStore = this.f19070f;
                a.p(preferenceDataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }
}
