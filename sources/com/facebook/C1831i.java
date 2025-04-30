package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractC1839h;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* renamed from: com.facebook.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1831i implements Parcelable {
    public static final Parcelable.Creator<C1831i> CREATOR = new E3.b(28);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13567d;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r4 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1831i(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "typ"
            java.lang.String r1 = "kid"
            java.lang.String r2 = "alg"
            java.lang.String r3 = "encodedHeaderString"
            G7.j.e(r11, r3)
            r10.<init>()
            com.facebook.internal.AbstractC1839h.h(r11, r3)
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r11, r3)
            java.lang.String r5 = "decodedBytes"
            G7.j.d(r4, r5)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = O7.a.f2244a
            r6.<init>(r4, r7)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6b
            r4.<init>(r6)     // Catch: org.json.JSONException -> L6b
            java.lang.String r6 = r4.optString(r2)     // Catch: org.json.JSONException -> L6b
            G7.j.d(r6, r2)     // Catch: org.json.JSONException -> L6b
            int r7 = r6.length()     // Catch: org.json.JSONException -> L6b
            r8 = 1
            if (r7 <= 0) goto L3f
            java.lang.String r7 = "RS256"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> L6b
            if (r6 == 0) goto L3f
            r6 = r8
            goto L40
        L3f:
            r6 = r3
        L40:
            java.lang.String r7 = r4.optString(r1)     // Catch: org.json.JSONException -> L6b
            java.lang.String r9 = "jsonObj.optString(\"kid\")"
            G7.j.d(r7, r9)     // Catch: org.json.JSONException -> L6b
            int r7 = r7.length()     // Catch: org.json.JSONException -> L6b
            if (r7 <= 0) goto L51
            r7 = r8
            goto L52
        L51:
            r7 = r3
        L52:
            java.lang.String r4 = r4.optString(r0)     // Catch: org.json.JSONException -> L6b
            java.lang.String r9 = "jsonObj.optString(\"typ\")"
            G7.j.d(r4, r9)     // Catch: org.json.JSONException -> L6b
            int r4 = r4.length()     // Catch: org.json.JSONException -> L6b
            if (r4 <= 0) goto L63
            r4 = r8
            goto L64
        L63:
            r4 = r3
        L64:
            if (r6 == 0) goto L6b
            if (r7 == 0) goto L6b
            if (r4 == 0) goto L6b
            goto L6c
        L6b:
            r8 = r3
        L6c:
            if (r8 == 0) goto La3
            byte[] r11 = android.util.Base64.decode(r11, r3)
            G7.j.d(r11, r5)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = O7.a.f2244a
            r3.<init>(r11, r4)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "jsonObj.getString(\"alg\")"
            G7.j.d(r2, r3)
            r10.b = r2
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r2 = "jsonObj.getString(\"typ\")"
            G7.j.d(r0, r2)
            r10.f13566c = r0
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = "jsonObj.getString(\"kid\")"
            G7.j.d(r11, r0)
            r10.f13567d = r11
            return
        La3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Header"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1831i.<init>(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1831i)) {
            return false;
        }
        C1831i c1831i = (C1831i) obj;
        if (G7.j.a(this.b, c1831i.b) && G7.j.a(this.f13566c, c1831i.f13566c) && G7.j.a(this.f13567d, c1831i.f13567d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13567d.hashCode() + AbstractC2914a.b(AbstractC2914a.b(527, 31, this.b), 31, this.f13566c);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.b);
        jSONObject.put("typ", this.f13566c);
        jSONObject.put("kid", this.f13567d);
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f13566c);
        parcel.writeString(this.f13567d);
    }

    public C1831i(Parcel parcel) {
        G7.j.e(parcel, "parcel");
        String readString = parcel.readString();
        AbstractC1839h.j(readString, "alg");
        this.b = readString;
        String readString2 = parcel.readString();
        AbstractC1839h.j(readString2, "typ");
        this.f13566c = readString2;
        String readString3 = parcel.readString();
        AbstractC1839h.j(readString3, "kid");
        this.f13567d = readString3;
    }
}
