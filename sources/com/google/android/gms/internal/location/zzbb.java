package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List<ClientIdentity> list = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j7 = Long.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        list = SafeParcelReader.createTypedList(parcel, readHeader, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 8:
                        z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 9:
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 10:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 11:
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 12:
                        z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 13:
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 14:
                        j7 = SafeParcelReader.readLong(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzba(locationRequest, list, str, z8, z9, z10, str2, z11, z12, str3, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i9) {
        return new zzba[i9];
    }
}
