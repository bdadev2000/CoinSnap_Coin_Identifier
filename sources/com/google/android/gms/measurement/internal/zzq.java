package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
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
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j16 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i12 = 100;
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
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j16 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 14:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
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
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    j14 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 30:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 32:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    j15 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 36:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzo(str, str2, str3, str4, j3, j10, str5, z10, z12, j16, str6, j11, j12, i10, z11, z13, str7, bool, j13, arrayList, str8, str11, str12, str9, z14, j14, i12, str13, i11, j15, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i10) {
        return new zzo[i10];
    }
}
