package com.instagram.common.viewpoint.core;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: assets/audience_network.dex */
public class Eh extends AbstractC1041Zo<String> {
    public static byte[] A08;
    public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", "E"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C03527s A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
        if (A09[2].length() == 32) {
            throw new RuntimeException();
        }
        A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
        A08 = bArr;
    }

    static {
        A02();
    }

    public Eh(C03527s c03527s, String str, String str2, int i2, double d, double d2, String str3, Map map) {
        this.A03 = c03527s;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i2;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03547v
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        C1044Zr c1044Zr;
        Lock lock;
        Lock lock2;
        C1044Zr c1044Zr2;
        C1044Zr c1044Zr3;
        Lock lock3;
        C1044Zr c1044Zr4;
        C1043Zq c1043Zq;
        C1042Zp c1042Zp;
        Lock lock4;
        C1044Zr c1044Zr5;
        String eventId = A01(0, 8, 90);
        c1044Zr = this.A03.A01;
        c1044Zr.A07().A9A(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C03527s.A07;
        lock.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1043Zq = this.A03.A02;
                c1042Zp = this.A03.A03;
                String A0E = c1043Zq.A0E(c1042Zp.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e) {
                        c1044Zr5 = this.A03.A01;
                        c1044Zr5.A07().AA0(eventId, C8E.A0z, new C8F(e));
                    }
                }
                lock4 = C03527s.A07;
                lock4.unlock();
                return A0E;
            } catch (Exception e2) {
                A01(EnumC03537u.A05);
                c1044Zr3 = this.A03.A01;
                c1044Zr3.A07().AA0(eventId, C8E.A0y, new C8F(e2));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e3) {
                        c1044Zr4 = this.A03.A01;
                        c1044Zr4.A07().AA0(eventId, C8E.A0z, new C8F(e3));
                    }
                }
                lock3 = C03527s.A07;
                lock3.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                boolean isOpen = sQLiteDatabase.isOpen();
                if (A09[5].length() != 7) {
                    throw new RuntimeException();
                }
                A09[2] = "rWG930h";
                if (isOpen) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e4) {
                        c1044Zr2 = this.A03.A01;
                        c1044Zr2.A07().AA0(eventId, C8E.A0z, new C8F(e4));
                    }
                }
            }
            lock2 = C03527s.A07;
            lock2.unlock();
            throw th;
        }
    }
}
