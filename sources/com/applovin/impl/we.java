package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class we implements Parcelable {
    public static final Parcelable.Creator<we> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f11981a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public we[] newArray(int i9) {
            return new we[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public we createFromParcel(Parcel parcel) {
            return new we(parcel);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        default void a(qd.b bVar) {
        }

        default d9 b() {
            return null;
        }

        default byte[] a() {
            return null;
        }
    }

    public we(Parcel parcel) {
        this.f11981a = new b[parcel.readInt()];
        int i9 = 0;
        while (true) {
            b[] bVarArr = this.f11981a;
            if (i9 >= bVarArr.length) {
                return;
            }
            bVarArr[i9] = (b) parcel.readParcelable(b.class.getClassLoader());
            i9++;
        }
    }

    public we a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new we((b[]) yp.a((Object[]) this.f11981a, (Object[]) bVarArr));
    }

    public int c() {
        return this.f11981a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && we.class == obj.getClass()) {
            return Arrays.equals(this.f11981a, ((we) obj).f11981a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11981a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f11981a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f11981a.length);
        for (b bVar : this.f11981a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public we a(we weVar) {
        return weVar == null ? this : a(weVar.f11981a);
    }

    public b a(int i9) {
        return this.f11981a[i9];
    }

    public we(List list) {
        this.f11981a = (b[]) list.toArray(new b[0]);
    }

    public we(b... bVarArr) {
        this.f11981a = bVarArr;
    }
}
