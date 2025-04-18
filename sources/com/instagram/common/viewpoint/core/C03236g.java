package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
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
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03236g {
    public static byte[] A02;
    public static String[] A03 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A04;
    public static volatile C03236g A05;
    public final C1044Zr A00;
    public final Map<String, C03206d> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C7j c7j, C03206d c03206d, String str) {
        Bitmap A01;
        String str2 = c03206d.A07;
        int i2 = c03206d.A03;
        int i3 = c03206d.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, Opcodes.DNEG);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i2, i3)) {
                        try {
                            A01 = AbstractC03276k.A01(inputStream, i2, i3);
                        } catch (IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
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
                } catch (IOException e4) {
                    e = e4;
                } catch (OutOfMemoryError e5) {
                    e = e5;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0C(i2, i3)) {
            try {
                A01 = A05(str2, i2, i3);
            } catch (IOException e6) {
                e = e6;
                A0B(e);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            C03256i.A03(c7j, c03206d, str, C03256i.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C03256i.A03(c7j, c03206d, str, C03256i.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C03256i.A03(c7j, c03206d, str, C03256i.A01, th4, null, null);
        if (C0608Im.A0x(c7j)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{3, 4, 119, 41, 55, 62, 58, 25, 28, 88, 23, 13, 12, 8, 13, 12, 88, 28, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, 88, 80, 30, 17, 20, 29, 69, 122, 81, 76, 85, 89, 72, 24, 75, 81, 66, 93, 24, 93, 64, 91, 93, 93, 92, 75, 24, 85, 89, 64, 24, 75, 81, 66, 93, 24, 94, 87, 74, 24, 75, 76, 87, 74, 89, 95, 93, 2, 24, 18, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, Utf8.REPLACEMENT_BYTE, 36, 61, 61, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 88, 84, 75, 66, 27, 87, 84, 88, 90, 87, 27, 82, 86, 90, 92, 94, 27, 82, 85, 79, 84, 27, 88, 90, 88, 83, 94, 27, 19, 78, 73, 87, 6, 38, 29, 18, 17, 31, 22, 83, 7, 28, 83, 4, 1, 26, 7, 22, 83, 17, 26, 7, 30, 18, 3, 83, 7, 28, 83, 21, 26, 31, 22, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, 61, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, 14, 27, 27, 27, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, 27, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A04 = C03236g.class.getSimpleName();
    }

    public C03236g(C1044Zr c1044Zr) {
        this.A00 = c1044Zr;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C0608Im.A0G(this.A00)) {
                A0B(new Throwable(A08(35, 42, Opcodes.LSHR) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e) {
            A0B(e);
            Log.e(A04, A08(Opcodes.INVOKESTATIC, 39, 80), e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A04, A08(6, 29, 59) + file.getPath() + A08, e2);
            A0B(e2);
            return 0;
        } catch (IOException e3) {
            A0B(e3);
            Log.e(A04, A08(Opcodes.LCMP, 36, 48) + str + A08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    private final Bitmap A01(C7j c7j, C03206d c03206d, int i2, int i3, String str) {
        if (C03256i.A06(c7j) && A08(266, 4, 37).equals(str)) {
            this.A01.put(c03206d.A07, c03206d);
        }
        String str2 = c03206d.A07;
        C03246h c03246h = new C03246h(c03206d.A05, c03206d.A06, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C03256i.A04(c7j, c03246h, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A03[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A03[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, Opcodes.DNEG);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i3, i2);
                }
            }
            return A02(c7j, c03206d, str);
        }
        C03256i.A04(c7j, c03246h, true);
        try {
            if (A0C(i3, i2)) {
                return AbstractC03276k.A02(file.getCanonicalPath(), i3, i2, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] A6W;
        InterfaceC0838Rp AER = S8.A00(this.A00).AER(str, new S4());
        if (AER == null || (A6W = AER.A6W()) == null) {
            return null;
        }
        int length = A6W.length;
        if (A03[4].charAt(22) == 'U') {
            throw new RuntimeException();
        }
        A03[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return BitmapFactory.decodeByteArray(A6W, 0, length);
    }

    private Bitmap A04(String str, int i2, int i3) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i2, i3);
            String A08 = A08(232, 7, 112);
            if (A0C) {
                decodeStream = AbstractC03276k.A02(str.substring(A08.length()), i2, i3, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e) {
            Log.e(A04, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
        if (C0608Im.A0x(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i2, int i3) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC03276k.A01(inputStream, i2, i3);
        A0A(inputStream);
        return A01;
    }

    public static C03236g A06(C1044Zr c1044Zr) {
        if (A05 == null) {
            synchronized (C03236g.class) {
                if (A05 == null) {
                    A05 = new C03236g(c1044Zr);
                }
            }
        }
        return A05;
    }

    public static File A07(C7j c7j) {
        return c7j.getCacheDir();
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
        String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A07().AA0(A08, C8E.A1f, new C8F(th));
        } else {
            this.A00.A07().AA0(A08, C8E.A1f, new C8F(A08(77, 28, 18)));
        }
    }

    private boolean A0C(int i2, int i3) {
        return i2 > 0 && i3 > 0 && C0608Im.A1Q(this.A00);
    }

    public final Bitmap A0D(C03206d c03206d) {
        return A01(this.A00, c03206d, c03206d.A04, c03206d.A03, c03206d.A01);
    }

    public final Bitmap A0E(C7j c7j, String str, int i2, int i3, String str2) {
        C03206d c03206d = this.A01.get(str);
        return (!C03256i.A06(c7j) || c03206d == null) ? A01(c7j, new C03206d(str, i2, i3, A08(270, 7, 28), A08(270, 7, 28)), i3, i2, str2) : A01(c7j, c03206d, i3, i2, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
