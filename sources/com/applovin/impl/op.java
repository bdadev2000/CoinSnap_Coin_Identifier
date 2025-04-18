package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class op extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private final int f6859e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f6860f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f6861g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f6862h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f6863i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f6864j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f6865k;

    /* renamed from: l, reason: collision with root package name */
    private InetSocketAddress f6866l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6867m;

    /* renamed from: n, reason: collision with root package name */
    private int f6868n;

    /* loaded from: classes.dex */
    public static final class a extends h5 {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public op() {
        this(2000);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        Uri uri = j5Var.a;
        this.f6862h = uri;
        String host = uri.getHost();
        int port = this.f6862h.getPort();
        b(j5Var);
        try {
            this.f6865k = InetAddress.getByName(host);
            this.f6866l = new InetSocketAddress(this.f6865k, port);
            if (this.f6865k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f6866l);
                this.f6864j = multicastSocket;
                multicastSocket.joinGroup(this.f6865k);
                this.f6863i = this.f6864j;
            } else {
                this.f6863i = new DatagramSocket(this.f6866l);
            }
            this.f6863i.setSoTimeout(this.f6859e);
            this.f6867m = true;
            c(j5Var);
            return -1L;
        } catch (IOException e2) {
            throw new a(e2, 2001);
        } catch (SecurityException e10) {
            throw new a(e10, 2006);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f6862h;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f6862h = null;
        MulticastSocket multicastSocket = this.f6864j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f6865k);
            } catch (IOException unused) {
            }
            this.f6864j = null;
        }
        DatagramSocket datagramSocket = this.f6863i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f6863i = null;
        }
        this.f6865k = null;
        this.f6866l = null;
        this.f6868n = 0;
        if (this.f6867m) {
            this.f6867m = false;
            g();
        }
    }

    public op(int i10) {
        this(i10, 8000);
    }

    public op(int i10, int i11) {
        super(true);
        this.f6859e = i11;
        byte[] bArr = new byte[i10];
        this.f6860f = bArr;
        this.f6861g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f6868n == 0) {
            try {
                this.f6863i.receive(this.f6861g);
                int length = this.f6861g.getLength();
                this.f6868n = length;
                d(length);
            } catch (SocketTimeoutException e2) {
                throw new a(e2, 2002);
            } catch (IOException e10) {
                throw new a(e10, 2001);
            }
        }
        int length2 = this.f6861g.getLength();
        int i12 = this.f6868n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f6860f, length2 - i12, bArr, i10, min);
        this.f6868n -= min;
        return min;
    }
}
