package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfyq implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfyt zzb;

    public zzfyq(zzfyt zzfytVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfytVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfxv.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
