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

    /* renamed from: h */
    private final com.applovin.impl.sdk.k f10512h;

    public rm(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f10512h = kVar;
    }

    private void g() {
        if (this.f10512h.N().c()) {
            return;
        }
        Activity p02 = this.f10512h.p0();
        if (p02 != null) {
            this.f10512h.N().a(p02);
        } else {
            this.f10512h.l0().a(new kn(this.f10512h, true, "initializeAdapters", new F2(this, 0)), sm.b.CORE, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void h() {
        Map l;
        Map F4;
        boolean z8;
        String str;
        String str2;
        boolean c9 = this.f10512h.h0().c();
        String str3 = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        String str4 = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (this.f10512h.y() != null) {
            l = this.f10512h.y().d();
            F4 = this.f10512h.y().j();
            if (c9) {
                str4 = this.f10512h.z().d().a();
            }
            if (c9) {
                str3 = l.get("idfv") + " (use this for test devices)";
            }
        } else {
            l = this.f10512h.x().l();
            F4 = this.f10512h.x().F();
            if (c9) {
                str4 = this.f10512h.x().f().a();
            }
            if (c9) {
                str3 = l.get("idfv") + " (use this for test devices)";
            }
        }
        lc lcVar = new lc();
        lcVar.a().a("=====AppLovin SDK=====");
        lcVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f10512h.a(oj.f9685U3)).a("Ad Review Version", C0765v.b()).a("OM SDK Version", this.f10512h.Y().c());
        lcVar.a("===Device Info===").a("OS", zp.d()).a("GAID", str4).a("App Set ID", str3).a("Model", l.get("model")).a("Locale", l.get("locale")).a("Emulator", l.get("sim")).a("Tablet", l.get("is_tablet"));
        lcVar.a("===App Info===").a("Application ID", F4.get(CampaignEx.JSON_KEY_PACKAGE_NAME)).a("Target SDK", F4.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(zp.f()));
        lcVar.a("===SDK Settings===").a("SDK Key", this.f10512h.d0()).a("Mediation Provider", this.f10512h.Q()).a("TG", xp.a(this.f10512h)).a("AEI", this.f10512h.a(oj.f9893z)).a("MEI", this.f10512h.a(oj.f9546A)).a("MD", this.f10512h.a(oj.f9554B)).a("Test Mode On", Boolean.valueOf(this.f10512h.n0().c())).a("Verbose Logging On", Boolean.valueOf(c9));
        lcVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(y3.a(a()));
        lcVar.a("===MAX Terms Flow===");
        f4 t9 = this.f10512h.t();
        boolean k6 = t9.k();
        lcVar.a("Enabled", Boolean.valueOf(k6));
        if (k6) {
            if (t9.e() == g4.a.UNIFIED) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                str = "MAX Terms and Privacy Policy Flow";
            } else {
                str = "MAX Terms Flow";
            }
            lcVar.a("Flow Type", str);
            if (z8) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f10512h.q().getConsentFlowUserGeography();
                AppLovinSdkConfiguration.ConsentFlowUserGeography f9 = t9.f();
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
                if (zp.c(this.f10512h)) {
                    if (f9 == consentFlowUserGeography2) {
                        str5 = "GDPR";
                    } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                        str5 = "None";
                    }
                    lcVar.a("Debug User Geography", str5);
                }
            }
        }
        lcVar.a("Privacy Policy URI", t9.h()).a("Terms of Service URI", t9.i());
        this.f10512h.m0();
        lcVar.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f10512h.m0().j());
        lcVar.a();
        com.applovin.impl.sdk.t.g("AppLovinSdk", lcVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x019b, code lost:
    
        if (r13.f10512h.y0() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0247, code lost:
    
        r5.append(r2);
        r5.append(" in ");
        r5.append(java.lang.System.currentTimeMillis() - r6);
        r5.append("ms");
        r8.a(r9, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0246, code lost:
    
        r2 = "succeeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0244, code lost:
    
        if (r13.f10512h.y0() != false) goto L132;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.rm.run():void");
    }

    public /* synthetic */ void e() {
        this.f10512h.N().a(this.f10512h.e().b());
    }

    public /* synthetic */ void f() {
        tr.f(this.f10512h);
    }
}
