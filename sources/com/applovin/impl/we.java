package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class we implements Parcelable {
    public static final Parcelable.Creator<we> CREATOR = new a();
    private final b[] a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public we[] newArray(int i10) {
            return new we[i10];
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
        this.a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.a;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }

    public we a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new we((b[]) yp.a((Object[]) this.a, (Object[]) bVarArr));
    }

    public int c() {
        return this.a.length;
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
            return Arrays.equals(this.a, ((we) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a.length);
        for (b bVar : this.a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public we a(we weVar) {
        return weVar == null ? this : a(weVar.a);
    }

    public b a(int i10) {
        return this.a[i10];
    }

    public we(List list) {
        this.a = (b[]) list.toArray(new b[0]);
    }

    public we(b... bVarArr) {
        this.a = bVarArr;
    }
}
