package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfyo extends zzfyr {
    final /* synthetic */ zzfyp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyo(zzfyp zzfypVar, zzfyt zzfytVar, CharSequence charSequence) {
        super(zzfytVar, charSequence);
        this.zza = zzfypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzc(int i9) {
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzd(int i9) {
        int i10 = i9 + 4000;
        if (i10 < ((zzfyr) this).zzb.length()) {
            return i10;
        }
        return -1;
    }
}
