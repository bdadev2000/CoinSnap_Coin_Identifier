package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
final class zzakx {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzakx(int i10, int i11, int i12, int i13, int i14) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
    }

    @Nullable
    public static zzakx zza(String str) {
        char c10;
        zzdb.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = split.length;
            if (i10 < length) {
                String zza = zzfwa.zza(split[i10].trim());
                switch (zza.hashCode()) {
                    case 100571:
                        if (zza.equals(TtmlNode.END)) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3556653:
                        if (zza.equals(MimeTypes.BASE_TYPE_TEXT)) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 109757538:
                        if (zza.equals("start")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 109780401:
                        if (zza.equals(TtmlNode.TAG_STYLE)) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 == 3) {
                                i14 = i10;
                            }
                        } else {
                            i13 = i10;
                        }
                    } else {
                        i12 = i10;
                    }
                } else {
                    i11 = i10;
                }
                i10++;
            } else {
                if (i11 != -1 && i12 != -1 && i14 != -1) {
                    return new zzakx(i11, i12, i13, i14, length);
                }
                return null;
            }
        }
    }
}
