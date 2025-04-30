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
public final class op extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private final int f9947e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f9948f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f9949g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f9950h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f9951i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f9952j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f9953k;
    private InetSocketAddress l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private int f9954n;

    /* loaded from: classes.dex */
    public static final class a extends h5 {
        public a(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public op() {
        this(2000);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        Uri uri = j5Var.f8395a;
        this.f9950h = uri;
        String host = uri.getHost();
        int port = this.f9950h.getPort();
        b(j5Var);
        try {
            this.f9953k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.f9953k, port);
            if (this.f9953k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.f9952j = multicastSocket;
                multicastSocket.joinGroup(this.f9953k);
                this.f9951i = this.f9952j;
            } else {
                this.f9951i = new DatagramSocket(this.l);
            }
            this.f9951i.setSoTimeout(this.f9947e);
            this.m = true;
            c(j5Var);
            return -1L;
        } catch (IOException e4) {
            throw new a(e4, 2001);
        } catch (SecurityException e9) {
            throw new a(e9, 2006);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f9950h;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f9950h = null;
        MulticastSocket multicastSocket = this.f9952j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f9953k);
            } catch (IOException unused) {
            }
            this.f9952j = null;
        }
        DatagramSocket datagramSocket = this.f9951i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9951i = null;
        }
        this.f9953k = null;
        this.l = null;
        this.f9954n = 0;
        if (this.m) {
            this.m = false;
            g();
        }
    }

    public op(int i9) {
        this(i9, 8000);
    }

    public op(int i9, int i10) {
        super(true);
        this.f9947e = i10;
        byte[] bArr = new byte[i9];
        this.f9948f = bArr;
        this.f9949g = new DatagramPacket(bArr, 0, i9);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f9954n == 0) {
            try {
                this.f9951i.receive(this.f9949g);
                int length = this.f9949g.getLength();
                this.f9954n = length;
                d(length);
            } catch (SocketTimeoutException e4) {
                throw new a(e4, 2002);
            } catch (IOException e9) {
                throw new a(e9, 2001);
            }
        }
        int length2 = this.f9949g.getLength();
        int i11 = this.f9954n;
        int min = Math.min(i11, i10);
        System.arraycopy(this.f9948f, length2 - i11, bArr, i9, min);
        this.f9954n -= min;
        return min;
    }
}
