package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0785a;
import com.facebook.C1829g;
import com.facebook.internal.H;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new com.facebook.y(10);
    public final r b;

    /* renamed from: c, reason: collision with root package name */
    public final C0785a f13763c;

    /* renamed from: d, reason: collision with root package name */
    public final C1829g f13764d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13765f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13766g;

    /* renamed from: h, reason: collision with root package name */
    public final q f13767h;

    /* renamed from: i, reason: collision with root package name */
    public Map f13768i;

    /* renamed from: j, reason: collision with root package name */
    public HashMap f13769j;

    public s(q qVar, r rVar, C0785a c0785a, String str, String str2) {
        this(qVar, rVar, c0785a, null, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.f13763c, i9);
        parcel.writeParcelable(this.f13764d, i9);
        parcel.writeString(this.f13765f);
        parcel.writeString(this.f13766g);
        parcel.writeParcelable(this.f13767h, i9);
        H.N(parcel, this.f13768i);
        H.N(parcel, this.f13769j);
    }

    public s(q qVar, r rVar, C0785a c0785a, C1829g c1829g, String str, String str2) {
        this.f13767h = qVar;
        this.f13763c = c0785a;
        this.f13764d = c1829g;
        this.f13765f = str;
        this.b = rVar;
        this.f13766g = str2;
    }

    public s(Parcel parcel) {
        String readString = parcel.readString();
        this.b = r.valueOf(readString == null ? "error" : readString);
        this.f13763c = (C0785a) parcel.readParcelable(C0785a.class.getClassLoader());
        this.f13764d = (C1829g) parcel.readParcelable(C1829g.class.getClassLoader());
        this.f13765f = parcel.readString();
        this.f13766g = parcel.readString();
        this.f13767h = (q) parcel.readParcelable(q.class.getClassLoader());
        this.f13768i = H.I(parcel);
        this.f13769j = H.I(parcel);
    }
}
