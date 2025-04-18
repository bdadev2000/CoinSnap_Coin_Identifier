package com.google.android.gms.measurement.internal;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;

/* loaded from: classes3.dex */
final class zzah {
    private final EnumMap<zzje.zza, zzak> zza;

    public zzah() {
        this.zza = new EnumMap<>(zzje.zza.class);
    }

    public final String toString() {
        char c2;
        StringBuilder sb = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_YES);
        for (zzje.zza zzaVar : zzje.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            c2 = zzakVar.zzl;
            sb.append(c2);
        }
        return sb.toString();
    }

    public final zzak zza(zzje.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    private zzah(EnumMap<zzje.zza, zzak> enumMap) {
        EnumMap<zzje.zza, zzak> enumMap2 = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        if (str.length() >= zzje.zza.values().length) {
            int i2 = 0;
            if (str.charAt(0) == '1') {
                zzje.zza[] values = zzje.zza.values();
                int length = values.length;
                int i3 = 1;
                while (i2 < length) {
                    enumMap.put((EnumMap) values[i2], (zzje.zza) zzak.zza(str.charAt(i3)));
                    i2++;
                    i3++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final void zza(zzje.zza zzaVar, int i2) {
        zzak zzakVar = zzak.UNSET;
        if (i2 != -30) {
            if (i2 != -20) {
                if (i2 == -10) {
                    zzakVar = zzak.MANIFEST;
                } else if (i2 != 0) {
                    if (i2 == 30) {
                        zzakVar = zzak.INITIALIZATION;
                    }
                }
            }
            zzakVar = zzak.API;
        } else {
            zzakVar = zzak.TCF;
        }
        this.zza.put((EnumMap<zzje.zza, zzak>) zzaVar, (zzje.zza) zzakVar);
    }

    public final void zza(zzje.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zzje.zza, zzak>) zzaVar, (zzje.zza) zzakVar);
    }
}
