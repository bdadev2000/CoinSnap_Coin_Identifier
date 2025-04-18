package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Date f10883b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f10884c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f10885d;

    /* renamed from: f, reason: collision with root package name */
    public final Set f10886f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10887g;

    /* renamed from: h, reason: collision with root package name */
    public final k f10888h;

    /* renamed from: i, reason: collision with root package name */
    public final Date f10889i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10890j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10891k;

    /* renamed from: l, reason: collision with root package name */
    public final Date f10892l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10893m;

    /* renamed from: n, reason: collision with root package name */
    public static final Date f10880n = new Date(Long.MAX_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final Date f10881o = new Date();

    /* renamed from: p, reason: collision with root package name */
    public static final k f10882p = k.FACEBOOK_APPLICATION_WEB;

    @JvmField
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(19);

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, k kVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, kVar, date, date2, date3, "facebook");
    }

    public static String c() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(BidResponsed.KEY_TOKEN, this.f10887g);
        jSONObject.put("expires_at", this.f10883b.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f10884c));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f10885d));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f10886f));
        jSONObject.put("last_refresh", this.f10889i.getTime());
        jSONObject.put("source", this.f10888h.name());
        jSONObject.put("application_id", this.f10890j);
        jSONObject.put("user_id", this.f10891k);
        jSONObject.put("data_access_expiration_time", this.f10892l.getTime());
        String str = this.f10893m;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.f10883b, aVar.f10883b) && Intrinsics.areEqual(this.f10884c, aVar.f10884c) && Intrinsics.areEqual(this.f10885d, aVar.f10885d) && Intrinsics.areEqual(this.f10886f, aVar.f10886f) && Intrinsics.areEqual(this.f10887g, aVar.f10887g) && this.f10888h == aVar.f10888h && Intrinsics.areEqual(this.f10889i, aVar.f10889i) && Intrinsics.areEqual(this.f10890j, aVar.f10890j) && Intrinsics.areEqual(this.f10891k, aVar.f10891k) && Intrinsics.areEqual(this.f10892l, aVar.f10892l)) {
            String str = this.f10893m;
            String str2 = aVar.f10893m;
            if (str == null) {
                if (str2 == null) {
                    areEqual = true;
                } else {
                    areEqual = false;
                }
            } else {
                areEqual = Intrinsics.areEqual(str, str2);
            }
            if (areEqual) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10892l.hashCode() + vd.e.c(this.f10891k, vd.e.c(this.f10890j, (this.f10889i.hashCode() + ((this.f10888h.hashCode() + vd.e.c(this.f10887g, (this.f10886f.hashCode() + ((this.f10885d.hashCode() + ((this.f10884c.hashCode() + ((this.f10883b.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f10893m;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        x xVar = x.a;
        x.i(m0.INCLUDE_ACCESS_TOKENS);
        sb2.append(TextUtils.join(", ", this.f10884c));
        sb2.append("]}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f10883b.getTime());
        dest.writeStringList(new ArrayList(this.f10884c));
        dest.writeStringList(new ArrayList(this.f10885d));
        dest.writeStringList(new ArrayList(this.f10886f));
        dest.writeString(this.f10887g);
        dest.writeString(this.f10888h.name());
        dest.writeLong(this.f10889i.getTime());
        dest.writeString(this.f10890j);
        dest.writeString(this.f10891k);
        dest.writeLong(this.f10892l.getTime());
        dest.writeString(this.f10893m);
    }

    public a(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, k kVar, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        x5.i.m(accessToken, "accessToken");
        x5.i.m(applicationId, "applicationId");
        x5.i.m(userId, "userId");
        Date date4 = f10880n;
        this.f10883b = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f10884c = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f10885d = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f10886f = unmodifiableSet3;
        this.f10887g = accessToken;
        kVar = kVar == null ? f10882p : kVar;
        if (str != null && str.equals("instagram")) {
            int ordinal = kVar.ordinal();
            if (ordinal == 1) {
                kVar = k.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                kVar = k.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                kVar = k.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f10888h = kVar;
        this.f10889i = date2 == null ? f10881o : date2;
        this.f10890j = applicationId;
        this.f10891k = userId;
        this.f10892l = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f10893m = str == null ? "facebook" : str;
    }

    public a(Parcel parcel) {
        k kVar;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f10883b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f10884c = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f10885d = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f10886f = unmodifiableSet3;
        String readString = parcel.readString();
        x5.i.o(readString, BidResponsed.KEY_TOKEN);
        this.f10887g = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            kVar = k.valueOf(readString2);
        } else {
            kVar = f10882p;
        }
        this.f10888h = kVar;
        this.f10889i = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        x5.i.o(readString3, "applicationId");
        this.f10890j = readString3;
        String readString4 = parcel.readString();
        x5.i.o(readString4, "userId");
        this.f10891k = readString4;
        this.f10892l = new Date(parcel.readLong());
        this.f10893m = parcel.readString();
    }
}
