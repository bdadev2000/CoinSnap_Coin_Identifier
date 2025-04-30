package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgwu extends zzhbo implements zzhdf {
    private static final zzgwu zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd = zzhbo.zzbK();

    static {
        zzgwu zzgwuVar = new zzgwu();
        zza = zzgwuVar;
        zzhbo.zzca(zzgwu.class, zzgwuVar);
    }

    private zzgwu() {
    }

    public static zzgwr zzd() {
        return (zzgwr) zza.zzaZ();
    }

    public static zzgwu zzg(InputStream inputStream, zzhay zzhayVar) throws IOException {
        return (zzgwu) zzhbo.zzbu(zza, inputStream, zzhayVar);
    }

    public static /* synthetic */ void zzj(zzgwu zzgwuVar, zzgwt zzgwtVar) {
        zzgwtVar.getClass();
        zzhca zzhcaVar = zzgwuVar.zzd;
        if (!zzhcaVar.zzc()) {
            zzgwuVar.zzd = zzhbo.zzbL(zzhcaVar);
        }
        zzgwuVar.zzd.add(zzgwtVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwq zzgwqVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgwt.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwu();
            case NEW_BUILDER:
                return new zzgwr(zzgwqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwu.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgwt zze(int i9) {
        return (zzgwt) this.zzd.get(i9);
    }

    public final List zzh() {
        return this.zzd;
    }
}
