package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfww extends zzfxb {
    final /* synthetic */ zzfwx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfww(zzfwx zzfwxVar, zzfxd zzfxdVar, CharSequence charSequence) {
        super(zzfxdVar, charSequence);
        this.zza = zzfwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final int zzd(int i10) {
        CharSequence charSequence = ((zzfxb) this).zzb;
        int length = charSequence.length();
        zzfwq.zzb(i10, length, "index");
        while (i10 < length) {
            zzfwx zzfwxVar = this.zza;
            if (!zzfwxVar.zza.zzb(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }
}
