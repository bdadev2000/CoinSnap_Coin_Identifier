package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzarh extends zzaqc {
    private final Object zza;

    @Nullable
    @GuardedBy
    private final zzaqh zzb;

    public zzarh(int i2, String str, zzaqh zzaqhVar, @Nullable zzaqg zzaqgVar) {
        super(i2, str, zzaqgVar);
        this.zza = new Object();
        this.zzb = zzaqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final zzaqi zzh(zzapy zzapyVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapyVar.zzb;
            Map map = zzapyVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i2].trim().split(ImpressionLog.R, 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapyVar.zzb);
        }
        return zzaqi.zzb(str, zzaqz.zzb(zzapyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzaqh zzaqhVar;
        synchronized (this.zza) {
            zzaqhVar = this.zzb;
        }
        zzaqhVar.zza(str);
    }
}
