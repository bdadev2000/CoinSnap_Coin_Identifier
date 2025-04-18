package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzfrh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
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
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                i12 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfrg(i10, i11, i12, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfrg[i10];
    }
}
