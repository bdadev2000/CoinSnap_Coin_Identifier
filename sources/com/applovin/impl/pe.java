package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.b4;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pe implements b4.e {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f6939m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f6940n = new AtomicBoolean();
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f6941b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6942c;

    /* renamed from: d, reason: collision with root package name */
    private final oe f6943d;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6946h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6948j;

    /* renamed from: k, reason: collision with root package name */
    private Map f6949k;

    /* renamed from: l, reason: collision with root package name */
    private final x0 f6950l;

    /* renamed from: f, reason: collision with root package name */
    private final Map f6944f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f6945g = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private int f6947i = 2;

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Started mediation debugger");
                if (!pe.this.c() || pe.f6939m.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = pe.f6939m = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(pe.this.f6943d, pe.this.a.e());
                }
                pe.f6940n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = pe.f6939m = null;
            }
        }
    }

    public pe(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f6941b = kVar.L();
        Context k10 = com.applovin.impl.sdk.k.k();
        this.f6942c = k10;
        oe oeVar = new oe(k10);
        this.f6943d = oeVar;
        this.f6950l = new x0(kVar, oeVar);
    }

    private void f() {
        this.a.e().a(new a());
    }

    public boolean g() {
        return this.f6946h;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f6943d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f6939m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity p02 = this.a.p0();
        if (p02 != null && !p02.isFinishing()) {
            new AlertDialog.Builder(p02).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new rt(this, 2)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        } else {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        }
    }

    public void e() {
        if (this.f6945g.compareAndSet(false, true)) {
            this.a.l0().a((xl) new lm(this, this.a), sm.b.OTHER);
        }
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new z(jSONObject2, this.f6944f, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List a(String str) {
        Map map = this.f6949k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f6949k.get(str);
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds;
        if (kVar.C0().get()) {
            adUnitIds = kVar.g0().getInitializationAdUnitIds();
        } else {
            adUnitIds = kVar.I() != null ? kVar.I().getAdUnitIds() : null;
        }
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (adUnitIds.contains(zVar.c())) {
                    arrayList.add(zVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                fe feVar = new fe(jSONObject2, kVar);
                arrayList.add(feVar);
                this.f6944f.put(feVar.b(), feVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            w0 w0Var = new w0(str);
            if (w0Var.h()) {
                arrayList.add(w0Var);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f6941b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.y() && feVar.q() == fe.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new tu(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    @Override // com.applovin.impl.b4.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List a10 = a(jSONObject, this.a);
        List a11 = a(jSONObject, a10, this.a);
        List a12 = a(a11, this.a);
        List a13 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f6943d.a(a10, a11, a12, a13, JsonUtils.getString(jSONObject2, CampaignEx.JSON_KEY_TITLE, null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.a);
        if (!a13.isEmpty()) {
            this.f6950l.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new tu(this, 0), TimeUnit.SECONDS.toMillis(this.f6947i));
        } else {
            a(a10);
        }
    }

    public void a(boolean z10, int i10) {
        this.f6946h = z10;
        this.f6947i = i10;
    }

    public void a(Map map) {
        this.f6949k = map;
        e();
        if (!c() && f6940n.compareAndSet(false, true)) {
            if (!this.f6948j) {
                f();
                this.f6948j = true;
            }
            Intent intent = new Intent(this.f6942c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting mediation debugger...");
            this.f6942c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    @Override // com.applovin.impl.b4.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6941b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f6943d.a(null, null, null, null, null, null, null, null, false, this.a);
        this.f6945g.set(false);
    }
}
