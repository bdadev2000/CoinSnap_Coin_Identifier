package jb;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19879b = g.E(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f19880c = new AtomicLong(0);
    public final String a;

    public e() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a = a(time % 1000);
        byte[] a10 = a(f19880c.incrementAndGet());
        byte[] a11 = a(Integer.valueOf(Process.myPid()).shortValue());
        String k10 = g.k(new byte[]{array[0], array[1], array[2], array[3], a[0], a[1], a10[0], a10[1], a11[0], a11[1]});
        Locale locale = Locale.US;
        this.a = String.format(locale, "%s%s%s%s", k10.substring(0, 12), k10.substring(12, 16), k10.subSequence(16, 20), f19879b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j3) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j3);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.a;
    }
}
