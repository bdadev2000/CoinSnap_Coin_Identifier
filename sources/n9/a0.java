package n9;

import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes3.dex */
public abstract class a0 {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22513b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22514c;

    /* renamed from: d, reason: collision with root package name */
    public static long f22515d;

    public static long a() {
        DatagramSocket datagramSocket;
        synchronized (f22513b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = Ascii.ESC;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j3 = currentTimeMillis / 1000;
                long j10 = currentTimeMillis - (j3 * 1000);
                long j11 = j3 + 2208988800L;
                bArr[40] = (byte) (j11 >> 24);
                bArr[41] = (byte) (j11 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) (j11 >> 0);
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        datagramSocket.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j13 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            byte b3 = bArr[0];
            int i10 = bArr[1] & UByte.MAX_VALUE;
            long d10 = d(24, bArr);
            long d11 = d(32, bArr);
            long d12 = d(40, bArr);
            b((byte) ((b3 >> 6) & 3), (byte) (b3 & 7), i10, d12);
            long j14 = (j13 + (((d12 - j13) + (d11 - d10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j14;
        } catch (Throwable th5) {
            th = th5;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b3, byte b10, int i10, long j3) {
        if (b3 != 3) {
            if (b10 != 4 && b10 != 5) {
                throw new IOException(eb.j.i("SNTP: Untrusted mode: ", b10));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j3 != 0) {
                    return;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            }
            throw new IOException(eb.j.i("SNTP: Untrusted stratum: ", i10));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(int i10, byte[] bArr) {
        long c10 = c(i10, bArr);
        long c11 = c(i10 + 4, bArr);
        if (c10 == 0 && c11 == 0) {
            return 0L;
        }
        return ((c11 * 1000) / 4294967296L) + ((c10 - 2208988800L) * 1000);
    }
}
