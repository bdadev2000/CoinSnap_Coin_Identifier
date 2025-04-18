package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzalz implements zzaki {
    private final zzed zza = new zzed();
    private final zzalp zzb = new zzalp();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        ArrayList arrayList = new ArrayList();
        try {
            zzed zzedVar = this.zza;
            int zzd = zzedVar.zzd();
            String zzz = zzedVar.zzz(StandardCharsets.UTF_8);
            if (zzz == null || !zzz.startsWith("WEBVTT")) {
                zzedVar.zzL(zzd);
                throw zzbh.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzedVar.zzz(StandardCharsets.UTF_8))), null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzed zzedVar2 = this.zza;
                char c10 = 65535;
                int i12 = 0;
                while (c10 == 65535) {
                    i12 = zzedVar2.zzd();
                    String zzz2 = zzedVar2.zzz(StandardCharsets.UTF_8);
                    if (zzz2 == null) {
                        c10 = 0;
                    } else if ("STYLE".equals(zzz2)) {
                        c10 = 2;
                    } else if (zzz2.startsWith("NOTE")) {
                        c10 = 1;
                    } else {
                        c10 = 3;
                    }
                }
                zzedVar2.zzL(i12);
                if (c10 != 0) {
                    if (c10 == 1) {
                        do {
                        } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
                    } else if (c10 == 2) {
                        if (arrayList2.isEmpty()) {
                            this.zza.zzz(StandardCharsets.UTF_8);
                            arrayList.addAll(this.zzb.zzb(this.zza));
                        } else {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                    } else {
                        zzalr zzc = zzaly.zzc(this.zza, arrayList);
                        if (zzc != null) {
                            arrayList2.add(zzc);
                        }
                    }
                } else {
                    zzakc.zza(new zzamc(arrayList2), zzakhVar, zzdgVar);
                    return;
                }
            }
        } catch (zzbh e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
