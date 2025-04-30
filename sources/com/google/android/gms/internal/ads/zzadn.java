package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzadn implements zzaea {
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};
    private static final zzadm zzc = new zzadm(new zzadl() { // from class: com.google.android.gms.internal.ads.zzadj
        @Override // com.google.android.gms.internal.ads.zzadl
        public final Constructor zza() {
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadu.class).getConstructor(Integer.TYPE);
        }
    });
    private static final zzadm zzd = new zzadm(new zzadl() { // from class: com.google.android.gms.internal.ads.zzadk
        @Override // com.google.android.gms.internal.ads.zzadl
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadu.class).getConstructor(null);
        }
    });

    @Nullable
    private zzgbc zze;
    private final zzalt zzf = new zzalo();

    private final void zzb(int i9, List list) {
        switch (i9) {
            case 0:
                list.add(new zzanr());
                return;
            case 1:
                list.add(new zzanu());
                return;
            case 2:
                list.add(new zzanx(0));
                return;
            case 3:
                list.add(new zzafi(0));
                return;
            case 4:
                zzadu zza = zzc.zza(0);
                if (zza != null) {
                    list.add(zza);
                    return;
                } else {
                    list.add(new zzaga(0));
                    return;
                }
            case 5:
                list.add(new zzagd());
                return;
            case 6:
                list.add(new zzaiy(this.zzf, 2));
                return;
            case 7:
                list.add(new zzajg(0));
                return;
            case 8:
                list.add(new zzakd(this.zzf, 32));
                list.add(new zzakj(this.zzf, 16));
                return;
            case 9:
                list.add(new zzala());
                return;
            case 10:
                list.add(new zzapa());
                return;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgbc.zzm();
                }
                list.add(new zzapk(1, 1, this.zzf, new zzgb(0L), new zzanz(0, this.zze), 112800));
                return;
            case 12:
                list.add(new zzapw());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzagj(0));
                return;
            case 15:
                zzadu zza2 = zzd.zza(new Object[0]);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                }
                return;
            case 16:
                list.add(new zzafn(1, this.zzf));
                return;
            case 17:
                list.add(new zzall());
                return;
            case 18:
                list.add(new zzaqb());
                return;
            case 19:
                list.add(new zzafu());
                return;
            case 20:
                list.add(new zzagi());
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01e1 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x038c A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a5 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ed A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x001f, B:13:0x01e1, B:14:0x01e4, B:19:0x0384, B:20:0x0387, B:22:0x038c, B:25:0x0392, B:27:0x0395, B:31:0x0398, B:32:0x039f, B:34:0x03a5, B:41:0x01ed, B:43:0x01f5, B:45:0x0200, B:48:0x020c, B:50:0x0214, B:52:0x021f, B:55:0x022a, B:58:0x0235, B:61:0x0240, B:63:0x0248, B:65:0x0250, B:67:0x025c, B:69:0x026a, B:71:0x0275, B:74:0x0280, B:76:0x0288, B:78:0x0296, B:80:0x02a4, B:82:0x02b6, B:84:0x02c4, B:86:0x02d0, B:88:0x02d8, B:90:0x02e0, B:92:0x02e8, B:94:0x02f4, B:96:0x02fc, B:98:0x030d, B:100:0x0315, B:102:0x0320, B:104:0x0328, B:106:0x0333, B:108:0x033b, B:110:0x0345, B:113:0x034f, B:116:0x0359, B:119:0x0364, B:121:0x036c, B:123:0x0377, B:138:0x004b, B:139:0x0053, B:142:0x01ab, B:164:0x0058, B:167:0x0064, B:170:0x0070, B:173:0x007c, B:176:0x0088, B:179:0x0093, B:182:0x009f, B:185:0x00aa, B:188:0x00b5, B:191:0x00c1, B:194:0x00cd, B:197:0x00d8, B:200:0x00e3, B:203:0x00ee, B:206:0x00f9, B:209:0x0105, B:212:0x0110, B:215:0x011b, B:218:0x0127, B:221:0x0133, B:224:0x013f, B:227:0x014b, B:230:0x0156, B:233:0x0161, B:236:0x016c, B:239:0x0177, B:242:0x0181, B:245:0x018b, B:248:0x0196, B:251:0x01a0), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzaea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzadu[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadn.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzadu[]");
    }
}
