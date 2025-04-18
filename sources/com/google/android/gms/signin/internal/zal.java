package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* loaded from: classes3.dex */
public final class zal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        zavVar = (zav) SafeParcelReader.createParcelable(parcel, readHeader, zav.CREATOR);
                    }
                } else {
                    connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel, readHeader, ConnectionResult.CREATOR);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zak(i10, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
