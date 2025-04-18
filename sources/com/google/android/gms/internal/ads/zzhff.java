package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class zzhff extends zzhfi implements zzarc {
    protected final String zza = "moov";

    public zzhff(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzb(zzhfj zzhfjVar, ByteBuffer byteBuffer, long j3, zzaqz zzaqzVar) throws IOException {
        zzhfjVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhfjVar;
        this.zze = zzhfjVar.zzb();
        zzhfjVar.zze(zzhfjVar.zzb() + j3);
        this.zzf = zzhfjVar.zzb();
        this.zzb = zzaqzVar;
    }
}
