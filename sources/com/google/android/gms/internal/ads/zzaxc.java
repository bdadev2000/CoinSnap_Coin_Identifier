package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzaxc extends zzayc {
    private static final zzayd zzh = new zzayd();
    private final zzask zzi;
    private final Context zzj;

    public zzaxc(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, Context context, zzasc zzascVar, zzask zzaskVar) {
        super(zzawoVar, "5gR2Yi2k1qmqwB908rtZUebo4TzAbjEGSkWYIuNbRdnGPocO4kIxU9dsn2qP+c0J", "NnIoFyYmTm9Yd/i5F1TZFAo2tPeZkpFEZBtgPBr60Ow=", zzasmVar, i2, 27);
        this.zzj = context;
        this.zzi = zzaskVar;
    }

    private final String zzc() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzath zzc = this.zza.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i2;
        zzaty zzatyVar;
        AtomicReference zza = zzh.zza(this.zzj.getPackageName());
        synchronized (zza) {
            try {
                zzaty zzatyVar2 = (zzaty) zza.get();
                if (zzatyVar2 != null) {
                    if (!zzawr.zzd(zzatyVar2.zza)) {
                        if (!zzatyVar2.zza.equals("E")) {
                            if (zzatyVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzatyVar = (zzaty) zza.get();
                        }
                    }
                }
                if (zzawr.zzd(null)) {
                    (!zzawr.zzd(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue();
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i2 == 3 && !this.zzi.zzd());
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcx);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcw)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zza.zzp() && zzawr.zzd(zzb)) {
                    zzb = zzc();
                }
                zzaty zzatyVar3 = new zzaty((String) this.zze.invoke(null, this.zzj, valueOf, zzb));
                if (zzawr.zzd(zzatyVar3.zza) || zzatyVar3.zza.equals("E")) {
                    int i3 = i2 - 1;
                    if (i3 == 3) {
                        String zzc = zzc();
                        if (!zzawr.zzd(zzc)) {
                            zzatyVar3.zza = zzc;
                        }
                    } else if (i3 == 4) {
                        throw null;
                    }
                }
                zza.set(zzatyVar3);
                zzatyVar = (zzaty) zza.get();
            } finally {
            }
        }
        synchronized (this.zzd) {
            if (zzatyVar != null) {
                try {
                    this.zzd.zzx(zzatyVar.zza);
                    this.zzd.zzX(zzatyVar.zzb);
                    this.zzd.zzZ(zzatyVar.zzc);
                    this.zzd.zzi(zzatyVar.zzd);
                    this.zzd.zzw(zzatyVar.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzaye] */
    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzawr.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcy));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawr.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcz)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzggh zze = zzggh.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaye
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzggh zzgghVar = zzggh.this;
                    if (list == null) {
                        zzgghVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ApkChecksum f2 = androidx.core.view.a.f(list.get(i2));
                            type = f2.getType();
                            if (type == 8) {
                                value = f2.getValue();
                                zzgghVar.zzc(zzawr.zzb(value));
                                return;
                            }
                        }
                        zzgghVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgghVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
