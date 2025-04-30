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
    private static WeakReference m;

    /* renamed from: n */
    private static final AtomicBoolean f10009n = new AtomicBoolean();

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f10010a;
    private final com.applovin.impl.sdk.t b;

    /* renamed from: c */
    private final Context f10011c;

    /* renamed from: d */
    private final oe f10012d;

    /* renamed from: h */
    private boolean f10015h;

    /* renamed from: j */
    private boolean f10017j;

    /* renamed from: k */
    private Map f10018k;
    private final C0774x0 l;

    /* renamed from: f */
    private final Map f10013f = new HashMap();

    /* renamed from: g */
    private final AtomicBoolean f10014g = new AtomicBoolean();

    /* renamed from: i */
    private int f10016i = 2;

    /* loaded from: classes.dex */
    public class a extends AbstractC0734p {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Started mediation debugger");
                if (!pe.this.c() || pe.m.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = pe.m = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(pe.this.f10012d, pe.this.f10010a.e());
                }
                pe.f10009n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = pe.m = null;
            }
        }
    }

    public pe(com.applovin.impl.sdk.k kVar) {
        this.f10010a = kVar;
        this.b = kVar.L();
        Context k6 = com.applovin.impl.sdk.k.k();
        this.f10011c = k6;
        oe oeVar = new oe(k6);
        this.f10012d = oeVar;
        this.l = new C0774x0(kVar, oeVar);
    }

    private void f() {
        this.f10010a.e().a(new a());
    }

    public void e() {
        if (this.f10014g.compareAndSet(false, true)) {
            this.f10010a.l0().a((xl) new lm(this, this.f10010a), sm.b.OTHER);
        }
    }

    public boolean g() {
        return this.f10015h;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f10012d + "}";
    }

    public boolean c() {
        WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public /* synthetic */ void d() {
        Activity p02 = this.f10010a.p0();
        if (p02 != null && !p02.isFinishing()) {
            new AlertDialog.Builder(p02).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new J0(this, 2)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        } else {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        }
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C0781z(jSONObject2, this.f10013f, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List a(String str) {
        Map map = this.f10018k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f10018k.get(str);
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
                C0781z c0781z = (C0781z) it.next();
                if (adUnitIds.contains(c0781z.c())) {
                    arrayList.add(c0781z);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject2 != null) {
                fe feVar = new fe(jSONObject2, kVar);
                arrayList.add(feVar);
                this.f10013f.put(feVar.b(), feVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            C0770w0 c0770w0 = new C0770w0(str);
            if (c0770w0.h()) {
                arrayList.add(c0770w0);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i9) {
        h();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.y() && feVar.q() == fe.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new J1(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    @Override // com.applovin.impl.b4.e
    public void a(String str, JSONObject jSONObject, int i9) {
        List a6 = a(jSONObject, this.f10010a);
        List a9 = a(jSONObject, a6, this.f10010a);
        List a10 = a(a9, this.f10010a);
        List a11 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f10012d.a(a6, a9, a10, a11, JsonUtils.getString(jSONObject2, CampaignEx.JSON_KEY_TITLE, null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f10010a);
        if (!a11.isEmpty()) {
            this.l.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new J1(this, 0), TimeUnit.SECONDS.toMillis(this.f10016i));
        } else {
            a(a6);
        }
    }

    public void a(boolean z8, int i9) {
        this.f10015h = z8;
        this.f10016i = i9;
    }

    public void a(Map map) {
        this.f10018k = map;
        e();
        if (!c() && f10009n.compareAndSet(false, true)) {
            if (!this.f10017j) {
                f();
                this.f10017j = true;
            }
            Intent intent = new Intent(this.f10011c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting mediation debugger...");
            this.f10011c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    @Override // com.applovin.impl.b4.e
    public void a(String str, int i9, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.t.a()) {
            this.b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i9);
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f10012d.a(null, null, null, null, null, null, null, null, false, this.f10010a);
        this.f10014g.set(false);
    }
}
