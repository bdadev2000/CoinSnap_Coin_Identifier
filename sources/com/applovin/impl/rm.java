package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.g4;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class rm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7375h;

    public rm(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f7375h = kVar;
    }

    private void g() {
        if (this.f7375h.N().c()) {
            return;
        }
        Activity p02 = this.f7375h.p0();
        if (p02 != null) {
            this.f7375h.N().a(p02);
        } else {
            this.f7375h.l0().a(new kn(this.f7375h, true, "initializeAdapters", new pv(this, 0)), sm.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void h() {
        Map l10;
        Map F;
        boolean z10;
        String str;
        String str2;
        boolean c10 = this.f7375h.h0().c();
        String str3 = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        String str4 = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.f7375h.y() != null) {
            l10 = this.f7375h.y().d();
            F = this.f7375h.y().j();
            if (c10) {
                str4 = this.f7375h.z().d().a();
            }
            if (c10) {
                str3 = l10.get("idfv") + " (use this for test devices)";
            }
        } else {
            l10 = this.f7375h.x().l();
            F = this.f7375h.x().F();
            if (c10) {
                str4 = this.f7375h.x().f().a();
            }
            if (c10) {
                str3 = l10.get("idfv") + " (use this for test devices)";
            }
        }
        lc lcVar = new lc();
        lcVar.a().a("=====AppLovin SDK=====");
        lcVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f7375h.a(oj.U3)).a("Ad Review Version", v.b()).a("OM SDK Version", this.f7375h.Y().c());
        lcVar.a("===Device Info===").a("OS", zp.d()).a("GAID", str4).a("App Set ID", str3).a("Model", l10.get("model")).a("Locale", l10.get("locale")).a("Emulator", l10.get("sim")).a("Tablet", l10.get("is_tablet"));
        lcVar.a("===App Info===").a("Application ID", F.get(CampaignEx.JSON_KEY_PACKAGE_NAME)).a("Target SDK", F.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(zp.f()));
        lcVar.a("===SDK Settings===").a("SDK Key", this.f7375h.d0()).a("Mediation Provider", this.f7375h.Q()).a("TG", xp.a(this.f7375h)).a("AEI", this.f7375h.a(oj.f6801z)).a("MEI", this.f7375h.a(oj.A)).a("MD", this.f7375h.a(oj.B)).a("Test Mode On", Boolean.valueOf(this.f7375h.n0().c())).a("Verbose Logging On", Boolean.valueOf(c10));
        lcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(y3.a(a()));
        lcVar.a("===MAX Terms Flow===");
        f4 t5 = this.f7375h.t();
        boolean k10 = t5.k();
        lcVar.a("Enabled", Boolean.valueOf(k10));
        if (k10) {
            if (t5.e() == g4.a.UNIFIED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = "MAX Terms and Privacy Policy Flow";
            } else {
                str = "MAX Terms Flow";
            }
            lcVar.a("Flow Type", str);
            if (z10) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f7375h.q().getConsentFlowUserGeography();
                AppLovinSdkConfiguration.ConsentFlowUserGeography f10 = t5.f();
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                String str5 = "Other";
                if (consentFlowUserGeography == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "Other";
                } else {
                    str2 = "Unknown";
                }
                lcVar.a("Consent Flow Geography", str2);
                if (zp.c(this.f7375h)) {
                    if (f10 == consentFlowUserGeography2) {
                        str5 = "GDPR";
                    } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                        str5 = "None";
                    }
                    lcVar.a("Debug User Geography", str5);
                }
            }
        }
        lcVar.a("Privacy Policy URI", t5.h()).a("Terms of Service URI", t5.i());
        this.f7375h.m0();
        lcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f7375h.m0().j());
        lcVar.a();
        com.applovin.impl.sdk.t.g("AppLovinSdk", lcVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0197, code lost:
    
        if (r13.f7375h.y0() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0240, code lost:
    
        r2 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0241, code lost:
    
        r5.append(r2);
        r5.append(" in ");
        r5.append(java.lang.System.currentTimeMillis() - r6);
        r5.append("ms");
        r8.a(r9, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0259, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023d, code lost:
    
        if (r13.f7375h.y0() != false) goto L54;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.rm.run():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7375h.N().a(this.f7375h.e().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        tr.f(this.f7375h);
    }
}
