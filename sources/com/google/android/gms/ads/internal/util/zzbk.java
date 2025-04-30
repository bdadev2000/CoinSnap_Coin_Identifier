package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzasj;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbk extends zzasj {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbq zzbqVar, int i9, String str, zzarj zzarjVar, zzari zzariVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i9, str, zzarjVar, zzariVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final Map zzl() throws zzaqm {
        Map map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final byte[] zzx() throws zzaqm {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzasj, com.google.android.gms.internal.ads.zzare
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
