package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final String JSON_KEY_AUD = "aud";

    @NotNull
    public static final String JSON_KEY_EMAIL = "email";

    @NotNull
    public static final String JSON_KEY_EXP = "exp";

    @NotNull
    public static final String JSON_KEY_FAMILY_NAME = "family_name";

    @NotNull
    public static final String JSON_KEY_GIVEN_NAME = "given_name";

    @NotNull
    public static final String JSON_KEY_IAT = "iat";

    @NotNull
    public static final String JSON_KEY_ISS = "iss";

    @NotNull
    public static final String JSON_KEY_JIT = "jti";

    @NotNull
    public static final String JSON_KEY_MIDDLE_NAME = "middle_name";

    @NotNull
    public static final String JSON_KEY_NAME = "name";

    @NotNull
    public static final String JSON_KEY_NONCE = "nonce";

    @NotNull
    public static final String JSON_KEY_PICTURE = "picture";

    @NotNull
    public static final String JSON_KEY_SUB = "sub";

    @NotNull
    public static final String JSON_KEY_USER_AGE_RANGE = "user_age_range";

    @NotNull
    public static final String JSON_KEY_USER_BIRTHDAY = "user_birthday";

    @NotNull
    public static final String JSON_KEY_USER_FRIENDS = "user_friends";

    @NotNull
    public static final String JSON_KEY_USER_GENDER = "user_gender";

    @NotNull
    public static final String JSON_KEY_USER_HOMETOWN = "user_hometown";

    @NotNull
    public static final String JSON_KEY_USER_LINK = "user_link";

    @NotNull
    public static final String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;

    @NotNull
    private final String aud;

    @Nullable
    private final String email;
    private final long exp;

    @Nullable
    private final String familyName;

    @Nullable
    private final String givenName;
    private final long iat;

    @NotNull
    private final String iss;

    @NotNull
    private final String jti;

    @Nullable
    private final String middleName;

    @Nullable
    private final String name;

    @NotNull
    private final String nonce;

    @Nullable
    private final String picture;

    @NotNull
    private final String sub;

    @Nullable
    private final Map<String, Integer> userAgeRange;

    @Nullable
    private final String userBirthday;

    @Nullable
    private final Set<String> userFriends;

    @Nullable
    private final String userGender;

    @Nullable
    private final Map<String, String> userHometown;

    @Nullable
    private final String userLink;

    @Nullable
    private final Map<String, String> userLocation;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new Parcelable.Creator<AuthenticationTokenClaims>() { // from class: com.facebook.AuthenticationTokenClaims$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenClaims createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AuthenticationTokenClaims[] newArray(int i2) {
            return new AuthenticationTokenClaims[i2];
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final AuthenticationTokenClaims createFromJSONObject$facebook_core_release(@NotNull JSONObject jSONObject) throws JSONException {
            p0.a.s(jSONObject, "jsonObject");
            String string = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_JIT);
            String string2 = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_ISS);
            String string3 = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_AUD);
            String string4 = jSONObject.getString("nonce");
            long j2 = jSONObject.getLong("exp");
            long j3 = jSONObject.getLong(AuthenticationTokenClaims.JSON_KEY_IAT);
            String string5 = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_SUB);
            String nullableString$facebook_core_release = getNullableString$facebook_core_release(jSONObject, "name");
            String nullableString$facebook_core_release2 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME);
            String nullableString$facebook_core_release3 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
            String nullableString$facebook_core_release4 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME);
            String nullableString$facebook_core_release5 = getNullableString$facebook_core_release(jSONObject, "email");
            String nullableString$facebook_core_release6 = getNullableString$facebook_core_release(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray(AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            String nullableString$facebook_core_release7 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY);
            JSONObject optJSONObject = jSONObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            JSONObject optJSONObject3 = jSONObject.optJSONObject(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            String nullableString$facebook_core_release8 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
            String nullableString$facebook_core_release9 = getNullableString$facebook_core_release(jSONObject, AuthenticationTokenClaims.JSON_KEY_USER_LINK);
            p0.a.r(string, AuthenticationTokenClaims.JSON_KEY_JIT);
            p0.a.r(string2, AuthenticationTokenClaims.JSON_KEY_ISS);
            p0.a.r(string3, AuthenticationTokenClaims.JSON_KEY_AUD);
            p0.a.r(string4, "nonce");
            p0.a.r(string5, AuthenticationTokenClaims.JSON_KEY_SUB);
            return new AuthenticationTokenClaims(string, string2, string3, string4, j2, j3, string5, nullableString$facebook_core_release, nullableString$facebook_core_release2, nullableString$facebook_core_release3, nullableString$facebook_core_release4, nullableString$facebook_core_release5, nullableString$facebook_core_release6, optJSONArray == null ? null : Utility.jsonArrayToStringList(optJSONArray), nullableString$facebook_core_release7, optJSONObject == null ? null : Utility.convertJSONObjectToHashMap(optJSONObject), optJSONObject2 == null ? null : Utility.convertJSONObjectToStringMap(optJSONObject2), optJSONObject3 != null ? Utility.convertJSONObjectToStringMap(optJSONObject3) : null, nullableString$facebook_core_release8, nullableString$facebook_core_release9);
        }

        @Nullable
        public final String getNullableString$facebook_core_release(@NotNull JSONObject jSONObject, @NotNull String str) {
            p0.a.s(jSONObject, "<this>");
            p0.a.s(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5) {
        this(str, str2, str3, str4, j2, j3, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (p0.a.g(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isValidClaims(org.json.JSONObject r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r7.optString(r2)
            p0.a.r(r3, r2)
            int r2 = r3.length()
            if (r2 != 0) goto L16
            return r1
        L16:
            java.lang.String r2 = r7.optString(r0)     // Catch: java.net.MalformedURLException -> Lc2
            p0.a.r(r2, r0)     // Catch: java.net.MalformedURLException -> Lc2
            int r0 = r2.length()     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L24
            goto L46
        L24:
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r3 = "facebook.com"
            boolean r0 = p0.a.g(r0, r3)     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L47
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lc2
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Lc2
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = p0.a.g(r0, r2)     // Catch: java.net.MalformedURLException -> Lc2
            if (r0 != 0) goto L47
        L46:
            return r1
        L47:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r7.optString(r0)
            p0.a.r(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L57
            goto L61
        L57:
            java.lang.String r0 = com.facebook.FacebookSdk.getApplicationId()
            boolean r0 = p0.a.g(r2, r0)
            if (r0 != 0) goto L62
        L61:
            return r1
        L62:
            java.util.Date r0 = new java.util.Date
            java.lang.String r2 = "exp"
            long r2 = r7.optLong(r2)
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 * r4
            r0.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L7d
            return r1
        L7d:
            java.lang.String r0 = "iat"
            long r2 = r7.optLong(r0)
            java.util.Date r0 = new java.util.Date
            long r2 = r2 * r4
            r4 = 600000(0x927c0, double:2.964394E-318)
            long r2 = r2 + r4
            r0.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L99
            return r1
        L99:
            java.lang.String r0 = "sub"
            java.lang.String r2 = r7.optString(r0)
            p0.a.r(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto La9
            return r1
        La9:
            java.lang.String r0 = "nonce"
            java.lang.String r7 = r7.optString(r0)
            p0.a.r(r7, r0)
            int r0 = r7.length()
            if (r0 != 0) goto Lb9
            goto Lbf
        Lb9:
            boolean r7 = p0.a.g(r7, r8)
            if (r7 != 0) goto Lc0
        Lbf:
            return r1
        Lc0:
            r7 = 1
            return r7
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.AuthenticationTokenClaims.isValidClaims(org.json.JSONObject, java.lang.String):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return p0.a.g(this.jti, authenticationTokenClaims.jti) && p0.a.g(this.iss, authenticationTokenClaims.iss) && p0.a.g(this.aud, authenticationTokenClaims.aud) && p0.a.g(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && p0.a.g(this.sub, authenticationTokenClaims.sub) && p0.a.g(this.name, authenticationTokenClaims.name) && p0.a.g(this.givenName, authenticationTokenClaims.givenName) && p0.a.g(this.middleName, authenticationTokenClaims.middleName) && p0.a.g(this.familyName, authenticationTokenClaims.familyName) && p0.a.g(this.email, authenticationTokenClaims.email) && p0.a.g(this.picture, authenticationTokenClaims.picture) && p0.a.g(this.userFriends, authenticationTokenClaims.userFriends) && p0.a.g(this.userBirthday, authenticationTokenClaims.userBirthday) && p0.a.g(this.userAgeRange, authenticationTokenClaims.userAgeRange) && p0.a.g(this.userHometown, authenticationTokenClaims.userHometown) && p0.a.g(this.userLocation, authenticationTokenClaims.userLocation) && p0.a.g(this.userGender, authenticationTokenClaims.userGender) && p0.a.g(this.userLink, authenticationTokenClaims.userLink);
    }

    @NotNull
    public final String getAud() {
        return this.aud;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    public final long getExp() {
        return this.exp;
    }

    @Nullable
    public final String getFamilyName() {
        return this.familyName;
    }

    @Nullable
    public final String getGivenName() {
        return this.givenName;
    }

    public final long getIat() {
        return this.iat;
    }

    @NotNull
    public final String getIss() {
        return this.iss;
    }

    @NotNull
    public final String getJti() {
        return this.jti;
    }

    @Nullable
    public final String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @NotNull
    public final String getSub() {
        return this.sub;
    }

    @Nullable
    public final Map<String, Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    @Nullable
    public final String getUserBirthday() {
        return this.userBirthday;
    }

    @Nullable
    public final Set<String> getUserFriends() {
        return this.userFriends;
    }

    @Nullable
    public final String getUserGender() {
        return this.userGender;
    }

    @Nullable
    public final Map<String, String> getUserHometown() {
        return this.userHometown;
    }

    @Nullable
    public final String getUserLink() {
        return this.userLink;
    }

    @Nullable
    public final Map<String, String> getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int b2 = androidx.compose.foundation.text.input.a.b(this.sub, android.support.v4.media.d.d(this.iat, android.support.v4.media.d.d(this.exp, androidx.compose.foundation.text.input.a.b(this.nonce, androidx.compose.foundation.text.input.a.b(this.aud, androidx.compose.foundation.text.input.a.b(this.iss, androidx.compose.foundation.text.input.a.b(this.jti, 527, 31), 31), 31), 31), 31), 31), 31);
        String str = this.name;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.userFriends;
        int hashCode7 = (hashCode6 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.userHometown;
        int hashCode10 = (hashCode9 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.userLocation;
        int hashCode11 = (hashCode10 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    @VisibleForTesting
    @NotNull
    public final String toEnCodedString() {
        String authenticationTokenClaims = toString();
        Charset charset = z0.a.f31458a;
        if (authenticationTokenClaims == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = authenticationTokenClaims.getBytes(charset);
        p0.a.r(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 8);
        p0.a.r(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.URL_SAFE)");
        return encodeToString;
    }

    @VisibleForTesting
    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put("exp", this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        p0.a.r(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "dest");
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6) {
        this(str, str2, str3, str4, j2, j3, str5, str6, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, null, null, null, null, null, null, null, null, null, null, 1047552, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, null, null, null, null, null, null, null, null, null, 1046528, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, null, null, null, null, null, null, null, null, 1044480, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, null, null, null, null, null, null, null, 1040384, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, null, null, null, null, null, null, 1032192, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, str12, null, null, null, null, null, 1015808, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, null, null, null, null, 983040, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, null, null, null, 917504, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, null, null, 786432, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str13) {
        this(str, str2, str3, str4, j2, j3, str5, str6, str7, str8, str9, str10, str11, collection, str12, map, map2, map3, str13, null, Opcodes.ASM8, null);
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
    }

    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2) {
        p0.a.s(str, "encodedClaims");
        p0.a.s(str2, "expectedNonce");
        Validate.notEmpty(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        p0.a.r(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, z0.a.f31458a));
        if (isValidClaims(jSONObject, str2)) {
            String string = jSONObject.getString(JSON_KEY_JIT);
            p0.a.r(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.jti = string;
            String string2 = jSONObject.getString(JSON_KEY_ISS);
            p0.a.r(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.iss = string2;
            String string3 = jSONObject.getString(JSON_KEY_AUD);
            p0.a.r(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.aud = string3;
            String string4 = jSONObject.getString("nonce");
            p0.a.r(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.nonce = string4;
            this.exp = jSONObject.getLong("exp");
            this.iat = jSONObject.getLong(JSON_KEY_IAT);
            String string5 = jSONObject.getString(JSON_KEY_SUB);
            p0.a.r(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.sub = string5;
            Companion companion = Companion;
            this.name = companion.getNullableString$facebook_core_release(jSONObject, "name");
            this.givenName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_GIVEN_NAME);
            this.middleName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_MIDDLE_NAME);
            this.familyName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_FAMILY_NAME);
            this.email = companion.getNullableString$facebook_core_release(jSONObject, "email");
            this.picture = companion.getNullableString$facebook_core_release(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
            this.userFriends = optJSONArray == null ? null : Collections.unmodifiableSet(Utility.jsonArrayToSet(optJSONArray));
            this.userBirthday = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_BIRTHDAY);
            JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
            this.userAgeRange = optJSONObject == null ? null : Collections.unmodifiableMap(Utility.convertJSONObjectToHashMap(optJSONObject));
            JSONObject optJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
            this.userHometown = optJSONObject2 == null ? null : Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject2));
            JSONObject optJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
            this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(Utility.convertJSONObjectToStringMap(optJSONObject3)) : null;
            this.userGender = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_GENDER);
            this.userLink = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_LINK);
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    public /* synthetic */ AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j2, long j3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection collection, String str12, Map map, Map map2, Map map3, String str13, String str14, int i2, k kVar) {
        this(str, str2, str3, str4, j2, j3, str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? null : str9, (i2 & Opcodes.ACC_STRICT) != 0 ? null : str10, (i2 & 4096) != 0 ? null : str11, (i2 & 8192) != 0 ? null : collection, (i2 & 16384) != 0 ? null : str12, (32768 & i2) != 0 ? null : map, (65536 & i2) != 0 ? null : map2, (131072 & i2) != 0 ? null : map3, (262144 & i2) != 0 ? null : str13, (i2 & Opcodes.ASM8) != 0 ? null : str14);
    }

    @VisibleForTesting
    public AuthenticationTokenClaims(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2, long j3, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Collection<String> collection, @Nullable String str12, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str13, @Nullable String str14) {
        p0.a.s(str, JSON_KEY_JIT);
        p0.a.s(str2, JSON_KEY_ISS);
        p0.a.s(str3, JSON_KEY_AUD);
        p0.a.s(str4, "nonce");
        p0.a.s(str5, JSON_KEY_SUB);
        Validate.notEmpty(str, JSON_KEY_JIT);
        Validate.notEmpty(str2, JSON_KEY_ISS);
        Validate.notEmpty(str3, JSON_KEY_AUD);
        Validate.notEmpty(str4, "nonce");
        Validate.notEmpty(str5, JSON_KEY_SUB);
        this.jti = str;
        this.iss = str2;
        this.aud = str3;
        this.nonce = str4;
        this.exp = j2;
        this.iat = j3;
        this.sub = str5;
        this.name = str6;
        this.givenName = str7;
        this.middleName = str8;
        this.familyName = str9;
        this.email = str10;
        this.picture = str11;
        this.userFriends = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.userBirthday = str12;
        this.userAgeRange = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.userHometown = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.userLocation = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.userGender = str13;
        this.userLink = str14;
    }

    public AuthenticationTokenClaims(@NotNull Parcel parcel) {
        p0.a.s(parcel, "parcel");
        this.jti = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_JIT);
        this.iss = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_ISS);
        this.aud = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_AUD);
        this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = Validate.notNullOrEmpty(parcel.readString(), JSON_KEY_SUB);
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.userFriends = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(p.class.getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.userAgeRange = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(i0.class.getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.userHometown = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(i0.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.userLocation = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
