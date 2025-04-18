package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f27649a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27650b;

    /* loaded from: classes2.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f27654a;

        a(String str) {
            this.f27654a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f27654a;
        }
    }

    public w(String str, com.applovin.impl.sdk.j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f27650b = str;
        this.f27649a = jVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AppLovinVideoBridge.stringInit(Base64.decode(this.f27650b.substring(d().length()), 0), "UTF-8"));
                this.f27649a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27649a.J().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.f27649a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f27649a.J().a("AdToken", "Unable to decode token '" + this.f27650b + "' into JSON", e);
                }
                this.f27649a.E().a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f27649a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f27649a.J().a("AdToken", android.support.v4.media.d.r(new StringBuilder("Unable to process ad response from token '"), this.f27650b, "'"), e2);
            }
            this.f27649a.E().a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    public String b() {
        return this.f27650b;
    }

    public a c() {
        return a(sj.S0) != null ? a.REGULAR : a(sj.T0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String a2 = a(sj.S0);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(sj.T0);
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        return a3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        String str = this.f27650b;
        String str2 = ((w) obj).f27650b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f27650b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder v2 = android.support.v4.media.d.v("AdToken{id=", StringUtils.prefixToIndex(32, this.f27650b), ", type=");
        v2.append(c());
        v2.append('}');
        return v2.toString();
    }

    private String a(sj sjVar) {
        for (String str : this.f27649a.c(sjVar)) {
            if (this.f27650b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
