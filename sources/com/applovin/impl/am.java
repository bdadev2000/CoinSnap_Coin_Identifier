package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* loaded from: classes3.dex */
public class am extends yl {

    /* renamed from: h */
    private final List f22916h;

    /* renamed from: i */
    private final Activity f22917i;

    public am(List list, Activity activity, com.applovin.impl.sdk.j jVar) {
        super("TaskAutoInitAdapters", jVar, true);
        this.f22916h = list;
        this.f22917i = activity;
    }

    public /* synthetic */ void a(pe peVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Auto-initing adapter: " + peVar);
        }
        this.f28216a.L().b(peVar, this.f22917i);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f22916h.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str = this.f28217b;
                StringBuilder sb = new StringBuilder("Auto-initing ");
                sb.append(this.f22916h.size());
                sb.append(" adapters");
                sb.append(this.f28216a.l0().c() ? " in test mode" : "");
                sb.append("...");
                nVar.a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f28216a.O())) {
                this.f28216a.e(AppLovinMediationProvider.MAX);
            } else if (!this.f28216a.A0()) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f28216a.O());
            }
            if (this.f22917i == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (pe peVar : this.f22916h) {
                if (peVar.s()) {
                    this.f28216a.j0().a(new ms(7, this, peVar), tm.b.MEDIATION);
                } else {
                    this.f28216a.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28216a.J().a(this.f28217b, "Skipping eager auto-init for adapter " + peVar);
                    }
                }
            }
        }
    }
}
