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

/* loaded from: classes2.dex */
public final class zzays extends zzazs {
    private static final zzazt zzi = new zzazt();
    private final Context zzj;

    public zzays(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, Context context, zzatg zzatgVar) {
        super(zzayeVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzatpVar, i9, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaus zzc = this.zzb.zzc();
            if (zzc != null && zzc.zzar()) {
                return zzc.zzi();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzatl zzatlVar;
        boolean z8;
        String str;
        zzavp zzavpVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            try {
                zzavp zzavpVar2 = (zzavp) zza.get();
                if (zzavpVar2 != null) {
                    if (!zzayh.zzd(zzavpVar2.zza)) {
                        if (!zzavpVar2.zza.equals("E")) {
                            if (zzavpVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzavpVar = (zzavp) zza.get();
                        }
                    }
                }
                if (!zzayh.zzd(null)) {
                    zzatlVar = zzatl.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                } else {
                    zzayh.zzd(null);
                    zzatlVar = zzatl.ENUM_SIGNAL_SOURCE_ADSHIELD;
                }
                if (zzatlVar == zzatl.ENUM_SIGNAL_SOURCE_ADSHIELD) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcu);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzct)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool.booleanValue() && this.zzb.zzp() && zzayh.zzd(str)) {
                    str = zzc();
                }
                zzavp zzavpVar3 = new zzavp((String) this.zzf.invoke(null, this.zzj, valueOf, str));
                if (zzayh.zzd(zzavpVar3.zza) || zzavpVar3.zza.equals("E")) {
                    int ordinal = zzatlVar.ordinal();
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            throw null;
                        }
                    } else {
                        String zzc = zzc();
                        if (!zzayh.zzd(zzc)) {
                            zzavpVar3.zza = zzc;
                        }
                    }
                }
                zza.set(zzavpVar3);
                zzavpVar = (zzavp) zza.get();
            } finally {
            }
        }
        synchronized (this.zze) {
            if (zzavpVar != null) {
                try {
                    this.zze.zzz(zzavpVar.zza);
                    this.zze.zzae(zzavpVar.zzb);
                    this.zze.zzag(zzavpVar.zzc);
                    this.zze.zzj(zzavpVar.zzd);
                    this.zze.zzy(zzavpVar.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzazu] */
    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzayh.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcv));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzayh.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcw)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzggm zze = zzggm.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzazu
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzggm zzggmVar = zzggm.this;
                    if (list == null) {
                        zzggmVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ApkChecksum g9 = B3.a.g(list.get(i9));
                            type = g9.getType();
                            if (type == 8) {
                                value = g9.getValue();
                                zzggmVar.zzc(zzayh.zzb(value));
                                return;
                            }
                        }
                        zzggmVar.zzc(null);
                    } catch (Throwable unused) {
                        zzggmVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
