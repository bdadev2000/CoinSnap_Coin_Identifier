package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String str = null;
        zzq[] zzqVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    zzqVarArr = (zzq[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzq.CREATOR);
                    break;
                case 9:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 12:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 14:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    z16 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzq(str, i9, i10, z8, i11, i12, zzqVarArr, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzq[i9];
    }
}
