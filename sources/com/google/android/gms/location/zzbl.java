package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbl implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        boolean z8 = false;
        boolean z9 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 5) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            zzbjVar = (zzbj) SafeParcelReader.createParcelable(parcel, readHeader, zzbj.CREATOR);
                        }
                    } else {
                        z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                }
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationSettingsRequest(arrayList, z8, z9, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i9) {
        return new LocationSettingsRequest[i9];
    }
}
