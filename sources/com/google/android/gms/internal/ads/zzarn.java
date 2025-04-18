package com.google.android.gms.internal.ads;

import com.applovin.impl.adview.t;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzarn extends zzhht implements Closeable {
    static {
        zzhia.zzb(zzarn.class);
    }

    public zzarn(zzhhu zzhhuVar, zzarm zzarmVar) throws IOException {
        zze(zzhhuVar, zzhhuVar.zzc(), zzarmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhht, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhht
    public final String toString() {
        String obj = this.zzc.toString();
        return t.j(t.b(obj, 7), "model(", obj, ")");
    }
}
