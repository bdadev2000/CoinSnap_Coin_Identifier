package com.applovin.impl.sdk.network;

import Q7.n0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f11087a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f11088c;

    /* renamed from: d, reason: collision with root package name */
    private String f11089d;

    /* renamed from: e, reason: collision with root package name */
    private Map f11090e;

    /* renamed from: f, reason: collision with root package name */
    private Map f11091f;

    /* renamed from: g, reason: collision with root package name */
    private Map f11092g;

    /* renamed from: h, reason: collision with root package name */
    private qi.a f11093h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11094i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11095j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11096k;
    private boolean l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private int f11097n;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f11098a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f11099c;

        /* renamed from: d, reason: collision with root package name */
        private String f11100d;

        /* renamed from: e, reason: collision with root package name */
        private Map f11101e;

        /* renamed from: f, reason: collision with root package name */
        private Map f11102f;

        /* renamed from: g, reason: collision with root package name */
        private Map f11103g;

        /* renamed from: h, reason: collision with root package name */
        private qi.a f11104h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11105i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f11106j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f11107k;
        private boolean l;

        public b a(qi.a aVar) {
            this.f11104h = aVar;
            return this;
        }

        public b b(String str) {
            this.f11098a = str;
            return this;
        }

        public b c(String str) {
            this.b = str;
            return this;
        }

        public b d(String str) {
            this.f11099c = str;
            return this;
        }

        public b a(String str) {
            this.f11100d = str;
            return this;
        }

        public b b(Map map) {
            this.f11101e = map;
            return this;
        }

        public b c(Map map) {
            this.f11103g = map;
            return this;
        }

        public b d(boolean z8) {
            this.f11107k = z8;
            return this;
        }

        public b a(Map map) {
            this.f11102f = map;
            return this;
        }

        public b b(boolean z8) {
            this.l = z8;
            return this;
        }

        public b c(boolean z8) {
            this.f11106j = z8;
            return this;
        }

        public b a(boolean z8) {
            this.f11105i = z8;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    public void a() {
        Map map = CollectionUtils.map(this.f11090e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f11090e = map;
    }

    public int c() {
        return this.f11097n;
    }

    public String d() {
        return this.f11089d;
    }

    public String e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f11087a.equals(((d) obj).f11087a);
        }
        return false;
    }

    public qi.a f() {
        return this.f11093h;
    }

    public Map g() {
        return this.f11091f;
    }

    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.f11087a.hashCode();
    }

    public Map i() {
        return this.f11090e;
    }

    public Map j() {
        return this.f11092g;
    }

    public String k() {
        return this.f11088c;
    }

    public void l() {
        this.f11097n++;
    }

    public boolean m() {
        return this.f11096k;
    }

    public boolean n() {
        return this.f11094i;
    }

    public boolean o() {
        return this.f11095j;
    }

    public boolean p() {
        return this.l;
    }

    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f11087a);
        jSONObject.put("communicatorRequestId", this.m);
        jSONObject.put("httpMethod", this.b);
        jSONObject.put("targetUrl", this.f11088c);
        jSONObject.put("backupUrl", this.f11089d);
        jSONObject.put("encodingType", this.f11093h);
        jSONObject.put("isEncodingEnabled", this.f11094i);
        jSONObject.put("gzipBodyEncoding", this.f11095j);
        jSONObject.put("isAllowedPreInitEvent", this.f11096k);
        jSONObject.put("attemptNumber", this.f11097n);
        if (this.f11090e != null) {
            jSONObject.put("parameters", new JSONObject(this.f11090e));
        }
        if (this.f11091f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f11091f));
        }
        if (this.f11092g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f11092g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostbackRequest{uniqueId='");
        sb.append(this.f11087a);
        sb.append("', communicatorRequestId='");
        sb.append(this.m);
        sb.append("', httpMethod='");
        sb.append(this.b);
        sb.append("', targetUrl='");
        sb.append(this.f11088c);
        sb.append("', backupUrl='");
        sb.append(this.f11089d);
        sb.append("', attemptNumber=");
        sb.append(this.f11097n);
        sb.append(", isEncodingEnabled=");
        sb.append(this.f11094i);
        sb.append(", isGzipBodyEncoding=");
        sb.append(this.f11095j);
        sb.append(", isAllowedPreInitEvent=");
        sb.append(this.f11096k);
        sb.append(", shouldFireInWebView=");
        return n0.n(sb, this.l, '}');
    }

    public d(JSONObject jSONObject, k kVar) {
        Map hashMap;
        Map hashMap2;
        Map hashMap3;
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i9 = jSONObject.getInt("attemptNumber");
        if (JsonUtils.valueExists(jSONObject, "parameters")) {
            hashMap = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters")));
        } else {
            hashMap = new HashMap();
        }
        if (JsonUtils.valueExists(jSONObject, "httpHeaders")) {
            hashMap2 = Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders")));
        } else {
            hashMap2 = new HashMap();
        }
        if (JsonUtils.valueExists(jSONObject, "requestBody")) {
            hashMap3 = Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody")));
        } else {
            hashMap3 = new HashMap();
        }
        this.f11087a = string;
        this.b = string3;
        this.m = string2;
        this.f11088c = string4;
        this.f11089d = string5;
        this.f11090e = hashMap;
        this.f11091f = hashMap2;
        this.f11092g = hashMap3;
        this.f11093h = qi.a.a(jSONObject.optInt("encodingType", qi.a.DEFAULT.b()));
        this.f11094i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f11095j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f11096k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f11097n = i9;
    }

    private d(b bVar) {
        this.f11087a = UUID.randomUUID().toString();
        this.b = bVar.b;
        this.f11088c = bVar.f11099c;
        this.f11089d = bVar.f11100d;
        this.f11090e = bVar.f11101e;
        this.f11091f = bVar.f11102f;
        this.f11092g = bVar.f11103g;
        this.f11093h = bVar.f11104h;
        this.f11094i = bVar.f11105i;
        this.f11095j = bVar.f11106j;
        this.f11096k = bVar.f11107k;
        this.l = bVar.l;
        this.m = bVar.f11098a;
        this.f11097n = 0;
    }
}
