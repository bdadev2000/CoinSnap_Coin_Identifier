package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<m> CREATOR = new android.support.v4.media.a(21);

    /* renamed from: b, reason: collision with root package name */
    public final String f11316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11318d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11319f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11320g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11321h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11322i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11323j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11324k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11325l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11326m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11327n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11328o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f11329p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11330q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f11331r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f11332s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f11333t;
    public final String u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11334v;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(r4).getHost(), "www.facebook.com") == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Intrinsics.areEqual(this.f11316b, mVar.f11316b) && Intrinsics.areEqual(this.f11317c, mVar.f11317c) && Intrinsics.areEqual(this.f11318d, mVar.f11318d) && Intrinsics.areEqual(this.f11319f, mVar.f11319f) && this.f11320g == mVar.f11320g && this.f11321h == mVar.f11321h && Intrinsics.areEqual(this.f11322i, mVar.f11322i) && Intrinsics.areEqual(this.f11323j, mVar.f11323j) && Intrinsics.areEqual(this.f11324k, mVar.f11324k) && Intrinsics.areEqual(this.f11325l, mVar.f11325l) && Intrinsics.areEqual(this.f11326m, mVar.f11326m) && Intrinsics.areEqual(this.f11327n, mVar.f11327n) && Intrinsics.areEqual(this.f11328o, mVar.f11328o) && Intrinsics.areEqual(this.f11329p, mVar.f11329p) && Intrinsics.areEqual(this.f11330q, mVar.f11330q) && Intrinsics.areEqual(this.f11331r, mVar.f11331r) && Intrinsics.areEqual(this.f11332s, mVar.f11332s) && Intrinsics.areEqual(this.f11333t, mVar.f11333t) && Intrinsics.areEqual(this.u, mVar.u) && Intrinsics.areEqual(this.f11334v, mVar.f11334v)) {
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
        int c10 = vd.e.c(this.f11322i, (Long.hashCode(this.f11321h) + ((Long.hashCode(this.f11320g) + vd.e.c(this.f11319f, vd.e.c(this.f11318d, vd.e.c(this.f11317c, vd.e.c(this.f11316b, 527, 31), 31), 31), 31)) * 31)) * 31, 31);
        int i10 = 0;
        String str = this.f11323j;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c10 + hashCode) * 31;
        String str2 = this.f11324k;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f11325l;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f11326m;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.f11327n;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.f11328o;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Set set = this.f11329p;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str7 = this.f11330q;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Map map = this.f11331r;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Map map2 = this.f11332s;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Map map3 = this.f11333t;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        String str8 = this.u;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str9 = this.f11334v;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return i22 + i10;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f11316b);
        jSONObject.put("iss", this.f11317c);
        jSONObject.put("aud", this.f11318d);
        jSONObject.put("nonce", this.f11319f);
        jSONObject.put("exp", this.f11320g);
        jSONObject.put("iat", this.f11321h);
        String str = this.f11322i;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f11323j;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f11324k;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f11325l;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f11326m;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f11327n;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f11328o;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f11329p;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f11330q;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f11331r;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f11332s;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f11333t;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.u;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f11334v;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "claimsJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11316b);
        dest.writeString(this.f11317c);
        dest.writeString(this.f11318d);
        dest.writeString(this.f11319f);
        dest.writeLong(this.f11320g);
        dest.writeLong(this.f11321h);
        dest.writeString(this.f11322i);
        dest.writeString(this.f11323j);
        dest.writeString(this.f11324k);
        dest.writeString(this.f11325l);
        dest.writeString(this.f11326m);
        dest.writeString(this.f11327n);
        dest.writeString(this.f11328o);
        Set set = this.f11329p;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.f11330q);
        dest.writeMap(this.f11331r);
        dest.writeMap(this.f11332s);
        dest.writeMap(this.f11333t);
        dest.writeString(this.u);
        dest.writeString(this.f11334v);
    }

    public m(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        x5.i.o(readString, "jti");
        this.f11316b = readString;
        String readString2 = parcel.readString();
        x5.i.o(readString2, "iss");
        this.f11317c = readString2;
        String readString3 = parcel.readString();
        x5.i.o(readString3, "aud");
        this.f11318d = readString3;
        String readString4 = parcel.readString();
        x5.i.o(readString4, "nonce");
        this.f11319f = readString4;
        this.f11320g = parcel.readLong();
        this.f11321h = parcel.readLong();
        String readString5 = parcel.readString();
        x5.i.o(readString5, "sub");
        this.f11322i = readString5;
        this.f11323j = parcel.readString();
        this.f11324k = parcel.readString();
        this.f11325l = parcel.readString();
        this.f11326m = parcel.readString();
        this.f11327n = parcel.readString();
        this.f11328o = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f11329p = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f11330q = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f11331r = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(StringCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f11332s = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(StringCompanionObject.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f11333t = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.u = parcel.readString();
        this.f11334v = parcel.readString();
    }
}
