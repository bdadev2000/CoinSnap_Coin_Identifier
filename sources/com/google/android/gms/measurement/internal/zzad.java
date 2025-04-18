package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzad implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzon zzonVar = null;
        String str3 = null;
        zzbf zzbfVar = null;
        zzbf zzbfVar2 = null;
        zzbf zzbfVar3 = null;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzonVar = (zzon) SafeParcelReader.createParcelable(parcel, readHeader, zzon.CREATOR);
                    break;
                case 5:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzbfVar = (zzbf) SafeParcelReader.createParcelable(parcel, readHeader, zzbf.CREATOR);
                    break;
                case 9:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzbfVar2 = (zzbf) SafeParcelReader.createParcelable(parcel, readHeader, zzbf.CREATOR);
                    break;
                case 11:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzbfVar3 = (zzbf) SafeParcelReader.createParcelable(parcel, readHeader, zzbf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(str, str2, zzonVar, j3, z10, str3, zzbfVar, j10, zzbfVar2, j11, zzbfVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i10) {
        return new zzae[i10];
    }
}
