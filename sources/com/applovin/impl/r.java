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
    public class a extends AbstractC0734p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f10426a;
        final /* synthetic */ b b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0738q f10427c;

        public a(Class cls, b bVar, C0738q c0738q) {
            this.f10426a = cls;
            this.b = bVar;
            this.f10427c = c0738q;
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f10426a.isInstance(activity)) {
                this.b.a(activity);
            }
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f10426a.isInstance(activity) && !activity.isChangingConfigurations()) {
                this.f10427c.b(this);
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

    public static void a(boolean z8, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z8 && x3.b()) {
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

    public static void a(Context context, Class cls, C0738q c0738q, b bVar) {
        c0738q.a(new a(cls, bVar, c0738q));
        a(context, cls);
    }
}
