package com.applovin.impl;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class np extends a2 {
    private final int e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f25772f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f25773g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f25774h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f25775i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f25776j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f25777k;

    /* renamed from: l, reason: collision with root package name */
    private InetSocketAddress f25778l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25779m;

    /* renamed from: n, reason: collision with root package name */
    private int f25780n;

    /* loaded from: classes.dex */
    public static final class a extends j5 {
        public a(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public np() {
        this(AdError.SERVER_ERROR_CODE);
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        Uri uri = l5Var.f24983a;
        this.f25774h = uri;
        String host = uri.getHost();
        int port = this.f25774h.getPort();
        b(l5Var);
        try {
            this.f25777k = InetAddress.getByName(host);
            this.f25778l = new InetSocketAddress(this.f25777k, port);
            if (this.f25777k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f25778l);
                this.f25776j = multicastSocket;
                multicastSocket.joinGroup(this.f25777k);
                this.f25775i = this.f25776j;
            } else {
                this.f25775i = new DatagramSocket(this.f25778l);
            }
            this.f25775i.setSoTimeout(this.e);
            this.f25779m = true;
            c(l5Var);
            return -1L;
        } catch (IOException e) {
            throw new a(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new a(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f25774h;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f25774h = null;
        MulticastSocket multicastSocket = this.f25776j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f25777k);
            } catch (IOException unused) {
            }
            this.f25776j = null;
        }
        DatagramSocket datagramSocket = this.f25775i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f25775i = null;
        }
        this.f25777k = null;
        this.f25778l = null;
        this.f25780n = 0;
        if (this.f25779m) {
            this.f25779m = false;
            g();
        }
    }

    public np(int i2) {
        this(i2, 8000);
    }

    public np(int i2, int i3) {
        super(true);
        this.e = i3;
        byte[] bArr = new byte[i2];
        this.f25772f = bArr;
        this.f25773g = new DatagramPacket(bArr, 0, i2);
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.f25780n == 0) {
            try {
                this.f25775i.receive(this.f25773g);
                int length = this.f25773g.getLength();
                this.f25780n = length;
                d(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new a(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f25773g.getLength();
        int i4 = this.f25780n;
        int min = Math.min(i4, i3);
        System.arraycopy(this.f25772f, length2 - i4, bArr, i2, min);
        this.f25780n -= min;
        return min;
    }
}
