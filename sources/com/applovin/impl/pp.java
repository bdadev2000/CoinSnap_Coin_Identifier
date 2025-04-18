package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class pp extends ne {
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private zb f6995b;

    /* loaded from: classes.dex */
    public class a extends zb {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            return i10 == d.SETTINGS.ordinal() ? pp.this.c() : pp.this.a();
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return new bj("SETTINGS");
            }
            return new bj("GDPR APPLICABILITY");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        public b(com.applovin.impl.sdk.k kVar) {
            this.a = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == d.SETTINGS.ordinal()) {
                if (hbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.a.t().h() != null) {
                        up.a(this.a.t().h(), com.applovin.impl.sdk.k.k(), this.a);
                        return;
                    } else {
                        zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", pp.this);
                        return;
                    }
                }
                if (hbVar.a() == e.TERMS_OF_SERVICE_URL.ordinal() && this.a.t().i() != null) {
                    up.a(this.a.t().i(), com.applovin.impl.sdk.k.k(), this.a);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* loaded from: classes.dex */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* loaded from: classes.dex */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private yb d() {
        yb.b d10 = yb.a().d("Terms of Service URL");
        if (this.a.t().i() != null) {
            d10.a(R.drawable.applovin_ic_check_mark_bordered);
            d10.b(r3.a(R.color.applovin_sdk_checkmarkColor, this));
            d10.a(true);
        } else {
            d10.c("None");
            d10.a(false);
        }
        return d10.a();
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a aVar = new a(this);
        this.f6995b = aVar;
        aVar.a(new b(kVar));
        this.f6995b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f6995b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f6995b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private yb a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return yb.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z10).a();
    }

    private yb b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return yb.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.a.q().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography f10 = this.a.t().f();
        boolean z10 = zp.c(this.a) && f10 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(yb.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(f10, z10));
        return arrayList;
    }

    private yb b() {
        boolean z10 = this.a.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
