package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class zl extends xl {

    /* renamed from: h */
    private final List f9470h;

    /* renamed from: i */
    private final Activity f9471i;

    public zl(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f9470h = list;
        this.f9471i = activity;
    }

    public /* synthetic */ void a(ke keVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Auto-initing adapter: " + keVar);
        }
        this.a.N().a(keVar, this.f9471i);
    }

    public static /* synthetic */ void e(zl zlVar, ke keVar) {
        zlVar.a(keVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (this.f9470h.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9061c;
                String str2 = this.f9060b;
                StringBuilder sb2 = new StringBuilder("Auto-initing ");
                sb2.append(this.f9470h.size());
                sb2.append(" adapters");
                if (this.a.n0().c()) {
                    str = " in test mode";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append("...");
                tVar.a(str2, sb2.toString());
            }
            if (TextUtils.isEmpty(this.a.Q())) {
                this.a.e(AppLovinMediationProvider.MAX);
            } else if (!this.a.D0()) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.a.Q());
            }
            if (this.f9471i == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            Iterator it = this.f9470h.iterator();
            while (it.hasNext()) {
                this.a.l0().a(new zv(6, this, (ke) it.next()), sm.b.MEDIATION);
            }
        }
    }
}
