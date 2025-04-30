package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzad implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzno zznoVar = null;
        String str3 = null;
        zzbd zzbdVar = null;
        zzbd zzbdVar2 = null;
        zzbd zzbdVar3 = null;
        long j7 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z8 = false;
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
                    zznoVar = (zzno) SafeParcelReader.createParcelable(parcel, readHeader, zzno.CREATOR);
                    break;
                case 5:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzbdVar = (zzbd) SafeParcelReader.createParcelable(parcel, readHeader, zzbd.CREATOR);
                    break;
                case 9:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzbdVar2 = (zzbd) SafeParcelReader.createParcelable(parcel, readHeader, zzbd.CREATOR);
                    break;
                case 11:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzbdVar3 = (zzbd) SafeParcelReader.createParcelable(parcel, readHeader, zzbd.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(str, str2, zznoVar, j7, z8, str3, zzbdVar, j9, zzbdVar2, j10, zzbdVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i9) {
        return new zzae[i9];
    }
}
