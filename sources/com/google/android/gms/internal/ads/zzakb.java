package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzakb implements zzakg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakg
    public final int zza(zzad zzadVar) {
        char c10;
        String str = zzadVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
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
    @Override // com.google.android.gms.internal.ads.zzakg
    public final zzaki zzb(zzad zzadVar) {
        char c10;
        String str = zzadVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return new zzaky(zzadVar.zzr);
                case 1:
                    return new zzalz();
                case 2:
                    return new zzalo();
                case 3:
                    return new zzalc();
                case 4:
                    return new zzaln(zzadVar.zzr);
                case 5:
                    return new zzakw();
                case 6:
                    return new zzaku(zzadVar.zzr);
                case 7:
                    return new zzali();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(zzad zzadVar) {
        String str = zzadVar.zzo;
        if (!Objects.equals(str, MimeTypes.TEXT_SSA) && !Objects.equals(str, MimeTypes.TEXT_VTT) && !Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) && !Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) && !Objects.equals(str, MimeTypes.APPLICATION_TX3G) && !Objects.equals(str, MimeTypes.APPLICATION_PGS) && !Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) && !Objects.equals(str, MimeTypes.APPLICATION_TTML)) {
            return false;
        }
        return true;
    }
}
