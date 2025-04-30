package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class zzhbe {
    public static final zzhbe zzA;
    public static final zzhbe zzB;
    public static final zzhbe zzC;
    public static final zzhbe zzD;
    public static final zzhbe zzE;
    public static final zzhbe zzF;
    public static final zzhbe zzG;
    public static final zzhbe zzH;
    public static final zzhbe zzI;
    public static final zzhbe zzJ;
    public static final zzhbe zzK;
    public static final zzhbe zzL;
    public static final zzhbe zzM;
    public static final zzhbe zzN;
    public static final zzhbe zzO;
    public static final zzhbe zzP;
    public static final zzhbe zzQ;
    public static final zzhbe zzR;
    public static final zzhbe zzS;
    public static final zzhbe zzT;
    public static final zzhbe zzU;
    public static final zzhbe zzV;
    public static final zzhbe zzW;
    public static final zzhbe zzX;
    public static final zzhbe zzY;
    private static final zzhbe[] zzZ;
    public static final zzhbe zza;
    private static final /* synthetic */ zzhbe[] zzaa;
    public static final zzhbe zzb;
    public static final zzhbe zzc;
    public static final zzhbe zzd;
    public static final zzhbe zze;
    public static final zzhbe zzf;
    public static final zzhbe zzg;
    public static final zzhbe zzh;
    public static final zzhbe zzi;
    public static final zzhbe zzj;
    public static final zzhbe zzk;
    public static final zzhbe zzl;
    public static final zzhbe zzm;
    public static final zzhbe zzn;
    public static final zzhbe zzo;
    public static final zzhbe zzp;
    public static final zzhbe zzq;
    public static final zzhbe zzr;
    public static final zzhbe zzs;
    public static final zzhbe zzt;
    public static final zzhbe zzu;
    public static final zzhbe zzv;
    public static final zzhbe zzw;
    public static final zzhbe zzx;
    public static final zzhbe zzy;
    public static final zzhbe zzz;
    private final zzhcf zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzhcf zzhcfVar = zzhcf.zze;
        zzhbe zzhbeVar = new zzhbe("DOUBLE", 0, 0, 1, zzhcfVar);
        zza = zzhbeVar;
        zzhcf zzhcfVar2 = zzhcf.zzd;
        zzhbe zzhbeVar2 = new zzhbe("FLOAT", 1, 1, 1, zzhcfVar2);
        zzb = zzhbeVar2;
        zzhcf zzhcfVar3 = zzhcf.zzc;
        zzhbe zzhbeVar3 = new zzhbe("INT64", 2, 2, 1, zzhcfVar3);
        zzc = zzhbeVar3;
        zzhbe zzhbeVar4 = new zzhbe("UINT64", 3, 3, 1, zzhcfVar3);
        zzd = zzhbeVar4;
        zzhcf zzhcfVar4 = zzhcf.zzb;
        zzhbe zzhbeVar5 = new zzhbe("INT32", 4, 4, 1, zzhcfVar4);
        zze = zzhbeVar5;
        zzhbe zzhbeVar6 = new zzhbe("FIXED64", 5, 5, 1, zzhcfVar3);
        zzf = zzhbeVar6;
        zzhbe zzhbeVar7 = new zzhbe("FIXED32", 6, 6, 1, zzhcfVar4);
        zzg = zzhbeVar7;
        zzhcf zzhcfVar5 = zzhcf.zzf;
        zzhbe zzhbeVar8 = new zzhbe("BOOL", 7, 7, 1, zzhcfVar5);
        zzh = zzhbeVar8;
        zzhcf zzhcfVar6 = zzhcf.zzg;
        zzhbe zzhbeVar9 = new zzhbe("STRING", 8, 8, 1, zzhcfVar6);
        zzi = zzhbeVar9;
        zzhcf zzhcfVar7 = zzhcf.zzj;
        zzhbe zzhbeVar10 = new zzhbe("MESSAGE", 9, 9, 1, zzhcfVar7);
        zzj = zzhbeVar10;
        zzhcf zzhcfVar8 = zzhcf.zzh;
        zzhbe zzhbeVar11 = new zzhbe("BYTES", 10, 10, 1, zzhcfVar8);
        zzk = zzhbeVar11;
        zzhbe zzhbeVar12 = new zzhbe("UINT32", 11, 11, 1, zzhcfVar4);
        zzl = zzhbeVar12;
        zzhcf zzhcfVar9 = zzhcf.zzi;
        zzhbe zzhbeVar13 = new zzhbe("ENUM", 12, 12, 1, zzhcfVar9);
        zzm = zzhbeVar13;
        zzhbe zzhbeVar14 = new zzhbe("SFIXED32", 13, 13, 1, zzhcfVar4);
        zzn = zzhbeVar14;
        zzhbe zzhbeVar15 = new zzhbe("SFIXED64", 14, 14, 1, zzhcfVar3);
        zzo = zzhbeVar15;
        zzhbe zzhbeVar16 = new zzhbe("SINT32", 15, 15, 1, zzhcfVar4);
        zzp = zzhbeVar16;
        zzhbe zzhbeVar17 = new zzhbe("SINT64", 16, 16, 1, zzhcfVar3);
        zzq = zzhbeVar17;
        zzhbe zzhbeVar18 = new zzhbe("GROUP", 17, 17, 1, zzhcfVar7);
        zzr = zzhbeVar18;
        zzhbe zzhbeVar19 = new zzhbe("DOUBLE_LIST", 18, 18, 2, zzhcfVar);
        zzs = zzhbeVar19;
        zzhbe zzhbeVar20 = new zzhbe("FLOAT_LIST", 19, 19, 2, zzhcfVar2);
        zzt = zzhbeVar20;
        zzhbe zzhbeVar21 = new zzhbe("INT64_LIST", 20, 20, 2, zzhcfVar3);
        zzu = zzhbeVar21;
        zzhbe zzhbeVar22 = new zzhbe("UINT64_LIST", 21, 21, 2, zzhcfVar3);
        zzv = zzhbeVar22;
        zzhbe zzhbeVar23 = new zzhbe("INT32_LIST", 22, 22, 2, zzhcfVar4);
        zzw = zzhbeVar23;
        zzhbe zzhbeVar24 = new zzhbe("FIXED64_LIST", 23, 23, 2, zzhcfVar3);
        zzx = zzhbeVar24;
        zzhbe zzhbeVar25 = new zzhbe("FIXED32_LIST", 24, 24, 2, zzhcfVar4);
        zzy = zzhbeVar25;
        zzhbe zzhbeVar26 = new zzhbe("BOOL_LIST", 25, 25, 2, zzhcfVar5);
        zzz = zzhbeVar26;
        zzhbe zzhbeVar27 = new zzhbe("STRING_LIST", 26, 26, 2, zzhcfVar6);
        zzA = zzhbeVar27;
        zzhbe zzhbeVar28 = new zzhbe("MESSAGE_LIST", 27, 27, 2, zzhcfVar7);
        zzB = zzhbeVar28;
        zzhbe zzhbeVar29 = new zzhbe("BYTES_LIST", 28, 28, 2, zzhcfVar8);
        zzC = zzhbeVar29;
        zzhbe zzhbeVar30 = new zzhbe("UINT32_LIST", 29, 29, 2, zzhcfVar4);
        zzD = zzhbeVar30;
        zzhbe zzhbeVar31 = new zzhbe("ENUM_LIST", 30, 30, 2, zzhcfVar9);
        zzE = zzhbeVar31;
        zzhbe zzhbeVar32 = new zzhbe("SFIXED32_LIST", 31, 31, 2, zzhcfVar4);
        zzF = zzhbeVar32;
        zzhbe zzhbeVar33 = new zzhbe("SFIXED64_LIST", 32, 32, 2, zzhcfVar3);
        zzG = zzhbeVar33;
        zzhbe zzhbeVar34 = new zzhbe("SINT32_LIST", 33, 33, 2, zzhcfVar4);
        zzH = zzhbeVar34;
        zzhbe zzhbeVar35 = new zzhbe("SINT64_LIST", 34, 34, 2, zzhcfVar3);
        zzI = zzhbeVar35;
        zzhbe zzhbeVar36 = new zzhbe("DOUBLE_LIST_PACKED", 35, 35, 3, zzhcfVar);
        zzJ = zzhbeVar36;
        zzhbe zzhbeVar37 = new zzhbe("FLOAT_LIST_PACKED", 36, 36, 3, zzhcfVar2);
        zzK = zzhbeVar37;
        zzhbe zzhbeVar38 = new zzhbe("INT64_LIST_PACKED", 37, 37, 3, zzhcfVar3);
        zzL = zzhbeVar38;
        zzhbe zzhbeVar39 = new zzhbe("UINT64_LIST_PACKED", 38, 38, 3, zzhcfVar3);
        zzM = zzhbeVar39;
        zzhbe zzhbeVar40 = new zzhbe("INT32_LIST_PACKED", 39, 39, 3, zzhcfVar4);
        zzN = zzhbeVar40;
        zzhbe zzhbeVar41 = new zzhbe("FIXED64_LIST_PACKED", 40, 40, 3, zzhcfVar3);
        zzO = zzhbeVar41;
        zzhbe zzhbeVar42 = new zzhbe("FIXED32_LIST_PACKED", 41, 41, 3, zzhcfVar4);
        zzP = zzhbeVar42;
        zzhbe zzhbeVar43 = new zzhbe("BOOL_LIST_PACKED", 42, 42, 3, zzhcfVar5);
        zzQ = zzhbeVar43;
        zzhbe zzhbeVar44 = new zzhbe("UINT32_LIST_PACKED", 43, 43, 3, zzhcfVar4);
        zzR = zzhbeVar44;
        zzhbe zzhbeVar45 = new zzhbe("ENUM_LIST_PACKED", 44, 44, 3, zzhcfVar9);
        zzS = zzhbeVar45;
        zzhbe zzhbeVar46 = new zzhbe("SFIXED32_LIST_PACKED", 45, 45, 3, zzhcfVar4);
        zzT = zzhbeVar46;
        zzhbe zzhbeVar47 = new zzhbe("SFIXED64_LIST_PACKED", 46, 46, 3, zzhcfVar3);
        zzU = zzhbeVar47;
        zzhbe zzhbeVar48 = new zzhbe("SINT32_LIST_PACKED", 47, 47, 3, zzhcfVar4);
        zzV = zzhbeVar48;
        zzhbe zzhbeVar49 = new zzhbe("SINT64_LIST_PACKED", 48, 48, 3, zzhcfVar3);
        zzW = zzhbeVar49;
        zzhbe zzhbeVar50 = new zzhbe("GROUP_LIST", 49, 49, 2, zzhcfVar7);
        zzX = zzhbeVar50;
        zzhbe zzhbeVar51 = new zzhbe("MAP", 50, 50, 4, zzhcf.zza);
        zzY = zzhbeVar51;
        zzaa = new zzhbe[]{zzhbeVar, zzhbeVar2, zzhbeVar3, zzhbeVar4, zzhbeVar5, zzhbeVar6, zzhbeVar7, zzhbeVar8, zzhbeVar9, zzhbeVar10, zzhbeVar11, zzhbeVar12, zzhbeVar13, zzhbeVar14, zzhbeVar15, zzhbeVar16, zzhbeVar17, zzhbeVar18, zzhbeVar19, zzhbeVar20, zzhbeVar21, zzhbeVar22, zzhbeVar23, zzhbeVar24, zzhbeVar25, zzhbeVar26, zzhbeVar27, zzhbeVar28, zzhbeVar29, zzhbeVar30, zzhbeVar31, zzhbeVar32, zzhbeVar33, zzhbeVar34, zzhbeVar35, zzhbeVar36, zzhbeVar37, zzhbeVar38, zzhbeVar39, zzhbeVar40, zzhbeVar41, zzhbeVar42, zzhbeVar43, zzhbeVar44, zzhbeVar45, zzhbeVar46, zzhbeVar47, zzhbeVar48, zzhbeVar49, zzhbeVar50, zzhbeVar51};
        zzhbe[] values = values();
        zzZ = new zzhbe[values.length];
        for (zzhbe zzhbeVar52 : values) {
            zzZ[zzhbeVar52.zzac] = zzhbeVar52;
        }
    }

    private zzhbe(String str, int i9, int i10, int i11, zzhcf zzhcfVar) {
        this.zzac = i10;
        this.zzab = zzhcfVar;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 != 3) {
                this.zzad = null;
            } else {
                this.zzad = zzhcfVar.zza();
            }
        } else {
            this.zzad = zzhcfVar.zza();
        }
        if (i11 == 1) {
            zzhcf zzhcfVar2 = zzhcf.zza;
            zzhcfVar.ordinal();
        }
    }

    public static zzhbe[] values() {
        return (zzhbe[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
