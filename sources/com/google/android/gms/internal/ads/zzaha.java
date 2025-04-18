package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class zzaha implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, zzahc.class.getClassLoader());
        return new zzahd(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzahd[i10];
    }
}
