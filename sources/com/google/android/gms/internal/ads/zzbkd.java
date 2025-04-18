package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbkd implements zzbjr {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdsm zzb;

    @Nullable
    private final zzbse zzd;

    @Nullable
    private final zzedp zze;

    @Nullable
    private final zzcnb zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final zzges zzh = zzcaj.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbkd(com.google.android.gms.ads.internal.zzb zzbVar, zzbse zzbseVar, zzedp zzedpVar, zzdsm zzdsmVar, zzcnb zzcnbVar) {
        this.zza = zzbVar;
        this.zzd = zzbseVar;
        this.zze = zzedpVar;
        this.zzb = zzdsmVar;
        this.zzf = zzcnbVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if (com.mbridge.msdk.foundation.controller.a.a.equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    public static Uri zzc(Context context, zzavc zzavcVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzffs zzffsVar) {
        if (zzavcVar == null) {
            return uri;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlI)).booleanValue() && zzffsVar != null) {
                if (zzavcVar.zze(uri)) {
                    uri = zzffsVar.zza(uri, context, view, activity);
                }
            } else if (zzavcVar.zze(uri)) {
                uri = zzavcVar.zza(uri, context, view, activity);
            }
        } catch (zzavd unused) {
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e2);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.String r29, com.google.android.gms.ads.internal.client.zza r30, java.util.Map r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkd.zzh(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzeea.zzd(context, zzdsmVar, this.zze, str, "dialog_not_shown", zzfzr.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (com.google.android.gms.internal.ads.zzbkc.zzc(r2, r11, r12, r13, r14) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkd.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbse zzbseVar = this.zzd;
        if (zzbseVar != null) {
            zzbseVar.zza(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r4 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkd.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        zzdsm zzdsmVar;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeE)).booleanValue() && (zzdsmVar = this.zzb) != null) {
            zzdsl zza = zzdsmVar.zza();
            zza.zzb("action", "cct_action");
            switch (i10) {
                case 2:
                    str = "CONTEXT_NOT_AN_ACTIVITY";
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                case 9:
                    str = "WRONG_EXP_SETUP";
                    break;
                default:
                    str = "OPT_OUT";
                    break;
            }
            zza.zzb("cct_open_status", str);
            zza.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ua.b zzh;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcfk zzcfkVar = (zzcfk) zzaVar;
        if (zzcfkVar.zzD() != null) {
            hashMap = zzcfkVar.zzD().zzaw;
        }
        String zzc = zzbyx.zzc(str, zzcfkVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue() && this.zzf != null && zzcnb.zzj(zzc)) {
            zzh = this.zzf.zzb(zzc, com.google.android.gms.ads.internal.client.zzbc.zze());
        } else {
            zzh = zzgei.zzh(zzc);
        }
        zzgei.zzr(zzh, new zzbjz(this, map, zzaVar, str2), this.zzh);
    }
}
