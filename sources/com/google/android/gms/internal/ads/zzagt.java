package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzagt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        return new zzagu(readString, readString2, zzfzo.zzm(createStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzagu[i10];
    }
}
