package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class WorkManagerInitializer implements Initializer<WorkManager> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21903a = Logger.e("WrkMgrInitializer");

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.work.Configuration$Builder, java.lang.Object] */
    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Logger.c().a(f21903a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        WorkManagerImpl.c(context, new Configuration(new Object()));
        return WorkManagerImpl.b(context);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.emptyList();
    }
}
