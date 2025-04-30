package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new y(12);
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public final m f14010c;

    /* renamed from: d, reason: collision with root package name */
    public final d f14011d;

    /* renamed from: f, reason: collision with root package name */
    public final m f14012f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14013g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14014h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14015i;

    public b(m mVar, m mVar2, d dVar, m mVar3, int i9) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.b = mVar;
        this.f14010c = mVar2;
        this.f14012f = mVar3;
        this.f14013g = i9;
        this.f14011d = dVar;
        if (mVar3 != null && mVar.b.compareTo(mVar3.b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.b.compareTo(mVar2.b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i9 >= 0 && i9 <= u.d(null).getMaximum(7)) {
            this.f14015i = mVar.d(mVar2) + 1;
            this.f14014h = (mVar2.f14059d - mVar.f14059d) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b.equals(bVar.b) && this.f14010c.equals(bVar.f14010c) && Objects.equals(this.f14012f, bVar.f14012f) && this.f14013g == bVar.f14013g && this.f14011d.equals(bVar.f14011d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.f14010c, this.f14012f, Integer.valueOf(this.f14013g), this.f14011d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.f14010c, 0);
        parcel.writeParcelable(this.f14012f, 0);
        parcel.writeParcelable(this.f14011d, 0);
        parcel.writeInt(this.f14013g);
    }
}
