package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import eb.j;

/* loaded from: classes.dex */
public class a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final t f7028b;

    /* renamed from: c, reason: collision with root package name */
    private ConsentForm f7029c;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0029a implements ConsentInformation.OnConsentInfoUpdateSuccessListener {
        final /* synthetic */ Activity a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f7030b;

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0030a implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
            public C0030a() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a("Successfully loaded consent form");
                a.this.f7029c = consentForm;
                C0029a.this.f7030b.onFlowLoaded(null);
            }
        }

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$b */
        /* loaded from: classes.dex */
        public class b implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
            public b() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public void onConsentFormLoadFailure(FormError formError) {
                a.this.b("Failed to load with error: " + formError.getMessage());
                C0029a c0029a = C0029a.this;
                c0029a.f7030b.onFlowLoadFailed(a.this.a(formError, "Consent form load failed"));
            }
        }

        public C0029a(Activity activity, d dVar) {
            this.a = activity;
            this.f7030b = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
        public void onConsentInfoUpdateSuccess() {
            ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.a);
            boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
            int consentStatus = consentInformation.getConsentStatus();
            a.this.a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
            if (!isConsentFormAvailable) {
                a.this.b("Failed to load form.");
                this.f7030b.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            } else if (consentStatus == 2) {
                a.this.a("Successfully requested consent info");
                a.this.a("Loading consent form...");
                UserMessagingPlatform.loadConsentForm(this.a, new C0030a(), new b());
            } else {
                a.this.b("Failed to load with consent status: " + consentStatus);
                this.f7030b.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, j.i("Consent form not required for consent status: ", consentStatus)));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {
        final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
        public void onConsentInfoUpdateFailure(FormError formError) {
            a.this.b("Failed to request consent info with error: " + formError.getMessage());
            this.a.onFlowLoadFailed(a.this.a(formError, "Consent info update failed"));
        }
    }

    /* loaded from: classes.dex */
    public class c implements ConsentForm.OnConsentFormDismissedListener {
        final /* synthetic */ d a;

        public c(d dVar) {
            this.a = dVar;
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(FormError formError) {
            if (formError != null) {
                a.this.b("Failed to show with error: " + formError.getMessage());
                this.a.onFlowShowFailed(a.this.a(formError, "Consent form show failed"));
                return;
            }
            a.this.a("Consent form finished showing");
            this.a.onFlowHidden(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.a = kVar;
        this.f7028b = kVar.L();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.k());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a(Activity activity, k3 k3Var, d dVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (zp.c(this.a) && k3Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull((String) a4.j.b(this.a, "google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new C0029a(activity, dVar), new b(dVar));
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.k()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public void b(Activity activity, k3 k3Var, d dVar) {
        if (this.f7029c == null) {
            b("Failed to show - not ready yet");
            dVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f7029c.show(activity, new c(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (t.a()) {
            this.f7028b.b("GoogleCmpAdapter", str);
        }
    }

    public void a() {
        if (this.f7029c != null) {
            this.f7029c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (t.a()) {
            this.f7028b.a("GoogleCmpAdapter", str);
        }
    }
}
