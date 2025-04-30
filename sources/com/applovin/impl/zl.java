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
    private final List f12663h;

    /* renamed from: i */
    private final Activity f12664i;

    public zl(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f12663h = list;
        this.f12664i = activity;
    }

    public /* synthetic */ void a(ke keVar) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Auto-initing adapter: " + keVar);
        }
        this.f12278a.N().a(keVar, this.f12664i);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (this.f12663h.size() > 0) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f12279c;
                String str2 = this.b;
                StringBuilder sb = new StringBuilder("Auto-initing ");
                sb.append(this.f12663h.size());
                sb.append(" adapters");
                if (this.f12278a.n0().c()) {
                    str = " in test mode";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("...");
                tVar.a(str2, sb.toString());
            }
            if (TextUtils.isEmpty(this.f12278a.Q())) {
                this.f12278a.e(AppLovinMediationProvider.MAX);
            } else if (!this.f12278a.D0()) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f12278a.Q());
            }
            if (this.f12664i == null) {
                com.applovin.impl.sdk.t.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            Iterator it = this.f12663h.iterator();
            while (it.hasNext()) {
                this.f12278a.l0().a(new P2(6, this, (ke) it.next()), sm.b.MEDIATION);
            }
        }
    }
}
