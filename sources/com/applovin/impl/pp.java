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

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f10060a;
    private zb b;

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
        public List c(int i9) {
            return i9 == d.SETTINGS.ordinal() ? pp.this.c() : pp.this.a();
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            if (i9 == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            if (i9 == d.SETTINGS.ordinal()) {
                return new bj("SETTINGS");
            }
            return new bj("GDPR APPLICABILITY");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f10062a;

        public b(com.applovin.impl.sdk.k kVar) {
            this.f10062a = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == d.SETTINGS.ordinal()) {
                if (hbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f10062a.t().h() != null) {
                        up.a(this.f10062a.t().h(), com.applovin.impl.sdk.k.k(), this.f10062a);
                        return;
                    } else {
                        zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", pp.this);
                        return;
                    }
                }
                if (hbVar.a() == e.TERMS_OF_SERVICE_URL.ordinal() && this.f10062a.t().i() != null) {
                    up.a(this.f10062a.t().i(), com.applovin.impl.sdk.k.k(), this.f10062a);
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
        yb.b d2 = yb.a().d("Terms of Service URL");
        if (this.f10060a.t().i() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(r3.a(R.color.applovin_sdk_checkmarkColor, this));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f10060a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f10060a = kVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private yb a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z8) {
        return yb.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z8).a();
    }

    private yb b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z8) {
        return yb.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z8).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f10060a.q().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography f9 = this.f10060a.t().f();
        boolean z8 = zp.c(this.f10060a) && f9 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(yb.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z8));
        arrayList.add(b(f9, z8));
        return arrayList;
    }

    private yb b() {
        boolean z8 = this.f10060a.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z8 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z8 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
