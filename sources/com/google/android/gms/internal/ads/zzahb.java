package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzahb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzahc(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzahc[i10];
    }
}
