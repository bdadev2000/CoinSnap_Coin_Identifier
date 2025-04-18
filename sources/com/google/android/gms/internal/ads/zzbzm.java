package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzbzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                        }
                    } else {
                        zzsVar = (com.google.android.gms.ads.internal.client.zzs) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                    }
                } else {
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbzl(str, str2, zzsVar, zzmVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbzl[i10];
    }
}
