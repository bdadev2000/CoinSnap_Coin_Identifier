package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractC1839h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* renamed from: com.facebook.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830h implements Parcelable {
    public static final Parcelable.Creator<C1830h> CREATOR = new E3.b(27);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13549c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13550d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13551f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13552g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13553h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13554i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13555j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13556k;
    public final String l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13557n;

    /* renamed from: o, reason: collision with root package name */
    public final String f13558o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f13559p;

    /* renamed from: q, reason: collision with root package name */
    public final String f13560q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f13561r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f13562s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f13563t;

    /* renamed from: u, reason: collision with root package name */
    public final String f13564u;

    /* renamed from: v, reason: collision with root package name */
    public final String f13565v;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (G7.j.a(new java.net.URL(r1).getHost(), "www.facebook.com") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1830h(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1830h.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1830h)) {
            return false;
        }
        C1830h c1830h = (C1830h) obj;
        if (G7.j.a(this.b, c1830h.b) && G7.j.a(this.f13549c, c1830h.f13549c) && G7.j.a(this.f13550d, c1830h.f13550d) && G7.j.a(this.f13551f, c1830h.f13551f) && this.f13552g == c1830h.f13552g && this.f13553h == c1830h.f13553h && G7.j.a(this.f13554i, c1830h.f13554i) && G7.j.a(this.f13555j, c1830h.f13555j) && G7.j.a(this.f13556k, c1830h.f13556k) && G7.j.a(this.l, c1830h.l) && G7.j.a(this.m, c1830h.m) && G7.j.a(this.f13557n, c1830h.f13557n) && G7.j.a(this.f13558o, c1830h.f13558o) && G7.j.a(this.f13559p, c1830h.f13559p) && G7.j.a(this.f13560q, c1830h.f13560q) && G7.j.a(this.f13561r, c1830h.f13561r) && G7.j.a(this.f13562s, c1830h.f13562s) && G7.j.a(this.f13563t, c1830h.f13563t) && G7.j.a(this.f13564u, c1830h.f13564u) && G7.j.a(this.f13565v, c1830h.f13565v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int b = AbstractC2914a.b((Long.hashCode(this.f13553h) + ((Long.hashCode(this.f13552g) + AbstractC2914a.b(AbstractC2914a.b(AbstractC2914a.b(AbstractC2914a.b(527, 31, this.b), 31, this.f13549c), 31, this.f13550d), 31, this.f13551f)) * 31)) * 31, 31, this.f13554i);
        int i9 = 0;
        String str = this.f13555j;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (b + hashCode) * 31;
        String str2 = this.f13556k;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.l;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.m;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.f13557n;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.f13558o;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Set set = this.f13559p;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.f13560q;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Map map = this.f13561r;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Map map2 = this.f13562s;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        Map map3 = this.f13563t;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        String str8 = this.f13564u;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str9 = this.f13565v;
        if (str9 != null) {
            i9 = str9.hashCode();
        }
        return i21 + i9;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.b);
        jSONObject.put("iss", this.f13549c);
        jSONObject.put("aud", this.f13550d);
        jSONObject.put("nonce", this.f13551f);
        jSONObject.put("exp", this.f13552g);
        jSONObject.put("iat", this.f13553h);
        String str = this.f13554i;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f13555j;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f13556k;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.m;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f13557n;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f13558o;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f13559p;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f13560q;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f13561r;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f13562s;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f13563t;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f13564u;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f13565v;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        String jSONObject2 = jSONObject.toString();
        G7.j.d(jSONObject2, "claimsJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f13549c);
        parcel.writeString(this.f13550d);
        parcel.writeString(this.f13551f);
        parcel.writeLong(this.f13552g);
        parcel.writeLong(this.f13553h);
        parcel.writeString(this.f13554i);
        parcel.writeString(this.f13555j);
        parcel.writeString(this.f13556k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.f13557n);
        parcel.writeString(this.f13558o);
        Set set = this.f13559p;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.f13560q);
        parcel.writeMap(this.f13561r);
        parcel.writeMap(this.f13562s);
        parcel.writeMap(this.f13563t);
        parcel.writeString(this.f13564u);
        parcel.writeString(this.f13565v);
    }

    public C1830h(Parcel parcel) {
        G7.j.e(parcel, "parcel");
        String readString = parcel.readString();
        AbstractC1839h.j(readString, "jti");
        this.b = readString;
        String readString2 = parcel.readString();
        AbstractC1839h.j(readString2, "iss");
        this.f13549c = readString2;
        String readString3 = parcel.readString();
        AbstractC1839h.j(readString3, "aud");
        this.f13550d = readString3;
        String readString4 = parcel.readString();
        AbstractC1839h.j(readString4, "nonce");
        this.f13551f = readString4;
        this.f13552g = parcel.readLong();
        this.f13553h = parcel.readLong();
        String readString5 = parcel.readString();
        AbstractC1839h.j(readString5, "sub");
        this.f13554i = readString5;
        this.f13555j = parcel.readString();
        this.f13556k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.f13557n = parcel.readString();
        this.f13558o = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f13559p = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f13560q = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(G7.i.class.getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f13561r = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(G7.u.class.getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f13562s = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(G7.u.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f13563t = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f13564u = parcel.readString();
        this.f13565v = parcel.readString();
    }
}
