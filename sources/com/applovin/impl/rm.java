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

/* loaded from: classes2.dex */
public class rm extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final String f26345h;

    /* renamed from: i, reason: collision with root package name */
    private final List f26346i;

    /* renamed from: j, reason: collision with root package name */
    private final pe f26347j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f26348k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f26349l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f26350m;

    /* renamed from: n, reason: collision with root package name */
    private final MaxError f26351n;

    public rm(String str, List list, Map map, Map map2, MaxError maxError, pe peVar, com.applovin.impl.sdk.j jVar, boolean z2) {
        super("TaskFireMediationPostbacks", jVar);
        this.f26345h = androidx.compose.foundation.text.input.a.j(str, "_urls");
        this.f26346i = list;
        this.f26348k = yp.a(map, jVar);
        this.f26349l = map2 == null ? new HashMap() : map2;
        this.f26351n = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f26347j = peVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z2 && peVar != null) {
            hashMap.put("AppLovin-Ad-Network-Name", peVar.c());
        }
        if (peVar instanceof ge) {
            ge geVar = (ge) peVar;
            hashMap.put("AppLovin-Ad-Unit-Id", geVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", geVar.getFormat().getLabel());
            if (z2) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", geVar.U());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f26350m = hashMap;
    }

    private void a(String str, Map map) {
        b().X().e(com.applovin.impl.sdk.network.d.b().d(str).c(com.safedk.android.a.g.f29074c).a(this.f26350m).a(false).c(map).c(((Boolean) this.f28216a.a(ve.d8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f28216a.a(ve.X6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f26346i;
        if (list != null) {
            return list;
        }
        pe peVar = this.f26347j;
        if (peVar != null) {
            return peVar.b(this.f26345h);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        List f2 = f();
        if (CollectionUtils.isEmpty(f2)) {
            return;
        }
        Map e = e();
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse(a(b((String) it.next(), this.f26348k), this.f26351n));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(this.f26349l);
            for (String str : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str);
                if (e.containsKey(queryParameter)) {
                    pe peVar = this.f26347j;
                    if (peVar != null) {
                        hashMap.put(str, peVar.a((String) e.get(queryParameter)));
                    }
                } else {
                    clearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            hashMap.putAll(this.f28216a.y().e());
            a(clearQuery.build().toString(), hashMap);
        }
    }

    private String a(String str, MaxError maxError) {
        int i2;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i2 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i2 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i2)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
