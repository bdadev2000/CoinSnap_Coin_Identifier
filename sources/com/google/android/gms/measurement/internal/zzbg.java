package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator<zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzbc zzbcVar = null;
        String str2 = null;
        long j7 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            j7 = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    zzbcVar = (zzbc) SafeParcelReader.createParcelable(parcel, readHeader, zzbc.CREATOR);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbd(str, zzbcVar, str2, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbd[] newArray(int i9) {
        return new zzbd[i9];
    }
}
