package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzanm implements zzalv {
    private final zzfu zza = new zzfu();
    private final zzanc zzb = new zzanc();

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        this.zza.zzI(bArr, i10 + i9);
        this.zza.zzK(i9);
        ArrayList arrayList = new ArrayList();
        try {
            zzfu zzfuVar = this.zza;
            int zzd = zzfuVar.zzd();
            Charset charset = zzfxs.zzc;
            String zzy = zzfuVar.zzy(charset);
            if (zzy == null || !zzy.startsWith("WEBVTT")) {
                zzfuVar.zzK(zzd);
                throw zzch.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzfuVar.zzy(charset))), null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzy(zzfxs.zzc)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzfu zzfuVar2 = this.zza;
                char c9 = 65535;
                int i11 = 0;
                while (c9 == 65535) {
                    i11 = zzfuVar2.zzd();
                    String zzy2 = zzfuVar2.zzy(zzfxs.zzc);
                    if (zzy2 == null) {
                        c9 = 0;
                    } else if ("STYLE".equals(zzy2)) {
                        c9 = 2;
                    } else if (zzy2.startsWith("NOTE")) {
                        c9 = 1;
                    } else {
                        c9 = 3;
                    }
                }
                zzfuVar2.zzK(i11);
                if (c9 != 0) {
                    if (c9 == 1) {
                        do {
                        } while (!TextUtils.isEmpty(this.zza.zzy(zzfxs.zzc)));
                    } else if (c9 == 2) {
                        if (arrayList2.isEmpty()) {
                            this.zza.zzy(zzfxs.zzc);
                            arrayList.addAll(this.zzb.zzb(this.zza));
                        } else {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                    } else {
                        zzane zzc = zzanl.zzc(this.zza, arrayList);
                        if (zzc != null) {
                            arrayList2.add(zzc);
                        }
                    }
                } else {
                    zzalp.zza(new zzanp(arrayList2), zzaluVar, zzevVar);
                    return;
                }
            }
        } catch (zzch e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
