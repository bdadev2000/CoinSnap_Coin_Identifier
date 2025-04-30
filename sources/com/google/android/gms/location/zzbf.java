package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 102;
        long j7 = 3600000;
        long j9 = 600000;
        boolean z8 = false;
        boolean z9 = false;
        long j10 = Long.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        float f9 = 0.0f;
        long j11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationRequest(i9, j7, j9, z8, j10, i10, f9, j11, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i9) {
        return new LocationRequest[i9];
    }
}
