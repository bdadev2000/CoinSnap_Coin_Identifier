package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzhfg {
    public static final zzhfg zza;
    public static final zzhfg zzb;
    public static final zzhfg zzc;
    public static final zzhfg zzd;
    public static final zzhfg zze;
    public static final zzhfg zzf;
    public static final zzhfg zzg;
    public static final zzhfg zzh;
    public static final zzhfg zzi;
    public static final zzhfg zzj;
    public static final zzhfg zzk;
    public static final zzhfg zzl;
    public static final zzhfg zzm;
    public static final zzhfg zzn;
    public static final zzhfg zzo;
    public static final zzhfg zzp;
    public static final zzhfg zzq;
    public static final zzhfg zzr;
    private static final /* synthetic */ zzhfg[] zzs;
    private final zzhfh zzt;

    static {
        zzhfg zzhfgVar = new zzhfg("DOUBLE", 0, zzhfh.DOUBLE, 1);
        zza = zzhfgVar;
        zzhfg zzhfgVar2 = new zzhfg("FLOAT", 1, zzhfh.FLOAT, 5);
        zzb = zzhfgVar2;
        zzhfh zzhfhVar = zzhfh.LONG;
        zzhfg zzhfgVar3 = new zzhfg("INT64", 2, zzhfhVar, 0);
        zzc = zzhfgVar3;
        zzhfg zzhfgVar4 = new zzhfg("UINT64", 3, zzhfhVar, 0);
        zzd = zzhfgVar4;
        zzhfh zzhfhVar2 = zzhfh.INT;
        zzhfg zzhfgVar5 = new zzhfg("INT32", 4, zzhfhVar2, 0);
        zze = zzhfgVar5;
        zzhfg zzhfgVar6 = new zzhfg("FIXED64", 5, zzhfhVar, 1);
        zzf = zzhfgVar6;
        zzhfg zzhfgVar7 = new zzhfg("FIXED32", 6, zzhfhVar2, 5);
        zzg = zzhfgVar7;
        zzhfg zzhfgVar8 = new zzhfg("BOOL", 7, zzhfh.BOOLEAN, 0);
        zzh = zzhfgVar8;
        zzhfg zzhfgVar9 = new zzhfg("STRING", 8, zzhfh.STRING, 2);
        zzi = zzhfgVar9;
        zzhfh zzhfhVar3 = zzhfh.MESSAGE;
        zzhfg zzhfgVar10 = new zzhfg("GROUP", 9, zzhfhVar3, 3);
        zzj = zzhfgVar10;
        zzhfg zzhfgVar11 = new zzhfg("MESSAGE", 10, zzhfhVar3, 2);
        zzk = zzhfgVar11;
        zzhfg zzhfgVar12 = new zzhfg("BYTES", 11, zzhfh.BYTE_STRING, 2);
        zzl = zzhfgVar12;
        zzhfg zzhfgVar13 = new zzhfg("UINT32", 12, zzhfhVar2, 0);
        zzm = zzhfgVar13;
        zzhfg zzhfgVar14 = new zzhfg("ENUM", 13, zzhfh.ENUM, 0);
        zzn = zzhfgVar14;
        zzhfg zzhfgVar15 = new zzhfg("SFIXED32", 14, zzhfhVar2, 5);
        zzo = zzhfgVar15;
        zzhfg zzhfgVar16 = new zzhfg("SFIXED64", 15, zzhfhVar, 1);
        zzp = zzhfgVar16;
        zzhfg zzhfgVar17 = new zzhfg("SINT32", 16, zzhfhVar2, 0);
        zzq = zzhfgVar17;
        zzhfg zzhfgVar18 = new zzhfg("SINT64", 17, zzhfhVar, 0);
        zzr = zzhfgVar18;
        zzs = new zzhfg[]{zzhfgVar, zzhfgVar2, zzhfgVar3, zzhfgVar4, zzhfgVar5, zzhfgVar6, zzhfgVar7, zzhfgVar8, zzhfgVar9, zzhfgVar10, zzhfgVar11, zzhfgVar12, zzhfgVar13, zzhfgVar14, zzhfgVar15, zzhfgVar16, zzhfgVar17, zzhfgVar18};
    }

    private zzhfg(String str, int i9, zzhfh zzhfhVar, int i10) {
        this.zzt = zzhfhVar;
    }

    public static zzhfg[] values() {
        return (zzhfg[]) zzs.clone();
    }

    public final zzhfh zza() {
        return this.zzt;
    }
}
