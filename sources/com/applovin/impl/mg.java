package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class mg {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f9204a;
    private final Context b = com.applovin.impl.sdk.k.k();

    /* renamed from: c */
    private String f9205c;

    public mg(com.applovin.impl.sdk.k kVar) {
        this.f9204a = kVar;
    }

    public /* synthetic */ void f() {
        if (this.f9205c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            this.f9205c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e4);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e9) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e9);
            }
        } catch (Throwable th3) {
            this.f9204a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9204a.L().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th3);
            }
        }
    }

    public /* synthetic */ void g() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.b);
        this.f9204a.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t L8 = this.f9204a.L();
            StringBuilder sb = new StringBuilder("Init ");
            if (d()) {
                str = "succeeded";
            } else {
                str = "failed";
            }
            sb.append(str);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            L8.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    private void h() {
        this.f9204a.l0().a((xl) new kn(this.f9204a, "OpenMeasurementService", new V0(this, 1)), sm.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = (String) Q7.n0.d(this.f9204a, "enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f9204a.a(oj.f9749e0)).booleanValue()) {
            this.f9204a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9204a.L().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new V0(this, 0));
        }
    }

    public String a() {
        return this.f9205c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f9204a.a(oj.f0), AppLovinSdk.VERSION);
    }

    public String a(String str) {
        String str2;
        try {
            if (e()) {
                String a6 = ng.a(this.f9204a);
                if (StringUtils.isValidString(a6)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a6, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.f9205c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.f9205c, str2);
        } catch (Throwable th) {
            this.f9204a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f9204a.L().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
