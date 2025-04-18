package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.Validate;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    @NotNull
    private final String alg;

    @NotNull
    private final String kid;

    @NotNull
    private final String typ;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new Parcelable.Creator<AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenHeader createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenHeader[] newArray(int i2) {
            return new AuthenticationTokenHeader[i2];
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public AuthenticationTokenHeader(@NotNull String str) {
        p0.a.s(str, "encodedHeaderString");
        if (isValidHeader(str)) {
            byte[] decode = Base64.decode(str, 0);
            p0.a.r(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, z0.a.f31458a));
            String string = jSONObject.getString("alg");
            p0.a.r(string, "jsonObj.getString(\"alg\")");
            this.alg = string;
            String string2 = jSONObject.getString(ImpressionLog.F);
            p0.a.r(string2, "jsonObj.getString(\"typ\")");
            this.typ = string2;
            String string3 = jSONObject.getString("kid");
            p0.a.r(string3, "jsonObj.getString(\"kid\")");
            this.kid = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    private final boolean isValidHeader(String str) {
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        p0.a.r(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, z0.a.f31458a));
            String optString = jSONObject.optString("alg");
            p0.a.r(optString, "alg");
            boolean z2 = optString.length() > 0 && p0.a.g(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            p0.a.r(optString2, "jsonObj.optString(\"kid\")");
            boolean z3 = optString2.length() > 0;
            String optString3 = jSONObject.optString(ImpressionLog.F);
            p0.a.r(optString3, "jsonObj.optString(\"typ\")");
            return z2 && z3 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return p0.a.g(this.alg, authenticationTokenHeader.alg) && p0.a.g(this.typ, authenticationTokenHeader.typ) && p0.a.g(this.kid, authenticationTokenHeader.kid);
    }

    @NotNull
    public final String getAlg() {
        return this.alg;
    }

    @NotNull
    public final String getKid() {
        return this.kid;
    }

    @NotNull
    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return this.kid.hashCode() + androidx.compose.foundation.text.input.a.b(this.typ, androidx.compose.foundation.text.input.a.b(this.alg, 527, 31), 31);
    }

    @VisibleForTesting
    @NotNull
    public final String toEnCodedString() {
        String authenticationTokenHeader = toString();
        Charset charset = z0.a.f31458a;
        if (authenticationTokenHeader == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = authenticationTokenHeader.getBytes(charset);
        p0.a.r(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        p0.a.r(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(ImpressionLog.F, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        p0.a.r(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "dest");
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    public AuthenticationTokenHeader(@NotNull Parcel parcel) {
        p0.a.s(parcel, "parcel");
        this.alg = Validate.notNullOrEmpty(parcel.readString(), "alg");
        this.typ = Validate.notNullOrEmpty(parcel.readString(), ImpressionLog.F);
        this.kid = Validate.notNullOrEmpty(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(@NotNull JSONObject jSONObject) throws JSONException {
        p0.a.s(jSONObject, "jsonObject");
        String string = jSONObject.getString("alg");
        p0.a.r(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString(ImpressionLog.F);
        p0.a.r(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        p0.a.r(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }

    @VisibleForTesting
    public AuthenticationTokenHeader(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p0.a.s(str, "alg");
        p0.a.s(str2, ImpressionLog.F);
        p0.a.s(str3, "kid");
        this.alg = str;
        this.typ = str2;
        this.kid = str3;
    }
}
