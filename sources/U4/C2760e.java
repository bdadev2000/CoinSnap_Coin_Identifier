package u4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: u4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2760e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f23115a = new AtomicLong(0);
    public static String b;

    public C2760e(C2778w c2778w) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b8 = array[0];
        byte b9 = array[1];
        byte b10 = array[2];
        byte b11 = array[3];
        byte[] a6 = a(time % 1000);
        byte b12 = a6[0];
        byte b13 = a6[1];
        byte[] a9 = a(f23115a.incrementAndGet());
        byte b14 = a9[0];
        byte b15 = a9[1];
        byte[] a10 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b8, b9, b10, b11, b12, b13, b14, b15, a10[0], a10[1]};
        String i9 = AbstractC2762g.i(c2778w.c().f23111a);
        String f9 = AbstractC2762g.f(bArr);
        Locale locale = Locale.US;
        b = String.format(locale, "%s%s%s%s", f9.substring(0, 12), f9.substring(12, 16), f9.subSequence(16, 20), i9.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j7);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return b;
    }
}
