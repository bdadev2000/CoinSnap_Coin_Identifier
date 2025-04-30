package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzefd extends zzefe {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcyp zzd;
    private final TelephonyManager zze;
    private final zzeev zzf;
    private zzbdv.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbdv.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbdv.zzaf.zzd zzdVar = zzbdv.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbdv.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbdv.zzaf.zzd zzdVar2 = zzbdv.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbdv.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzefd(Context context, zzcyp zzcypVar, zzeev zzeevVar, zzeer zzeerVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeerVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcypVar;
        this.zzf = zzeevVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbdv.zzab zza(zzefd zzefdVar, Bundle bundle) {
        zzbdv.zzab.zzb zzbVar;
        zzbdv.zzab.zza zza = zzbdv.zzab.zza();
        int i9 = bundle.getInt("cnt", -2);
        int i10 = bundle.getInt("gnt", 0);
        if (i9 == -1) {
            zzefdVar.zzg = zzbdv.zzq.ENUM_TRUE;
        } else {
            zzefdVar.zzg = zzbdv.zzq.ENUM_FALSE;
            if (i9 != 0) {
                if (i9 != 1) {
                    zza.zzd(zzbdv.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
                } else {
                    zza.zzd(zzbdv.zzab.zzc.WIFI);
                }
            } else {
                zza.zzd(zzbdv.zzab.zzc.CELL);
            }
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbdv.zzab.zzb.TWO_G;
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
                    zzbVar = zzbdv.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbdv.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbdv.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbdv.zzaf.zzd zzb(zzefd zzefdVar, Bundle bundle) {
        return (zzbdv.zzaf.zzd) zzb.get(zzfic.zza(zzfic.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbdv.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzefd zzefdVar, boolean z8, ArrayList arrayList, zzbdv.zzab zzabVar, zzbdv.zzaf.zzd zzdVar) {
        boolean z9;
        zzbdv.zzaf.zza.C0131zza zzn = zzbdv.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        boolean z10 = false;
        if (Settings.Global.getInt(zzefdVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzn.zzD(zzg(z9));
        zzn.zzE(com.google.android.gms.ads.internal.zzu.zzq().zzg(zzefdVar.zzc, zzefdVar.zze));
        zzn.zzM(zzefdVar.zzf.zze());
        zzn.zzL(zzefdVar.zzf.zzb());
        zzn.zzG(zzefdVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzefdVar.zzg);
        zzn.zzN(zzg(z8));
        zzn.zzP(zzefdVar.zzf.zzd());
        zzn.zzO(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        if (Settings.Global.getInt(zzefdVar.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z10 = true;
        }
        zzn.zzQ(zzg(z10));
        return zzn.zzbr().zzaV();
    }

    private static final zzbdv.zzq zzg(boolean z8) {
        if (z8) {
            return zzbdv.zzq.ENUM_TRUE;
        }
        return zzbdv.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z8) {
        zzgft.zzr(this.zzd.zzb(new Bundle()), new zzefc(this, z8), zzcci.zzf);
    }
}
