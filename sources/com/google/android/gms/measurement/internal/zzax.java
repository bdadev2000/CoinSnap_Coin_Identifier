package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzax {
    private static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzje.zza, zzjh> zzf;

    public zzax(Boolean bool, int i10) {
        this((Boolean) null, i10, (Boolean) null, (String) null);
    }

    private final String zzh() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb2.append(":");
            sb2.append(zzje.zza(this.zzf.get(zzaVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (!this.zzc.equalsIgnoreCase(zzaxVar.zzc) || !Objects.equals(this.zzd, zzaxVar.zzd)) {
            return false;
        }
        return Objects.equals(this.zze, zzaxVar.zze);
    }

    public final int hashCode() {
        int i10;
        int hashCode;
        Boolean bool = this.zzd;
        if (bool == null) {
            i10 = 3;
        } else if (bool == Boolean.TRUE) {
            i10 = 7;
        } else {
            i10 = 13;
        }
        String str = this.zze;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + (i10 * 29) + this.zzc.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzje.zza(this.zzb));
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            sb2.append(",");
            sb2.append(zzaVar.zze);
            sb2.append("=");
            zzjh zzjhVar = this.zzf.get(zzaVar);
            if (zzjhVar == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = zzba.zza[zzjhVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                sb2.append("granted");
                            }
                        } else {
                            sb2.append("denied");
                        }
                    } else {
                        sb2.append("eu_consent_policy");
                    }
                } else {
                    sb2.append("uninitialized");
                }
            }
        }
        if (this.zzd != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.zzd);
        }
        if (this.zze != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.zze);
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzje.zza, zzjh> entry : this.zzf.entrySet()) {
            String zzb = zzje.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzf.get(zzje.zza.AD_USER_DATA);
        if (zzjhVar == null) {
            return zzjh.UNINITIALIZED;
        }
        return zzjhVar;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzjh> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public zzax(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzje.zza, zzjh>) zzje.zza.AD_USER_DATA, (zzje.zza) zzje.zza(bool));
        this.zzb = i10;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzax zza(Bundle bundle, int i10) {
        if (bundle == null) {
            return new zzax(null, i10);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzje.zza) zzje.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    private zzax(EnumMap<zzje.zza, zzjh> enumMap, int i10, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i10;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzax zza(zzjh zzjhVar, int i10) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put((EnumMap) zzje.zza.AD_USER_DATA, (zzje.zza) zzjhVar);
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzje.zza.class);
            zzje.zza[] zza2 = zzjg.DMA.zza();
            int length = zza2.length;
            int i10 = 1;
            int i11 = 0;
            while (i11 < length) {
                enumMap.put((EnumMap) zza2[i11], (zzje.zza) zzje.zza(split[i10].charAt(0)));
                i11++;
                i10++;
            }
            return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, parseInt, (Boolean) null, (String) null);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        zzjh zza2;
        if (bundle == null || (zza2 = zzje.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i10 = zzba.zza[zza2.ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }
}
