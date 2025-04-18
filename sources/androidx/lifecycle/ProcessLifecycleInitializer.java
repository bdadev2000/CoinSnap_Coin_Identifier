package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lc2/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements c2.b {
    @Override // c2.b
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // c2.b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c2.a c10 = c2.a.c(context);
        Intrinsics.checkNotNullExpressionValue(c10, "getInstance(context)");
        if (c10.f2531b.contains(ProcessLifecycleInitializer.class)) {
            AtomicBoolean atomicBoolean = s.a;
            Intrinsics.checkNotNullParameter(context, "context");
            if (!s.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
            }
            l0 l0Var = l0.f1793k;
            Intrinsics.checkNotNullParameter(context, "context");
            l0 l0Var2 = l0.f1793k;
            l0Var2.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            l0Var2.f1798g = new Handler();
            l0Var2.f1799h.e(n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new j0(l0Var2));
            return l0Var2;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
