package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.io.Writer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: assets/audience_network.dex */
public class LV extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public final LU A02;

    public LV(LU lu) {
        this.A02 = lu;
    }

    private void A00() {
        this.A02.AE8(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            String[] strArr = A03;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int i14 = str2.length();
            if (length != i14) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i12 < i13) {
                if (cArr[i12] != '\n') {
                    int i15 = this.A00;
                    char[] cArr2 = this.A01;
                    int i16 = cArr2.length;
                    if (i15 != i16) {
                        cArr2[i15] = cArr[i12];
                        int i17 = i15 + 1;
                        this.A00 = i17;
                        i12++;
                    }
                }
                A00();
                i12++;
            } else {
                return;
            }
        }
    }
}
