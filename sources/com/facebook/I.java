package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractC1839h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new y(1);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13418c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13419d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13420f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13421g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f13422h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f13423i;

    public I(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        AbstractC1839h.j(str, "id");
        this.b = str;
        this.f13418c = str2;
        this.f13419d = str3;
        this.f13420f = str4;
        this.f13421g = str5;
        this.f13422h = uri;
        this.f13423i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        String str5 = this.b;
        if (((str5 == null && ((I) obj).b == null) || G7.j.a(str5, ((I) obj).b)) && ((((str = this.f13418c) == null && ((I) obj).f13418c == null) || G7.j.a(str, ((I) obj).f13418c)) && ((((str2 = this.f13419d) == null && ((I) obj).f13419d == null) || G7.j.a(str2, ((I) obj).f13419d)) && ((((str3 = this.f13420f) == null && ((I) obj).f13420f == null) || G7.j.a(str3, ((I) obj).f13420f)) && ((((str4 = this.f13421g) == null && ((I) obj).f13421g == null) || G7.j.a(str4, ((I) obj).f13421g)) && ((((uri = this.f13422h) == null && ((I) obj).f13422h == null) || G7.j.a(uri, ((I) obj).f13422h)) && (((uri2 = this.f13423i) == null && ((I) obj).f13423i == null) || G7.j.a(uri2, ((I) obj).f13423i)))))))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        String str = this.b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i10 = 527 + i9;
        String str2 = this.f13418c;
        if (str2 != null) {
            i10 = (i10 * 31) + str2.hashCode();
        }
        String str3 = this.f13419d;
        if (str3 != null) {
            i10 = (i10 * 31) + str3.hashCode();
        }
        String str4 = this.f13420f;
        if (str4 != null) {
            i10 = (i10 * 31) + str4.hashCode();
        }
        String str5 = this.f13421g;
        if (str5 != null) {
            i10 = (i10 * 31) + str5.hashCode();
        }
        Uri uri = this.f13422h;
        if (uri != null) {
            i10 = (i10 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f13423i;
        if (uri2 != null) {
            return (i10 * 31) + uri2.hashCode();
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String uri;
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f13418c);
        parcel.writeString(this.f13419d);
        parcel.writeString(this.f13420f);
        parcel.writeString(this.f13421g);
        String str = null;
        Uri uri2 = this.f13422h;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        parcel.writeString(uri);
        Uri uri3 = this.f13423i;
        if (uri3 != null) {
            str = uri3.toString();
        }
        parcel.writeString(str);
    }

    public I(JSONObject jSONObject) {
        this.b = jSONObject.optString("id", null);
        this.f13418c = jSONObject.optString("first_name", null);
        this.f13419d = jSONObject.optString("middle_name", null);
        this.f13420f = jSONObject.optString("last_name", null);
        this.f13421g = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.f13422h = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.f13423i = optString2 != null ? Uri.parse(optString2) : null;
    }

    public I(Parcel parcel) {
        this.b = parcel.readString();
        this.f13418c = parcel.readString();
        this.f13419d = parcel.readString();
        this.f13420f = parcel.readString();
        this.f13421g = parcel.readString();
        String readString = parcel.readString();
        this.f13422h = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f13423i = readString2 != null ? Uri.parse(readString2) : null;
    }
}
