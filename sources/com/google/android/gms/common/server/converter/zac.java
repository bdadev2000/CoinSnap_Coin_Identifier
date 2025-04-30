package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
/* loaded from: classes2.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(id = 2)
    final String zab;

    @SafeParcelable.Field(id = 3)
    final int zac;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10) {
        this.zaa = i9;
        this.zab = str;
        this.zac = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zac(String str, int i9) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i9;
    }
}
