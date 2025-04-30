package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfoa {
    private final zzelf zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfhg zzf;
    private final zzfhh zzg;
    private final Clock zzh;
    private final zzaxd zzi;

    public zzfoa(zzelf zzelfVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzfhg zzfhgVar, @Nullable zzfhh zzfhhVar, Clock clock, zzaxd zzaxdVar) {
        this.zza = zzelfVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfhgVar;
        this.zzg = zzfhhVar;
        this.zzh = clock;
        this.zzi = zzaxdVar;
    }

    public static final List zzf(int i9, int i10, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", o.h(i10, "2.")));
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

    public static final List zzh(List list, long j7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j7, 10)));
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

    public final List zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, List list) {
        return zzd(zzfhfVar, zzfgtVar, false, "", "", list);
    }

    public final List zzd(zzfhf zzfhfVar, @Nullable zzfgt zzfgtVar, boolean z8, @Nullable String str, @Nullable String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z9 = true;
            if (true != z8) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfhfVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfgtVar != null) {
                zzj = zzcaw.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfgtVar.zzz), "@gw_adnetid@", zzfgtVar.zzy), "@gw_allocid@", zzfgtVar.zzx), this.zze, zzfgtVar.zzX, zzfgtVar.zzax);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z10 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdx)).booleanValue() && !TextUtils.isEmpty(str)) {
                z10 = true;
            }
            boolean z11 = !TextUtils.isEmpty(str2);
            if (!z10) {
                if (!z11) {
                    arrayList.add(zzj2);
                }
            } else {
                z9 = z11;
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z10) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z9) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[LOOP:0: B:10:0x0060->B:12:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfgt r11, java.util.List r12, com.google.android.gms.internal.ads.zzbyh r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb1
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb1
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb1
            com.google.android.gms.internal.ads.zzbeg r4 = com.google.android.gms.internal.ads.zzbep.zzdy
            com.google.android.gms.internal.ads.zzben r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzfhh r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfyb r4 = com.google.android.gms.internal.ads.zzfyb.zzc()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.zzfhg r4 = r4.zza
        L34:
            com.google.android.gms.internal.ads.zzfyb r4 = com.google.android.gms.internal.ads.zzfyb.zzd(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.zzfhg r4 = r10.zzf
            goto L34
        L3c:
            com.google.android.gms.internal.ads.zzfny r5 = new com.google.android.gms.internal.ads.zzfny
            r5.<init>()
            com.google.android.gms.internal.ads.zzfyb r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfnz r7 = new com.google.android.gms.internal.ads.zzfnz
            r7.<init>()
            com.google.android.gms.internal.ads.zzfyb r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L60:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb0
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
            boolean r8 = r11.zzX
            java.util.Map r9 = r11.zzax
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcaw.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L60
        Lb0:
            return r0
        Lb1:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfoa.zze(com.google.android.gms.internal.ads.zzfgt, java.util.List, com.google.android.gms.internal.ads.zzbyh):java.util.List");
    }
}
