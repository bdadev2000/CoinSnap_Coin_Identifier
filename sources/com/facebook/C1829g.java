package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AbstractC1839h;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import x0.AbstractC2914a;

/* renamed from: com.facebook.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1829g implements Parcelable {
    public static final Parcelable.Creator<C1829g> CREATOR = new E3.b(26);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13545c;

    /* renamed from: d, reason: collision with root package name */
    public final C1831i f13546d;

    /* renamed from: f, reason: collision with root package name */
    public final C1830h f13547f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13548g;

    public C1829g(String str, String str2) {
        G7.j.e(str2, "expectedNonce");
        AbstractC1839h.h(str, BidResponsed.KEY_TOKEN);
        AbstractC1839h.h(str2, "expectedNonce");
        boolean z8 = false;
        List V8 = O7.g.V(str, new String[]{"."}, 0, 6);
        if (V8.size() == 3) {
            String str3 = (String) V8.get(0);
            String str4 = (String) V8.get(1);
            String str5 = (String) V8.get(2);
            this.b = str;
            this.f13545c = str2;
            C1831i c1831i = new C1831i(str3);
            this.f13546d = c1831i;
            this.f13547f = new C1830h(str4, str2);
            try {
                String r9 = R2.b.r(c1831i.f13567d);
                if (r9 != null) {
                    z8 = R2.b.z(R2.b.q(r9), str3 + '.' + str4, str5);
                }
            } catch (IOException | InvalidKeySpecException unused) {
            }
            if (z8) {
                this.f13548g = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1829g)) {
            return false;
        }
        C1829g c1829g = (C1829g) obj;
        if (G7.j.a(this.b, c1829g.b) && G7.j.a(this.f13545c, c1829g.f13545c) && G7.j.a(this.f13546d, c1829g.f13546d) && G7.j.a(this.f13547f, c1829g.f13547f) && G7.j.a(this.f13548g, c1829g.f13548g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13548g.hashCode() + ((this.f13547f.hashCode() + ((this.f13546d.hashCode() + AbstractC2914a.b(AbstractC2914a.b(527, 31, this.b), 31, this.f13545c)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f13545c);
        parcel.writeParcelable(this.f13546d, i9);
        parcel.writeParcelable(this.f13547f, i9);
        parcel.writeString(this.f13548g);
    }

    public C1829g(Parcel parcel) {
        G7.j.e(parcel, "parcel");
        String readString = parcel.readString();
        AbstractC1839h.j(readString, BidResponsed.KEY_TOKEN);
        this.b = readString;
        String readString2 = parcel.readString();
        AbstractC1839h.j(readString2, "expectedNonce");
        this.f13545c = readString2;
        Parcelable readParcelable = parcel.readParcelable(C1831i.class.getClassLoader());
        if (readParcelable != null) {
            this.f13546d = (C1831i) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(C1830h.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f13547f = (C1830h) readParcelable2;
                String readString3 = parcel.readString();
                AbstractC1839h.j(readString3, "signature");
                this.f13548g = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
