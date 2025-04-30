package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzhjx extends zzhka implements zzasr {
    zzass zza;
    protected final String zzb = "moov";

    public zzhjx(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzb(zzhkb zzhkbVar, ByteBuffer byteBuffer, long j7, zzaso zzasoVar) throws IOException {
        zzhkbVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhkbVar;
        this.zzf = zzhkbVar.zzb();
        zzhkbVar.zze(zzhkbVar.zzb() + j7);
        this.zzg = zzhkbVar.zzb();
        this.zzc = zzasoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final void zzc(zzass zzassVar) {
        this.zza = zzassVar;
    }
}
