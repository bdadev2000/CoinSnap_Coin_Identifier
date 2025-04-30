package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2063q {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f19590a = null;
    private static String b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f19591c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f19592d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f19593e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static long f19594f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static long f19595g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static volatile long f19596h = -1;

    public static void a(File file, boolean z8) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (TextUtils.isEmpty(f19590a)) {
                a(a(file));
                if (z8) {
                    a();
                    try {
                        randomAccessFile.close();
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(f19591c)) {
                f19591c = a(randomAccessFile);
            }
            if (f19594f == 0) {
                f19594f = randomAccessFile.length() / 1024;
            }
            if (f19595g == 0) {
                f19595g = b(file);
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
        } catch (Throwable th2) {
            th = th2;
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
        int i9;
        long j7;
        long j9;
        if (TextUtils.isEmpty(f19590a) || TextUtils.isEmpty(f19591c) || f19593e == -1) {
            SharedPreferences a6 = K.a(v.b());
            long j10 = -1;
            if (a6 != null) {
                j10 = a6.getLong("mt", -1L);
                str2 = a6.getString("sa", null);
                str3 = a6.getString("sj", null);
                str4 = a6.getString("md5", null);
                j7 = a6.getLong("as", 0L);
                j9 = a6.getLong("ds", 0L);
                i9 = a6.getInt("cpc", -1);
                str = a6.getString("ap", null);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                i9 = 0;
                j7 = 0;
                j9 = 0;
            }
            String c9 = c();
            if (c9 == null) {
                return null;
            }
            File file = new File(c9);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, v.b(), c9);
            Integer num = (Integer) objArr[0];
            String str5 = (String) objArr[1];
            long lastModified = file.lastModified();
            if (lastModified == j10 && str2 != null && i9 != -1) {
                f19590a = str2;
                b = str3;
                f19594f = j7;
                f19595g = j9;
                f19591c = str4;
                f19593e = i9;
                f19592d = str;
            } else {
                f19596h = lastModified;
                if (str5 != null) {
                    f19592d = str5;
                }
                if (num != null) {
                    f19593e = num.intValue();
                }
                a(file, false);
                a();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f19590a)) {
                jSONObject.put("sign", f19590a);
            }
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("subject", b);
            }
            if (!TextUtils.isEmpty(f19591c)) {
                jSONObject.put("md5", f19591c);
            }
            if (!TextUtils.isEmpty(f19592d)) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, f19592d);
            }
            long j11 = f19594f;
            if (j11 != 0) {
                jSONObject.put("apkSize", j11);
            }
            long j12 = f19595g;
            if (j12 != 0) {
                jSONObject.put("dexSize", j12);
            }
            int i10 = f19593e;
            if (i10 != -1) {
                jSONObject.put("code", i10);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c() {
        if (v.b() == null) {
            return null;
        }
        String packageCodePath = v.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        return packageCodePath;
    }

    public static String d() {
        String str;
        if (!TextUtils.isEmpty(f19590a)) {
            return f19590a;
        }
        SharedPreferences a6 = K.a(v.b());
        long j7 = -1;
        if (a6 != null) {
            j7 = a6.getLong("mt", -1L);
            str = a6.getString("sa", null);
        } else {
            str = null;
        }
        String c9 = c();
        if (TextUtils.isEmpty(c9)) {
            return null;
        }
        File file = new File(c9);
        long lastModified = file.lastModified();
        if (lastModified == j7 && str != null) {
            f19590a = str;
            return str;
        }
        f19596h = lastModified;
        a(file, true);
        a();
        return f19590a;
    }

    public static void a() {
        SharedPreferences a6 = K.a(v.b());
        if (a6 != null) {
            if (!TextUtils.isEmpty(f19590a)) {
                a6.edit().putString("sa", f19590a).apply();
            }
            if (!TextUtils.isEmpty(f19591c)) {
                a6.edit().putString("md5", f19591c).apply();
            }
            if (!TextUtils.isEmpty(b)) {
                a6.edit().putString("sj", b).apply();
            }
            if (f19594f != 0) {
                a6.edit().putLong("as", f19594f).apply();
            }
            if (f19595g != 0) {
                a6.edit().putLong("ds", f19595g).apply();
            }
            if (f19596h != -1) {
                a6.edit().putLong("mt", f19596h).apply();
            }
            if (f19593e != -1) {
                a6.edit().putInt("cpc", f19593e).apply();
            }
            if (TextUtils.isEmpty(f19592d)) {
                return;
            }
            a6.edit().putString("ap", f19592d).apply();
        }
    }

    @DungeonFlag
    private static void a(Certificate certificate) {
        if (certificate != null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(certificate.getEncoded());
                StringBuilder sb = new StringBuilder();
                for (byte b8 : digest) {
                    sb.append(Integer.toHexString((b8 & 255) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                f19590a = sb.substring(0, sb.length() - 1);
            } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            }
            if (certificate instanceof X509Certificate) {
                b = String.valueOf(((X509Certificate) certificate).getSubjectDN());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ad, code lost:
    
        if (r2 == null) goto L55;
     */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.Certificate a(java.io.File r10) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "r"
            r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> L24
            long r7 = r1.length()     // Catch: java.lang.Throwable -> L24
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch: java.lang.Throwable -> L24
            r4.getClass()
            com.pgl.ssdk.j r1 = new com.pgl.ssdk.j
            r5 = 0
            r3 = r1
            r3.<init>(r4, r5, r7)
            com.pgl.ssdk.c$a r2 = com.pgl.ssdk.AbstractC2049c.a(r1)
            java.util.List r1 = com.pgl.ssdk.C2055i.a(r1, r2)
            goto L25
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L2f
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2f
            goto Lb2
        L2f:
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L36
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 != 0) goto L3c
            r1 = r0
            goto Lb2
        L3c:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L98 java.io.IOException -> La5
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L98 java.io.IOException -> La5
            java.util.zip.ZipInputStream r10 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L95
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L93 java.io.IOException -> L95
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L91
        L4b:
            java.util.zip.ZipEntry r4 = r10.getNextEntry()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            if (r4 == 0) goto L83
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            java.lang.String r5 = "META-INF/"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            if (r5 == 0) goto L4b
            java.lang.String r5 = ".RSA"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            if (r5 != 0) goto L7b
            java.lang.String r5 = ".DSA"
            boolean r5 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            if (r5 != 0) goto L7b
            java.lang.String r5 = ".EC"
            boolean r4 = r4.endsWith(r5)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            if (r4 != 0) goto L7b
            r10.closeEntry()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            goto L4b
        L79:
            r0 = move-exception
            goto L8d
        L7b:
            java.util.Collection r4 = r1.generateCertificates(r10)     // Catch: java.security.cert.CertificateException -> L4b java.lang.Throwable -> L79 java.io.IOException -> L8b
            r3.addAll(r4)     // Catch: java.security.cert.CertificateException -> L4b java.lang.Throwable -> L79 java.io.IOException -> L8b
            goto L4b
        L83:
            r10.close()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L8b
            r10.close()     // Catch: java.io.IOException -> L89
        L89:
            r1 = r3
            goto Laf
        L8b:
            r1 = r3
            goto La8
        L8d:
            r9 = r0
            r0 = r10
            r10 = r9
            goto L9a
        L91:
            r1 = r0
            goto La8
        L93:
            r10 = move-exception
            goto L9a
        L95:
            r10 = r0
            r1 = r10
            goto La8
        L98:
            r10 = move-exception
            r2 = r0
        L9a:
            if (r0 == 0) goto L9f
            r0.close()     // Catch: java.io.IOException -> L9f
        L9f:
            if (r2 == 0) goto La4
            r2.close()     // Catch: java.io.IOException -> La4
        La4:
            throw r10
        La5:
            r10 = r0
            r1 = r10
            r2 = r1
        La8:
            if (r10 == 0) goto Lad
            r10.close()     // Catch: java.io.IOException -> Lad
        Lad:
            if (r2 == 0) goto Lb2
        Laf:
            r2.close()     // Catch: java.io.IOException -> Lb2
        Lb2:
            if (r1 == 0) goto Lc2
            boolean r10 = r1.isEmpty()
            if (r10 != 0) goto Lc2
            r10 = 0
            java.lang.Object r10 = r1.get(r10)
            java.security.cert.Certificate r10 = (java.security.cert.Certificate) r10
            return r10
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.C2063q.a(java.io.File):java.security.cert.Certificate");
    }

    public static long b(File file) {
        ZipFile zipFile;
        String format;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (ZipException unused) {
            } catch (IOException unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                new ZipInputStream(new FileInputStream(file));
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i9 == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i9));
                    }
                    ZipEntry entry = zipFile.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    i10 = (int) (i10 + entry.getSize());
                    i9++;
                }
                long j7 = i10 / 1000;
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return j7;
            } catch (ZipException unused4) {
                zipFile2 = zipFile;
                if (zipFile2 == null) {
                    return 0L;
                }
                zipFile2.close();
                return 0L;
            } catch (IOException unused5) {
                zipFile2 = zipFile;
                if (zipFile2 == null) {
                    return 0L;
                }
                zipFile2.close();
                return 0L;
            } catch (Throwable th2) {
                th = th2;
                zipFile2 = zipFile;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[1048576];
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
