package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;
import com.applovin.impl.vd;
import com.facebook.share.internal.ShareConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;

/* loaded from: classes2.dex */
public final class dr implements bf.b {
    public static final Parcelable.Creator<dr> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f23533a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23534b;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public dr[] newArray(int i2) {
            return new dr[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public dr createFromParcel(Parcel parcel) {
            return new dr(parcel);
        }
    }

    public dr(Parcel parcel) {
        this.f23533a = (String) xp.a((Object) parcel.readString());
        this.f23534b = (String) xp.a((Object) parcel.readString());
    }

    @Override // com.applovin.impl.bf.b
    public void a(vd.b bVar) {
        String str = this.f23533a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c2 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c2 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                bVar.b(this.f23534b);
                return;
            case 1:
                bVar.k(this.f23534b);
                return;
            case 2:
                bVar.g(this.f23534b);
                return;
            case 3:
                bVar.a(this.f23534b);
                return;
            case 4:
                bVar.c(this.f23534b);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dr.class != obj.getClass()) {
            return false;
        }
        dr drVar = (dr) obj;
        return this.f23533a.equals(drVar.f23533a) && this.f23534b.equals(drVar.f23534b);
    }

    public int hashCode() {
        return this.f23534b.hashCode() + androidx.compose.foundation.text.input.a.b(this.f23533a, 527, 31);
    }

    public String toString() {
        return "VC: " + this.f23533a + ImpressionLog.R + this.f23534b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23533a);
        parcel.writeString(this.f23534b);
    }

    public dr(String str, String str2) {
        this.f23533a = str;
        this.f23534b = str2;
    }
}
