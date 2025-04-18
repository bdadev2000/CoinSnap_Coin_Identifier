package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i10 = 0;
        short s5 = 0;
        int i11 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float f10 = 0.0f;
        long j3 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s5 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d10 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d11 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzdh(str, i10, s5, d10, d11, f10, j3, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdh[i10];
    }
}
