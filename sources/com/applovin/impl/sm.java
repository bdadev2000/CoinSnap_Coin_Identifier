package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.i4;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class sm extends yl {

    /* renamed from: h */
    private final com.applovin.impl.sdk.j f26967h;

    public sm(com.applovin.impl.sdk.j jVar) {
        super("TaskInitializeSdk", jVar, true);
        this.f26967h = jVar;
    }

    private void g() {
        if (this.f26967h.L().c()) {
            return;
        }
        Activity n02 = this.f26967h.n0();
        if (n02 != null) {
            this.f26967h.L().a(n02);
        } else {
            this.f26967h.j0().a(new jn(this.f26967h, true, "initializeAdapters", new xv(this, 1)), tm.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void h() {
        String str;
        boolean c2 = this.f26967h.h0().c();
        Map l2 = this.f26967h.y().l();
        Map F = this.f26967h.y().F();
        String a2 = c2 ? this.f26967h.y().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (c2) {
            str = l2.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        qc qcVar = new qc();
        qcVar.a().a("=====AppLovin SDK=====");
        qcVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f26967h.a(sj.a4)).a("Ad Review Version", v.b()).a("OM SDK Version", this.f26967h.W().c());
        qcVar.a("===Device Info===").a("OS", yp.d()).a("GAID", a2).a("App Set ID", str).a("Model", l2.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)).a("Locale", l2.get("locale")).a("Emulator", l2.get("sim")).a("Tablet", l2.get("is_tablet"));
        qcVar.a("===App Info===").a("Application ID", F.get("package_name")).a("Target SDK", F.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(yp.f()));
        qcVar.a("===SDK Settings===").a("SDK Key", this.f26967h.b0()).a("Mediation Provider", this.f26967h.O()).a("TG", wp.a(this.f26967h)).a("MD", this.f26967h.a(sj.f26956v)).a("Test Mode On", Boolean.valueOf(this.f26967h.l0().c())).a("Verbose Logging On", Boolean.valueOf(c2));
        qcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(a4.a(a()));
        qcVar.a("===MAX Terms Flow===");
        h4 u2 = this.f26967h.u();
        boolean k2 = u2.k();
        qcVar.a("Enabled", Boolean.valueOf(k2));
        if (k2) {
            boolean z2 = u2.e() == i4.a.UNIFIED;
            qcVar.a("Flow Type", z2 ? "MAX Terms and Privacy Policy Flow" : "MAX Terms Flow");
            if (z2) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f26967h.r().getConsentFlowUserGeography();
                AppLovinSdkConfiguration.ConsentFlowUserGeography f2 = u2.f();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                String str2 = "Other";
                qcVar.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
                if (yp.c(this.f26967h)) {
                    if (f2 == consentFlowUserGeography2) {
                        str2 = "GDPR";
                    } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                        str2 = "None";
                    }
                    qcVar.a("Debug User Geography", str2);
                }
            }
        }
        qcVar.a("Privacy Policy URI", u2.h()).a("Terms of Service URI", u2.i());
        this.f26967h.k0();
        qcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f26967h.k0().j());
        qcVar.a();
        com.applovin.impl.sdk.n.g("AppLovinSdk", qcVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ac, code lost:
    
        if (r13.f26967h.u0() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0257, code lost:
    
        r5.append(r2);
        r5.append(" in ");
        r5.append(java.lang.System.currentTimeMillis() - r6);
        r5.append("ms");
        r8.a(r9, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x026f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0256, code lost:
    
        r2 = com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0254, code lost:
    
        if (r13.f26967h.u0() != false) goto L132;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sm.run():void");
    }

    public /* synthetic */ void e() {
        this.f26967h.L().a(this.f26967h.e().b());
    }

    public /* synthetic */ void f() {
        sr.f(this.f26967h);
    }
}
