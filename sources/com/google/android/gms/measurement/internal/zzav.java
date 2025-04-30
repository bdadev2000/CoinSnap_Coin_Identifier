package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzav {
    private static final zzav zza = new zzav(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzin.zza, zzim> zzf;

    public zzav(Boolean bool, int i9) {
        this(bool, i9, (Boolean) null, (String) null);
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            sb.append(":");
            sb.append(zzin.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        if (!this.zzc.equalsIgnoreCase(zzavVar.zzc) || !Objects.equals(this.zzd, zzavVar.zzd)) {
            return false;
        }
        return Objects.equals(this.zze, zzavVar.zze);
    }

    public final int hashCode() {
        int i9;
        int hashCode;
        Boolean bool = this.zzd;
        if (bool == null) {
            i9 = 3;
        } else if (bool == Boolean.TRUE) {
            i9 = 7;
        } else {
            i9 = 13;
        }
        String str = this.zze;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + (i9 * 29) + this.zzc.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzin.zza(this.zzb));
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzim zzimVar = this.zzf.get(zzaVar);
            if (zzimVar == null) {
                sb.append("uninitialized");
            } else {
                int i9 = zzay.zza[zzimVar.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzin.zza, zzim> entry : this.zzf.entrySet()) {
            String zzb = zzin.zzb(entry.getValue());
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

    public final zzim zzc() {
        zzim zzimVar = this.zzf.get(zzin.zza.AD_USER_DATA);
        if (zzimVar == null) {
            return zzim.UNINITIALIZED;
        }
        return zzimVar;
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
        Iterator<zzim> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzim.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public zzav(Boolean bool, int i9, Boolean bool2, String str) {
        EnumMap<zzin.zza, zzim> enumMap = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzin.zza, zzim>) zzin.zza.AD_USER_DATA, (zzin.zza) zzin.zza(bool));
        this.zzb = i9;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzav zza(Bundle bundle, int i9) {
        if (bundle == null) {
            return new zzav(null, i9);
        }
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        for (zzin.zza zzaVar : zzio.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzin.zza) zzin.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzav((EnumMap<zzin.zza, zzim>) enumMap, i9, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    private zzav(EnumMap<zzin.zza, zzim> enumMap, int i9, Boolean bool, String str) {
        EnumMap<zzin.zza, zzim> enumMap2 = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i9;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzav zza(zzim zzimVar, int i9) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        enumMap.put((EnumMap) zzin.zza.AD_USER_DATA, (zzin.zza) zzimVar);
        return new zzav((EnumMap<zzin.zza, zzim>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzav zza(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzin.zza.class);
            zzin.zza[] zza2 = zzio.DMA.zza();
            int length = zza2.length;
            int i9 = 1;
            int i10 = 0;
            while (i10 < length) {
                enumMap.put((EnumMap) zza2[i10], (zzin.zza) zzin.zza(split[i9].charAt(0)));
                i10++;
                i9++;
            }
            return new zzav((EnumMap<zzin.zza, zzim>) enumMap, parseInt, (Boolean) null, (String) null);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        zzim zza2;
        if (bundle == null || (zza2 = zzin.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i9 = zzay.zza[zza2.ordinal()];
        if (i9 == 3) {
            return Boolean.FALSE;
        }
        if (i9 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }
}
