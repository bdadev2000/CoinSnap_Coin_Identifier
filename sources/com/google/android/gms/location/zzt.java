package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z8 = true;
        long j7 = 50;
        float f9 = 0.0f;
        long j9 = Long.MAX_VALUE;
        int i9 = Integer.MAX_VALUE;
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
                                i9 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            j9 = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    }
                } else {
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                }
            } else {
                z8 = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzs(z8, j7, f9, j9, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i9) {
        return new zzs[i9];
    }
}
