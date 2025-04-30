package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class er implements we.b {
    public static final Parcelable.Creator<er> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f7485a;
    public final String b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er[] newArray(int i9) {
            return new er[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er createFromParcel(Parcel parcel) {
            return new er(parcel);
        }
    }

    public er(Parcel parcel) {
        this.f7485a = (String) yp.a((Object) parcel.readString());
        this.b = (String) yp.a((Object) parcel.readString());
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.f7485a;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c9 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c9 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                bVar.b(this.b);
                return;
            case 1:
                bVar.k(this.b);
                return;
            case 2:
                bVar.g(this.b);
                return;
            case 3:
                bVar.a(this.b);
                return;
            case 4:
                bVar.c(this.b);
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
        if (obj == null || er.class != obj.getClass()) {
            return false;
        }
        er erVar = (er) obj;
        if (this.f7485a.equals(erVar.f7485a) && this.b.equals(erVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + AbstractC2914a.b(527, 31, this.f7485a);
    }

    public String toString() {
        return "VC: " + this.f7485a + "=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f7485a);
        parcel.writeString(this.b);
    }

    public er(String str, String str2) {
        this.f7485a = str;
        this.b = str2;
    }
}
