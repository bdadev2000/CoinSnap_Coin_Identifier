package com.facebook.ads.redexgen.uinode;

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
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03766d {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C03766d A05;
    public final C1069Ym A00;
    public final Map<String, C03736a> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C03987f c03987f, C03736a c03736a, String str) {
        Bitmap A01;
        String str2 = c03736a.A07;
        int i10 = c03736a.A03;
        int i11 = c03736a.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e2 = null;
        String A08 = A08(g.STALE_CACHED_RESPONSE_VALUE, 9, 70);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 123);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i10, i11)) {
                        try {
                            A01 = AbstractC03806h.A01(inputStream, i10, i11);
                        } catch (IOException e10) {
                            e = e10;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e11) {
                            e = e11;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
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
                } catch (IOException e12) {
                    e = e12;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            boolean A0C = A0C(i10, i11);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (A0C) {
                try {
                    A01 = A05(str2, i10, i11);
                } catch (IOException e14) {
                    e2 = e14;
                    A0B(e2);
                    A01 = A03(str2);
                }
            } else {
                A01 = A03(str2);
            }
        }
        String th5 = e2 != null ? e2.toString() : null;
        if (A01 == null) {
            C03786f.A03(c03987f, c03736a, str, C03786f.A03, th5, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C03786f.A03(c03987f, c03736a, str, C03786f.A02, th5, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C03786f.A03(c03987f, c03736a, str, C03786f.A01, th5, null, null);
        if (C0659Ih.A0t(c03987f)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, Ascii.SUB, 49, 44, 53, 57, 40, 120, 43, 49, 34, Base64.padSymbol, 120, Base64.padSymbol, 32, 59, Base64.padSymbol, Base64.padSymbol, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, Base64.padSymbol, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, Base64.padSymbol, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, Ascii.RS, Ascii.SYN, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.DLE, Ascii.SI, 6, 95, 19, Ascii.DLE, Ascii.FS, Ascii.RS, 19, 95, Ascii.SYN, Ascii.DC2, Ascii.RS, Ascii.CAN, Ascii.SUB, 95, Ascii.SYN, 17, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, 95, 87, 10, Ascii.CR, 19, 66, 53, Ascii.SO, 1, 2, Ascii.FF, 5, 64, Ascii.DC4, Ascii.SI, 64, Ascii.ETB, Ascii.DC2, 9, Ascii.DC4, 5, 64, 2, 9, Ascii.DC4, Ascii.CR, 1, Ascii.DLE, 64, Ascii.DC4, Ascii.SI, 64, 6, 9, Ascii.FF, 5, 64, 72, Ascii.NAK, Ascii.DC2, Ascii.FF, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, Ascii.CAN, Ascii.CR, Ascii.CR, Ascii.CR, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, Ascii.CR, Ascii.ESC, Ascii.US, 19, Ascii.NAK, Ascii.ETB, 0, 3, Ascii.CR, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C03766d.class.getSimpleName();
    }

    public C03766d(C1069Ym c1069Ym) {
        this.A00 = c1069Ym;
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
            if (size >= C0659Ih.A0F(this.A00)) {
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
        } catch (OutOfMemoryError e2) {
            A0B(e2);
            Log.e(A04, A08(184, 39, 92), e2);
            return 0;
        } catch (FileNotFoundException e10) {
            Log.e(A04, A08(6, 29, 95) + file.getPath() + A08, e10);
            A0B(e10);
            return 0;
        } catch (IOException e11) {
            A0B(e11);
            Log.e(A04, A08(148, 36, 57) + str + A08, e11);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(null);
        }
    }

    private final Bitmap A01(C03987f c03987f, C03736a c03736a, int i10, int i11, String str) {
        if (C03786f.A06(c03987f) && A08(266, 4, 53).equals(str)) {
            Map<String, C03736a> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c03736a.A07, c03736a);
        }
        String str2 = c03736a.A07;
        C03776e c03776e = new C03776e(c03736a.A05, c03736a.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 85);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C03786f.A04(c03987f, c03776e, false);
            String url2 = A08(232, 7, 0);
            if (str2.startsWith(url2)) {
                String url3 = A08(239, 22, 123);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i11, i10);
                }
            }
            return A02(c03987f, c03736a, str);
        }
        C03786f.A04(c03987f, c03776e, true);
        try {
            if (A0C(i11, i10)) {
                return AbstractC03806h.A02(file.getCanonicalPath(), i11, i10, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e2) {
            A0B(e2);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bytes;
        RJ ADy = C0881Rc.A00(this.A00).ADy(str, new RY());
        if (ADy != null && (bytes = ADy.A68()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    private Bitmap A04(String str, int i10, int i11) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i10, i11);
            String A08 = A08(232, 7, 0);
            if (A0C) {
                decodeStream = AbstractC03806h.A02(str.substring(A08.length()), i10, i11, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e2) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e2);
        }
        if (C0659Ih.A0t(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC03806h.A01(inputStream, i10, i11);
        A0A(inputStream);
        return A01;
    }

    public static C03766d A06(C1069Ym c1069Ym) {
        if (A05 == null) {
            synchronized (C03766d.class) {
                if (A05 == null) {
                    A05 = new C03766d(c1069Ym);
                }
            }
        }
        return A05;
    }

    public static File A07(C03987f c03987f) {
        return c03987f.getCacheDir();
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

    private void A0B(Throwable th2) {
        String A08 = A08(261, 5, 43);
        if (th2 != null) {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(th2));
        } else {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i10, int i11) {
        return i10 > 0 && i11 > 0 && C0659Ih.A1A(this.A00);
    }

    public final Bitmap A0D(C03736a c03736a) {
        return A01(this.A00, c03736a, c03736a.A04, c03736a.A03, c03736a.A01);
    }

    public final Bitmap A0E(C03987f c03987f, String str, int i10, int i11, String str2) {
        C03736a c03736a = this.A01.get(str);
        return (!C03786f.A06(c03987f) || c03736a == null) ? A01(c03987f, new C03736a(str, i10, i11, A08(270, 7, 97), A08(270, 7, 97)), i11, i10, str2) : A01(c03987f, c03736a, i11, i10, str2);
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
