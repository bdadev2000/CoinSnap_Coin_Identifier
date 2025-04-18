package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    i17 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SleepClassifyEvent(i10, i11, i12, i13, i14, i15, i16, z10, i17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SleepClassifyEvent[i10];
    }
}
