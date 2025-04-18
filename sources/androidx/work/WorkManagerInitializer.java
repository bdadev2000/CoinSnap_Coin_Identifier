package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements c2.b {
    public static final String a = p.g("WrkMgrInitializer");

    @Override // c2.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // c2.b
    public final Object create(Context context) {
        p.e().b(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        m2.k.w(context, new b(new d6.h()));
        return m2.k.v(context);
    }
}
