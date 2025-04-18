package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        float f10 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzl(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
