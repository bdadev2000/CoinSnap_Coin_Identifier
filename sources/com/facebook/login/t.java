package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.m0;
import java.util.Map;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<t> CREATOR = new l(5);

    /* renamed from: b, reason: collision with root package name */
    public final s f11287b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.a f11288c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.l f11289d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11290f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11291g;

    /* renamed from: h, reason: collision with root package name */
    public final r f11292h;

    /* renamed from: i, reason: collision with root package name */
    public Map f11293i;

    /* renamed from: j, reason: collision with root package name */
    public Map f11294j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(r rVar, s code, com.facebook.a aVar, String str, String str2) {
        this(rVar, code, aVar, null, str, str2);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11287b.name());
        dest.writeParcelable(this.f11288c, i10);
        dest.writeParcelable(this.f11289d, i10);
        dest.writeString(this.f11290f);
        dest.writeString(this.f11291g);
        dest.writeParcelable(this.f11292h, i10);
        m0.L(dest, this.f11293i);
        m0.L(dest, this.f11294j);
    }

    public t(r rVar, s code, com.facebook.a aVar, com.facebook.l lVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f11292h = rVar;
        this.f11288c = aVar;
        this.f11289d = lVar;
        this.f11290f = str;
        this.f11287b = code;
        this.f11291g = str2;
    }

    public t(Parcel parcel) {
        String readString = parcel.readString();
        this.f11287b = s.valueOf(readString == null ? "error" : readString);
        this.f11288c = (com.facebook.a) parcel.readParcelable(com.facebook.a.class.getClassLoader());
        this.f11289d = (com.facebook.l) parcel.readParcelable(com.facebook.l.class.getClassLoader());
        this.f11290f = parcel.readString();
        this.f11291g = parcel.readString();
        this.f11292h = (r) parcel.readParcelable(r.class.getClassLoader());
        this.f11293i = m0.H(parcel);
        this.f11294j = m0.H(parcel);
    }
}
