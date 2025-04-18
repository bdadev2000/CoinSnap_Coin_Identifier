package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8636b;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");

        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public w(String str, com.applovin.impl.sdk.k kVar) {
        if (!TextUtils.isEmpty(str)) {
            if (kVar != null) {
                this.f8636b = str;
                this.a = kVar;
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
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f8636b.substring(d().length()), 0), "UTF-8"));
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e2) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().a("AdToken", "Unable to decode token '" + this.f8636b + "' into JSON", e2);
                }
                this.a.B().a("AdToken", "decodeFullAdResponseStr", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e10) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("AdToken", vd.e.h(new StringBuilder("Unable to process ad response from token '"), this.f8636b, "'"), e10);
            }
            this.a.B().a("AdToken", "decodeFullAdResponse", e10);
            return null;
        }
    }

    public String b() {
        return this.f8636b;
    }

    public a c() {
        if (a(oj.O0) != null) {
            return a.REGULAR;
        }
        if (a(oj.P0) != null) {
            return a.AD_RESPONSE_JSON;
        }
        return a.UNSPECIFIED;
    }

    public String d() {
        String a10 = a(oj.O0);
        if (!TextUtils.isEmpty(a10)) {
            return a10;
        }
        String a11 = a(oj.P0);
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        String str = this.f8636b;
        String str2 = ((w) obj).f8636b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8636b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder o10 = a4.j.o("AdToken{id=", StringUtils.prefixToIndex(32, this.f8636b), ", type=");
        o10.append(c());
        o10.append(AbstractJsonLexerKt.END_OBJ);
        return o10.toString();
    }

    private String a(oj ojVar) {
        for (String str : this.a.c(ojVar)) {
            if (this.f8636b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
