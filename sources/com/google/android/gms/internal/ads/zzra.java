package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzra implements zzpr {
    final /* synthetic */ zzrc zza;

    public /* synthetic */ zzra(zzrc zzrcVar, zzrb zzrbVar) {
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zza(Exception exc) {
        zzdt.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzrc.zzae(this.zza).zzb(exc);
    }
}
