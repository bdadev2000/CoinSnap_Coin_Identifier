package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i9 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f9 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzk(z8, z9, str, z10, f9, i9, z11, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzk[i9];
    }
}
