package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzaqu extends zzapp {
    private final Object zza;

    @Nullable
    private final zzapu zzb;

    public zzaqu(int i10, String str, zzapu zzapuVar, @Nullable zzapt zzaptVar) {
        super(i10, str, zzaptVar);
        this.zza = new Object();
        this.zzb = zzapuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapv zzh(zzapl zzaplVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaplVar.zzb;
            Map map = zzaplVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaplVar.zzb);
        }
        return zzapv.zzb(str, zzaqm.zzb(zzaplVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzapu zzapuVar;
        synchronized (this.zza) {
            zzapuVar = this.zzb;
        }
        zzapuVar.zza(str);
    }
}
