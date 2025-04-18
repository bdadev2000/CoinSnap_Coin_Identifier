package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzacl implements zzacw {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzack zzb = new zzack(new zzacj() { // from class: com.google.android.gms.internal.ads.zzach
        @Override // com.google.android.gms.internal.ads.zzacj
        public final Constructor zza() {
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacr.class).getConstructor(Integer.TYPE);
        }
    });
    private static final zzack zzc = new zzack(new zzacj() { // from class: com.google.android.gms.internal.ads.zzaci
        @Override // com.google.android.gms.internal.ads.zzacj
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzacr.class).getConstructor(new Class[0]);
        }
    });

    @Nullable
    private zzfzo zzd;
    private final zzakg zze = new zzakb();

    private final void zzb(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzamd());
                return;
            case 1:
                list.add(new zzamf());
                return;
            case 2:
                list.add(new zzamh(0));
                return;
            case 3:
                list.add(new zzaee(0));
                return;
            case 4:
                zzacr zza2 = zzb.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaew(0));
                    return;
                }
            case 5:
                list.add(new zzaey());
                return;
            case 6:
                list.add(new zzahq(this.zze, 0));
                return;
            case 7:
                list.add(new zzahw(0));
                return;
            case 8:
                list.add(new zzait(this.zze, 0, null, null, zzfzo.zzn(), null));
                list.add(new zzaiy(this.zze, 0));
                return;
            case 9:
                list.add(new zzajo());
                return;
            case 10:
                list.add(new zzanm());
                return;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfzo.zzn();
                }
                list.add(new zzanw(1, 0, this.zze, new zzek(0L), new zzamj(0, this.zzd), 112800));
                return;
            case 12:
                list.add(new zzaoh());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzafe(0));
                return;
            case 15:
                zzacr zza3 = zzc.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzaej(0, this.zze));
                return;
            case 17:
                list.add(new zzajz());
                return;
            case 18:
                list.add(new zzaom());
                return;
            case 19:
                list.add(new zzaer());
                return;
            case 20:
                list.add(new zzafd());
                return;
            case 21:
                list.add(new zzaeq());
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0048 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03cb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0207 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzacw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzacr[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacl.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzacr[]");
    }
}
