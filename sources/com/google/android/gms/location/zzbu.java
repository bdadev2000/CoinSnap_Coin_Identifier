package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z8 = false;
        int i16 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SleepClassifyEvent(i9, i10, i11, i12, i13, i14, i15, z8, i16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int i9) {
        return new SleepClassifyEvent[i9];
    }
}
