package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.ads.AdError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.g;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzgd {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;

    @Nullable
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;
    private static final int[] zzp;

    static {
        int i9 = Build.VERSION.SDK_INT;
        zza = i9;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i9;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzp = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, g.STALE_CACHED_RESPONSE_VALUE, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String zzA(byte[] bArr) {
        return new String(bArr, zzfxs.zzc);
    }

    public static String zzB(byte[] bArr, int i9, int i10) {
        return new String(bArr, i9, i10, zzfxs.zzc);
    }

    public static String zzC(int i9) {
        switch (i9) {
            case -2:
                return "none";
            case -1:
                return AppLovinMediationProvider.UNKNOWN;
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return MimeTypes.BASE_TYPE_TEXT;
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static String zzD(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String zza2 = zzfxm.zza(str);
        int i9 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzT();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !i.f15948a.equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i9 < 18) {
                if (zza2.startsWith(strArr[i9])) {
                    return String.valueOf(strArr[i9 + 1]).concat(String.valueOf(zza2.substring(strArr[i9].length())));
                }
                i9 += 2;
            } else {
                return zza2;
            }
        }
    }

    public static ExecutorService zzE(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzgc
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void zzF(long[] jArr, long j7, long j9) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i9 = 0;
        if (j9 >= 1000000 && j9 % 1000000 == 0) {
            long zza2 = zzgdu.zza(j9, 1000000L, RoundingMode.UNNECESSARY);
            while (i9 < jArr.length) {
                jArr[i9] = zzgdu.zza(jArr[i9], zza2, roundingMode);
                i9++;
            }
            return;
        }
        if (j9 < 1000000 && 1000000 % j9 == 0) {
            long zza3 = zzgdu.zza(1000000L, j9, RoundingMode.UNNECESSARY);
            while (i9 < jArr.length) {
                jArr[i9] = zzgdu.zzc(jArr[i9], zza3);
                i9++;
            }
            return;
        }
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                if (j9 >= j10 && j9 % j10 == 0) {
                    jArr[i10] = zzgdu.zza(1000000L, zzgdu.zza(j9, j10, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j9 < j10 && j10 % j9 == 0) {
                    jArr[i10] = zzgdu.zzc(1000000L, zzgdu.zza(j10, j9, RoundingMode.UNNECESSARY));
                } else {
                    jArr[i10] = zzR(j10, 1000000L, j9, roundingMode);
                }
            }
        }
    }

    public static boolean zzG(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    public static boolean zzH(SparseArray sparseArray, int i9) {
        if (sparseArray.indexOfKey(i9) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r4.zzJ(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzI(com.google.android.gms.internal.ads.zzfu r3, com.google.android.gms.internal.ads.zzfu r4, @androidx.annotation.Nullable java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzE(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzM()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzM()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzJ(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzE(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgd.zzI(com.google.android.gms.internal.ads.zzfu, com.google.android.gms.internal.ads.zzfu, java.util.zip.Inflater):boolean");
    }

    public static boolean zzJ(Context context) {
        if (zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    public static boolean zzK(int i9) {
        return i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 21 || i9 == 1342177280 || i9 == 22 || i9 == 1610612736 || i9 == 4;
    }

    public static boolean zzL(Context context) {
        int i9 = zza;
        if (i9 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i9 != 30) {
            return false;
        }
        String str = zzd;
        if (zzfxm.zzc(str, "moto g(20)") || zzfxm.zzc(str, "rmx3231")) {
            return true;
        }
        return false;
    }

    public static boolean zzM(int i9) {
        return i9 == 10 || i9 == 13;
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean zzO(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static Object[] zzP(Object[] objArr, int i9) {
        boolean z8;
        if (i9 <= objArr.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        return Arrays.copyOf(objArr, i9);
    }

    private static int zzQ(int i9, int i10) {
        return (char) (zzo[i9 ^ (i10 >> 12)] ^ ((char) (i10 << 4)));
    }

    private static long zzR(long j7, long j9, long j10, RoundingMode roundingMode) {
        long zzc2 = zzgdu.zzc(j7, j9);
        if (zzc2 != Long.MAX_VALUE && zzc2 != Long.MIN_VALUE) {
            return zzgdu.zza(zzc2, j10, roundingMode);
        }
        long zzb2 = zzgdu.zzb(Math.abs(j9), Math.abs(j10));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long zza2 = zzgdu.zza(j9, zzb2, roundingMode2);
        long zza3 = zzgdu.zza(j10, zzb2, roundingMode2);
        long zzb3 = zzgdu.zzb(Math.abs(j7), Math.abs(zza3));
        long zza4 = zzgdu.zza(j7, zzb3, roundingMode2);
        long zza5 = zzgdu.zza(zza3, zzb3, roundingMode2);
        long zzc3 = zzgdu.zzc(zza4, zza2);
        if (zzc3 != Long.MAX_VALUE && zzc3 != Long.MIN_VALUE) {
            return zzgdu.zza(zzc3, zza5, roundingMode);
        }
        double d2 = (zza2 / zza5) * zza4;
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgdp.zza(d2, roundingMode);
    }

    @Nullable
    private static String zzS(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            zzfk.zzd("Util", "Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    private static HashMap zzT() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 88);
        int i9 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i9 < 88) {
                hashMap.put(strArr[i9], strArr[i9 + 1]);
                i9 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static int zza(long[] jArr, long j7, boolean z8, boolean z9) {
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i9 = binarySearch + 1;
            if (i9 >= jArr.length || jArr[i9] != j7) {
                break;
            }
            binarySearch = i9;
        }
        if (!z8) {
            return i9;
        }
        return binarySearch;
    }

    public static int zzb(int[] iArr, int i9, boolean z8, boolean z9) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i9);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i9) {
                    break;
                }
                binarySearch = i10;
            }
            if (z8) {
                i11 = binarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z9) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static int zzc(long[] jArr, long j7, boolean z8, boolean z9) {
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j7) {
                    break;
                }
                binarySearch = i10;
            }
            i9 = binarySearch;
        }
        if (z9) {
            return Math.max(0, i9);
        }
        return i9;
    }

    public static int zzd(byte[] bArr, int i9, int i10, int i11) {
        int i12 = 65535;
        for (int i13 = 0; i13 < i10; i13++) {
            byte b = bArr[i13];
            i12 = zzQ(b & Ascii.SI, zzQ((b & 255) >> 4, i12));
        }
        return i12;
    }

    public static int zze(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            i11 = zzn[(i11 >>> 24) ^ (bArr[i9] & 255)] ^ (i11 << 8);
            i9++;
        }
        return i11;
    }

    public static int zzf(byte[] bArr, int i9, int i10, int i11) {
        int i12 = 0;
        while (i9 < i10) {
            i12 = zzp[i12 ^ (bArr[i9] & 255)];
            i9++;
        }
        return i12;
    }

    public static int zzg(int i9) {
        if (i9 == 20) {
            return 30;
        }
        if (i9 == 22) {
            return 31;
        }
        if (i9 == 30) {
            return 34;
        }
        switch (i9) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i9) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzh(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.zzgd.zza
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgd.zzh(int):int");
    }

    public static int zzi(ByteBuffer byteBuffer, int i9) {
        int i10 = byteBuffer.getInt(i9);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i10;
        }
        return Integer.reverseBytes(i10);
    }

    public static int zzj(int i9) {
        if (i9 == 2 || i9 == 4) {
            return 6005;
        }
        if (i9 == 10) {
            return 6004;
        }
        if (i9 == 7) {
            return 6005;
        }
        if (i9 == 8) {
            return 6003;
        }
        switch (i9) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i9) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzk(@Nullable String str) {
        String[] split;
        int length;
        boolean z8;
        int i9 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z8 = true;
        } else {
            z8 = false;
        }
        str2.getClass();
        try {
            i9 = Integer.parseInt(str2);
            if (z8) {
                return -i9;
            }
        } catch (NumberFormatException unused) {
        }
        return i9;
    }

    public static int zzl(int i9) {
        if (i9 == 8) {
            return 3;
        }
        if (i9 == 16) {
            return 2;
        }
        if (i9 != 24) {
            return i9 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int zzm(int i9, int i10) {
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 != 21) {
                        if (i9 != 22) {
                            if (i9 != 268435456) {
                                if (i9 != 1342177280) {
                                    if (i9 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i10 * 3;
                }
                return i10 * 4;
            }
            return i10;
        }
        return i10 + i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzn(Uri uri) {
        char c9;
        int i9;
        String scheme = uri.getScheme();
        if (scheme != null && zzfxm.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String zza2 = zzfxm.zza(lastPathSegment.substring(lastIndexOf + 1));
            switch (zza2.hashCode()) {
                case 104579:
                    if (zza2.equals("ism")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 108321:
                    if (zza2.equals("mpd")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3242057:
                    if (zza2.equals("isml")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3299913:
                    if (zza2.equals("m3u8")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 != 0) {
                if (c9 != 1) {
                    if (c9 != 2 && c9 != 3) {
                        i9 = 4;
                    } else {
                        i9 = 1;
                    }
                } else {
                    i9 = 2;
                }
            } else {
                i9 = 0;
            }
            if (i9 != 4) {
                return i9;
            }
        }
        Pattern pattern = zzj;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzo(long j7, int i9) {
        return zzt(j7, i9, 1000000L, RoundingMode.CEILING);
    }

    public static long zzp(long j7, float f9) {
        if (f9 == 1.0f) {
            return j7;
        }
        return Math.round(j7 * f9);
    }

    public static long zzq(long j7, float f9) {
        if (f9 == 1.0f) {
            return j7;
        }
        return Math.round(j7 / f9);
    }

    public static long zzr(long j7) {
        return (j7 == C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static long zzs(long j7, int i9) {
        return zzt(j7, 1000000L, i9, RoundingMode.FLOOR);
    }

    public static long zzt(long j7, long j9, long j10, RoundingMode roundingMode) {
        if (j7 == 0 || j9 == 0) {
            return 0L;
        }
        if (j10 >= j9 && j10 % j9 == 0) {
            return zzgdu.zza(j7, zzgdu.zza(j10, j9, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return zzgdu.zzc(j7, zzgdu.zza(j9, j10, RoundingMode.UNNECESSARY));
        }
        if (j10 >= j7 && j10 % j7 == 0) {
            return zzgdu.zza(j9, zzgdu.zza(j10, j7, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j10 < j7 && j7 % j10 == 0) {
            return zzgdu.zzc(j9, zzgdu.zza(j7, j10, RoundingMode.UNNECESSARY));
        }
        return zzR(j7, j9, j10, roundingMode);
    }

    public static long zzu(long j7) {
        return (j7 == C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static Point zzv(Context context) {
        Display display;
        String zzS;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            if (zza < 28) {
                zzS = zzS("sys.display-size");
            } else {
                zzS = zzS("vendor.display-size");
            }
            if (!TextUtils.isEmpty(zzS)) {
                try {
                    String[] split = zzS.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzfk.zzc("Util", "Invalid display size: ".concat(String.valueOf(zzS)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    @RequiresApi(21)
    public static AudioFormat zzw(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    public static Handler zzx(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzeq.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzy() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static zzan zzz(int i9, int i10, int i11) {
        zzal zzalVar = new zzal();
        zzalVar.zzX(MimeTypes.AUDIO_RAW);
        zzalVar.zzy(i10);
        zzalVar.zzY(i11);
        zzalVar.zzR(i9);
        return zzalVar.zzad();
    }
}
