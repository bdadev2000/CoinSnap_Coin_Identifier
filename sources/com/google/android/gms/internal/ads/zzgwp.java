package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgwp extends ThreadLocal {
    final /* synthetic */ zzgwq zza;

    public zzgwp(zzgwq zzgwqVar) {
        this.zza = zzgwqVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgwc zzgwcVar = zzgwc.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzgwcVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
