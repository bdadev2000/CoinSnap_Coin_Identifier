package com.meta.analytics.dsp.uinode;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: assets/audience_network.dex */
public class EP extends AbstractC1632Yj<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C09707o A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public EP(C09707o c09707o, String str, String str2, int i9, double d2, double d9, String str3, Map map) {
        this.A03 = c09707o;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i9;
        this.A01 = d2;
        this.A00 = d9;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09727r
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        C1635Ym c1635Ym;
        Lock lock;
        C1635Ym c1635Ym2;
        Lock lock2;
        C1635Ym c1635Ym3;
        Lock lock3;
        C1635Ym c1635Ym4;
        C1634Yl c1634Yl;
        C1633Yk c1633Yk;
        Lock lock4;
        C1635Ym c1635Ym5;
        String eventId = A01(0, 8, 12);
        c1635Ym = this.A03.A01;
        c1635Ym.A07().A8l(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C09707o.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1634Yl = this.A03.A02;
                c1633Yk = this.A03.A03;
                String A0E = c1634Yl.A0E(c1633Yk.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e4) {
                        c1635Ym5 = this.A03.A01;
                        c1635Ym5.A07().A9a(eventId, C8A.A0z, new C8B(e4));
                    }
                }
                lock4 = C09707o.A08;
                lock4.unlock();
                return A0E;
            } catch (Exception e9) {
                A01(C7q.A06);
                c1635Ym2 = this.A03.A01;
                c1635Ym2.A07().A9a(eventId, C8A.A0y, new C8B(e9));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e10) {
                        c1635Ym3 = this.A03.A01;
                        c1635Ym3.A07().A9a(eventId, C8A.A0z, new C8B(e10));
                    }
                }
                lock2 = C09707o.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e11) {
                    c1635Ym4 = this.A03.A01;
                    c1635Ym4.A07().A9a(eventId, C8A.A0z, new C8B(e11));
                }
            }
            lock3 = C09707o.A08;
            lock3.unlock();
            throw th;
        }
    }
}
