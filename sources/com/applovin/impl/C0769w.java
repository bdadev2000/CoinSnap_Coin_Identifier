package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* renamed from: com.applovin.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0769w {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11844a;
    private final String b;

    /* renamed from: com.applovin.impl.w$a */
    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f11848a;

        a(String str) {
            this.f11848a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f11848a;
        }
    }

    public C0769w(String str, com.applovin.impl.sdk.k kVar) {
        if (!TextUtils.isEmpty(str)) {
            if (kVar != null) {
                this.b = str;
                this.f11844a = kVar;
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("Identifier is empty");
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.b.substring(d().length()), 0), "UTF-8"));
                this.f11844a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11844a.L().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e4) {
                this.f11844a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11844a.L().a("AdToken", "Unable to decode token '" + this.b + "' into JSON", e4);
                }
                this.f11844a.B().a("AdToken", "decodeFullAdResponseStr", e4);
                return null;
            }
        } catch (UnsupportedEncodingException e9) {
            this.f11844a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f11844a.L().a("AdToken", AbstractC2914a.h(new StringBuilder("Unable to process ad response from token '"), this.b, "'"), e9);
            }
            this.f11844a.B().a("AdToken", "decodeFullAdResponse", e9);
            return null;
        }
    }

    public String b() {
        return this.b;
    }

    public a c() {
        if (a(oj.f9643O0) != null) {
            return a.REGULAR;
        }
        if (a(oj.P0) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String d() {
        String a6 = a(oj.f9643O0);
        if (!TextUtils.isEmpty(a6)) {
            return a6;
        }
        String a9 = a(oj.P0);
        if (!TextUtils.isEmpty(a9)) {
            return a9;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0769w)) {
            return false;
        }
        String str = this.b;
        String str2 = ((C0769w) obj).b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("AdToken{id=", StringUtils.prefixToIndex(32, this.b), ", type=");
        n2.append(c());
        n2.append('}');
        return n2.toString();
    }

    private String a(oj ojVar) {
        for (String str : this.f11844a.c(ojVar)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
