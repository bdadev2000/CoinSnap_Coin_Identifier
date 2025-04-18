package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzblq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        boolean z10 = false;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        i10 = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzblp(str, z10, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzblp[i10];
    }
}
