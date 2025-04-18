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

/* loaded from: classes3.dex */
public final class zzevg implements zzevz {
    final String zza;
    private final zzges zzb;
    private final ScheduledExecutorService zzc;
    private final zzelo zzd;
    private final Context zze;
    private final zzffo zzf;
    private final zzelk zzg;
    private final zzdqd zzh;
    private final zzdur zzi;

    public zzevg(zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, String str, zzelo zzeloVar, Context context, zzffo zzffoVar, zzelk zzelkVar, zzdqd zzdqdVar, zzdur zzdurVar) {
        this.zzb = zzgesVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeloVar;
        this.zze = context;
        this.zzf = zzffoVar;
        this.zzg = zzelkVar;
        this.zzh = zzdqdVar;
        this.zzi = zzdurVar;
    }

    public static /* synthetic */ ua.b zzc(zzevg zzevgVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkB)).booleanValue()) {
            str = zzevgVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzevgVar.zzf.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbJ)).booleanValue()) {
            bundle = zzevgVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbS)).booleanValue()) {
            for (Map.Entry entry : ((zzfzr) zzevgVar.zzd.zzb(zzevgVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzevgVar.zzg(str2, (List) entry.getValue(), zzevgVar.zzf(str2), true, true));
            }
            zzevgVar.zzi(arrayList, zzevgVar.zzd.zzc());
        } else {
            zzevgVar.zzi(arrayList, zzevgVar.zzd.zza(zzevgVar.zza, str));
        }
        return zzgei.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ua.b bVar : arrayList) {
                    if (((JSONObject) bVar.get()) != null) {
                        jSONArray.put(bVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzevh(jSONArray.toString(), bundle);
            }
        }, zzevgVar.zzb);
    }

    @Nullable
    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgdz zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgdz zzu = zzgdz.zzu(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzevd
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final ua.b zza() {
                return zzevg.this.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbF)).booleanValue()) {
            zzu = (zzgdz) zzgei.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzby)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgdz) zzgei.zze(zzu, Throwable.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th2 = (Throwable) obj;
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmI)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbrf zzbrfVar, Bundle bundle, @NonNull List list, zzelr zzelrVar) throws RemoteException {
        zzbrfVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelrVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzels zzelsVar = (zzels) ((Map.Entry) it.next()).getValue();
            String str = zzelsVar.zza;
            list.add(zzg(str, Collections.singletonList(zzelsVar.zze), zzf(str), zzelsVar.zzb, zzelsVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        zzffo zzffoVar = this.zzf;
        if (zzffoVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbL)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzffoVar.zzd)))) {
                return zzgei.zzh(new zzevh(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final ua.b zza() {
                return zzevg.zzc(zzevg.this);
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
    public final /* synthetic */ ua.b zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcao r7 = new com.google.android.gms.internal.ads.zzcao
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbce r13 = com.google.android.gms.internal.ads.zzbcn.zzbK
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzelk r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzelk r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbrf r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdqd r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbrf r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbce r10 = com.google.android.gms.internal.ads.zzbcn.zzbA
            com.google.android.gms.internal.ads.zzbcl r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzelr.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzelr r6 = new com.google.android.gms.internal.ads.zzelr
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbce r9 = com.google.android.gms.internal.ads.zzbcn.zzbF
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzevf r0 = new com.google.android.gms.internal.ads.zzevf
            r0.<init>()
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzby
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbce r9 = com.google.android.gms.internal.ads.zzbcn.zzbM
            com.google.android.gms.internal.ads.zzbcl r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzges r9 = r8.zzb
            com.google.android.gms.internal.ads.zzevc r12 = new com.google.android.gms.internal.ads.zzevc
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevg.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):ua.b");
    }

    public final /* synthetic */ void zze(zzbrf zzbrfVar, Bundle bundle, List list, zzelr zzelrVar, zzcao zzcaoVar) {
        try {
            zzh(zzbrfVar, bundle, list, zzelrVar);
        } catch (RemoteException e2) {
            zzcaoVar.zzd(e2);
        }
    }
}
