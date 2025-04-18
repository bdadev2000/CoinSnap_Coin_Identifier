package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzaqu;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbi extends zzaqu {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbn zzbnVar, int i10, String str, zzapu zzapuVar, zzapt zzaptVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i10, str, zzapuVar, zzaptVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final Map zzl() throws zzaox {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final byte[] zzx() throws zzaox {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu, com.google.android.gms.internal.ads.zzapp
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
