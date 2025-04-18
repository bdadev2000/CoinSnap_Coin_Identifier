package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final String f11347b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11348c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11349d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11350f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11351g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f11352h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f11353i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f11346j = n0.class.getSimpleName();

    @JvmField
    public static final Parcelable.Creator<n0> CREATOR = new android.support.v4.media.a(25);

    public n0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        x5.i.o(str, "id");
        this.f11347b = str;
        this.f11348c = str2;
        this.f11349d = str3;
        this.f11350f = str4;
        this.f11351g = str5;
        this.f11352h = uri;
        this.f11353i = uri2;
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
        if (!(obj instanceof n0)) {
            return false;
        }
        String str5 = this.f11347b;
        if (((str5 == null && ((n0) obj).f11347b == null) || Intrinsics.areEqual(str5, ((n0) obj).f11347b)) && ((((str = this.f11348c) == null && ((n0) obj).f11348c == null) || Intrinsics.areEqual(str, ((n0) obj).f11348c)) && ((((str2 = this.f11349d) == null && ((n0) obj).f11349d == null) || Intrinsics.areEqual(str2, ((n0) obj).f11349d)) && ((((str3 = this.f11350f) == null && ((n0) obj).f11350f == null) || Intrinsics.areEqual(str3, ((n0) obj).f11350f)) && ((((str4 = this.f11351g) == null && ((n0) obj).f11351g == null) || Intrinsics.areEqual(str4, ((n0) obj).f11351g)) && ((((uri = this.f11352h) == null && ((n0) obj).f11352h == null) || Intrinsics.areEqual(uri, ((n0) obj).f11352h)) && (((uri2 = this.f11353i) == null && ((n0) obj).f11353i == null) || Intrinsics.areEqual(uri2, ((n0) obj).f11353i)))))))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f11347b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = 527 + i10;
        String str2 = this.f11348c;
        if (str2 != null) {
            i11 = (i11 * 31) + str2.hashCode();
        }
        String str3 = this.f11349d;
        if (str3 != null) {
            i11 = (i11 * 31) + str3.hashCode();
        }
        String str4 = this.f11350f;
        if (str4 != null) {
            i11 = (i11 * 31) + str4.hashCode();
        }
        String str5 = this.f11351g;
        if (str5 != null) {
            i11 = (i11 * 31) + str5.hashCode();
        }
        Uri uri = this.f11352h;
        if (uri != null) {
            i11 = (i11 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f11353i;
        if (uri2 != null) {
            return (i11 * 31) + uri2.hashCode();
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String uri;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11347b);
        dest.writeString(this.f11348c);
        dest.writeString(this.f11349d);
        dest.writeString(this.f11350f);
        dest.writeString(this.f11351g);
        String str = null;
        Uri uri2 = this.f11352h;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        dest.writeString(uri);
        Uri uri3 = this.f11353i;
        if (uri3 != null) {
            str = uri3.toString();
        }
        dest.writeString(str);
    }

    public n0(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f11347b = jsonObject.optString("id", null);
        this.f11348c = jsonObject.optString("first_name", null);
        this.f11349d = jsonObject.optString("middle_name", null);
        this.f11350f = jsonObject.optString("last_name", null);
        this.f11351g = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f11352h = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f11353i = optString2 != null ? Uri.parse(optString2) : null;
    }

    public n0(Parcel parcel) {
        this.f11347b = parcel.readString();
        this.f11348c = parcel.readString();
        this.f11349d = parcel.readString();
        this.f11350f = parcel.readString();
        this.f11351g = parcel.readString();
        String readString = parcel.readString();
        this.f11352h = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f11353i = readString2 != null ? Uri.parse(readString2) : null;
    }
}
