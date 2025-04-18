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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzbut implements Parcelable.Creator {
    public static final zzbus zza(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
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
        zzbfn zzbfnVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzef zzefVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbmb zzbmbVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        long j3 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzsVar = (com.google.android.gms.ads.internal.client.zzs) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzs.CREATOR);
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
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 16:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
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
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 19:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    f10 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
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
                case NOTIFICATION_REDIRECT_VALUE:
                    zzbfnVar = (zzbfn) SafeParcelReader.createParcelable(parcel, readHeader, zzbfn.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 36:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    bundle4 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzefVar = (com.google.android.gms.ads.internal.client.zzef) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.ads.internal.client.zzef.CREATOR);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    z14 = SafeParcelReader.readBoolean(parcel, readHeader);
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
                    z15 = SafeParcelReader.readBoolean(parcel, readHeader);
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
                    i17 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 57:
                    z16 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 58:
                    z17 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 59:
                    z18 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    arrayList6 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    str16 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 63:
                    zzbmbVar = (zzbmb) SafeParcelReader.createParcelable(parcel, readHeader, zzbmb.CREATOR);
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
        return new zzbus(i10, bundle, zzmVar, zzsVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j3, str6, arrayList2, str7, zzbfnVar, arrayList3, j10, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, zzefVar, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzbmbVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbus[i10];
    }
}
