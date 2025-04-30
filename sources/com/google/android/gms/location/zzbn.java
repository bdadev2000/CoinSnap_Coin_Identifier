package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbn implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 2:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationSettingsStates(z8, z9, z10, z11, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsStates[] newArray(int i9) {
        return new LocationSettingsStates[i9];
    }
}
