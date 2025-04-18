package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j3 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zzd.CREATOR);
                            }
                        } else {
                            str = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                j3 = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LastLocationRequest(j3, i10, z10, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LastLocationRequest[i10];
    }
}
