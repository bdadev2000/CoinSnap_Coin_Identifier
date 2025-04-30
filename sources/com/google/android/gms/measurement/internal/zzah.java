package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;

/* loaded from: classes2.dex */
final class zzah {
    private final EnumMap<zzin.zza, zzak> zza;

    public zzah() {
        this.zza = new EnumMap<>(zzin.zza.class);
    }

    public final String toString() {
        char c9;
        StringBuilder sb = new StringBuilder("1");
        for (zzin.zza zzaVar : zzin.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            c9 = zzakVar.zzl;
            sb.append(c9);
        }
        return sb.toString();
    }

    public final zzak zza(zzin.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    private zzah(EnumMap<zzin.zza, zzak> enumMap) {
        EnumMap<zzin.zza, zzak> enumMap2 = new EnumMap<>((Class<zzin.zza>) zzin.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        if (str.length() >= zzin.zza.values().length) {
            int i9 = 0;
            if (str.charAt(0) == '1') {
                zzin.zza[] values = zzin.zza.values();
                int length = values.length;
                int i10 = 1;
                while (i9 < length) {
                    enumMap.put((EnumMap) values[i9], (zzin.zza) zzak.zza(str.charAt(i10)));
                    i9++;
                    i10++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final void zza(zzin.zza zzaVar, int i9) {
        zzak zzakVar = zzak.UNSET;
        if (i9 != -30) {
            if (i9 != -20) {
                if (i9 == -10) {
                    zzakVar = zzak.MANIFEST;
                } else if (i9 != 0) {
                    if (i9 == 30) {
                        zzakVar = zzak.INITIALIZATION;
                    }
                }
            }
            zzakVar = zzak.API;
        } else {
            zzakVar = zzak.TCF;
        }
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }

    public final void zza(zzin.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }
}
