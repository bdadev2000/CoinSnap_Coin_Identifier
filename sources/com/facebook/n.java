package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<n> CREATOR = new android.support.v4.media.a(22);

    /* renamed from: b, reason: collision with root package name */
    public final String f11343b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11344c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11345d;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r4 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "typ"
            java.lang.String r1 = "kid"
            java.lang.String r2 = "alg"
            java.lang.String r3 = "encodedHeaderString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            r10.<init>()
            x5.i.m(r11, r3)
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r11, r3)
            java.lang.String r5 = "decodedBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
            r6.<init>(r4, r7)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L70
            r4.<init>(r6)     // Catch: org.json.JSONException -> L70
            java.lang.String r6 = r4.optString(r2)     // Catch: org.json.JSONException -> L70
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch: org.json.JSONException -> L70
            int r7 = r6.length()     // Catch: org.json.JSONException -> L70
            r8 = 1
            if (r7 <= 0) goto L37
            r7 = r8
            goto L38
        L37:
            r7 = r3
        L38:
            if (r7 == 0) goto L44
            java.lang.String r7 = "RS256"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)     // Catch: org.json.JSONException -> L70
            if (r6 == 0) goto L44
            r6 = r8
            goto L45
        L44:
            r6 = r3
        L45:
            java.lang.String r7 = r4.optString(r1)     // Catch: org.json.JSONException -> L70
            java.lang.String r9 = "jsonObj.optString(\"kid\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)     // Catch: org.json.JSONException -> L70
            int r7 = r7.length()     // Catch: org.json.JSONException -> L70
            if (r7 <= 0) goto L56
            r7 = r8
            goto L57
        L56:
            r7 = r3
        L57:
            java.lang.String r4 = r4.optString(r0)     // Catch: org.json.JSONException -> L70
            java.lang.String r9 = "jsonObj.optString(\"typ\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)     // Catch: org.json.JSONException -> L70
            int r4 = r4.length()     // Catch: org.json.JSONException -> L70
            if (r4 <= 0) goto L68
            r4 = r8
            goto L69
        L68:
            r4 = r3
        L69:
            if (r6 == 0) goto L70
            if (r7 == 0) goto L70
            if (r4 == 0) goto L70
            goto L71
        L70:
            r8 = r3
        L71:
            if (r8 == 0) goto La8
            byte[] r11 = android.util.Base64.decode(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r5)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r11, r4)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "jsonObj.getString(\"alg\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r10.f11343b = r2
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r2 = "jsonObj.getString(\"typ\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r10.f11344c = r0
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = "jsonObj.getString(\"kid\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r10.f11345d = r11
            return
        La8:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Header"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.n.<init>(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Intrinsics.areEqual(this.f11343b, nVar.f11343b) && Intrinsics.areEqual(this.f11344c, nVar.f11344c) && Intrinsics.areEqual(this.f11345d, nVar.f11345d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11345d.hashCode() + vd.e.c(this.f11344c, vd.e.c(this.f11343b, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f11343b);
        jSONObject.put("typ", this.f11344c);
        jSONObject.put("kid", this.f11345d);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11343b);
        dest.writeString(this.f11344c);
        dest.writeString(this.f11345d);
    }

    public n(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        x5.i.o(readString, "alg");
        this.f11343b = readString;
        String readString2 = parcel.readString();
        x5.i.o(readString2, "typ");
        this.f11344c = readString2;
        String readString3 = parcel.readString();
        x5.i.o(readString3, "kid");
        this.f11345d = readString3;
    }
}
