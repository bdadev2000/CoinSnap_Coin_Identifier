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
    private final String f10393h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10394i;

    /* renamed from: j, reason: collision with root package name */
    private final ke f10395j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f10396k;
    private final Map l;
    private final Map m;

    /* renamed from: n, reason: collision with root package name */
    private final MaxError f10397n;

    public qm(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, com.applovin.impl.sdk.k kVar, boolean z8) {
        super("TaskFireMediationPostbacks", kVar);
        MaxError maxErrorImpl;
        this.f10393h = com.mbridge.msdk.foundation.entity.o.j(str, "_urls");
        this.f10394i = list;
        this.f10396k = zp.a(map, kVar);
        this.l = map2 == null ? new HashMap() : map2;
        if (maxError != null) {
            maxErrorImpl = maxError;
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        this.f10397n = maxErrorImpl;
        this.f10395j = keVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z8 && keVar != null) {
            hashMap.put("AppLovin-Ad-Network-Name", keVar.c());
        }
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            hashMap.put("AppLovin-Ad-Unit-Id", beVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", beVar.getFormat().getLabel());
            if (z8) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", beVar.S());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.m = hashMap;
    }

    private void a(String str, Map map) {
        b().Z().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.m).a(false).c(map).c(((Boolean) this.f12278a.a(qe.f10310O7)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f12278a.a(qe.f10309O6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f10394i;
        if (list != null) {
            return list;
        }
        ke keVar = this.f10395j;
        if (keVar != null) {
            return keVar.b(this.f10393h);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map e4;
        List f9 = f();
        if (CollectionUtils.isEmpty(f9)) {
            return;
        }
        Map e9 = e();
        Iterator it = f9.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b((String) it.next(), this.f10396k), this.f10397n));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.l);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (e9.containsKey(queryParameter)) {
                    ke keVar = this.f10395j;
                    if (keVar != null) {
                        hashMap.put(str, keVar.a((String) e9.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            if (((Boolean) this.f12278a.a(qe.I7)).booleanValue()) {
                if (this.f12278a.y() != null) {
                    e4 = this.f12278a.y().a();
                } else {
                    e4 = this.f12278a.x().e();
                }
                hashMap.putAll(e4);
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i9;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i9 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i9 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i9)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
