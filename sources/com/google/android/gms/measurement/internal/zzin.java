package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzin {
    public static final zzin zza = new zzin(null, null, 100);
    private final EnumMap<zza, zzim> zzb;
    private final int zzc;

    /* loaded from: classes2.dex */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    private zzin(EnumMap<zza, zzim> enumMap, int i9) {
        EnumMap<zza, zzim> enumMap2 = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i9;
    }

    public static boolean zza(int i9, int i10) {
        if (i9 == -20 && i10 == -30) {
            return true;
        }
        return (i9 == -30 && i10 == -20) || i9 == i10 || i9 < i10;
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zzin)) {
            return false;
        }
        zzin zzinVar = (zzin) obj;
        zzaVarArr = zzio.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            if (this.zzb.get(zzaVar) != zzinVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        if (this.zzc != zzinVar.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.zzc * 17;
        Iterator<zzim> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i9 = (i9 * 31) + it.next().hashCode();
        }
        return i9;
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        zzaVarArr = zzio.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzim zzimVar = this.zzb.get(zzaVar);
            if (zzimVar == null) {
                zzimVar = zzim.UNINITIALIZED;
            }
            sb.append(zzimVar);
        }
        return sb.toString();
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zzim> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    public final zzim zzc() {
        zzim zzimVar = this.zzb.get(zza.AD_STORAGE);
        return zzimVar == null ? zzim.UNINITIALIZED : zzimVar;
    }

    public final zzim zzd() {
        zzim zzimVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzimVar == null) {
            return zzim.UNINITIALIZED;
        }
        return zzimVar;
    }

    public final Boolean zze() {
        zzim zzimVar = this.zzb.get(zza.AD_STORAGE);
        if (zzimVar != null) {
            int ordinal = zzimVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean zzf() {
        zzim zzimVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzimVar != null) {
            int ordinal = zzimVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final String zzg() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzio.STORAGE.zza()) {
            zzim zzimVar = this.zzb.get(zzaVar);
            char c9 = '-';
            if (zzimVar != null && (ordinal = zzimVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c9 = '0';
                    }
                }
                c9 = '1';
            }
            sb.append(c9);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzio.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zzim> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzim.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public static char zza(zzim zzimVar) {
        if (zzimVar == null) {
            return '-';
        }
        int ordinal = zzimVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public final int zza() {
        return this.zzc;
    }

    public final boolean zzc(zzin zzinVar) {
        return zzb(zzinVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public static zzim zza(String str) {
        if (str == null) {
            return zzim.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzim.GRANTED;
        }
        if (str.equals("denied")) {
            return zzim.DENIED;
        }
        return zzim.UNINITIALIZED;
    }

    public zzin(Boolean bool, Boolean bool2, int i9) {
        EnumMap<zza, zzim> enumMap = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzim>) zza.AD_STORAGE, (zza) zza(bool));
        enumMap.put((EnumMap<zza, zzim>) zza.ANALYTICS_STORAGE, (zza) zza(bool2));
        this.zzc = i9;
    }

    public static zzin zzb(String str) {
        return zza(str, 100);
    }

    public final zzin zzb(zzin zzinVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzio.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzim zzimVar = this.zzb.get(zzaVar);
            if (zzimVar == zzim.UNINITIALIZED) {
                zzimVar = zzinVar.zzb.get(zzaVar);
            }
            if (zzimVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzimVar);
            }
        }
        return new zzin(enumMap, this.zzc);
    }

    public static zzim zza(char c9) {
        if (c9 == '+') {
            return zzim.POLICY;
        }
        if (c9 == '0') {
            return zzim.DENIED;
        }
        if (c9 != '1') {
            return zzim.UNINITIALIZED;
        }
        return zzim.GRANTED;
    }

    public static String zzb(zzim zzimVar) {
        int ordinal = zzimVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static zzim zza(Boolean bool) {
        if (bool == null) {
            return zzim.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzim.GRANTED;
        }
        return zzim.DENIED;
    }

    public final boolean zzb(zzin zzinVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzim zzimVar = this.zzb.get(zzaVar);
            zzim zzimVar2 = zzinVar.zzb.get(zzaVar);
            zzim zzimVar3 = zzim.DENIED;
            if (zzimVar == zzimVar3 && zzimVar2 != zzimVar3) {
                return true;
            }
        }
        return false;
    }

    public static zzin zza(Bundle bundle, int i9) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zzin(null, null, i9);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzio.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zzin(enumMap, i9);
    }

    public static zzin zza(zzim zzimVar, zzim zzimVar2, int i9) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzimVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzimVar2);
        return new zzin(enumMap, -10);
    }

    public static zzin zza(String str, int i9) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zza2 = zzio.STORAGE.zza();
        for (int i10 = 0; i10 < zza2.length; i10++) {
            zza zzaVar = zza2[i10];
            int i11 = i10 + 2;
            if (i11 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i11)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzim.UNINITIALIZED);
            }
        }
        return new zzin(enumMap, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzin zza(com.google.android.gms.measurement.internal.zzin r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzin$zza> r1 = com.google.android.gms.measurement.internal.zzin.zza.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzio r1 = com.google.android.gms.measurement.internal.zzio.STORAGE
            com.google.android.gms.measurement.internal.zzin$zza[] r1 = com.google.android.gms.measurement.internal.zzio.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzin$zza, com.google.android.gms.measurement.internal.zzim> r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzim r5 = (com.google.android.gms.measurement.internal.zzim) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzin$zza, com.google.android.gms.measurement.internal.zzim> r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzim r6 = (com.google.android.gms.measurement.internal.zzim) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            com.google.android.gms.measurement.internal.zzim r7 = com.google.android.gms.measurement.internal.zzim.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            com.google.android.gms.measurement.internal.zzim r7 = com.google.android.gms.measurement.internal.zzim.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            com.google.android.gms.measurement.internal.zzim r7 = com.google.android.gms.measurement.internal.zzim.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            com.google.android.gms.measurement.internal.zzim r5 = com.google.android.gms.measurement.internal.zzim.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.zzin r9 = new com.google.android.gms.measurement.internal.zzin
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzin.zza(com.google.android.gms.measurement.internal.zzin):com.google.android.gms.measurement.internal.zzin");
    }

    public static String zza(int i9) {
        if (i9 == -30) {
            return "TCF";
        }
        if (i9 == -20) {
            return "API";
        }
        if (i9 == -10) {
            return "MANIFEST";
        }
        if (i9 == 0) {
            return "1P_API";
        }
        if (i9 == 30) {
            return "1P_INIT";
        }
        if (i9 == 90) {
            return "REMOTE_CONFIG";
        }
        if (i9 != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzio.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i9 = 0;
        while (true) {
            Boolean bool = null;
            if (i9 >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i9];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i9++;
        }
    }

    public final boolean zza(zzin zzinVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzinVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzim.DENIED;
    }
}
