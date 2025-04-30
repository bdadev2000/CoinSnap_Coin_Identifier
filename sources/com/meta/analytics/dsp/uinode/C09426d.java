package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.vungle.ads.internal.protos.g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09426d {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C09426d A05;
    public final C1635Ym A00;
    public final Map<String, C09396a> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C09647f c09647f, C09396a c09396a, String str) {
        Bitmap A01;
        String str2 = c09396a.A07;
        int i9 = c09396a.A03;
        int i10 = c09396a.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e4 = null;
        String A08 = A08(g.STALE_CACHED_RESPONSE_VALUE, 9, 70);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 123);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i9, i10)) {
                        try {
                            A01 = AbstractC09466h.A01(inputStream, i9, i10);
                        } catch (IOException e9) {
                            e = e9;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e10) {
                            e = e10;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean A0C = A0C(i9, i10);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (A0C) {
                try {
                    A01 = A05(str2, i9, i10);
                } catch (IOException e13) {
                    e4 = e13;
                    A0B(e4);
                    A01 = A03(str2);
                }
            } else {
                A01 = A03(str2);
            }
        }
        String th4 = e4 != null ? e4.toString() : null;
        if (A01 == null) {
            C09446f.A03(c09647f, c09396a, str, C09446f.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C09446f.A03(c09647f, c09396a, str, C09446f.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C09446f.A03(c09647f, c09396a, str, C09446f.A01, th4, null, null);
        if (C1225Ih.A0t(c09647f)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, Ascii.SUB, 49, 44, 53, 57, 40, 120, 43, 49, 34, 61, 120, 61, 32, 59, 61, 61, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, 61, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, 61, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, Ascii.RS, Ascii.SYN, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.DLE, Ascii.SI, 6, 95, 19, Ascii.DLE, Ascii.FS, Ascii.RS, 19, 95, Ascii.SYN, Ascii.DC2, Ascii.RS, Ascii.CAN, Ascii.SUB, 95, Ascii.SYN, 17, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, 95, 87, 10, Ascii.CR, 19, 66, 53, Ascii.SO, 1, 2, Ascii.FF, 5, 64, Ascii.DC4, Ascii.SI, 64, Ascii.ETB, Ascii.DC2, 9, Ascii.DC4, 5, 64, 2, 9, Ascii.DC4, Ascii.CR, 1, Ascii.DLE, 64, Ascii.DC4, Ascii.SI, 64, 6, 9, Ascii.FF, 5, 64, 72, Ascii.NAK, Ascii.DC2, Ascii.FF, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, Ascii.CAN, Ascii.CR, Ascii.CR, Ascii.CR, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, Ascii.CR, Ascii.ESC, Ascii.US, 19, Ascii.NAK, Ascii.ETB, 0, 3, Ascii.CR, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C09426d.class.getSimpleName();
    }

    public C09426d(C1635Ym c1635Ym) {
        this.A00 = c1635Ym;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            if (size >= C1225Ih.A0F(this.A00)) {
                A0B(new Throwable(A08(35, 42, 1) + size));
                return 0;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            A0A(byteArrayOutputStream);
            if (A03[7].charAt(22) != 'z') {
                throw new RuntimeException();
            }
            A03[4] = "r6vsbyQxsbBUkJdqjFKv7NMRisOUwCFh";
            A0A(fileOutputStream);
            return size;
        } catch (OutOfMemoryError e4) {
            A0B(e4);
            Log.e(A04, A08(184, 39, 92), e4);
            return 0;
        } catch (FileNotFoundException e9) {
            Log.e(A04, A08(6, 29, 95) + file.getPath() + A08, e9);
            A0B(e9);
            return 0;
        } catch (IOException e10) {
            A0B(e10);
            Log.e(A04, A08(148, 36, 57) + str + A08, e10);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(null);
        }
    }

    private final Bitmap A01(C09647f c09647f, C09396a c09396a, int i9, int i10, String str) {
        if (C09446f.A06(c09647f) && A08(266, 4, 53).equals(str)) {
            Map<String, C09396a> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c09396a.A07, c09396a);
        }
        String str2 = c09396a.A07;
        C09436e c09436e = new C09436e(c09396a.A05, c09396a.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 85);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C09446f.A04(c09647f, c09436e, false);
            String url2 = A08(232, 7, 0);
            if (str2.startsWith(url2)) {
                String url3 = A08(239, 22, 123);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i10, i9);
                }
            }
            return A02(c09647f, c09396a, str);
        }
        C09446f.A04(c09647f, c09436e, true);
        try {
            if (A0C(i10, i9)) {
                return AbstractC09466h.A02(file.getCanonicalPath(), i10, i9, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e4) {
            A0B(e4);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bytes;
        RJ ADy = C1447Rc.A00(this.A00).ADy(str, new RY());
        if (ADy != null && (bytes = ADy.A68()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    private Bitmap A04(String str, int i9, int i10) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i9, i10);
            String A08 = A08(232, 7, 0);
            if (A0C) {
                decodeStream = AbstractC09466h.A02(str.substring(A08.length()), i9, i10, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e4) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e4);
        }
        if (C1225Ih.A0t(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i9, int i10) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC09466h.A01(inputStream, i9, i10);
        A0A(inputStream);
        return A01;
    }

    public static C09426d A06(C1635Ym c1635Ym) {
        if (A05 == null) {
            synchronized (C09426d.class) {
                if (A05 == null) {
                    A05 = new C09426d(c1635Ym);
                }
            }
        }
        return A05;
    }

    public static File A07(C09647f c09647f) {
        return c09647f.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(Throwable th) {
        String A08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(th));
        } else {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i9, int i10) {
        return i9 > 0 && i10 > 0 && C1225Ih.A1A(this.A00);
    }

    public final Bitmap A0D(C09396a c09396a) {
        return A01(this.A00, c09396a, c09396a.A04, c09396a.A03, c09396a.A01);
    }

    public final Bitmap A0E(C09647f c09647f, String str, int i9, int i10, String str2) {
        C09396a c09396a = this.A01.get(str);
        return (!C09446f.A06(c09647f) || c09396a == null) ? A01(c09647f, new C09396a(str, i9, i10, A08(270, 7, 97), A08(270, 7, 97)), i10, i9, str2) : A01(c09647f, c09396a, i10, i9, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
