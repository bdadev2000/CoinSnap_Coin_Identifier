package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import u7.C2824o;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements J0.b {
    @Override // J0.b
    public final List a() {
        return C2824o.b;
    }

    @Override // J0.b
    public final Object create(Context context) {
        G7.j.e(context, "context");
        J0.a c9 = J0.a.c(context);
        G7.j.d(c9, "getInstance(context)");
        if (c9.b.contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC0508s.f4901a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                G7.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
            }
            I i9 = I.f4828k;
            i9.getClass();
            i9.f4832g = new Handler();
            i9.f4833h.e(EnumC0503m.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            G7.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new H(i9));
            return i9;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
