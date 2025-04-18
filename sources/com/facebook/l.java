package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class l implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<l> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: b, reason: collision with root package name */
    public final String f11170b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11171c;

    /* renamed from: d, reason: collision with root package name */
    public final n f11172d;

    /* renamed from: f, reason: collision with root package name */
    public final m f11173f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11174g;

    public l(String token, String expectedNonce) {
        List split$default;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        x5.i.m(token, BidResponsed.KEY_TOKEN);
        x5.i.m(expectedNonce, "expectedNonce");
        boolean z10 = false;
        split$default = StringsKt__StringsKt.split$default(token, new String[]{"."}, false, 0, 6, (Object) null);
        if (split$default.size() == 3) {
            String str = (String) split$default.get(0);
            String str2 = (String) split$default.get(1);
            String str3 = (String) split$default.get(2);
            this.f11170b = token;
            this.f11171c = expectedNonce;
            n nVar = new n(str);
            this.f11172d = nVar;
            this.f11173f = new m(str2, expectedNonce);
            try {
                String k10 = p6.a.k(nVar.f11345d);
                if (k10 != null) {
                    z10 = p6.a.y(p6.a.j(k10), str + '.' + str2, str3);
                }
            } catch (IOException | InvalidKeySpecException unused) {
            }
            if (z10) {
                this.f11174g = str3;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Intrinsics.areEqual(this.f11170b, lVar.f11170b) && Intrinsics.areEqual(this.f11171c, lVar.f11171c) && Intrinsics.areEqual(this.f11172d, lVar.f11172d) && Intrinsics.areEqual(this.f11173f, lVar.f11173f) && Intrinsics.areEqual(this.f11174g, lVar.f11174g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11174g.hashCode() + ((this.f11173f.hashCode() + ((this.f11172d.hashCode() + vd.e.c(this.f11171c, vd.e.c(this.f11170b, 527, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11170b);
        dest.writeString(this.f11171c);
        dest.writeParcelable(this.f11172d, i10);
        dest.writeParcelable(this.f11173f, i10);
        dest.writeString(this.f11174g);
    }

    public l(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        x5.i.o(readString, BidResponsed.KEY_TOKEN);
        this.f11170b = readString;
        String readString2 = parcel.readString();
        x5.i.o(readString2, "expectedNonce");
        this.f11171c = readString2;
        Parcelable readParcelable = parcel.readParcelable(n.class.getClassLoader());
        if (readParcelable != null) {
            this.f11172d = (n) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(m.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f11173f = (m) readParcelable2;
                String readString3 = parcel.readString();
                x5.i.o(readString3, "signature");
                this.f11174g = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
