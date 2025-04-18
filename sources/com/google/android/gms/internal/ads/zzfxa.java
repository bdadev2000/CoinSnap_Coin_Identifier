package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxa implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfxd zzb;

    public zzfxa(zzfxd zzfxdVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxdVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzf;
        zzf = this.zzb.zzf(this.zza);
        return zzf;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzfwi.zzb(sb2, this, ", ");
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
