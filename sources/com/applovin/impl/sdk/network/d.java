package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.vi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f26801a;

    /* renamed from: b, reason: collision with root package name */
    private String f26802b;

    /* renamed from: c, reason: collision with root package name */
    private String f26803c;
    private String d;
    private Map e;

    /* renamed from: f, reason: collision with root package name */
    private Map f26804f;

    /* renamed from: g, reason: collision with root package name */
    private Map f26805g;

    /* renamed from: h, reason: collision with root package name */
    private vi.a f26806h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26807i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26808j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26809k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26810l;

    /* renamed from: m, reason: collision with root package name */
    private String f26811m;

    /* renamed from: n, reason: collision with root package name */
    private int f26812n;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f26813a;

        /* renamed from: b, reason: collision with root package name */
        private String f26814b;

        /* renamed from: c, reason: collision with root package name */
        private String f26815c;
        private String d;
        private Map e;

        /* renamed from: f, reason: collision with root package name */
        private Map f26816f;

        /* renamed from: g, reason: collision with root package name */
        private Map f26817g;

        /* renamed from: h, reason: collision with root package name */
        private vi.a f26818h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f26819i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f26820j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f26821k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f26822l;

        public b a(vi.a aVar) {
            this.f26818h = aVar;
            return this;
        }

        public b b(String str) {
            this.f26813a = str;
            return this;
        }

        public b c(String str) {
            this.f26814b = str;
            return this;
        }

        public b d(String str) {
            this.f26815c = str;
            return this;
        }

        public b a(String str) {
            this.d = str;
            return this;
        }

        public b b(Map map) {
            this.e = map;
            return this;
        }

        public b c(Map map) {
            this.f26817g = map;
            return this;
        }

        public b d(boolean z2) {
            this.f26821k = z2;
            return this;
        }

        public b a(Map map) {
            this.f26816f = map;
            return this;
        }

        public b b(boolean z2) {
            this.f26822l = z2;
            return this;
        }

        public b c(boolean z2) {
            this.f26820j = z2;
            return this;
        }

        public b a(boolean z2) {
            this.f26819i = z2;
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
        Map map = CollectionUtils.map(this.e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.e = map;
    }

    public int c() {
        return this.f26812n;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f26811m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f26801a.equals(((d) obj).f26801a);
    }

    public vi.a f() {
        return this.f26806h;
    }

    public Map g() {
        return this.f26804f;
    }

    public String h() {
        return this.f26802b;
    }

    public int hashCode() {
        return this.f26801a.hashCode();
    }

    public Map i() {
        return this.e;
    }

    public Map j() {
        return this.f26805g;
    }

    public String k() {
        return this.f26803c;
    }

    public void l() {
        this.f26812n++;
    }

    public boolean m() {
        return this.f26809k;
    }

    public boolean n() {
        return this.f26807i;
    }

    public boolean o() {
        return this.f26808j;
    }

    public boolean p() {
        return this.f26810l;
    }

    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f26801a);
        jSONObject.put("communicatorRequestId", this.f26811m);
        jSONObject.put("httpMethod", this.f26802b);
        jSONObject.put("targetUrl", this.f26803c);
        jSONObject.put("backupUrl", this.d);
        jSONObject.put("encodingType", this.f26806h);
        jSONObject.put("isEncodingEnabled", this.f26807i);
        jSONObject.put("gzipBodyEncoding", this.f26808j);
        jSONObject.put("isAllowedPreInitEvent", this.f26809k);
        jSONObject.put("attemptNumber", this.f26812n);
        if (this.e != null) {
            jSONObject.put("parameters", new JSONObject(this.e));
        }
        if (this.f26804f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f26804f));
        }
        if (this.f26805g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f26805g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostbackRequest{uniqueId='");
        sb.append(this.f26801a);
        sb.append("', communicatorRequestId='");
        sb.append(this.f26811m);
        sb.append("', httpMethod='");
        sb.append(this.f26802b);
        sb.append("', targetUrl='");
        sb.append(this.f26803c);
        sb.append("', backupUrl='");
        sb.append(this.d);
        sb.append("', attemptNumber=");
        sb.append(this.f26812n);
        sb.append(", isEncodingEnabled=");
        sb.append(this.f26807i);
        sb.append(", isGzipBodyEncoding=");
        sb.append(this.f26808j);
        sb.append(", isAllowedPreInitEvent=");
        sb.append(this.f26809k);
        sb.append(", shouldFireInWebView=");
        return android.support.v4.media.d.s(sb, this.f26810l, '}');
    }

    public d(JSONObject jSONObject, j jVar) {
        Map hashMap;
        Map hashMap2;
        Map hashMap3;
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i2 = jSONObject.getInt("attemptNumber");
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
        this.f26801a = string;
        this.f26802b = string3;
        this.f26811m = string2;
        this.f26803c = string4;
        this.d = string5;
        this.e = hashMap;
        this.f26804f = hashMap2;
        this.f26805g = hashMap3;
        this.f26806h = vi.a.a(jSONObject.optInt("encodingType", vi.a.DEFAULT.b()));
        this.f26807i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f26808j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f26809k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f26810l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f26812n = i2;
    }

    private d(b bVar) {
        this.f26801a = UUID.randomUUID().toString();
        this.f26802b = bVar.f26814b;
        this.f26803c = bVar.f26815c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f26804f = bVar.f26816f;
        this.f26805g = bVar.f26817g;
        this.f26806h = bVar.f26818h;
        this.f26807i = bVar.f26819i;
        this.f26808j = bVar.f26820j;
        this.f26809k = bVar.f26821k;
        this.f26810l = bVar.f26822l;
        this.f26811m = bVar.f26813a;
        this.f26812n = 0;
    }
}
