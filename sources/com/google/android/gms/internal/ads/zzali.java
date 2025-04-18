package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class zzali implements zzaki {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalg zzh = new zzalg(30.0f, 1, 1);

    public zzali() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalg r14) throws com.google.android.gms.internal.ads.zzake {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalg):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    private static Layout.Alignment zzd(String str) {
        char c10;
        String zza2 = zzfwa.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals(TtmlNode.CENTER)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 100571:
                if (zza2.equals(TtmlNode.END)) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3317767:
                if (zza2.equals(TtmlNode.LEFT)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 108511772:
                if (zza2.equals(TtmlNode.RIGHT)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c10 == 2 || c10 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c10 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzall zze(@Nullable zzall zzallVar) {
        return zzallVar == null ? new zzall() : zzallVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e6, code lost:
    
        switch(r8) {
            case 0: goto L174;
            case 1: goto L173;
            case 2: goto L172;
            default: goto L207;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0303, code lost:
    
        r14.zzr(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030e, code lost:
    
        r5 = r5.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0312, code lost:
    
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0315, code lost:
    
        r14.zzq(java.lang.Float.parseFloat(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0307, code lost:
    
        r14.zzr(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030b, code lost:
    
        r14.zzr(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0302, code lost:
    
        throw new com.google.android.gms.internal.ads.zzake("Invalid unit for fontSize: '" + r6 + "'.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0095, code lost:
    
        if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_FONT_WEIGHT) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
    
        switch(r4) {
            case 0: goto L91;
            case 1: goto L90;
            case 2: goto L89;
            case 3: goto L88;
            default: goto L234;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        r14 = zze(r14);
        r14.zzu(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        r14 = zze(r14);
        r14.zzu(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        r14 = zze(r14);
        r14.zzC(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0175, code lost:
    
        r14 = zze(r14);
        r14.zzC(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        switch(r4) {
            case 0: goto L131;
            case 1: goto L130;
            case 2: goto L129;
            case 3: goto L128;
            case 4: goto L131;
            case 5: goto L128;
            default: goto L236;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r14 = zze(r14);
        r14.zzx(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0208, code lost:
    
        r14 = zze(r14);
        r14.zzx(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0211, code lost:
    
        r14 = zze(r14);
        r14.zzx(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021a, code lost:
    
        r14 = zze(r14);
        r14.zzx(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzall zzf(org.xmlpull.v1.XmlPullParser r13, com.google.android.gms.internal.ads.zzall r14) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzall):com.google.android.gms.internal.ads.zzall");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = zzen.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        zzakc.zza(zzb(bArr, i10, i11), zzakhVar, zzdgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02bf, code lost:
    
        r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c8, code lost:
    
        if (com.google.android.gms.internal.ads.zzeo.zzc(r4, "image") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ca, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzeo.zza(r4, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ce, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d0, code lost:
    
        r7.put(r1, r4.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02db, code lost:
    
        if (com.google.android.gms.internal.ads.zzeo.zzb(r4, r2) == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02bd, code lost:
    
        if (com.google.android.gms.internal.ads.zzeo.zzc(r4, r2) != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d8 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037a A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f5 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0443 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_LEAVE, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0181 A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dc A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, TRY_ENTER, TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f A[Catch: IOException -> 0x06b9, XmlPullParserException -> 0x06c3, LOOP:1: B:75:0x026f->B:89:0x04e9, LOOP_START, PHI: r2 r5 r11
      0x026f: PHI (r2v40 java.lang.String) = (r2v16 java.lang.String), (r2v78 java.lang.String) binds: [B:74:0x026d, B:89:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r5v7 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v23 java.util.HashMap) binds: [B:74:0x026d, B:89:0x04e9] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r11v11 com.google.android.gms.internal.ads.zzalg) = (r11v5 com.google.android.gms.internal.ads.zzalg), (r11v28 com.google.android.gms.internal.ads.zzalg) binds: [B:74:0x026d, B:89:0x04e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06b9, XmlPullParserException -> 0x06c3, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:20:0x0098, B:23:0x00aa, B:24:0x00c9, B:26:0x00d7, B:27:0x00de, B:29:0x00ea, B:30:0x00f5, B:34:0x0177, B:38:0x01ce, B:41:0x01dc, B:43:0x01e2, B:45:0x01ea, B:47:0x01f2, B:49:0x01fa, B:51:0x0202, B:53:0x020a, B:55:0x0210, B:57:0x0218, B:59:0x0220, B:61:0x0226, B:63:0x022c, B:65:0x0234, B:67:0x023c, B:70:0x0245, B:71:0x06a1, B:73:0x0269, B:75:0x026f, B:77:0x0278, B:79:0x0287, B:81:0x0291, B:83:0x02a5, B:85:0x02ab, B:87:0x04dd, B:95:0x02af, B:98:0x02b9, B:100:0x02bf, B:102:0x02ca, B:104:0x02d0, B:105:0x02d7, B:109:0x02e3, B:114:0x04d8, B:115:0x02f0, B:117:0x02f8, B:122:0x0311, B:124:0x0318, B:126:0x0326, B:128:0x0372, B:130:0x037a, B:134:0x0389, B:136:0x0390, B:138:0x039e, B:140:0x03ed, B:142:0x03f5, B:155:0x043b, B:157:0x0443, B:173:0x048c, B:190:0x03a9, B:191:0x03b4, B:194:0x03bc, B:197:0x03c8, B:199:0x03cf, B:201:0x03db, B:204:0x0498, B:205:0x04a3, B:206:0x04ae, B:208:0x032f, B:209:0x0339, B:212:0x0343, B:215:0x034e, B:217:0x0355, B:219:0x0361, B:222:0x04b5, B:223:0x04c0, B:224:0x04cb, B:227:0x04f5, B:231:0x0512, B:250:0x05b2, B:260:0x056e, B:264:0x0577, B:256:0x0630, B:271:0x057f, B:274:0x0589, B:279:0x059e, B:281:0x05a3, B:283:0x05ab, B:307:0x05c7, B:311:0x05d1, B:314:0x05da, B:320:0x05ee, B:322:0x0603, B:325:0x0611, B:327:0x0616, B:335:0x05f5, B:347:0x0181, B:349:0x018d, B:352:0x0198, B:354:0x019f, B:356:0x01ab, B:358:0x01b5, B:359:0x010c, B:361:0x0118, B:364:0x0123, B:366:0x012a, B:368:0x0136, B:373:0x014c, B:376:0x0153, B:379:0x016d, B:396:0x0650, B:402:0x065f, B:404:0x0669, B:406:0x0676, B:407:0x067e, B:411:0x0692, B:415:0x069a), top: B:2:0x0006, inners: #5, #6, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e9 A[LOOP:1: B:75:0x026f->B:89:0x04e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzakd zzb(byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakd");
    }
}
