package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDispatcher;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import e0.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        p0.a.s(context, "context");
        AppInitializer c2 = AppInitializer.c(context);
        p0.a.r(c2, "getInstance(context)");
        if (!c2.f21501b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!LifecycleDispatcher.f20008a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            p0.a.q(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleDispatcher.DispatcherActivityCallback());
        }
        final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f20052j;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f20056f = new Handler();
        processLifecycleOwner.f20057g.g(Lifecycle.Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        p0.a.q(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                p0.a.s(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    int i2 = ReportFragment.f20088b;
                    Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                    p0.a.q(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
                    ((ReportFragment) findFragmentByTag).f20089a = ProcessLifecycleOwner.this.f20059i;
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                p0.a.s(activity, "activity");
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i2 = processLifecycleOwner2.f20054b - 1;
                processLifecycleOwner2.f20054b = i2;
                if (i2 == 0) {
                    Handler handler = processLifecycleOwner2.f20056f;
                    p0.a.p(handler);
                    handler.postDelayed(processLifecycleOwner2.f20058h, 700L);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi
            public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                p0.a.s(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.a(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@NotNull Activity activity2) {
                        p0.a.s(activity2, "activity");
                        ProcessLifecycleOwner.this.a();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@NotNull Activity activity2) {
                        p0.a.s(activity2, "activity");
                        ProcessLifecycleOwner processLifecycleOwner3 = ProcessLifecycleOwner.this;
                        int i2 = processLifecycleOwner3.f20053a + 1;
                        processLifecycleOwner3.f20053a = i2;
                        if (i2 == 1 && processLifecycleOwner3.d) {
                            processLifecycleOwner3.f20057g.g(Lifecycle.Event.ON_START);
                            processLifecycleOwner3.d = false;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                p0.a.s(activity, "activity");
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i2 = processLifecycleOwner2.f20053a - 1;
                processLifecycleOwner2.f20053a = i2;
                if (i2 == 0 && processLifecycleOwner2.f20055c) {
                    processLifecycleOwner2.f20057g.g(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner2.d = true;
                }
            }
        });
        return processLifecycleOwner;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return w.f30218a;
    }
}
