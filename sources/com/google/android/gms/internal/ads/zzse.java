package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzse implements zzqs {
    final /* synthetic */ zzsf zza;

    public /* synthetic */ zzse(zzsf zzsfVar, zzsd zzsdVar) {
        this.zza = zzsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final void zza(Exception exc) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzsf.zzae(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final void zzb() {
        zzsf zzsfVar = this.zza;
        if (zzsf.zzad(zzsfVar) != null) {
            zzsf.zzad(zzsfVar).zzb();
        }
    }
}
