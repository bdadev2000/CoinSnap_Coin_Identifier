package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes2.dex */
public abstract class r {

    /* loaded from: classes2.dex */
    public class a extends p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f26229a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f26230b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f26231c;

        public a(Class cls, b bVar, q qVar) {
            this.f26229a = cls;
            this.f26230b = bVar;
            this.f26231c = qVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f26229a.isInstance(activity)) {
                this.f26230b.a(activity);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (!this.f26229a.isInstance(activity) || activity.isChangingConfigurations()) {
                return;
            }
            this.f26231c.b(this);
        }
    }

    /* loaded from: classes2.dex */
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

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public static void a(boolean z2, Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (z2 && z3.b()) {
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
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (z3.d() && activity.isDestroyed());
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public static void a(Context context, Class cls, q qVar, b bVar) {
        qVar.a(new a(cls, bVar, qVar));
        a(context, cls);
    }
}
