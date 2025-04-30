package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdy extends Exception {
    public final zzdx zza;

    public zzdy(String str, zzdx zzdxVar) {
        super("Unhandled input format: ".concat(String.valueOf(zzdxVar)));
        this.zza = zzdxVar;
    }
}
