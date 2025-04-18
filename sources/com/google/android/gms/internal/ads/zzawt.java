package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzawt extends zzaxt {
    private static final zzaxu zzh = new zzaxu();
    private final zzasb zzi;
    private final Context zzj;
    private final zzatx zzk;

    public zzawt(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, Context context, zzars zzarsVar, zzasb zzasbVar, zzatx zzatxVar) {
        super(zzawfVar, "C5H7nTBN4nltmNau+/MNt6CSB0fOzxeNv8MDz6xiw5iQrv1d68C/G+ooekFvBfaF", "+RUwiCqrIcStaeiSXRFEyI1zJGWpibshqhmF48hI+GU=", zzasfVar, i10, 27);
        this.zzj = context;
        this.zzi = zzasbVar;
        this.zzk = zzatxVar;
    }

    private final zzatu zzc() throws IllegalAccessException, InvocationTargetException {
        int zza;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcM)).booleanValue()) {
            zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcR)).intValue();
        } else {
            zza = this.zzi.zza();
        }
        zzatu zzatuVar = new zzatu((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatx zzatxVar = this.zzk;
        if (zzatxVar != null && zzatxVar.zza() != null) {
            try {
                str = (String) zzatxVar.zza().get(zza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzatuVar.zza = str;
            return zzatuVar;
        }
        str = "E";
        zzatuVar.zza = str;
        return zzatuVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzata zzc = this.zza.zzc();
            if (zzc != null && zzc.zzaj()) {
                return zzc.zzh();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i10;
        boolean z10;
        String str;
        zzatu zzatuVar;
        zzatu zzatuVar2;
        AtomicReference zza = zzh.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzatu zzatuVar3 = (zzatu) zza.get();
            if (zzatuVar3 == null || zzawi.zzd(zzatuVar3.zza) || zzatuVar3.zza.equals("E") || zzatuVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzawi.zzd(null)) {
                    i10 = 5;
                } else {
                    if (!zzawi.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i10 = 3;
                }
                if (this.zzk != null) {
                    zzatuVar = zzc();
                } else {
                    if (i10 == 3 && !this.zzi.zzd()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z10);
                    Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcA);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcz)).booleanValue()) {
                        str = zzb();
                    } else {
                        str = null;
                    }
                    if (bool2.booleanValue() && this.zza.zzp() && zzawi.zzd(str)) {
                        str = zzd();
                    }
                    zzatu zzatuVar4 = new zzatu((String) this.zze.invoke(null, this.zzj, valueOf, str));
                    if (zzawi.zzd(zzatuVar4.zza) || zzatuVar4.zza.equals("E")) {
                        int i11 = i10 - 1;
                        if (i11 != 3) {
                            if (i11 == 4) {
                                throw null;
                            }
                        } else {
                            String zzd = zzd();
                            if (!zzawi.zzd(zzd)) {
                                zzatuVar4.zza = zzd;
                            }
                        }
                    }
                    zzatuVar = zzatuVar4;
                }
                zza.set(zzatuVar);
            }
            zzatuVar2 = (zzatu) zza.get();
        }
        synchronized (this.zzd) {
            if (zzatuVar2 != null) {
                this.zzd.zzx(zzatuVar2.zza);
                this.zzd.zzX(zzatuVar2.zzb);
                this.zzd.zzZ(zzatuVar2.zzc);
                this.zzd.zzi(zzatuVar2.zzd);
                this.zzd.zzw(zzatuVar2.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.zzaxv] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzawi.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcB));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawi.zzf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcC)))));
            }
            context = this.zzj;
            packageName = context.getPackageName();
            this.zza.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzgfa zze = zzgfa.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxv
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzgfa zzgfaVar = zzgfa.this;
                    if (list == null) {
                        zzgfaVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum f10 = androidx.core.app.c.f(list.get(i10));
                            type = f10.getType();
                            if (type == 8) {
                                value = f10.getValue();
                                zzgfaVar.zzc(zzawi.zzb(value));
                                return;
                            }
                        }
                        zzgfaVar.zzc(null);
                    } catch (Throwable unused2) {
                        zzgfaVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        }
        return null;
    }
}
