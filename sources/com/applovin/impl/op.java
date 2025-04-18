package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.ec;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class op extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f25913a;

    /* renamed from: b, reason: collision with root package name */
    private ec f25914b;

    /* loaded from: classes2.dex */
    public class a extends ec {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return i2 == d.SETTINGS.ordinal() ? op.this.c() : op.this.a();
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return i2 == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return i2 == d.SETTINGS.ordinal() ? new fj("SETTINGS") : new fj("GDPR APPLICABILITY");
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ec.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f25916a;

        public b(com.applovin.impl.sdk.j jVar) {
            this.f25916a = jVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            if (lbVar.b() == d.SETTINGS.ordinal()) {
                if (lbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f25916a.u().h() != null) {
                        tp.a(this.f25916a.u().h(), com.applovin.impl.sdk.j.l(), this.f25916a);
                        return;
                    } else {
                        yp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", op.this);
                        return;
                    }
                }
                if (lbVar.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f25916a.u().i() == null) {
                    return;
                }
                tp.a(this.f25916a.u().i(), com.applovin.impl.sdk.j.l(), this.f25916a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* loaded from: classes2.dex */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* loaded from: classes2.dex */
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

    private dc d() {
        dc.b d2 = dc.a().d("Terms of Service URL");
        if (this.f25913a.u().i() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(t3.a(R.color.applovin_sdk_checkmarkColor, this));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f25913a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f25913a = jVar;
        a aVar = new a(this);
        this.f25914b = aVar;
        aVar.a(new b(jVar));
        this.f25914b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f25914b);
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ec ecVar = this.f25914b;
        if (ecVar != null) {
            ecVar.a((ec.a) null);
        }
    }

    private dc a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z2) {
        return dc.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN).b(z2).a();
    }

    private dc b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z2) {
        return dc.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f25913a.r().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography f2 = this.f25913a.u().f();
        boolean z2 = yp.c(this.f25913a) && f2 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(dc.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z2));
        arrayList.add(b(f2, z2));
        return arrayList;
    }

    private dc b() {
        boolean z2 = this.f25913a.u().h() != null;
        return dc.a().d("Privacy Policy URL").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(t3.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
