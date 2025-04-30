package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfz extends SSLSocketFactory {
    final SSLSocketFactory zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    final /* synthetic */ zzcga zzb;

    public zzcfz(zzcga zzcgaVar) {
        this.zzb = zzcgaVar;
    }

    private final Socket zza(Socket socket) throws SocketException {
        int i9;
        int i10;
        zzcga zzcgaVar = this.zzb;
        i9 = zzcgaVar.zzr;
        if (i9 > 0) {
            i10 = zzcgaVar.zzr;
            socket.setReceiveBufferSize(i10);
        }
        this.zzb.zzs.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i9) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i9);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i9, InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i9, inetAddress, i10);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i9) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i9);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i9, InetAddress inetAddress2, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i9, inetAddress2, i10);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i9, boolean z8) throws IOException {
        Socket createSocket = this.zza.createSocket(socket, str, i9, z8);
        zza(createSocket);
        return createSocket;
    }
}
