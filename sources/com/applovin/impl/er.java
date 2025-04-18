package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class er implements we.b {
    public static final Parcelable.Creator<er> CREATOR = new a();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4519b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er[] newArray(int i10) {
            return new er[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er createFromParcel(Parcel parcel) {
            return new er(parcel);
        }
    }

    public er(Parcel parcel) {
        this.a = (String) yp.a((Object) parcel.readString());
        this.f4519b = (String) yp.a((Object) parcel.readString());
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.b(this.f4519b);
                return;
            case 1:
                bVar.k(this.f4519b);
                return;
            case 2:
                bVar.g(this.f4519b);
                return;
            case 3:
                bVar.a(this.f4519b);
                return;
            case 4:
                bVar.c(this.f4519b);
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
        if (this.a.equals(erVar.a) && this.f4519b.equals(erVar.f4519b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4519b.hashCode() + vd.e.c(this.a, 527, 31);
    }

    public String toString() {
        return "VC: " + this.a + "=" + this.f4519b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f4519b);
    }

    public er(String str, String str2) {
        this.a = str;
        this.f4519b = str2;
    }
}
