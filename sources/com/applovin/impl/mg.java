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
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6269b = com.applovin.impl.sdk.k.k();

    /* renamed from: c, reason: collision with root package name */
    private String f6270c;

    public mg(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f6270c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6269b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            this.f6270c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th2);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
            }
        } catch (Throwable th4) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f6269b);
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            com.applovin.impl.sdk.t L = this.a.L();
            StringBuilder sb2 = new StringBuilder("Init ");
            if (d()) {
                str = "succeeded";
            } else {
                str = "failed";
            }
            sb2.append(str);
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append("ms");
            L.a("OpenMeasurementService", sb2.toString());
        }
        h();
    }

    private void h() {
        this.a.l0().a((xl) new kn(this.a, "OpenMeasurementService", new du(this, 1)), sm.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = (String) a4.j.b(this.a, "enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.a.a(oj.f6642e0)).booleanValue()) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new du(this, 0));
        }
    }

    public String a() {
        return this.f6270c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.a.a(oj.f6649f0), AppLovinSdk.VERSION);
    }

    public String a(String str) {
        String str2;
        try {
            if (e()) {
                String a = ng.a(this.a);
                if (StringUtils.isValidString(a)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.f6270c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.f6270c, str2);
        } catch (Throwable th2) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th2);
            }
            return str;
        }
    }
}
