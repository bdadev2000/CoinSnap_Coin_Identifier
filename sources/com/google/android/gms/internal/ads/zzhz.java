package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzhz extends zzhb {
    public static final zzfyh zza = new zzfyh() { // from class: com.google.android.gms.internal.ads.zzht
        @Override // com.google.android.gms.internal.ads.zzfyh
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str != null) {
                String zza2 = zzfxm.zza(str);
                if (!TextUtils.isEmpty(zza2)) {
                    if ((!zza2.contains(MimeTypes.BASE_TYPE_TEXT) || zza2.contains(MimeTypes.TEXT_VTT)) && !zza2.contains("html") && !zza2.contains("xml")) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzhb
    Map zze();
}
