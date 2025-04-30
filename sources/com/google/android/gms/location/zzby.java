package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzby implements Parcelable.Creator<zzbx> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbx createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            i12 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        i11 = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i9 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbx(i9, i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbx[] newArray(int i9) {
        return new zzbx[i9];
    }
}
