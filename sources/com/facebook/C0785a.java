package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.AbstractC1839h;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* renamed from: com.facebook.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785a implements Parcelable {
    public final Date b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f13442c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f13443d;

    /* renamed from: f, reason: collision with root package name */
    public final Set f13444f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13445g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC1828f f13446h;

    /* renamed from: i, reason: collision with root package name */
    public final Date f13447i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13448j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13449k;
    public final Date l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public static final Date f13439n = new Date(Long.MAX_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final Date f13440o = new Date();

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC1828f f13441p = EnumC1828f.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<C0785a> CREATOR = new E3.b(25);

    public C0785a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC1828f enumC1828f, Date date, Date date2, Date date3, String str4) {
        G7.j.e(str, "accessToken");
        G7.j.e(str2, "applicationId");
        G7.j.e(str3, "userId");
        AbstractC1839h.h(str, "accessToken");
        AbstractC1839h.h(str2, "applicationId");
        AbstractC1839h.h(str3, "userId");
        Date date4 = f13439n;
        this.b = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        G7.j.d(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f13442c = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        G7.j.d(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f13443d = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        G7.j.d(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f13444f = unmodifiableSet3;
        this.f13445g = str;
        enumC1828f = enumC1828f == null ? f13441p : enumC1828f;
        if (str4 != null && str4.equals("instagram")) {
            int ordinal = enumC1828f.ordinal();
            if (ordinal == 1) {
                enumC1828f = EnumC1828f.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                enumC1828f = EnumC1828f.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                enumC1828f = EnumC1828f.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f13446h = enumC1828f;
        this.f13447i = date2 == null ? f13440o : date2;
        this.f13448j = str2;
        this.f13449k = str3;
        this.l = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.m = str4 == null ? "facebook" : str4;
    }

    public static String c() {
        throw null;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(BidResponsed.KEY_TOKEN, this.f13445g);
        jSONObject.put("expires_at", this.b.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f13442c));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f13443d));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f13444f));
        jSONObject.put("last_refresh", this.f13447i.getTime());
        jSONObject.put("source", this.f13446h.name());
        jSONObject.put("application_id", this.f13448j);
        jSONObject.put("user_id", this.f13449k);
        jSONObject.put("data_access_expiration_time", this.l.getTime());
        String str = this.m;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean a6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0785a)) {
            return false;
        }
        C0785a c0785a = (C0785a) obj;
        if (G7.j.a(this.b, c0785a.b) && G7.j.a(this.f13442c, c0785a.f13442c) && G7.j.a(this.f13443d, c0785a.f13443d) && G7.j.a(this.f13444f, c0785a.f13444f) && G7.j.a(this.f13445g, c0785a.f13445g) && this.f13446h == c0785a.f13446h && G7.j.a(this.f13447i, c0785a.f13447i) && G7.j.a(this.f13448j, c0785a.f13448j) && G7.j.a(this.f13449k, c0785a.f13449k) && G7.j.a(this.l, c0785a.l)) {
            String str = this.m;
            String str2 = c0785a.m;
            if (str == null) {
                if (str2 == null) {
                    a6 = true;
                } else {
                    a6 = false;
                }
            } else {
                a6 = G7.j.a(str, str2);
            }
            if (a6) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.l.hashCode() + AbstractC2914a.b(AbstractC2914a.b((this.f13447i.hashCode() + ((this.f13446h.hashCode() + AbstractC2914a.b((this.f13444f.hashCode() + ((this.f13443d.hashCode() + ((this.f13442c.hashCode() + ((this.b.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31, this.f13445g)) * 31)) * 31, 31, this.f13448j), 31, this.f13449k)) * 31;
        String str = this.m;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        r rVar = r.f13801a;
        r.h(H.f13411c);
        sb.append(TextUtils.join(", ", this.f13442c));
        sb.append("]}");
        String sb2 = sb.toString();
        G7.j.d(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeLong(this.b.getTime());
        parcel.writeStringList(new ArrayList(this.f13442c));
        parcel.writeStringList(new ArrayList(this.f13443d));
        parcel.writeStringList(new ArrayList(this.f13444f));
        parcel.writeString(this.f13445g);
        parcel.writeString(this.f13446h.name());
        parcel.writeLong(this.f13447i.getTime());
        parcel.writeString(this.f13448j);
        parcel.writeString(this.f13449k);
        parcel.writeLong(this.l.getTime());
        parcel.writeString(this.m);
    }

    public C0785a(Parcel parcel) {
        EnumC1828f enumC1828f;
        G7.j.e(parcel, "parcel");
        this.b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        G7.j.d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f13442c = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        G7.j.d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f13443d = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        G7.j.d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f13444f = unmodifiableSet3;
        String readString = parcel.readString();
        AbstractC1839h.j(readString, BidResponsed.KEY_TOKEN);
        this.f13445g = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            enumC1828f = EnumC1828f.valueOf(readString2);
        } else {
            enumC1828f = f13441p;
        }
        this.f13446h = enumC1828f;
        this.f13447i = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        AbstractC1839h.j(readString3, "applicationId");
        this.f13448j = readString3;
        String readString4 = parcel.readString();
        AbstractC1839h.j(readString4, "userId");
        this.f13449k = readString4;
        this.l = new Date(parcel.readLong());
        this.m = parcel.readString();
    }
}
