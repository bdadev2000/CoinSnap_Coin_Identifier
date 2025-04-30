package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.AbstractC0405f;
import i.AbstractC2330a;

/* loaded from: classes.dex */
public final class k extends h.i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f20220h;

    public k(l lVar) {
        this.f20220h = lVar;
    }

    @Override // h.i
    public final void b(int i9, AbstractC2330a abstractC2330a, Object obj) {
        Bundle bundle;
        G7.j.e(abstractC2330a, "contract");
        l lVar = this.f20220h;
        com.bumptech.glide.f b = abstractC2330a.b(lVar, obj);
        if (b != null) {
            new Handler(Looper.getMainLooper()).post(new C0.a(i9, this, b, 2));
            return;
        }
        Intent a6 = abstractC2330a.a(lVar, obj);
        if (a6.getExtras() != null) {
            Bundle extras = a6.getExtras();
            G7.j.b(extras);
            if (extras.getClassLoader() == null) {
                a6.setExtrasClassLoader(lVar.getClassLoader());
            }
        }
        if (a6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a6.getAction())) {
            String[] stringArrayExtra = a6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0405f.a(lVar, stringArrayExtra, i9);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a6.getAction())) {
            h.k kVar = (h.k) a6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                G7.j.b(kVar);
                lVar.startIntentSenderForResult(kVar.b, i9, kVar.f20566c, kVar.f20567d, kVar.f20568f, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new C0.a(i9, this, e4, 3));
                return;
            }
        }
        lVar.startActivityForResult(a6, i9, bundle);
    }
}
