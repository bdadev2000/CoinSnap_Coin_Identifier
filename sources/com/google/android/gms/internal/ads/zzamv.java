package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class zzamv implements zzalv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzamt zzh = new zzamt(30.0f, 1, 1);

    public zzamv() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzamt r14) throws com.google.android.gms.internal.ads.zzalr {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zzc(java.lang.String, com.google.android.gms.internal.ads.zzamt):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    private static Layout.Alignment zzd(String str) {
        char c9;
        String zza2 = zzfxm.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals(TtmlNode.CENTER)) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 100571:
                if (zza2.equals(TtmlNode.END)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 3317767:
                if (zza2.equals(TtmlNode.LEFT)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 108511772:
                if (zza2.equals(TtmlNode.RIGHT)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 != 0 && c9 != 1) {
            if (c9 != 2 && c9 != 3) {
                if (c9 != 4) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private static zzamy zze(@Nullable zzamy zzamyVar) {
        return zzamyVar == null ? new zzamy() : zzamyVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0221, code lost:
    
        r15 = zze(r15);
        r15.zzx(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022a, code lost:
    
        r15 = zze(r15);
        r15.zzx(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        if (r9 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
    
        if (r9 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0152, code lost:
    
        if (r9 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0154, code lost:
    
        if (r9 == 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0158, code lost:
    
        r15 = zze(r15);
        r15.zzC(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
    
        r15 = zze(r15);
        r15.zzC(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016a, code lost:
    
        r15 = zze(r15);
        r15.zzu(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0173, code lost:
    
        r15 = zze(r15);
        r15.zzu(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0201, code lost:
    
        if (r9 == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0203, code lost:
    
        if (r9 == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0205, code lost:
    
        if (r9 == 2) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0207, code lost:
    
        if (r9 == 3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0209, code lost:
    
        if (r9 == 4) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020b, code lost:
    
        if (r9 == 5) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020f, code lost:
    
        r15 = zze(r15);
        r15.zzx(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0218, code lost:
    
        r15 = zze(r15);
        r15.zzx(3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzamy zzf(org.xmlpull.v1.XmlPullParser r14, com.google.android.gms.internal.ads.zzamy r15) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzamy):com.google.android.gms.internal.ads.zzamy");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i9 = zzgd.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        zzalp.zza(zzb(bArr, i9, i10), zzaluVar, zzevVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:248:0x0608. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0593 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0498 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e6 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_LEAVE, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0747 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, zzalr -> 0x074b, TRY_LEAVE, TryCatch #18 {zzalr -> 0x074b, blocks: (B:334:0x0742, B:336:0x0747), top: B:333:0x0742 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01a9 A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020d A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, TRY_ENTER, TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ad A[Catch: IOException -> 0x00a1, XmlPullParserException -> 0x00a5, LOOP:1: B:76:0x02ad->B:90:0x05ae, LOOP_START, PHI: r1 r5 r6 r7 r14 r30 r31 r32 r33 r34 r36
      0x02ad: PHI (r1v33 com.google.android.gms.internal.ads.zzamt) = (r1v25 com.google.android.gms.internal.ads.zzamt), (r1v56 com.google.android.gms.internal.ads.zzamt) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r5v30 java.lang.String) = (r5v13 java.lang.String), (r5v53 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r6v13 java.lang.String) = (r6v10 java.lang.String), (r6v28 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r7v12 java.lang.String) = (r7v1 java.lang.String), (r7v40 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r14v12 java.util.HashMap) = (r14v1 java.util.HashMap), (r14v29 java.util.HashMap) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r30v10 java.util.HashMap) = (r30v1 java.util.HashMap), (r30v11 java.util.HashMap) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r31v2 java.lang.String) = (r31v1 java.lang.String), (r31v3 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r32v5 java.lang.String) = (r32v2 java.lang.String), (r32v17 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r33v22 java.lang.String) = (r33v8 java.lang.String), (r33v24 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r34v11 java.util.HashMap) = (r34v8 java.util.HashMap), (r34v22 java.util.HashMap) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r36v7 java.lang.String) = (r36v1 java.lang.String), (r36v11 java.lang.String) binds: [B:75:0x02ab, B:90:0x05ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #19 {IOException -> 0x00a1, XmlPullParserException -> 0x00a5, blocks: (B:3:0x0010, B:5:0x006f, B:7:0x0079, B:10:0x0084, B:13:0x0092, B:15:0x009a, B:17:0x00ac, B:20:0x00b8, B:23:0x00cb, B:24:0x00e7, B:26:0x00f5, B:27:0x00fc, B:29:0x0108, B:30:0x0113, B:34:0x01a0, B:38:0x01ff, B:41:0x020d, B:43:0x0213, B:45:0x021b, B:47:0x0223, B:49:0x022b, B:51:0x0233, B:53:0x023b, B:55:0x0241, B:57:0x0249, B:59:0x0251, B:61:0x0257, B:63:0x025d, B:65:0x0263, B:67:0x026b, B:70:0x0274, B:72:0x07f6, B:74:0x02a7, B:76:0x02ad, B:78:0x02b6, B:80:0x02c5, B:82:0x02d0, B:84:0x02e4, B:86:0x02ea, B:88:0x059d, B:97:0x0303, B:99:0x030b, B:101:0x0311, B:103:0x031a, B:105:0x0322, B:106:0x0333, B:113:0x0354, B:118:0x0593, B:120:0x0373, B:122:0x037b, B:127:0x0398, B:129:0x039f, B:131:0x03ad, B:133:0x0417, B:135:0x041d, B:139:0x042c, B:141:0x0433, B:143:0x0441, B:145:0x0490, B:147:0x0498, B:160:0x04de, B:162:0x04e6, B:178:0x052d, B:196:0x0450, B:198:0x0458, B:201:0x0462, B:204:0x046b, B:206:0x0472, B:208:0x047e, B:211:0x0539, B:212:0x0542, B:213:0x054d, B:216:0x03c1, B:217:0x03cf, B:220:0x03db, B:224:0x03f2, B:226:0x03f9, B:229:0x0400, B:231:0x0407, B:236:0x055c, B:239:0x0565, B:240:0x0578, B:243:0x05da, B:247:0x05fc, B:275:0x0666, B:277:0x066e, B:272:0x0769, B:265:0x06b6, B:281:0x0683, B:284:0x068d, B:288:0x069b, B:289:0x06a6, B:290:0x06ae, B:315:0x06c8, B:331:0x0734, B:334:0x0742, B:336:0x0747, B:344:0x0718, B:361:0x01a9, B:363:0x01b5, B:366:0x01c0, B:368:0x01c7, B:370:0x01d3, B:373:0x01df, B:374:0x012c, B:377:0x013a, B:380:0x0143, B:382:0x014a, B:385:0x0151, B:387:0x0158, B:392:0x016e, B:395:0x0175, B:399:0x0198, B:418:0x0793, B:424:0x07a8, B:426:0x07b2, B:428:0x07c1, B:429:0x07cb, B:433:0x07e6, B:436:0x07f1), top: B:2:0x0010, inners: #0, #1, #4, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05ae A[LOOP:1: B:76:0x02ad->B:90:0x05ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzalq zzb(byte[] r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzalq");
    }
}
