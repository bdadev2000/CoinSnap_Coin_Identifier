package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzbyf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 7:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbye(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbye[i10];
    }
}
