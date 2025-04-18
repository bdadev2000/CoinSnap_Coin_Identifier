package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzhfm extends zzhfp {
    final Logger zza;

    public zzhfm(String str) {
        this.zza = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhfp
    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
