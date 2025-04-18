package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class r {

    /* loaded from: classes.dex */
    public class a extends p {
        final /* synthetic */ Class a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f7291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f7292c;

        public a(Class cls, b bVar, q qVar) {
            this.a = cls;
            this.f7291b = bVar;
            this.f7292c = qVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.a.isInstance(activity)) {
                this.f7291b.a(activity);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.a.isInstance(activity) && !activity.isChangingConfigurations()) {
                this.f7292c.b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Activity activity);
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static void a(boolean z10, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z10 && x3.b()) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
                systemBars = WindowInsets.Type.systemBars();
                insetsController.hide(systemBars);
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (x3.d() && activity.isDestroyed());
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, Class cls, q qVar, b bVar) {
        qVar.a(new a(cls, bVar, qVar));
        a(context, cls);
    }
}
