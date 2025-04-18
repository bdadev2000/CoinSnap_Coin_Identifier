package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j3 = 3600000;
        long j10 = 600000;
        long j11 = 0;
        long j12 = Long.MAX_VALUE;
        long j13 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j14 = -1;
        String str = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 5:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j14 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 15:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, readHeader, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationRequest(i10, j3, j10, j11, j12, j13, i11, f10, z10, j14, i12, i13, str, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
