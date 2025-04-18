package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzrh implements zzpv {
    final /* synthetic */ zzri zza;

    public /* synthetic */ zzrh(zzri zzriVar, zzrg zzrgVar) {
        this.zza = zzriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zza(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzri.zzae(this.zza).zzb(exc);
    }
}
