package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzq implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = 0;
        long j9 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i4 = 100;
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
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 14:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 20:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 24:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 26:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 27:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 28:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 29:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 30:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 31:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 32:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 34:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 35:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 36:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzo(str, str2, str3, str4, j2, j3, str5, z2, z4, j9, str6, j4, j5, i2, z3, z5, str7, bool, j6, arrayList, str8, str11, str12, str9, z6, j7, i4, str13, i3, j8, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i2) {
        return new zzo[i2];
    }
}
