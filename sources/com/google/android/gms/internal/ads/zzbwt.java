package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbwt implements Parcelable.Creator {
    public static final zzbws zza(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        com.google.android.gms.ads.internal.client.zzq zzqVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbhk zzbhkVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzdu zzduVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbnz zzbnzVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        long j7 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (com.google.android.gms.ads.internal.client.zzq) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, readHeader, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.createParcelable(parcel, readHeader, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 13:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 16:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 62:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 18:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 19:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    f9 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 26:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 28:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 29:
                    zzbhkVar = (zzbhk) SafeParcelReader.createParcelable(parcel, readHeader, zzbhk.CREATOR);
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 31:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 34:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 35:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 36:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 37:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 40:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 41:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 42:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzduVar = (com.google.android.gms.ads.internal.client.zzdu) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzdu.CREATOR);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 49:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 51:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 52:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.createIntegerList(parcel, readHeader);
                    break;
                case 54:
                    str15 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 56:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 57:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 58:
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 59:
                    z16 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 61:
                    str16 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 63:
                    zzbnzVar = (zzbnz) SafeParcelReader.createParcelable(parcel, readHeader, zzbnz.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbws(i9, bundle, zzlVar, zzqVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i10, arrayList, bundle3, z8, i11, i12, f9, str5, j7, str6, arrayList2, str7, zzbhkVar, arrayList3, j9, str8, f10, z9, i13, i14, z10, str9, str10, z11, i15, bundle4, str11, zzduVar, z12, bundle5, str12, str13, str14, z13, arrayList4, str15, arrayList5, i16, z14, z15, z16, arrayList6, str16, zzbnzVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new zzbws[i9];
    }
}
