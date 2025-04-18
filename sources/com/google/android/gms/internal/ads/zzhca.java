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
/* loaded from: classes3.dex */
public final class zzhca {
    public static final zzhca zza;
    public static final zzhca zzb;
    public static final zzhca zzc;
    public static final zzhca zzd;
    public static final zzhca zze;
    public static final zzhca zzf;
    public static final zzhca zzg;
    public static final zzhca zzh;
    public static final zzhca zzi;
    public static final zzhca zzj;
    public static final zzhca zzk;
    public static final zzhca zzl;
    public static final zzhca zzm;
    public static final zzhca zzn;
    public static final zzhca zzo;
    public static final zzhca zzp;
    public static final zzhca zzq;
    public static final zzhca zzr;
    private static final /* synthetic */ zzhca[] zzs;
    private final zzhcb zzt;

    static {
        zzhca zzhcaVar = new zzhca("DOUBLE", 0, zzhcb.DOUBLE, 1);
        zza = zzhcaVar;
        zzhca zzhcaVar2 = new zzhca("FLOAT", 1, zzhcb.FLOAT, 5);
        zzb = zzhcaVar2;
        zzhcb zzhcbVar = zzhcb.LONG;
        zzhca zzhcaVar3 = new zzhca("INT64", 2, zzhcbVar, 0);
        zzc = zzhcaVar3;
        zzhca zzhcaVar4 = new zzhca("UINT64", 3, zzhcbVar, 0);
        zzd = zzhcaVar4;
        zzhcb zzhcbVar2 = zzhcb.INT;
        zzhca zzhcaVar5 = new zzhca("INT32", 4, zzhcbVar2, 0);
        zze = zzhcaVar5;
        zzhca zzhcaVar6 = new zzhca("FIXED64", 5, zzhcbVar, 1);
        zzf = zzhcaVar6;
        zzhca zzhcaVar7 = new zzhca("FIXED32", 6, zzhcbVar2, 5);
        zzg = zzhcaVar7;
        zzhca zzhcaVar8 = new zzhca("BOOL", 7, zzhcb.BOOLEAN, 0);
        zzh = zzhcaVar8;
        zzhca zzhcaVar9 = new zzhca("STRING", 8, zzhcb.STRING, 2);
        zzi = zzhcaVar9;
        zzhcb zzhcbVar3 = zzhcb.MESSAGE;
        zzhca zzhcaVar10 = new zzhca("GROUP", 9, zzhcbVar3, 3);
        zzj = zzhcaVar10;
        zzhca zzhcaVar11 = new zzhca("MESSAGE", 10, zzhcbVar3, 2);
        zzk = zzhcaVar11;
        zzhca zzhcaVar12 = new zzhca("BYTES", 11, zzhcb.BYTE_STRING, 2);
        zzl = zzhcaVar12;
        zzhca zzhcaVar13 = new zzhca("UINT32", 12, zzhcbVar2, 0);
        zzm = zzhcaVar13;
        zzhca zzhcaVar14 = new zzhca("ENUM", 13, zzhcb.ENUM, 0);
        zzn = zzhcaVar14;
        zzhca zzhcaVar15 = new zzhca("SFIXED32", 14, zzhcbVar2, 5);
        zzo = zzhcaVar15;
        zzhca zzhcaVar16 = new zzhca("SFIXED64", 15, zzhcbVar, 1);
        zzp = zzhcaVar16;
        zzhca zzhcaVar17 = new zzhca("SINT32", 16, zzhcbVar2, 0);
        zzq = zzhcaVar17;
        zzhca zzhcaVar18 = new zzhca("SINT64", 17, zzhcbVar, 0);
        zzr = zzhcaVar18;
        zzs = new zzhca[]{zzhcaVar, zzhcaVar2, zzhcaVar3, zzhcaVar4, zzhcaVar5, zzhcaVar6, zzhcaVar7, zzhcaVar8, zzhcaVar9, zzhcaVar10, zzhcaVar11, zzhcaVar12, zzhcaVar13, zzhcaVar14, zzhcaVar15, zzhcaVar16, zzhcaVar17, zzhcaVar18};
    }

    private zzhca(String str, int i10, zzhcb zzhcbVar, int i11) {
        this.zzt = zzhcbVar;
    }

    public static zzhca[] values() {
        return (zzhca[]) zzs.clone();
    }

    public final zzhcb zza() {
        return this.zzt;
    }
}
