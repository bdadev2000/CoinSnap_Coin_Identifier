package m9;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class y0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final int f21798e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f21799f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f21800g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f21801h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f21802i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f21803j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f21804k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21805l;

    /* renamed from: m, reason: collision with root package name */
    public int f21806m;

    public y0() {
        super(true);
        this.f21798e = 8000;
        byte[] bArr = new byte[2000];
        this.f21799f = bArr;
        this.f21800g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // m9.l
    public final long a(p pVar) {
        Uri uri = pVar.a;
        this.f21801h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f21801h.getPort();
        f();
        try {
            this.f21804k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f21804k, port);
            if (this.f21804k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f21803j = multicastSocket;
                multicastSocket.joinGroup(this.f21804k);
                this.f21802i = this.f21803j;
            } else {
                this.f21802i = new DatagramSocket(inetSocketAddress);
            }
            this.f21802i.setSoTimeout(this.f21798e);
            this.f21805l = true;
            g(pVar);
            return -1L;
        } catch (IOException e2) {
            throw new x0(e2, 2001);
        } catch (SecurityException e10) {
            throw new x0(e10, 2006);
        }
    }

    @Override // m9.l
    public final void close() {
        this.f21801h = null;
        MulticastSocket multicastSocket = this.f21803j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f21804k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f21803j = null;
        }
        DatagramSocket datagramSocket = this.f21802i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f21802i = null;
        }
        this.f21804k = null;
        this.f21806m = 0;
        if (this.f21805l) {
            this.f21805l = false;
            e();
        }
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.f21801h;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f21806m;
        DatagramPacket datagramPacket = this.f21800g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f21802i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f21806m = length;
                d(length);
            } catch (SocketTimeoutException e2) {
                throw new x0(e2, 2002);
            } catch (IOException e10) {
                throw new x0(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f21806m;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f21799f, length2 - i13, bArr, i10, min);
        this.f21806m -= min;
        return min;
    }
}
