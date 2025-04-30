package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgyz extends ThreadLocal {
    final /* synthetic */ zzgza zza;

    public zzgyz(zzgza zzgzaVar) {
        this.zza = zzgzaVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgyn zzgynVar = zzgyn.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgynVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
