package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgum extends zzgyx implements zzhaj {
    private static final zzgum zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgzj zzd = zzgyx.zzbK();

    static {
        zzgum zzgumVar = new zzgum();
        zza = zzgumVar;
        zzgyx.zzcb(zzgum.class, zzgumVar);
    }

    private zzgum() {
    }

    public static zzgui zzc() {
        return (zzgui) zza.zzaZ();
    }

    public static zzgum zzg(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        return (zzgum) zzgyx.zzbu(zza, inputStream, zzgyhVar);
    }

    public static /* synthetic */ void zzi(zzgum zzgumVar, zzguk zzgukVar) {
        zzgukVar.getClass();
        zzgzj zzgzjVar = zzgumVar.zzd;
        if (!zzgzjVar.zzc()) {
            zzgumVar.zzd = zzgyx.zzbL(zzgzjVar);
        }
        zzgumVar.zzd.add(zzgukVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzguk zzd(int i10) {
        return (zzguk) this.zzd.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgul zzgulVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzguk.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgum();
            case NEW_BUILDER:
                return new zzgui(zzgulVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgum.class) {
                        zzhaqVar = zzb;
                        if (zzhaqVar == null) {
                            zzhaqVar = new zzgys(zza);
                            zzb = zzhaqVar;
                        }
                    }
                }
                return zzhaqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List zzh() {
        return this.zzd;
    }
}
