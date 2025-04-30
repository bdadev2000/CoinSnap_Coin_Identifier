package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z8 = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j7 = 0;
        long j9 = 0;
        long j10 = 0;
        float f9 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 8:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 15:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 16:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 17:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 18:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new WakeLockEvent(i9, j7, i10, str, i11, arrayList, str2, j9, i12, str3, str4, f9, j10, str5, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new WakeLockEvent[i9];
    }
}
