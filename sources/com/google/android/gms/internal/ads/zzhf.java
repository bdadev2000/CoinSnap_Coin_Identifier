package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class zzhf extends zzfw {
    private final byte[] zza;
    private final DatagramPacket zzb;

    @Nullable
    private Uri zzc;

    @Nullable
    private DatagramSocket zzd;

    @Nullable
    private MulticastSocket zze;

    @Nullable
    private InetAddress zzf;
    private boolean zzg;
    private int zzh;

    public zzhf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzhe {
        if (i11 == 0) {
            return 0;
        }
        if (this.zzh == 0) {
            try {
                DatagramSocket datagramSocket = this.zzd;
                datagramSocket.getClass();
                datagramSocket.receive(this.zzb);
                int length = this.zzb.getLength();
                this.zzh = length;
                zzg(length);
            } catch (SocketTimeoutException e2) {
                throw new zzhe(e2, 2002);
            } catch (IOException e10) {
                throw new zzhe(e10, 2001);
            }
        }
        int length2 = this.zzb.getLength();
        int i12 = this.zzh;
        int min = Math.min(i12, i11);
        System.arraycopy(this.zza, length2 - i12, bArr, i10, min);
        this.zzh -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzhe {
        Uri uri = zzgiVar.zza;
        this.zzc = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.zzc.getPort();
        zzi(zzgiVar);
        try {
            this.zzf = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new DatagramSocket(inetSocketAddress);
            }
            this.zzd.setSoTimeout(8000);
            this.zzg = true;
            zzj(zzgiVar);
            return -1L;
        } catch (IOException e2) {
            throw new zzhe(e2, 2001);
        } catch (SecurityException e10) {
            throw new zzhe(e10, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        this.zzc = null;
        MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.zzf;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.zze = null;
        }
        DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzh = 0;
        if (this.zzg) {
            this.zzg = false;
            zzh();
        }
    }

    public zzhf(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.zza = bArr;
        this.zzb = new DatagramPacket(bArr, 0, 2000);
    }
}
