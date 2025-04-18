package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfyj implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfym zzb;

    public zzfyj(zzfym zzfymVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfymVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzf;
        zzf = this.zzb.zzf(this.zza);
        return zzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfxr.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
