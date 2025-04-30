package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
final class zzamk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzamk(int i9, int i10, int i11, int i12, int i13) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    @Nullable
    public static zzamk zza(String str) {
        char c9;
        zzeq.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            int length = split.length;
            if (i9 < length) {
                String zza = zzfxm.zza(split[i9].trim());
                switch (zza.hashCode()) {
                    case 100571:
                        if (zza.equals(TtmlNode.END)) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 3556653:
                        if (zza.equals(MimeTypes.BASE_TYPE_TEXT)) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 109757538:
                        if (zza.equals("start")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 109780401:
                        if (zza.equals(TtmlNode.TAG_STYLE)) {
                            c9 = 2;
                            break;
                        }
                        break;
                }
                c9 = 65535;
                if (c9 != 0) {
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 == 3) {
                                i13 = i9;
                            }
                        } else {
                            i12 = i9;
                        }
                    } else {
                        i11 = i9;
                    }
                } else {
                    i10 = i9;
                }
                i9++;
            } else {
                if (i10 != -1 && i11 != -1 && i13 != -1) {
                    return new zzamk(i10, i11, i12, i13, length);
                }
                return null;
            }
        }
    }
}
