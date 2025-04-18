package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class qg {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f26171a;

    /* renamed from: b */
    private final Context f26172b = com.applovin.impl.sdk.j.l();

    /* renamed from: c */
    private String f26173c;

    public qg(com.applovin.impl.sdk.j jVar) {
        this.f26171a = jVar;
    }

    public /* synthetic */ void f() {
        if (this.f26173c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f26172b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            this.f26173c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(readLine);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (Throwable th3) {
            this.f26171a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26171a.J().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th3);
            }
        }
    }

    public /* synthetic */ void g() {
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f26172b);
        this.f26171a.J();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n J = this.f26171a.J();
            StringBuilder sb = new StringBuilder("Init ");
            sb.append(d() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            J.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    private void h() {
        this.f26171a.j0().a((yl) new jn(this.f26171a, "OpenMeasurementService", new yu(this, 0)), tm.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f26171a.g0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f26171a.a(sj.f26921h0)).booleanValue()) {
            this.f26171a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26171a.J().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new yu(this, 1));
        }
    }

    public String a() {
        return this.f26173c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f26171a.a(sj.f26924i0), AppLovinSdk.VERSION);
    }

    public String a(String str) {
        String str2;
        try {
            if (e()) {
                String a2 = rg.a(this.f26171a);
                if (StringUtils.isValidString(a2)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a2, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.f26173c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.f26173c, str2);
        } catch (Throwable th) {
            this.f26171a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f26171a.J().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
