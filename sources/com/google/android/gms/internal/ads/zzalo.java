package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzalo implements zzalt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzalt
    public final int zza(zzan zzanVar) {
        char c9;
        String str = zzanVar.zzn;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                case 5:
                case 6:
                    return 2;
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzalt
    public final zzalv zzb(zzan zzanVar) {
        char c9;
        String str = zzanVar.zzn;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return new zzaml(zzanVar.zzp);
                case 1:
                    return new zzanm();
                case 2:
                    return new zzanb();
                case 3:
                    return new zzamp();
                case 4:
                    return new zzana(zzanVar.zzp);
                case 5:
                    return new zzamj();
                case 6:
                    return new zzamh(zzanVar.zzp);
                case 7:
                    return new zzamv();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final boolean zzc(zzan zzanVar) {
        String str = zzanVar.zzn;
        if (!Objects.equals(str, MimeTypes.TEXT_SSA) && !Objects.equals(str, MimeTypes.TEXT_VTT) && !Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) && !Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) && !Objects.equals(str, MimeTypes.APPLICATION_TX3G) && !Objects.equals(str, MimeTypes.APPLICATION_PGS) && !Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) && !Objects.equals(str, MimeTypes.APPLICATION_TTML)) {
            return false;
        }
        return true;
    }
}
