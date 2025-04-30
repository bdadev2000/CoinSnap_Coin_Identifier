package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfym extends zzfyr {
    final /* synthetic */ zzfyn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfym(zzfyn zzfynVar, zzfyt zzfytVar, CharSequence charSequence) {
        super(zzfytVar, charSequence);
        this.zza = zzfynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzc(int i9) {
        return i9 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zzd(int i9) {
        CharSequence charSequence = ((zzfyr) this).zzb;
        int length = charSequence.length();
        zzfyg.zzb(i9, length, "index");
        while (i9 < length) {
            zzfyn zzfynVar = this.zza;
            if (!zzfynVar.zza.zzb(charSequence.charAt(i9))) {
                i9++;
            } else {
                return i9;
            }
        }
        return -1;
    }
}
