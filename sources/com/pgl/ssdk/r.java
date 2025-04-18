package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import kotlin.UByte;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r {
    private static volatile String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f16566b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f16567c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f16568d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f16569e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f16570f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f16571g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static long f16572h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f16573i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static volatile long f16574j = -1;

    public static void a(File file, boolean z10) {
        RandomAccessFile randomAccessFile;
        C1262e a10;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (TextUtils.isEmpty(a) && (a10 = a(file)) != null) {
                a = a(a10.a());
                f16568d = a10.b();
                if (z10) {
                    a();
                    try {
                        randomAccessFile.close();
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(f16569e)) {
                f16569e = a(randomAccessFile);
            }
            if (f16572h == 0) {
                f16572h = randomAccessFile.length() / 1024;
            }
            if (f16573i == 0) {
                f16573i = b(file);
            }
        } catch (FileNotFoundException unused4) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                return;
            }
            randomAccessFile = randomAccessFile2;
            randomAccessFile.close();
        } catch (IOException unused5) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 == null) {
                return;
            }
            randomAccessFile = randomAccessFile2;
            randomAccessFile.close();
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
    }

    public static String b() {
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        long j3;
        long j10;
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(f16569e) || f16571g == -1) {
            SharedPreferences a10 = L.a(C1278v.b());
            long j11 = -1;
            if (a10 != null) {
                j11 = a10.getLong("mt", -1L);
                str2 = a10.getString("sa", null);
                str3 = a10.getString("sj", null);
                str4 = a10.getString("md5", null);
                j3 = a10.getLong("as", 0L);
                j10 = a10.getLong("ds", 0L);
                i10 = a10.getInt("cpc", -1);
                str = a10.getString("ap", null);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                i10 = 0;
                j3 = 0;
                j10 = 0;
            }
            String c10 = c();
            if (c10 == null) {
                return null;
            }
            File file = new File(c10);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, C1278v.b(), c10);
            Integer num = (Integer) objArr[0];
            String str5 = (String) objArr[1];
            long lastModified = file.lastModified();
            if (lastModified == j11 && str2 != null && i10 != -1) {
                a = str2;
                f16568d = str3;
                f16572h = j3;
                f16573i = j10;
                f16569e = str4;
                f16571g = i10;
                f16570f = str;
            } else {
                f16574j = lastModified;
                if (str5 != null) {
                    f16570f = str5;
                }
                if (num != null) {
                    f16571g = num.intValue();
                }
                a(file, false);
                a();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("sign", a);
            }
            if (!TextUtils.isEmpty(f16568d)) {
                jSONObject.put("subject", f16568d);
            }
            if (!TextUtils.isEmpty(f16569e)) {
                jSONObject.put("md5", f16569e);
            }
            if (!TextUtils.isEmpty(f16570f)) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, f16570f);
            }
            long j12 = f16572h;
            if (j12 != 0) {
                jSONObject.put("apkSize", j12);
            }
            long j13 = f16573i;
            if (j13 != 0) {
                jSONObject.put("dexSize", j13);
            }
            int i11 = f16571g;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            f();
            jSONObject.put("signpm", f16566b);
            if (!TextUtils.isEmpty(f16566b) && !TextUtils.isEmpty(a)) {
                if (!f16566b.equals(a)) {
                    f16567c = true;
                }
                jSONObject.put("rebud", f16567c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c() {
        if (C1278v.b() == null) {
            return null;
        }
        String packageCodePath = C1278v.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        return packageCodePath;
    }

    public static void d() {
        if (TextUtils.isEmpty(a)) {
            SharedPreferences a10 = L.a(C1278v.b());
            String str = null;
            long j3 = -1;
            if (a10 != null) {
                j3 = a10.getLong("mt", -1L);
                str = a10.getString("sa", null);
            }
            String c10 = c();
            if (TextUtils.isEmpty(c10)) {
                return;
            }
            File file = new File(c10);
            long lastModified = file.lastModified();
            if (lastModified == j3 && str != null) {
                a = str;
            } else {
                f16574j = lastModified;
                a(file, true);
                a();
            }
        }
        f();
        if (!TextUtils.isEmpty(f16566b) && !TextUtils.isEmpty(a) && !f16566b.equals(a)) {
            f16567c = true;
        }
    }

    public static String e() {
        d();
        return a;
    }

    public static String f() {
        if (!TextUtils.isEmpty(f16566b)) {
            return f16566b;
        }
        try {
            String a10 = a(C1278v.b().getPackageManager().getPackageInfo(C1278v.b().getPackageName(), 64).signatures[0].toByteArray());
            f16566b = a10;
            return a10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        d();
        return f16567c;
    }

    public static void a() {
        SharedPreferences a10 = L.a(C1278v.b());
        if (a10 != null) {
            if (!TextUtils.isEmpty(a)) {
                a10.edit().putString("sa", a).apply();
            }
            if (!TextUtils.isEmpty(f16569e)) {
                a10.edit().putString("md5", f16569e).apply();
            }
            if (!TextUtils.isEmpty(f16568d)) {
                a10.edit().putString("sj", f16568d).apply();
            }
            if (f16572h != 0) {
                a10.edit().putLong("as", f16572h).apply();
            }
            if (f16573i != 0) {
                a10.edit().putLong("ds", f16573i).apply();
            }
            if (f16574j != -1) {
                a10.edit().putLong("mt", f16574j).apply();
            }
            if (f16571g != -1) {
                a10.edit().putInt("cpc", f16571g).apply();
            }
            if (TextUtils.isEmpty(f16570f)) {
                return;
            }
            a10.edit().putString("ap", f16570f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b3 : digest) {
                sb2.append(Integer.toHexString((b3 & UByte.MAX_VALUE) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f8, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.C1262e a(java.io.File r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.r.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    ZipEntry entry = zipFile2.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    try {
                        i11 = (int) (i11 + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j3 = i11 / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j3;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0".concat(bigInteger);
            }
            return bigInteger;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
