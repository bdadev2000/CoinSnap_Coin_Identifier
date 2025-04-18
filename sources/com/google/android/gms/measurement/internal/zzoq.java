package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzoq implements Parcelable.Creator<zzon> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzon createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    l10 = SafeParcelReader.readLongObject(parcel, readHeader);
                    break;
                case 5:
                    f10 = SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 6:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    d10 = SafeParcelReader.readDoubleObject(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzon(i10, str, j3, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzon[] newArray(int i10) {
        return new zzon[i10];
    }
}
