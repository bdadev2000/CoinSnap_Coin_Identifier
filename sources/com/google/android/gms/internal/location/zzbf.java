package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = 0.0f;
        long j2 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s2 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d2 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbe(str, i2, s2, d, d2, f2, j2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i2) {
        return new zzbe[i2];
    }
}
