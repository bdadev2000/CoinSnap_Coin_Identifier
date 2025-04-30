package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractC1839h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new com.facebook.y(9);
    public final p b;

    /* renamed from: c, reason: collision with root package name */
    public Set f13744c;

    /* renamed from: d, reason: collision with root package name */
    public final d f13745d;

    /* renamed from: f, reason: collision with root package name */
    public final String f13746f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13747g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13748h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13749i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13750j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13751k;
    public final String l;
    public final boolean m;

    /* renamed from: n, reason: collision with root package name */
    public final A f13752n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13753o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13754p;

    /* renamed from: q, reason: collision with root package name */
    public final String f13755q;

    /* renamed from: r, reason: collision with root package name */
    public final String f13756r;

    /* renamed from: s, reason: collision with root package name */
    public final String f13757s;

    /* renamed from: t, reason: collision with root package name */
    public final EnumC1850a f13758t;

    public q(Parcel parcel) {
        d dVar;
        boolean z8;
        boolean z9;
        A a6;
        boolean z10;
        EnumC1850a valueOf;
        String readString = parcel.readString();
        AbstractC1839h.j(readString, "loginBehavior");
        this.b = p.valueOf(readString);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f13744c = new HashSet(arrayList);
        String readString2 = parcel.readString();
        if (readString2 != null) {
            dVar = d.valueOf(readString2);
        } else {
            dVar = d.NONE;
        }
        this.f13745d = dVar;
        String readString3 = parcel.readString();
        AbstractC1839h.j(readString3, "applicationId");
        this.f13746f = readString3;
        String readString4 = parcel.readString();
        AbstractC1839h.j(readString4, "authId");
        this.f13747g = readString4;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13748h = z8;
        this.f13749i = parcel.readString();
        String readString5 = parcel.readString();
        AbstractC1839h.j(readString5, "authType");
        this.f13750j = readString5;
        this.f13751k = parcel.readString();
        this.l = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.m = z9;
        String readString6 = parcel.readString();
        if (readString6 != null) {
            a6 = A.valueOf(readString6);
        } else {
            a6 = A.FACEBOOK;
        }
        this.f13752n = a6;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13753o = z10;
        this.f13754p = parcel.readByte() != 0;
        String readString7 = parcel.readString();
        AbstractC1839h.j(readString7, "nonce");
        this.f13755q = readString7;
        this.f13756r = parcel.readString();
        this.f13757s = parcel.readString();
        String readString8 = parcel.readString();
        if (readString8 == null) {
            valueOf = null;
        } else {
            valueOf = EnumC1850a.valueOf(readString8);
        }
        this.f13758t = valueOf;
    }

    public final boolean c() {
        for (String str : this.f13744c) {
            Set set = y.f13787a;
            if (str != null && (O7.o.C(str, "publish", false) || O7.o.C(str, "manage", false) || y.f13787a.contains(str))) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (this.f13752n == A.INSTAGRAM) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String name;
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b.name());
        parcel.writeStringList(new ArrayList(this.f13744c));
        parcel.writeString(this.f13745d.name());
        parcel.writeString(this.f13746f);
        parcel.writeString(this.f13747g);
        parcel.writeByte(this.f13748h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13749i);
        parcel.writeString(this.f13750j);
        parcel.writeString(this.f13751k);
        parcel.writeString(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13752n.name());
        parcel.writeByte(this.f13753o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13754p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13755q);
        parcel.writeString(this.f13756r);
        parcel.writeString(this.f13757s);
        EnumC1850a enumC1850a = this.f13758t;
        if (enumC1850a == null) {
            name = null;
        } else {
            name = enumC1850a.name();
        }
        parcel.writeString(name);
    }
}
