package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazm extends zzazs {
    private final zzayl zzi;
    private long zzj;

    public zzazm(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, zzayl zzaylVar) {
        super(zzayeVar, "1LUIVO6lhWmBJfHw9DMAIriIU/Yodc7yYpCjENKu6ENqSuhgH3MJrJCpj/jKq6Pa", "V8P78mWO+MxnWR283vMX+BSDXEvrm8XlQCYXMpvUe5w=", zzatpVar, i9, 53);
        this.zzi = zzaylVar;
        if (zzaylVar != null) {
            this.zzj = zzaylVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzV(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
