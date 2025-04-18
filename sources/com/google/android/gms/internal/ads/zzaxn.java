package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxn extends zzaxt {
    private final zzawm zzh;
    private long zzi;

    public zzaxn(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, zzawm zzawmVar) {
        super(zzawfVar, "Atq0HLNiKHjz80ZnAFWvUPfMlGQHg7AXdMxxDL1JZ6bmQmTFxmAmKhIDk2Jnayuk", "Su/GzywZakXq4glBT/l81JrPkq4+JC0EaqCjCuVscxM=", zzasfVar, i10, 53);
        this.zzh = zzawmVar;
        if (zzawmVar != null) {
            this.zzi = zzawmVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzP(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
