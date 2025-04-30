package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayp extends zzazs {
    public zzayp(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "g3h/WBQ8k1SqFyNwcX6aXlyabMyZPKS0QgL4qcVfix1XI+70++CdiHkDZKRlUPQw", "8DR7pqgII7Dvg/rx7G/5VQ7MbFexA62WxQA5oVjQDIU=", zzatpVar, i9, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zzf.invoke(null, null);
        synchronized (this.zze) {
            this.zze.zzh(str);
        }
    }
}
