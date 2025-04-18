package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzbfo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        com.google.android.gms.ads.internal.client.zzga zzgaVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    zzgaVar = (com.google.android.gms.ads.internal.client.zzga) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzga.CREATOR);
                    break;
                case 7:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbfn(i10, z10, i11, z11, i12, zzgaVar, z12, i13, i14, z13, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbfn[i10];
    }
}
