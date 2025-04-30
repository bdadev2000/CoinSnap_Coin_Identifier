package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbhl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    zzfkVar = (com.google.android.gms.ads.internal.client.zzfk) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzfk.CREATOR);
                    break;
                case 7:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbhk(i9, z8, i10, z9, i11, zzfkVar, z10, i12, i13, z11, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzbhk[i9];
    }
}
