package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class zzalv implements zzakv {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalt zzh = new zzalt(30.0f, 1, 1);

    public zzalv() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalt r14) throws com.google.android.gms.internal.ads.zzakr {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalv.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalt):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    private static Layout.Alignment zzd(String str) {
        char c2;
        String zza2 = zzfxi.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (zza2.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c2 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzaly zze(@Nullable zzaly zzalyVar) {
        return zzalyVar == null ? new zzaly() : zzalyVar;
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
    
        throw new com.google.android.gms.internal.ads.zzakr("Invalid unit for fontSize: '" + r6 + "'.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0095, code lost:
    
        if (r4.equals("fontWeight") != false) goto L53;
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
    private static com.google.android.gms.internal.ads.zzaly zzf(org.xmlpull.v1.XmlPullParser r13, com.google.android.gms.internal.ads.zzaly r14) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalv.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzaly):com.google.android.gms.internal.ads.zzaly");
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i2 = zzeu.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        zzakp.zza(zzb(bArr, i2, i3), zzakuVar, zzdnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02de, code lost:
    
        if (com.google.android.gms.internal.ads.zzev.zzc(r4, r6) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e0, code lost:
    
        r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e9, code lost:
    
        if (com.google.android.gms.internal.ads.zzev.zzc(r4, "image") == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02eb, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzev.zza(r4, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02f1, code lost:
    
        if (r1 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f3, code lost:
    
        r7.put(r1, r4.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02fe, code lost:
    
        if (com.google.android.gms.internal.ads.zzev.zzb(r4, r6) == false) goto L439;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04f2 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:17:0x0098, B:20:0x00a4, B:23:0x00b6, B:24:0x00d5, B:26:0x00e3, B:27:0x00ea, B:29:0x00f6, B:30:0x0101, B:34:0x018e, B:39:0x01e8, B:42:0x01f6, B:44:0x01fc, B:46:0x0204, B:48:0x020c, B:50:0x0214, B:52:0x021c, B:54:0x0224, B:56:0x022a, B:58:0x0232, B:60:0x023a, B:62:0x0240, B:64:0x0246, B:66:0x024e, B:68:0x0256, B:71:0x025f, B:72:0x06c5, B:74:0x0285, B:76:0x028b, B:78:0x0294, B:80:0x02a3, B:82:0x02ad, B:84:0x02c1, B:86:0x02c7, B:89:0x04f9, B:97:0x02d2, B:99:0x02da, B:101:0x02e0, B:103:0x02eb, B:105:0x02f3, B:106:0x02fa, B:111:0x0301, B:116:0x04f2, B:117:0x0310, B:119:0x0318, B:124:0x0331, B:126:0x0338, B:128:0x0346, B:131:0x0390, B:133:0x0396, B:137:0x03a5, B:139:0x03ac, B:141:0x03ba, B:143:0x0409, B:145:0x0411, B:158:0x0456, B:160:0x045e, B:176:0x04a6, B:193:0x03c5, B:194:0x03d0, B:197:0x03d8, B:200:0x03e4, B:202:0x03eb, B:204:0x03f7, B:207:0x04b2, B:208:0x04bd, B:209:0x04c8, B:211:0x034f, B:212:0x0359, B:215:0x0363, B:218:0x036e, B:220:0x0375, B:222:0x0381, B:225:0x04cf, B:226:0x04da, B:227:0x04e5, B:230:0x0515, B:234:0x0532, B:253:0x05d8, B:262:0x058e, B:266:0x0597, B:258:0x0656, B:273:0x05a9, B:276:0x05b3, B:281:0x05c1, B:283:0x05c9, B:285:0x05d1, B:309:0x05e9, B:313:0x05f5, B:316:0x05fe, B:322:0x0611, B:324:0x0622, B:327:0x0632, B:329:0x0637, B:337:0x0618, B:348:0x0196, B:350:0x01a2, B:353:0x01ad, B:355:0x01b4, B:357:0x01c0, B:359:0x01ca, B:360:0x011a, B:363:0x0128, B:366:0x0131, B:368:0x0138, B:371:0x013f, B:373:0x0146, B:378:0x015c, B:381:0x0163, B:385:0x0186, B:404:0x0674, B:410:0x0685, B:412:0x068f, B:414:0x069c, B:415:0x06a4, B:419:0x06b7, B:423:0x06bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x045e A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:17:0x0098, B:20:0x00a4, B:23:0x00b6, B:24:0x00d5, B:26:0x00e3, B:27:0x00ea, B:29:0x00f6, B:30:0x0101, B:34:0x018e, B:39:0x01e8, B:42:0x01f6, B:44:0x01fc, B:46:0x0204, B:48:0x020c, B:50:0x0214, B:52:0x021c, B:54:0x0224, B:56:0x022a, B:58:0x0232, B:60:0x023a, B:62:0x0240, B:64:0x0246, B:66:0x024e, B:68:0x0256, B:71:0x025f, B:72:0x06c5, B:74:0x0285, B:76:0x028b, B:78:0x0294, B:80:0x02a3, B:82:0x02ad, B:84:0x02c1, B:86:0x02c7, B:89:0x04f9, B:97:0x02d2, B:99:0x02da, B:101:0x02e0, B:103:0x02eb, B:105:0x02f3, B:106:0x02fa, B:111:0x0301, B:116:0x04f2, B:117:0x0310, B:119:0x0318, B:124:0x0331, B:126:0x0338, B:128:0x0346, B:131:0x0390, B:133:0x0396, B:137:0x03a5, B:139:0x03ac, B:141:0x03ba, B:143:0x0409, B:145:0x0411, B:158:0x0456, B:160:0x045e, B:176:0x04a6, B:193:0x03c5, B:194:0x03d0, B:197:0x03d8, B:200:0x03e4, B:202:0x03eb, B:204:0x03f7, B:207:0x04b2, B:208:0x04bd, B:209:0x04c8, B:211:0x034f, B:212:0x0359, B:215:0x0363, B:218:0x036e, B:220:0x0375, B:222:0x0381, B:225:0x04cf, B:226:0x04da, B:227:0x04e5, B:230:0x0515, B:234:0x0532, B:253:0x05d8, B:262:0x058e, B:266:0x0597, B:258:0x0656, B:273:0x05a9, B:276:0x05b3, B:281:0x05c1, B:283:0x05c9, B:285:0x05d1, B:309:0x05e9, B:313:0x05f5, B:316:0x05fe, B:322:0x0611, B:324:0x0622, B:327:0x0632, B:329:0x0637, B:337:0x0618, B:348:0x0196, B:350:0x01a2, B:353:0x01ad, B:355:0x01b4, B:357:0x01c0, B:359:0x01ca, B:360:0x011a, B:363:0x0128, B:366:0x0131, B:368:0x0138, B:371:0x013f, B:373:0x0146, B:378:0x015c, B:381:0x0163, B:385:0x0186, B:404:0x0674, B:410:0x0685, B:412:0x068f, B:414:0x069c, B:415:0x06a4, B:419:0x06b7, B:423:0x06bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0196 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:17:0x0098, B:20:0x00a4, B:23:0x00b6, B:24:0x00d5, B:26:0x00e3, B:27:0x00ea, B:29:0x00f6, B:30:0x0101, B:34:0x018e, B:39:0x01e8, B:42:0x01f6, B:44:0x01fc, B:46:0x0204, B:48:0x020c, B:50:0x0214, B:52:0x021c, B:54:0x0224, B:56:0x022a, B:58:0x0232, B:60:0x023a, B:62:0x0240, B:64:0x0246, B:66:0x024e, B:68:0x0256, B:71:0x025f, B:72:0x06c5, B:74:0x0285, B:76:0x028b, B:78:0x0294, B:80:0x02a3, B:82:0x02ad, B:84:0x02c1, B:86:0x02c7, B:89:0x04f9, B:97:0x02d2, B:99:0x02da, B:101:0x02e0, B:103:0x02eb, B:105:0x02f3, B:106:0x02fa, B:111:0x0301, B:116:0x04f2, B:117:0x0310, B:119:0x0318, B:124:0x0331, B:126:0x0338, B:128:0x0346, B:131:0x0390, B:133:0x0396, B:137:0x03a5, B:139:0x03ac, B:141:0x03ba, B:143:0x0409, B:145:0x0411, B:158:0x0456, B:160:0x045e, B:176:0x04a6, B:193:0x03c5, B:194:0x03d0, B:197:0x03d8, B:200:0x03e4, B:202:0x03eb, B:204:0x03f7, B:207:0x04b2, B:208:0x04bd, B:209:0x04c8, B:211:0x034f, B:212:0x0359, B:215:0x0363, B:218:0x036e, B:220:0x0375, B:222:0x0381, B:225:0x04cf, B:226:0x04da, B:227:0x04e5, B:230:0x0515, B:234:0x0532, B:253:0x05d8, B:262:0x058e, B:266:0x0597, B:258:0x0656, B:273:0x05a9, B:276:0x05b3, B:281:0x05c1, B:283:0x05c9, B:285:0x05d1, B:309:0x05e9, B:313:0x05f5, B:316:0x05fe, B:322:0x0611, B:324:0x0622, B:327:0x0632, B:329:0x0637, B:337:0x0618, B:348:0x0196, B:350:0x01a2, B:353:0x01ad, B:355:0x01b4, B:357:0x01c0, B:359:0x01ca, B:360:0x011a, B:363:0x0128, B:366:0x0131, B:368:0x0138, B:371:0x013f, B:373:0x0146, B:378:0x015c, B:381:0x0163, B:385:0x0186, B:404:0x0674, B:410:0x0685, B:412:0x068f, B:414:0x069c, B:415:0x06a4, B:419:0x06b7, B:423:0x06bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f6 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_ENTER, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:17:0x0098, B:20:0x00a4, B:23:0x00b6, B:24:0x00d5, B:26:0x00e3, B:27:0x00ea, B:29:0x00f6, B:30:0x0101, B:34:0x018e, B:39:0x01e8, B:42:0x01f6, B:44:0x01fc, B:46:0x0204, B:48:0x020c, B:50:0x0214, B:52:0x021c, B:54:0x0224, B:56:0x022a, B:58:0x0232, B:60:0x023a, B:62:0x0240, B:64:0x0246, B:66:0x024e, B:68:0x0256, B:71:0x025f, B:72:0x06c5, B:74:0x0285, B:76:0x028b, B:78:0x0294, B:80:0x02a3, B:82:0x02ad, B:84:0x02c1, B:86:0x02c7, B:89:0x04f9, B:97:0x02d2, B:99:0x02da, B:101:0x02e0, B:103:0x02eb, B:105:0x02f3, B:106:0x02fa, B:111:0x0301, B:116:0x04f2, B:117:0x0310, B:119:0x0318, B:124:0x0331, B:126:0x0338, B:128:0x0346, B:131:0x0390, B:133:0x0396, B:137:0x03a5, B:139:0x03ac, B:141:0x03ba, B:143:0x0409, B:145:0x0411, B:158:0x0456, B:160:0x045e, B:176:0x04a6, B:193:0x03c5, B:194:0x03d0, B:197:0x03d8, B:200:0x03e4, B:202:0x03eb, B:204:0x03f7, B:207:0x04b2, B:208:0x04bd, B:209:0x04c8, B:211:0x034f, B:212:0x0359, B:215:0x0363, B:218:0x036e, B:220:0x0375, B:222:0x0381, B:225:0x04cf, B:226:0x04da, B:227:0x04e5, B:230:0x0515, B:234:0x0532, B:253:0x05d8, B:262:0x058e, B:266:0x0597, B:258:0x0656, B:273:0x05a9, B:276:0x05b3, B:281:0x05c1, B:283:0x05c9, B:285:0x05d1, B:309:0x05e9, B:313:0x05f5, B:316:0x05fe, B:322:0x0611, B:324:0x0622, B:327:0x0632, B:329:0x0637, B:337:0x0618, B:348:0x0196, B:350:0x01a2, B:353:0x01ad, B:355:0x01b4, B:357:0x01c0, B:359:0x01ca, B:360:0x011a, B:363:0x0128, B:366:0x0131, B:368:0x0138, B:371:0x013f, B:373:0x0146, B:378:0x015c, B:381:0x0163, B:385:0x0186, B:404:0x0674, B:410:0x0685, B:412:0x068f, B:414:0x069c, B:415:0x06a4, B:419:0x06b7, B:423:0x06bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028b A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, LOOP:1: B:76:0x028b->B:91:0x0505, LOOP_START, PHI: r5 r6 r11 r28
      0x028b: PHI (r5v42 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v80 java.util.HashMap) binds: [B:75:0x0289, B:91:0x0505] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r6v7 java.lang.String) = (r6v3 java.lang.String), (r6v24 java.lang.String) binds: [B:75:0x0289, B:91:0x0505] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r11v9 com.google.android.gms.internal.ads.zzalt) = (r11v5 com.google.android.gms.internal.ads.zzalt), (r11v21 com.google.android.gms.internal.ads.zzalt) binds: [B:75:0x0289, B:91:0x0505] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r28v11 java.util.HashMap) = (r28v1 java.util.HashMap), (r28v12 java.util.HashMap) binds: [B:75:0x0289, B:91:0x0505] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:17:0x0098, B:20:0x00a4, B:23:0x00b6, B:24:0x00d5, B:26:0x00e3, B:27:0x00ea, B:29:0x00f6, B:30:0x0101, B:34:0x018e, B:39:0x01e8, B:42:0x01f6, B:44:0x01fc, B:46:0x0204, B:48:0x020c, B:50:0x0214, B:52:0x021c, B:54:0x0224, B:56:0x022a, B:58:0x0232, B:60:0x023a, B:62:0x0240, B:64:0x0246, B:66:0x024e, B:68:0x0256, B:71:0x025f, B:72:0x06c5, B:74:0x0285, B:76:0x028b, B:78:0x0294, B:80:0x02a3, B:82:0x02ad, B:84:0x02c1, B:86:0x02c7, B:89:0x04f9, B:97:0x02d2, B:99:0x02da, B:101:0x02e0, B:103:0x02eb, B:105:0x02f3, B:106:0x02fa, B:111:0x0301, B:116:0x04f2, B:117:0x0310, B:119:0x0318, B:124:0x0331, B:126:0x0338, B:128:0x0346, B:131:0x0390, B:133:0x0396, B:137:0x03a5, B:139:0x03ac, B:141:0x03ba, B:143:0x0409, B:145:0x0411, B:158:0x0456, B:160:0x045e, B:176:0x04a6, B:193:0x03c5, B:194:0x03d0, B:197:0x03d8, B:200:0x03e4, B:202:0x03eb, B:204:0x03f7, B:207:0x04b2, B:208:0x04bd, B:209:0x04c8, B:211:0x034f, B:212:0x0359, B:215:0x0363, B:218:0x036e, B:220:0x0375, B:222:0x0381, B:225:0x04cf, B:226:0x04da, B:227:0x04e5, B:230:0x0515, B:234:0x0532, B:253:0x05d8, B:262:0x058e, B:266:0x0597, B:258:0x0656, B:273:0x05a9, B:276:0x05b3, B:281:0x05c1, B:283:0x05c9, B:285:0x05d1, B:309:0x05e9, B:313:0x05f5, B:316:0x05fe, B:322:0x0611, B:324:0x0622, B:327:0x0632, B:329:0x0637, B:337:0x0618, B:348:0x0196, B:350:0x01a2, B:353:0x01ad, B:355:0x01b4, B:357:0x01c0, B:359:0x01ca, B:360:0x011a, B:363:0x0128, B:366:0x0131, B:368:0x0138, B:371:0x013f, B:373:0x0146, B:378:0x015c, B:381:0x0163, B:385:0x0186, B:404:0x0674, B:410:0x0685, B:412:0x068f, B:414:0x069c, B:415:0x06a4, B:419:0x06b7, B:423:0x06bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0505 A[LOOP:1: B:76:0x028b->B:91:0x0505, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzakq zzb(byte[] r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalv.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakq");
    }
}
