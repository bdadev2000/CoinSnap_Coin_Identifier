package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.vd;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class bf implements Parcelable {
    public static final Parcelable.Creator<bf> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f23058a;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public bf[] newArray(int i2) {
            return new bf[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public bf createFromParcel(Parcel parcel) {
            return new bf(parcel);
        }
    }

    /* loaded from: classes3.dex */
    public interface b extends Parcelable {
        default void a(vd.b bVar) {
        }

        default f9 b() {
            return null;
        }

        default byte[] a() {
            return null;
        }
    }

    public bf(Parcel parcel) {
        this.f23058a = new b[parcel.readInt()];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f23058a;
            if (i2 >= bVarArr.length) {
                return;
            }
            bVarArr[i2] = (b) parcel.readParcelable(b.class.getClassLoader());
            i2++;
        }
    }

    public bf a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new bf((b[]) xp.a((Object[]) this.f23058a, (Object[]) bVarArr));
    }

    public int c() {
        return this.f23058a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f23058a, ((bf) obj).f23058a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f23058a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f23058a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23058a.length);
        for (b bVar : this.f23058a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public bf a(bf bfVar) {
        return bfVar == null ? this : a(bfVar.f23058a);
    }

    public b a(int i2) {
        return this.f23058a[i2];
    }

    public bf(List list) {
        this.f23058a = (b[]) list.toArray(new b[0]);
    }

    public bf(b... bVarArr) {
        this.f23058a = bVarArr;
    }
}
