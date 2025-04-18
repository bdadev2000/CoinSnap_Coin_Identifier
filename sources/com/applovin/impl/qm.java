package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final String f7249h;

    /* renamed from: i, reason: collision with root package name */
    private final List f7250i;

    /* renamed from: j, reason: collision with root package name */
    private final ke f7251j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f7252k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f7253l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f7254m;

    /* renamed from: n, reason: collision with root package name */
    private final MaxError f7255n;

    public qm(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskFireMediationPostbacks", kVar);
        MaxError maxErrorImpl;
        this.f7249h = eb.j.k(str, "_urls");
        this.f7250i = list;
        this.f7252k = zp.a(map, kVar);
        this.f7253l = map2 == null ? new HashMap() : map2;
        if (maxError != null) {
            maxErrorImpl = maxError;
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        this.f7255n = maxErrorImpl;
        this.f7251j = keVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z10 && keVar != null) {
            hashMap.put("AppLovin-Ad-Network-Name", keVar.c());
        }
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            hashMap.put("AppLovin-Ad-Unit-Id", beVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", beVar.getFormat().getLabel());
            if (z10) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", beVar.S());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f7254m = hashMap;
    }

    private void a(String str, Map map) {
        b().Z().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.f7254m).a(false).c(map).c(((Boolean) this.a.a(qe.O7)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.a.a(qe.O6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f7250i;
        if (list != null) {
            return list;
        }
        ke keVar = this.f7251j;
        if (keVar != null) {
            return keVar.b(this.f7249h);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map e2;
        List f10 = f();
        if (CollectionUtils.isEmpty(f10)) {
            return;
        }
        Map e10 = e();
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b((String) it.next(), this.f7252k), this.f7255n));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.f7253l);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (e10.containsKey(queryParameter)) {
                    ke keVar = this.f7251j;
                    if (keVar != null) {
                        hashMap.put(str, keVar.a((String) e10.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            if (((Boolean) this.a.a(qe.I7)).booleanValue()) {
                if (this.a.y() != null) {
                    e2 = this.a.y().a();
                } else {
                    e2 = this.a.x().e();
                }
                hashMap.putAll(e2);
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i10;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i10 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i10 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i10)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
