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
/* loaded from: classes3.dex */
public final class zzgzo {
    public static final zzgzo zza;
    public static final zzgzo zzb;
    public static final zzgzo zzc;
    public static final zzgzo zzd;
    public static final zzgzo zze;
    public static final zzgzo zzf;
    public static final zzgzo zzg;
    public static final zzgzo zzh;
    public static final zzgzo zzi;
    public static final zzgzo zzj;
    private static final /* synthetic */ zzgzo[] zzk;
    private final Class zzl;

    static {
        zzgzo zzgzoVar = new zzgzo("VOID", 0, Void.class, Void.class, null);
        zza = zzgzoVar;
        Class cls = Integer.TYPE;
        zzgzo zzgzoVar2 = new zzgzo("INT", 1, cls, Integer.class, 0);
        zzb = zzgzoVar2;
        zzgzo zzgzoVar3 = new zzgzo("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgzoVar3;
        zzgzo zzgzoVar4 = new zzgzo("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgzoVar4;
        zzgzo zzgzoVar5 = new zzgzo("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgzoVar5;
        zzgzo zzgzoVar6 = new zzgzo("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgzoVar6;
        zzgzo zzgzoVar7 = new zzgzo("STRING", 6, String.class, String.class, "");
        zzg = zzgzoVar7;
        zzgzo zzgzoVar8 = new zzgzo("BYTE_STRING", 7, zzgxp.class, zzgxp.class, zzgxp.zzb);
        zzh = zzgzoVar8;
        zzgzo zzgzoVar9 = new zzgzo("ENUM", 8, cls, Integer.class, null);
        zzi = zzgzoVar9;
        zzgzo zzgzoVar10 = new zzgzo("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgzoVar10;
        zzk = new zzgzo[]{zzgzoVar, zzgzoVar2, zzgzoVar3, zzgzoVar4, zzgzoVar5, zzgzoVar6, zzgzoVar7, zzgzoVar8, zzgzoVar9, zzgzoVar10};
    }

    private zzgzo(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgzo[] values() {
        return (zzgzo[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
