package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Method;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6N {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C6F A02(C7j c7j) {
        Object A002;
        Method A022;
        Object A003;
        Method A023 = C6O.A02(A00, A04(257, 29, 2), Context.class);
        if (A023 == null || (A002 = C6O.A00(null, A023, c7j)) == null || ((Integer) A002).intValue() != 0 || (A022 = C6O.A02(A04(65, 57, 83), A04(232, 20, 98), Context.class)) == null || (A003 = C6O.A00(null, A022, c7j)) == null) {
            return null;
        }
        Method A012 = C6O.A01(A003.getClass(), A04(252, 5, 124), new Class[0]);
        Method A013 = C6O.A01(A003.getClass(), A04(286, 24, 126), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String str = (String) C6O.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) C6O.A00(A003, A013, new Object[0]);
        if (str != null) {
            return new C6F(str, bool != null && bool.booleanValue(), C6E.A06);
        }
        return null;
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 90);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{102, 68, 75, 75, 74, 81, 5, 66, 64, 81, 5, 68, 65, 83, 64, 87, 81, 76, 86, 76, 75, 66, 5, 76, 75, 67, 74, 5, 74, 75, 5, 72, 68, 76, 75, 5, 81, 77, 87, 64, 68, 65, 11, 88, 84, 86, 21, 92, 84, 84, 92, 87, 94, 21, 90, 85, 95, 73, 84, 82, 95, 21, 92, 86, 72, 106, 102, 100, 39, 110, 102, 102, 110, 101, 108, 39, 104, 103, 109, 123, 102, 96, 109, 39, 110, 100, 122, 39, 104, 109, 122, 39, 96, 109, 108, 103, 125, 96, 111, 96, 108, 123, 39, 72, 109, Byte.MAX_VALUE, 108, 123, 125, 96, 122, 96, 103, 110, 64, 109, 74, 101, 96, 108, 103, 125, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 34, 40, 54, 107, 36, 33, 54, 107, 44, 33, 32, 43, 49, 44, 35, 44, 32, 55, 107, 54, 32, 55, 51, 44, 38, 32, 107, 22, 17, 4, 23, 17, 53, 57, 59, 120, 49, 57, 57, 49, 58, 51, 120, 55, 56, 50, 36, 57, Utf8.REPLACEMENT_BYTE, 50, 120, 49, 59, 37, 120, 53, 57, 59, 59, 57, 56, 120, 17, 57, 57, 49, 58, 51, 6, 58, 55, 47, 5, 51, 36, 32, Utf8.REPLACEMENT_BYTE, 53, 51, 37, 3, 34, Utf8.REPLACEMENT_BYTE, 58, 116, 118, 125, 118, 97, 122, 112, 95, 93, 76, 121, 92, 78, 93, 74, 76, 81, 75, 81, 86, 95, 113, 92, 113, 86, 94, 87, 65, 67, 82, 111, 66, 49, 43, 31, 55, 55, Utf8.REPLACEMENT_BYTE, 52, 61, 8, 52, 57, 33, 11, 61, 42, 46, 49, 59, 61, 43, 25, 46, 57, 49, 52, 57, 58, 52, 61, 77, 87, 104, 77, 73, 77, 80, 101, 64, 112, 86, 69, 71, 79, 77, 74, 67, 97, 74, 69, 70, 72, 65, 64};
    }

    static {
        A05();
        A03 = C6F.class.getSimpleName();
        A00 = A04(Opcodes.LRETURN, 52, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.C6F A00(com.instagram.common.viewpoint.core.C7j r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4a
            com.facebook.ads.redexgen.X.6F r4 = A01(r5)
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C6N.A02
            r0 = 5
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C6N.A02
            java.lang.String r1 = "hh0RZKDdPPlAkARzc3g59"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L39
        L35:
            com.facebook.ads.redexgen.X.6F r4 = A02(r5)
        L39:
            if (r4 == 0) goto L45
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
        L45:
            com.facebook.ads.redexgen.X.6F r4 = A03(r5)
        L49:
            return r4
        L4a:
            r2 = 0
            r1 = 43
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C6N.A00(com.facebook.ads.redexgen.X.7j):com.facebook.ads.redexgen.X.6F");
    }

    public static C6F A01(C7j c7j) {
        C7n adId = c7j.A04().A8D();
        if (adId != null) {
            return new C6F(adId.getId(), adId.A9W(), C6E.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C6F A03(C7j c7j) {
        C6M c6m = new C6M();
        Intent intent = new Intent(A04(122, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (c7j.bindService(intent, c6m, 1)) {
            try {
                final IBinder A022 = c6m.A02();
                ?? r02 = new IInterface(A022) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public IBinder A00;

                    public static String A00(int i2, int i3, int i4) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 103);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{100, 104, 106, 41, 96, 104, 104, 96, 107, 98, 41, 102, 105, 99, 117, 104, 110, 99, 41, 96, 106, 116, 41, 102, 99, 116, 41, 110, 99, 98, 105, 115, 110, 97, 110, 98, 117, 41, 110, 105, 115, 98, 117, 105, 102, 107, 41, 78, 70, 99, 113, 98, 117, 115, 110, 116, 110, 105, 96, 78, 99, 84, 98, 117, 113, 110, 100, 98};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            if (readString != null) {
                                return readString;
                            }
                            if (A02[2].length() == 16) {
                                throw new RuntimeException();
                            }
                            A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                            return A00(0, 0, 82);
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z2 = true;
                            obtain.writeInt(1);
                            this.A00.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            if (obtain2.readInt() == 0) {
                                z2 = false;
                            }
                            return z2;
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C6F(r02.A02(), r02.A03(), C6E.A07);
            } catch (Throwable th) {
                try {
                    c7j.A07().AA0(A04(225, 7, 73), C8E.A1Q, new C8F(th));
                } finally {
                    c7j.unbindService(c6m);
                }
            }
        }
        return null;
    }
}
