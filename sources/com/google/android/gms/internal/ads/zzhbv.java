package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzhbv {
    public static final zzhbv zza;
    public static final zzhbv zzb;
    public static final zzhbv zzc;
    public static final zzhbv zzd;
    public static final zzhbv zze;
    public static final zzhbv zzf;
    public static final zzhbv zzg;
    public static final zzhbv zzh;
    public static final zzhbv zzi;
    public static final zzhbv zzj;
    private static final /* synthetic */ zzhbv[] zzk;
    private final Class zzl;

    static {
        zzhbv zzhbvVar = new zzhbv("VOID", 0, Void.class, Void.class, null);
        zza = zzhbvVar;
        Class cls = Integer.TYPE;
        zzhbv zzhbvVar2 = new zzhbv("INT", 1, cls, Integer.class, 0);
        zzb = zzhbvVar2;
        zzhbv zzhbvVar3 = new zzhbv("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzhbvVar3;
        zzhbv zzhbvVar4 = new zzhbv("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzhbvVar4;
        zzhbv zzhbvVar5 = new zzhbv("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        zze = zzhbvVar5;
        zzhbv zzhbvVar6 = new zzhbv("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzhbvVar6;
        zzhbv zzhbvVar7 = new zzhbv("STRING", 6, String.class, String.class, "");
        zzg = zzhbvVar7;
        zzhbv zzhbvVar8 = new zzhbv("BYTE_STRING", 7, zzgzs.class, zzgzs.class, zzgzs.zzb);
        zzh = zzhbvVar8;
        zzhbv zzhbvVar9 = new zzhbv("ENUM", 8, cls, Integer.class, null);
        zzi = zzhbvVar9;
        zzhbv zzhbvVar10 = new zzhbv("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzhbvVar10;
        zzk = new zzhbv[]{zzhbvVar, zzhbvVar2, zzhbvVar3, zzhbvVar4, zzhbvVar5, zzhbvVar6, zzhbvVar7, zzhbvVar8, zzhbvVar9, zzhbvVar10};
    }

    private zzhbv(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzhbv[] values() {
        return (zzhbv[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
