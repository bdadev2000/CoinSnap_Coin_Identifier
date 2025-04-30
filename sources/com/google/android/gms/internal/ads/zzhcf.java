package com.google.android.gms.internal.ads;

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
public final class zzhcf {
    public static final zzhcf zza;
    public static final zzhcf zzb;
    public static final zzhcf zzc;
    public static final zzhcf zzd;
    public static final zzhcf zze;
    public static final zzhcf zzf;
    public static final zzhcf zzg;
    public static final zzhcf zzh;
    public static final zzhcf zzi;
    public static final zzhcf zzj;
    private static final /* synthetic */ zzhcf[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzhcf zzhcfVar = new zzhcf("VOID", 0, Void.class, Void.class, null);
        zza = zzhcfVar;
        Class cls = Integer.TYPE;
        zzhcf zzhcfVar2 = new zzhcf("INT", 1, cls, Integer.class, 0);
        zzb = zzhcfVar2;
        zzhcf zzhcfVar3 = new zzhcf("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzhcfVar3;
        zzhcf zzhcfVar4 = new zzhcf("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzhcfVar4;
        zzhcf zzhcfVar5 = new zzhcf("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzhcfVar5;
        zzhcf zzhcfVar6 = new zzhcf("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzhcfVar6;
        zzhcf zzhcfVar7 = new zzhcf("STRING", 6, String.class, String.class, "");
        zzg = zzhcfVar7;
        zzhcf zzhcfVar8 = new zzhcf("BYTE_STRING", 7, zzhac.class, zzhac.class, zzhac.zzb);
        zzh = zzhcfVar8;
        zzhcf zzhcfVar9 = new zzhcf("ENUM", 8, cls, Integer.class, null);
        zzi = zzhcfVar9;
        zzhcf zzhcfVar10 = new zzhcf("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzhcfVar10;
        zzk = new zzhcf[]{zzhcfVar, zzhcfVar2, zzhcfVar3, zzhcfVar4, zzhcfVar5, zzhcfVar6, zzhcfVar7, zzhcfVar8, zzhcfVar9, zzhcfVar10};
    }

    private zzhcf(String str, int i9, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzhcf[] values() {
        return (zzhcf[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
