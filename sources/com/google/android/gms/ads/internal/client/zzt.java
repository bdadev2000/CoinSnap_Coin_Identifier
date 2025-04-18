package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        String str = null;
        zzs[] zzsVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    zzsVarArr = (zzs[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzs.CREATOR);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 14:
                    z16 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    z17 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    z18 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzs(str, i10, i11, z10, i12, i13, zzsVarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
