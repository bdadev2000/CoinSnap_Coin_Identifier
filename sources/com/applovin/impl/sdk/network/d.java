package com.applovin.impl.sdk.network;

import a4.j;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f7919b;

    /* renamed from: c, reason: collision with root package name */
    private String f7920c;

    /* renamed from: d, reason: collision with root package name */
    private String f7921d;

    /* renamed from: e, reason: collision with root package name */
    private Map f7922e;

    /* renamed from: f, reason: collision with root package name */
    private Map f7923f;

    /* renamed from: g, reason: collision with root package name */
    private Map f7924g;

    /* renamed from: h, reason: collision with root package name */
    private qi.a f7925h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7926i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7927j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7928k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7929l;

    /* renamed from: m, reason: collision with root package name */
    private String f7930m;

    /* renamed from: n, reason: collision with root package name */
    private int f7931n;

    /* loaded from: classes.dex */
    public static class b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f7932b;

        /* renamed from: c, reason: collision with root package name */
        private String f7933c;

        /* renamed from: d, reason: collision with root package name */
        private String f7934d;

        /* renamed from: e, reason: collision with root package name */
        private Map f7935e;

        /* renamed from: f, reason: collision with root package name */
        private Map f7936f;

        /* renamed from: g, reason: collision with root package name */
        private Map f7937g;

        /* renamed from: h, reason: collision with root package name */
        private qi.a f7938h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f7939i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f7940j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f7941k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f7942l;

        public b a(qi.a aVar) {
            this.f7938h = aVar;
            return this;
        }

        public b b(String str) {
            this.a = str;
            return this;
        }

        public b c(String str) {
            this.f7932b = str;
            return this;
        }

        public b d(String str) {
            this.f7933c = str;
            return this;
        }

        public b a(String str) {
            this.f7934d = str;
            return this;
        }

        public b b(Map map) {
            this.f7935e = map;
            return this;
        }

        public b c(Map map) {
            this.f7937g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f7941k = z10;
            return this;
        }

        public b a(Map map) {
            this.f7936f = map;
            return this;
        }

        public b b(boolean z10) {
            this.f7942l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f7940j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f7939i = z10;
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
        Map map = CollectionUtils.map(this.f7922e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f7922e = map;
    }

    public int c() {
        return this.f7931n;
    }

    public String d() {
        return this.f7921d;
    }

    public String e() {
        return this.f7930m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public qi.a f() {
        return this.f7925h;
    }

    public Map g() {
        return this.f7923f;
    }

    public String h() {
        return this.f7919b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Map i() {
        return this.f7922e;
    }

    public Map j() {
        return this.f7924g;
    }

    public String k() {
        return this.f7920c;
    }

    public void l() {
        this.f7931n++;
    }

    public boolean m() {
        return this.f7928k;
    }

    public boolean n() {
        return this.f7926i;
    }

    public boolean o() {
        return this.f7927j;
    }

    public boolean p() {
        return this.f7929l;
    }

    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.a);
        jSONObject.put("communicatorRequestId", this.f7930m);
        jSONObject.put("httpMethod", this.f7919b);
        jSONObject.put("targetUrl", this.f7920c);
        jSONObject.put("backupUrl", this.f7921d);
        jSONObject.put("encodingType", this.f7925h);
        jSONObject.put("isEncodingEnabled", this.f7926i);
        jSONObject.put("gzipBodyEncoding", this.f7927j);
        jSONObject.put("isAllowedPreInitEvent", this.f7928k);
        jSONObject.put("attemptNumber", this.f7931n);
        if (this.f7922e != null) {
            jSONObject.put("parameters", new JSONObject(this.f7922e));
        }
        if (this.f7923f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f7923f));
        }
        if (this.f7924g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f7924g));
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostbackRequest{uniqueId='");
        sb2.append(this.a);
        sb2.append("', communicatorRequestId='");
        sb2.append(this.f7930m);
        sb2.append("', httpMethod='");
        sb2.append(this.f7919b);
        sb2.append("', targetUrl='");
        sb2.append(this.f7920c);
        sb2.append("', backupUrl='");
        sb2.append(this.f7921d);
        sb2.append("', attemptNumber=");
        sb2.append(this.f7931n);
        sb2.append(", isEncodingEnabled=");
        sb2.append(this.f7926i);
        sb2.append(", isGzipBodyEncoding=");
        sb2.append(this.f7927j);
        sb2.append(", isAllowedPreInitEvent=");
        sb2.append(this.f7928k);
        sb2.append(", shouldFireInWebView=");
        return j.l(sb2, this.f7929l, AbstractJsonLexerKt.END_OBJ);
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
        int i10 = jSONObject.getInt("attemptNumber");
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
        this.a = string;
        this.f7919b = string3;
        this.f7930m = string2;
        this.f7920c = string4;
        this.f7921d = string5;
        this.f7922e = hashMap;
        this.f7923f = hashMap2;
        this.f7924g = hashMap3;
        this.f7925h = qi.a.a(jSONObject.optInt("encodingType", qi.a.DEFAULT.b()));
        this.f7926i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f7927j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f7928k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f7929l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f7931n = i10;
    }

    private d(b bVar) {
        this.a = UUID.randomUUID().toString();
        this.f7919b = bVar.f7932b;
        this.f7920c = bVar.f7933c;
        this.f7921d = bVar.f7934d;
        this.f7922e = bVar.f7935e;
        this.f7923f = bVar.f7936f;
        this.f7924g = bVar.f7937g;
        this.f7925h = bVar.f7938h;
        this.f7926i = bVar.f7939i;
        this.f7927j = bVar.f7940j;
        this.f7928k = bVar.f7941k;
        this.f7929l = bVar.f7942l;
        this.f7930m = bVar.a;
        this.f7931n = 0;
    }
}
