package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.internal.ads.zzbcb;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzeec extends zzeed {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcxe zzd;
    private final TelephonyManager zze;
    private final zzedu zzf;
    private zzbcb.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbcb.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbcb.zzaf.zzd zzdVar = zzbcb.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbcb.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbcb.zzaf.zzd zzdVar2 = zzbcb.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbcb.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzeec(Context context, zzcxe zzcxeVar, zzedu zzeduVar, zzedq zzedqVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzedqVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcxeVar;
        this.zzf = zzeduVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbcb.zzab zza(zzeec zzeecVar, Bundle bundle) {
        zzbcb.zzab.zzb zzbVar;
        zzbcb.zzab.zza zza = zzbcb.zzab.zza();
        int i2 = bundle.getInt(ImpressionLog.M, -2);
        int i3 = bundle.getInt("gnt", 0);
        if (i2 == -1) {
            zzeecVar.zzg = zzbcb.zzq.ENUM_TRUE;
        } else {
            zzeecVar.zzg = zzbcb.zzq.ENUM_FALSE;
            if (i2 == 0) {
                zza.zzd(zzbcb.zzab.zzc.CELL);
            } else if (i2 != 1) {
                zza.zzd(zzbcb.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zza.zzd(zzbcb.zzab.zzc.WIFI);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbcb.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbcb.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbcb.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbcb.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbcb.zzaf.zzd zzb(zzeec zzeecVar, Bundle bundle) {
        return (zzbcb.zzaf.zzd) zzb.get(zzfhq.zza(zzfhq.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE), MaxEvent.d).getInt("active_network_state", -1), zzbcb.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzeec zzeecVar, boolean z2, ArrayList arrayList, zzbcb.zzab zzabVar, zzbcb.zzaf.zzd zzdVar) {
        zzbcb.zzaf.zza.C0124zza zzn = zzbcb.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        zzn.zzD(zzg(Settings.Global.getInt(zzeecVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzn.zzE(com.google.android.gms.ads.internal.zzu.zzq().zzg(zzeecVar.zzc, zzeecVar.zze));
        zzn.zzM(zzeecVar.zzf.zze());
        zzn.zzL(zzeecVar.zzf.zzb());
        zzn.zzG(zzeecVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzeecVar.zzg);
        zzn.zzN(zzg(z2));
        zzn.zzP(zzeecVar.zzf.zzd());
        zzn.zzO(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        zzn.zzQ(zzg(Settings.Global.getInt(zzeecVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return zzn.zzbr().zzaV();
    }

    private static final zzbcb.zzq zzg(boolean z2) {
        return z2 ? zzbcb.zzq.ENUM_TRUE : zzbcb.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z2) {
        zzgfo.zzr(this.zzd.zzb(new Bundle()), new zzeeb(this, z2), zzcan.zzf);
    }
}
