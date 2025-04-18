package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.SingleProcessDataStore;
import e1.h;
import h0.g;
import q0.p;

/* loaded from: classes4.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {

    /* renamed from: a, reason: collision with root package name */
    public final DataStore f19091a;

    public PreferenceDataStore(SingleProcessDataStore singleProcessDataStore) {
        this.f19091a = singleProcessDataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public final Object a(p pVar, g gVar) {
        return this.f19091a.a(new PreferenceDataStore$updateData$2(pVar, null), gVar);
    }

    @Override // androidx.datastore.core.DataStore
    public final h getData() {
        return this.f19091a.getData();
    }
}
