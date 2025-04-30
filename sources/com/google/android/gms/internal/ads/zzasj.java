package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzasj extends zzare {
    private final Object zza;

    @Nullable
    private final zzarj zzb;

    public zzasj(int i9, String str, zzarj zzarjVar, @Nullable zzari zzariVar) {
        super(i9, str, zzariVar);
        this.zza = new Object();
        this.zzb = zzarjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final zzark zzh(zzara zzaraVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaraVar.zzb;
            Map map = zzaraVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i9 = 1;
                while (true) {
                    if (i9 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i9].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i9++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaraVar.zzb);
        }
        return zzark.zzb(str, zzasb.zzb(zzaraVar));
    }

    @Override // com.google.android.gms.internal.ads.zzare
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzarj zzarjVar;
        synchronized (this.zza) {
            zzarjVar = this.zzb;
        }
        zzarjVar.zza(str);
    }
}
