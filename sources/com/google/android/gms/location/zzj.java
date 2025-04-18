package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, readHeader, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CurrentLocationRequest(j3, i10, i12, j10, z10, i11, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CurrentLocationRequest[i10];
    }
}
