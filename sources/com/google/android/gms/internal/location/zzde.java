package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j3 = Long.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 5) {
                    switch (fieldId) {
                        case 8:
                            z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 9:
                            z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 10:
                            str = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 11:
                            z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 12:
                            z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 13:
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 14:
                            j3 = SafeParcelReader.readLong(parcel, readHeader);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                            break;
                    }
                } else {
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, ClientIdentity.CREATOR);
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzdd(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
