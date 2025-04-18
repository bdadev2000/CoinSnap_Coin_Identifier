package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzewi implements zzexh {
    final String zza;
    private final zzgfz zzb;
    private final ScheduledExecutorService zzc;
    private final zzemx zzd;
    private final Context zze;
    private final zzfhc zzf;
    private final zzemt zzg;
    private final zzdru zzh;
    private final zzdwi zzi;

    public zzewi(zzgfz zzgfzVar, ScheduledExecutorService scheduledExecutorService, String str, zzemx zzemxVar, Context context, zzfhc zzfhcVar, zzemt zzemtVar, zzdru zzdruVar, zzdwi zzdwiVar) {
        this.zzb = zzgfzVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzemxVar;
        this.zze = context;
        this.zzf = zzfhcVar;
        this.zzg = zzemtVar;
        this.zzh = zzdruVar;
        this.zzi = zzdwiVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzewi zzewiVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkz)).booleanValue() ? zzewiVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzewiVar.zzf.zzf;
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbG)).booleanValue() ? zzewiVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbP)).booleanValue()) {
            zzewiVar.zzi(arrayList, zzewiVar.zzd.zza(zzewiVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzgba) zzewiVar.zzd.zzb(zzewiVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzewiVar.zzg(str, (List) entry.getValue(), zzewiVar.zzf(str), true, true));
            }
            zzewiVar.zzi(arrayList, zzewiVar.zzd.zzc());
        }
        return zzgfo.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzewj(jSONArray.toString(), zzg);
            }
        }, zzewiVar.zzb);
    }

    @Nullable
    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgff zzg(final String str, final List list, final Bundle bundle, final boolean z2, final boolean z3) {
        zzgff zzu = zzgff.zzu(zzgfo.zzk(new zzgeu() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // com.google.android.gms.internal.ads.zzgeu
            public final ListenableFuture zza() {
                return zzewi.this.zzd(str, list, bundle, z2, z3);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbC)).booleanValue()) {
            zzu = (zzgff) zzgfo.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbv)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgff) zzgfo.zze(zzu, Throwable.class, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                String concat = "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2));
                com.google.android.gms.ads.internal.zzu.zzo().zzw((Throwable) obj, concat);
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbrk zzbrkVar, Bundle bundle, @NonNull List list, zzena zzenaVar) throws RemoteException {
        zzbrkVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzenaVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzenb zzenbVar = (zzenb) ((Map.Entry) it.next()).getValue();
            String str = zzenbVar.zza;
            list.add(zzg(str, Collections.singletonList(zzenbVar.zze), zzf(str), zzenbVar.zzb, zzenbVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        zzfhc zzfhcVar = this.zzf;
        if (zzfhcVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbI)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfhcVar.zzd)))) {
                return zzgfo.zzh(new zzewj(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgfo.zzk(new zzgeu() { // from class: com.google.android.gms.internal.ads.zzewc
            @Override // com.google.android.gms.internal.ads.zzgeu
            public final ListenableFuture zza() {
                return zzewi.zzc(zzewi.this);
            }
        }, this.zzb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcas r7 = new com.google.android.gms.internal.ads.zzcas
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzbH
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzemt r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzemt r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbrk r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdru r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbrk r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzbx
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzena.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzena r6 = new com.google.android.gms.internal.ads.zzena
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzbC
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzewh r0 = new com.google.android.gms.internal.ads.zzewh
            r0.<init>()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbv
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzbJ
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgfz r9 = r8.zzb
            com.google.android.gms.internal.ads.zzewe r12 = new com.google.android.gms.internal.ads.zzewe
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewi.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    public final /* synthetic */ void zze(zzbrk zzbrkVar, Bundle bundle, List list, zzena zzenaVar, zzcas zzcasVar) {
        try {
            zzh(zzbrkVar, bundle, list, zzenaVar);
        } catch (RemoteException e) {
            zzcasVar.zzd(e);
        }
    }
}
