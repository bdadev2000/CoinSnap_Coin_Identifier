package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j3 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new MethodInvocation(i11, i12, i13, j3, j10, str, str2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
