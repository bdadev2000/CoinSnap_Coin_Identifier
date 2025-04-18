package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzamm implements zzakv {
    private final zzek zza = new zzek();
    private final zzamc zzb = new zzamc();

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        this.zza.zzJ(bArr, i3 + i2);
        this.zza.zzL(i2);
        ArrayList arrayList = new ArrayList();
        try {
            zzek zzekVar = this.zza;
            int zzd = zzekVar.zzd();
            Charset charset = StandardCharsets.UTF_8;
            String zzz = zzekVar.zzz(charset);
            if (zzz == null || !zzz.startsWith("WEBVTT")) {
                zzekVar.zzL(zzd);
                throw zzbo.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzekVar.zzz(charset))), null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzek zzekVar2 = this.zza;
                char c2 = 65535;
                int i4 = 0;
                while (c2 == 65535) {
                    i4 = zzekVar2.zzd();
                    String zzz2 = zzekVar2.zzz(StandardCharsets.UTF_8);
                    c2 = zzz2 == null ? (char) 0 : "STYLE".equals(zzz2) ? (char) 2 : zzz2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzekVar2.zzL(i4);
                if (c2 == 0) {
                    zzakp.zza(new zzamp(arrayList2), zzakuVar, zzdnVar);
                    return;
                }
                if (c2 == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
                } else if (c2 != 2) {
                    zzame zzc = zzaml.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzbo e) {
            throw new IllegalArgumentException(e);
        }
    }
}
