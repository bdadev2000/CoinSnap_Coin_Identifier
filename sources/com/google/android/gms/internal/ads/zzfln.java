package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import eb.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfln {
    private final zzeiv zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzffg zzf;
    private final zzffh zzg;
    private final Clock zzh;
    private final zzavc zzi;

    public zzfln(zzeiv zzeivVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzffg zzffgVar, @Nullable zzffh zzffhVar, Clock clock, zzavc zzavcVar) {
        this.zza = zzeivVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzffgVar;
        this.zzg = zzffhVar;
        this.zzh = clock;
        this.zzi = zzavcVar;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", j.i("2.", i11)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j3, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    private static String zzj(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfff zzfffVar, zzfet zzfetVar, List list) {
        return zzd(zzfffVar, zzfetVar, false, "", "", list);
    }

    public final List zzd(zzfff zzfffVar, @Nullable zzfet zzfetVar, boolean z10, @Nullable String str, @Nullable String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            if (true != z10) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfffVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfetVar != null) {
                zzj = zzbyx.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfetVar.zzy), "@gw_adnetid@", zzfetVar.zzx), "@gw_allocid@", zzfetVar.zzw), this.zze, zzfetVar.zzW, zzfetVar.zzaw);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdD)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (!z12) {
                if (!z13) {
                    arrayList.add(zzj2);
                }
            } else {
                z11 = z13;
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[LOOP:0: B:10:0x005f->B:12:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfet r11, java.util.List r12, com.google.android.gms.internal.ads.zzbwj r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb0
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb0
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.zzbce r4 = com.google.android.gms.internal.ads.zzbcn.zzdE
            com.google.android.gms.internal.ads.zzbcl r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzffh r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfwo r4 = com.google.android.gms.internal.ads.zzfwo.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzffg r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzffg r4 = r10.zzf
        L37:
            com.google.android.gms.internal.ads.zzfwo r4 = com.google.android.gms.internal.ads.zzfwo.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfll r5 = new com.google.android.gms.internal.ads.zzfll
            r5.<init>()
            com.google.android.gms.internal.ads.zzfwo r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzflm r7 = new com.google.android.gms.internal.ads.zzflm
            r7.<init>()
            com.google.android.gms.internal.ads.zzfwo r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzj(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzj(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyx.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L5f
        Laf:
            return r0
        Lb0:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfln.zze(com.google.android.gms.internal.ads.zzfet, java.util.List, com.google.android.gms.internal.ads.zzbwj):java.util.List");
    }
}
