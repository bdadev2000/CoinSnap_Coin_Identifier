package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
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

/* loaded from: classes2.dex */
public final class zzewx implements zzexw {
    final String zza;
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzeny zzd;
    private final Context zze;
    private final zzfho zzf;
    private final zzenu zzg;
    private final zzdst zzh;
    private final zzdxh zzi;

    public zzewx(zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, String str, zzeny zzenyVar, Context context, zzfho zzfhoVar, zzenu zzenuVar, zzdst zzdstVar, zzdxh zzdxhVar) {
        this.zzb = zzggeVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzenyVar;
        this.zze = context;
        this.zzf = zzfhoVar;
        this.zzg = zzenuVar;
        this.zzh = zzdstVar;
        this.zzi = zzdxhVar;
    }

    public static /* synthetic */ f4.c zzc(zzewx zzewxVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkR)).booleanValue()) {
            str = zzewxVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzewxVar.zzf.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbE)).booleanValue()) {
            bundle = zzewxVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbN)).booleanValue()) {
            for (Map.Entry entry : ((zzgbf) zzewxVar.zzd.zzb(zzewxVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzewxVar.zzg(str2, (List) entry.getValue(), zzewxVar.zzf(str2), true, true));
            }
            zzewxVar.zzi(arrayList, zzewxVar.zzd.zzc());
        } else {
            zzewxVar.zzi(arrayList, zzewxVar.zzd.zza(zzewxVar.zza, str));
        }
        return zzgft.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzews
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (f4.c cVar : arrayList) {
                    if (((JSONObject) cVar.get()) != null) {
                        jSONArray.put(cVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzewy(jSONArray.toString(), bundle);
            }
        }, zzewxVar.zzb);
    }

    @Nullable
    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgfk zzg(final String str, final List list, final Bundle bundle, final boolean z8, final boolean z9) {
        zzgfk zzu = zzgfk.zzu(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzewu
            @Override // com.google.android.gms.internal.ads.zzgez
            public final f4.c zza() {
                return zzewx.this.zzd(str, list, bundle, z8, z9);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbA)).booleanValue()) {
            zzu = (zzgfk) zzgft.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbt)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgfk) zzgft.zze(zzu, Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbte zzbteVar, Bundle bundle, @NonNull List list, zzeob zzeobVar) throws RemoteException {
        zzbteVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeobVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeoc zzeocVar = (zzeoc) ((Map.Entry) it.next()).getValue();
            String str = zzeocVar.zza;
            list.add(zzg(str, Collections.singletonList(zzeocVar.zze), zzf(str), zzeocVar.zzb, zzeocVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzfho zzfhoVar = this.zzf;
        if (zzfhoVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbG)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(zzfhoVar.zzd)))) {
                return zzgft.zzh(new zzewy(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzewr
            @Override // com.google.android.gms.internal.ads.zzgez
            public final f4.c zza() {
                return zzewx.zzc(zzewx.this);
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
    public final /* synthetic */ f4.c zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzccn r7 = new com.google.android.gms.internal.ads.zzccn
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbeg r13 = com.google.android.gms.internal.ads.zzbep.zzbF
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzenu r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzenu r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbte r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdst r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbte r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbeg r10 = com.google.android.gms.internal.ads.zzbep.zzbv
            com.google.android.gms.internal.ads.zzben r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzeob.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzeob r6 = new com.google.android.gms.internal.ads.zzeob
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbeg r9 = com.google.android.gms.internal.ads.zzbep.zzbA
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzeww r0 = new com.google.android.gms.internal.ads.zzeww
            r0.<init>()
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzbt
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbeg r9 = com.google.android.gms.internal.ads.zzbep.zzbH
            com.google.android.gms.internal.ads.zzben r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgge r9 = r8.zzb
            com.google.android.gms.internal.ads.zzewt r12 = new com.google.android.gms.internal.ads.zzewt
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewx.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):f4.c");
    }

    public final /* synthetic */ void zze(zzbte zzbteVar, Bundle bundle, List list, zzeob zzeobVar, zzccn zzccnVar) {
        try {
            zzh(zzbteVar, bundle, list, zzeobVar);
        } catch (RemoteException e4) {
            zzccnVar.zzd(e4);
        }
    }
}
