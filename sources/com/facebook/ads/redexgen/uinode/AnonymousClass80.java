package com.facebook.ads.redexgen.uinode;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass80 implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1069Ym A00;
    public final AnonymousClass87 A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, Ascii.FS, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, Ascii.VT, 7, 5, 70, Ascii.SO, 9, Ascii.VT, Ascii.CR, 10, 7, 7, 3, 70, 9, Ascii.FF, Ascii.ESC, 71, 86, 69, 87, 76, Ascii.DC4, Ascii.DC2, 5, 19, Ascii.RS, Ascii.ETB, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public AnonymousClass80(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1069Ym c1069Ym, InterfaceC04137z interfaceC04137z) {
        this(uncaughtExceptionHandler, c1069Ym, interfaceC04137z, AnonymousClass88.A00());
    }

    public AnonymousClass80(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1069Ym c1069Ym, InterfaceC04137z interfaceC04137z, AnonymousClass87 anonymousClass87) {
        this.A02 = uncaughtExceptionHandler;
        if (c1069Ym != null) {
            this.A00 = c1069Ym;
            this.A03 = interfaceC04137z.A7z(c1069Ym);
            this.A01 = anonymousClass87;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            String A03 = LW.A03(this.A00, th2);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C04127y(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = KG.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 == th2) {
                        String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AHF(new C8E(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (C0659Ih.A1h(this.A00)) {
                        C0659Ih.A0a(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th2);
    }
}
