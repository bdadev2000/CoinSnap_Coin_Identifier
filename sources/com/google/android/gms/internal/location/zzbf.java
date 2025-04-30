package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i9 = 0;
        short s5 = 0;
        int i10 = 0;
        double d2 = 0.0d;
        double d9 = 0.0d;
        float f9 = 0.0f;
        long j7 = 0;
        int i11 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s5 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d2 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d9 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbe(str, i9, s5, d2, d9, f9, j7, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i9) {
        return new zzbe[i9];
    }
}
