package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbcw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        long j7 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                            }
                        } else {
                            j7 = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, readHeader, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbcv(parcelFileDescriptor, z8, z9, j7, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzbcv[i9];
    }
}
