package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import q4.C2645d;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements J0.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5184a = o.g("WrkMgrInitializer");

    @Override // J0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // J0.b
    public final Object create(Context context) {
        o.e().b(f5184a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        V0.k.w(context, new b(new C2645d()));
        return V0.k.v(context);
    }
}
