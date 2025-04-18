package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class SingleProcessDataStore$file$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f19009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore singleProcessDataStore) {
        super(0);
        this.f19009a = singleProcessDataStore;
    }

    @Override // q0.a
    public final Object invoke() {
        File file = (File) this.f19009a.f18981a.invoke();
        String absolutePath = file.getAbsolutePath();
        synchronized (SingleProcessDataStore.f18980l) {
            LinkedHashSet linkedHashSet = SingleProcessDataStore.f18979k;
            if (!(!linkedHashSet.contains(absolutePath))) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            p0.a.r(absolutePath, "it");
            linkedHashSet.add(absolutePath);
        }
        return file;
    }
}
