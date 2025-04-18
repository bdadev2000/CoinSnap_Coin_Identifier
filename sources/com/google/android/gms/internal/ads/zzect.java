package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzect extends zzecu {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvq zzd;
    private final TelephonyManager zze;
    private final zzecl zzf;
    private zzbbs.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbs.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbs.zzaf.zzd zzdVar = zzbbs.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbs.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbs.zzaf.zzd zzdVar2 = zzbbs.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbs.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzect(Context context, zzcvq zzcvqVar, zzecl zzeclVar, zzech zzechVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzechVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcvqVar;
        this.zzf = zzeclVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbbs.zzab zza(zzect zzectVar, Bundle bundle) {
        zzbbs.zzab.zzb zzbVar;
        zzbbs.zzab.zza zza = zzbbs.zzab.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            zzectVar.zzg = zzbbs.zzq.ENUM_TRUE;
        } else {
            zzectVar.zzg = zzbbs.zzq.ENUM_FALSE;
            if (i10 != 0) {
                if (i10 != 1) {
                    zza.zzd(zzbbs.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
                } else {
                    zza.zzd(zzbbs.zzab.zzc.WIFI);
                }
            } else {
                zza.zzd(zzbbs.zzab.zzc.CELL);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbs.zzab.zzb.TWO_G;
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
                    zzbVar = zzbbs.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbs.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbs.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbbs.zzaf.zzd zzb(zzect zzectVar, Bundle bundle) {
        return (zzbbs.zzaf.zzd) zzb.get(zzfgc.zza(zzfgc.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbs.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzect zzectVar, boolean z10, ArrayList arrayList, zzbbs.zzab zzabVar, zzbbs.zzaf.zzd zzdVar) {
        boolean z11;
        zzbbs.zzaf.zza.C0143zza zzn = zzbbs.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        boolean z12 = false;
        if (Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzn.zzD(zzg(z11));
        zzn.zzE(com.google.android.gms.ads.internal.zzv.zzr().zzg(zzectVar.zzc, zzectVar.zze));
        zzn.zzM(zzectVar.zzf.zze());
        zzn.zzL(zzectVar.zzf.zzb());
        zzn.zzG(zzectVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzectVar.zzg);
        zzn.zzN(zzg(z10));
        zzn.zzP(zzectVar.zzf.zzd());
        zzn.zzO(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        if (Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z12 = true;
        }
        zzn.zzQ(zzg(z12));
        return zzn.zzbr().zzaV();
    }

    private static final zzbbs.zzq zzg(boolean z10) {
        return z10 ? zzbbs.zzq.ENUM_TRUE : zzbbs.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z10) {
        zzgei.zzr(this.zzd.zzb(new Bundle()), new zzecs(this, z10), zzcaj.zzf);
    }
}
