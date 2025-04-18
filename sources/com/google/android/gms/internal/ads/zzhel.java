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
public final class zzhel {
    public static final zzhel zza;
    public static final zzhel zzb;
    public static final zzhel zzc;
    public static final zzhel zzd;
    public static final zzhel zze;
    public static final zzhel zzf;
    public static final zzhel zzg;
    public static final zzhel zzh;
    public static final zzhel zzi;
    public static final zzhel zzj;
    public static final zzhel zzk;
    public static final zzhel zzl;
    public static final zzhel zzm;
    public static final zzhel zzn;
    public static final zzhel zzo;
    public static final zzhel zzp;
    public static final zzhel zzq;
    public static final zzhel zzr;
    private static final /* synthetic */ zzhel[] zzs;
    private final zzhem zzt;

    static {
        zzhel zzhelVar = new zzhel("DOUBLE", 0, zzhem.DOUBLE, 1);
        zza = zzhelVar;
        zzhel zzhelVar2 = new zzhel("FLOAT", 1, zzhem.FLOAT, 5);
        zzb = zzhelVar2;
        zzhem zzhemVar = zzhem.LONG;
        zzhel zzhelVar3 = new zzhel("INT64", 2, zzhemVar, 0);
        zzc = zzhelVar3;
        zzhel zzhelVar4 = new zzhel("UINT64", 3, zzhemVar, 0);
        zzd = zzhelVar4;
        zzhem zzhemVar2 = zzhem.INT;
        zzhel zzhelVar5 = new zzhel("INT32", 4, zzhemVar2, 0);
        zze = zzhelVar5;
        zzhel zzhelVar6 = new zzhel("FIXED64", 5, zzhemVar, 1);
        zzf = zzhelVar6;
        zzhel zzhelVar7 = new zzhel("FIXED32", 6, zzhemVar2, 5);
        zzg = zzhelVar7;
        zzhel zzhelVar8 = new zzhel("BOOL", 7, zzhem.BOOLEAN, 0);
        zzh = zzhelVar8;
        zzhel zzhelVar9 = new zzhel("STRING", 8, zzhem.STRING, 2);
        zzi = zzhelVar9;
        zzhem zzhemVar3 = zzhem.MESSAGE;
        zzhel zzhelVar10 = new zzhel("GROUP", 9, zzhemVar3, 3);
        zzj = zzhelVar10;
        zzhel zzhelVar11 = new zzhel("MESSAGE", 10, zzhemVar3, 2);
        zzk = zzhelVar11;
        zzhel zzhelVar12 = new zzhel("BYTES", 11, zzhem.BYTE_STRING, 2);
        zzl = zzhelVar12;
        zzhel zzhelVar13 = new zzhel("UINT32", 12, zzhemVar2, 0);
        zzm = zzhelVar13;
        zzhel zzhelVar14 = new zzhel("ENUM", 13, zzhem.ENUM, 0);
        zzn = zzhelVar14;
        zzhel zzhelVar15 = new zzhel("SFIXED32", 14, zzhemVar2, 5);
        zzo = zzhelVar15;
        zzhel zzhelVar16 = new zzhel("SFIXED64", 15, zzhemVar, 1);
        zzp = zzhelVar16;
        zzhel zzhelVar17 = new zzhel("SINT32", 16, zzhemVar2, 0);
        zzq = zzhelVar17;
        zzhel zzhelVar18 = new zzhel("SINT64", 17, zzhemVar, 0);
        zzr = zzhelVar18;
        zzs = new zzhel[]{zzhelVar, zzhelVar2, zzhelVar3, zzhelVar4, zzhelVar5, zzhelVar6, zzhelVar7, zzhelVar8, zzhelVar9, zzhelVar10, zzhelVar11, zzhelVar12, zzhelVar13, zzhelVar14, zzhelVar15, zzhelVar16, zzhelVar17, zzhelVar18};
    }

    private zzhel(String str, int i2, zzhem zzhemVar, int i3) {
        this.zzt = zzhemVar;
    }

    public static zzhel[] values() {
        return (zzhel[]) zzs.clone();
    }

    public final zzhem zza() {
        return this.zzt;
    }
}
