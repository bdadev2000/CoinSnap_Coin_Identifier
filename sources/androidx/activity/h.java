package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class h extends androidx.activity.result.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f572h;

    public h(ComponentActivity componentActivity) {
        this.f572h = componentActivity;
    }

    @Override // androidx.activity.result.g
    public final void b(int i10, f.b bVar, Object obj) {
        Bundle bundle;
        ComponentActivity componentActivity = this.f572h;
        f.a b3 = bVar.b(componentActivity, obj);
        if (b3 != null) {
            new Handler(Looper.getMainLooper()).post(new d.d(this, i10, b3, 1));
            return;
        }
        Intent a = bVar.a(componentActivity, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            androidx.core.app.i.a(componentActivity, stringArrayExtra, i10);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            androidx.activity.result.j jVar = (androidx.activity.result.j) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = jVar.f612b;
                Intent intent = jVar.f613c;
                int i11 = jVar.f614d;
                int i12 = jVar.f615f;
                int i13 = androidx.core.app.i.a;
                componentActivity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new d.d(this, i10, e2, 2));
                return;
            }
        }
        int i14 = androidx.core.app.i.a;
        componentActivity.startActivityForResult(a, i10, bundle);
    }
}
