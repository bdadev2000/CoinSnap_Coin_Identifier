package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbp implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 1;
        int i10 = 1;
        long j7 = -1;
        long j9 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            j9 = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        j7 = SafeParcelReader.readLong(parcel, readHeader);
                    }
                } else {
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i9 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbo(i9, i10, j7, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i9) {
        return new zzbo[i9];
    }
}
