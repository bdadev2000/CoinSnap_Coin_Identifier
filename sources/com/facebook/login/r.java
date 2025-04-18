package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class r implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<r> CREATOR = new l(4);

    /* renamed from: b, reason: collision with root package name */
    public final q f11264b;

    /* renamed from: c, reason: collision with root package name */
    public Set f11265c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11266d;

    /* renamed from: f, reason: collision with root package name */
    public final String f11267f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11268g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11269h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11270i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11271j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11272k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11273l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11274m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f11275n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11276o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11277p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11278q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11279r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11280s;

    /* renamed from: t, reason: collision with root package name */
    public final a f11281t;

    public r(Parcel parcel) {
        d dVar;
        boolean z10;
        boolean z11;
        b0 b0Var;
        boolean z12;
        a valueOf;
        int i10 = x5.i.a;
        String readString = parcel.readString();
        x5.i.o(readString, "loginBehavior");
        this.f11264b = q.valueOf(readString);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f11265c = new HashSet(arrayList);
        String readString2 = parcel.readString();
        if (readString2 != null) {
            dVar = d.valueOf(readString2);
        } else {
            dVar = d.NONE;
        }
        this.f11266d = dVar;
        String readString3 = parcel.readString();
        x5.i.o(readString3, "applicationId");
        this.f11267f = readString3;
        String readString4 = parcel.readString();
        x5.i.o(readString4, "authId");
        this.f11268g = readString4;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11269h = z10;
        this.f11270i = parcel.readString();
        String readString5 = parcel.readString();
        x5.i.o(readString5, "authType");
        this.f11271j = readString5;
        this.f11272k = parcel.readString();
        this.f11273l = parcel.readString();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11274m = z11;
        String readString6 = parcel.readString();
        if (readString6 != null) {
            b0Var = b0.valueOf(readString6);
        } else {
            b0Var = b0.FACEBOOK;
        }
        this.f11275n = b0Var;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11276o = z12;
        this.f11277p = parcel.readByte() != 0;
        String readString7 = parcel.readString();
        x5.i.o(readString7, "nonce");
        this.f11278q = readString7;
        this.f11279r = parcel.readString();
        this.f11280s = parcel.readString();
        String readString8 = parcel.readString();
        if (readString8 == null) {
            valueOf = null;
        } else {
            valueOf = a.valueOf(readString8);
        }
        this.f11281t = valueOf;
    }

    public final boolean c() {
        boolean z10;
        boolean startsWith$default;
        boolean startsWith$default2;
        Iterator it = this.f11265c.iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            String str = (String) it.next();
            Set set = z.a;
            if (str != null) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "publish", false, 2, null);
                if (!startsWith$default) {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "manage", false, 2, null);
                    if (!startsWith$default2 && !z.a.contains(str)) {
                    }
                }
                z10 = true;
            }
        } while (!z10);
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String name;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11264b.name());
        dest.writeStringList(new ArrayList(this.f11265c));
        dest.writeString(this.f11266d.name());
        dest.writeString(this.f11267f);
        dest.writeString(this.f11268g);
        dest.writeByte(this.f11269h ? (byte) 1 : (byte) 0);
        dest.writeString(this.f11270i);
        dest.writeString(this.f11271j);
        dest.writeString(this.f11272k);
        dest.writeString(this.f11273l);
        dest.writeByte(this.f11274m ? (byte) 1 : (byte) 0);
        dest.writeString(this.f11275n.name());
        dest.writeByte(this.f11276o ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f11277p ? (byte) 1 : (byte) 0);
        dest.writeString(this.f11278q);
        dest.writeString(this.f11279r);
        dest.writeString(this.f11280s);
        a aVar = this.f11281t;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        dest.writeString(name);
    }
}
