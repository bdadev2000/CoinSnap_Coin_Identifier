package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzbmb implements zzblp {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdvc zzb;

    @Nullable
    private final zzbud zzd;

    @Nullable
    private final zzefz zze;

    @Nullable
    private final zzcqd zzf;
    private com.google.android.gms.ads.internal.overlay.zzy zzg = null;
    private final zzgge zzh = zzcci.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbmb(com.google.android.gms.ads.internal.zzb zzbVar, zzbud zzbudVar, zzefz zzefzVar, zzdvc zzdvcVar, zzcqd zzcqdVar) {
        this.zza = zzbVar;
        this.zzd = zzbudVar;
        this.zze = zzefzVar;
        this.zzb = zzdvcVar;
        this.zzf = zzcqdVar;
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
            if (com.mbridge.msdk.foundation.controller.a.f15376a.equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    public static Uri zzc(Context context, zzaxd zzaxdVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfhs zzfhsVar) {
        if (zzaxdVar == null) {
            return uri;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() && zzfhsVar != null) {
                if (zzaxdVar.zze(uri)) {
                    uri = zzfhsVar.zza(uri, context, view, activity);
                }
            } else if (zzaxdVar.zze(uri)) {
                uri = zzaxdVar.zza(uri, context, view, activity);
            }
        } catch (zzaxe unused) {
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e4);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        HashMap hashMap;
        Object obj2;
        boolean z13;
        String str4;
        boolean z14;
        zzchd zzchdVar = (zzchd) zzaVar;
        zzfgt zzD = zzchdVar.zzD();
        zzfgw zzR = zzchdVar.zzR();
        boolean z15 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z8 = false;
        } else {
            String str5 = zzR.zzb;
            z8 = zzD.zzaj;
            str3 = str5;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkK)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmH)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzchdVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcin) zzaVar).zzaL(zzf(map), zzb(map), z9);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlR)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (str != null) {
                ((zzcin) zzaVar).zzaN(zzf(map), zzb(map), str, z9, z14);
                return;
            } else {
                ((zzcin) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z9);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzchdVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeB)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeF)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    z15 = true;
                }
            }
            boolean zzg = zzbfm.zzg(zzchdVar.getContext());
            if (z15) {
                if (!zzg) {
                    zzm(4);
                } else {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), Uri.parse(str), zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS()));
                    if (!z8 || this.zze == null || !zzl(zzaVar, zzchdVar.getContext(), zzd.toString(), str3)) {
                        this.zzg = new zzbly(this);
                        ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z9, z10);
                        return;
                    }
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z8, str3, z9, z10);
            return;
        }
        if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z8, str3, z9, z10);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzio)).booleanValue()) {
                zzk(true);
                String str6 = (String) map.get(TtmlNode.TAG_P);
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing from open app action.");
                    return;
                }
                if (!z8 || this.zze == null || !zzl(zzaVar, zzchdVar.getContext(), str6, str3)) {
                    PackageManager packageManager = zzchdVar.getContext().getPackageManager();
                    if (packageManager == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot get package manager from open app action.");
                        return;
                    }
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z9, z10);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str7 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str7)) {
            try {
                intent = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(str7)), e4);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), data, zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzip)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziG)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id")) {
            z11 = true;
        } else {
            z11 = false;
        }
        HashMap hashMap2 = new HashMap();
        if (z11) {
            obj = TtmlNode.TAG_P;
            obj2 = "event_id";
            z12 = z10;
            hashMap = hashMap2;
            this.zzg = new zzblz(this, z9, zzaVar, hashMap2, map);
            z13 = false;
        } else {
            z12 = z10;
            obj = TtmlNode.TAG_P;
            hashMap = hashMap2;
            obj2 = "event_id";
            z13 = z9;
        }
        if (intent2 != null) {
            if (z8 && this.zze != null && zzl(zzaVar, zzchdVar.getContext(), intent2.getData().toString(), str3)) {
                if (z11) {
                    hashMap.put((String) map.get(obj2), Boolean.TRUE);
                    ((zzbok) zzaVar).zzd("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
            ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z13, z12);
            return;
        }
        boolean z16 = z12;
        if (!TextUtils.isEmpty(str)) {
            str4 = zzd(zzc(zzchdVar.getContext(), zzchdVar.zzI(), Uri.parse(str), zzchdVar.zzF(), zzchdVar.zzi(), zzchdVar.zzS())).toString();
        } else {
            str4 = str;
        }
        if (z8 && this.zze != null && zzl(zzaVar, zzchdVar.getContext(), str4, str3)) {
            if (z11) {
                hashMap.put((String) map.get(obj2), Boolean.TRUE);
                ((zzbok) zzaVar).zzd("openIntentAsync", hashMap);
                return;
            }
            return;
        }
        ((zzcin) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get(i.f15948a), str4, (String) map.get("m"), (String) map.get(obj), (String) map.get(com.mbridge.msdk.foundation.controller.a.f15376a), (String) map.get("f"), (String) map.get("e"), this.zzg), z13, z16);
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdvc zzdvcVar = this.zzb;
        if (zzdvcVar != null) {
            zzegk.zzc(context, zzdvcVar, this.zze, str, "dialog_not_shown", zzgbf.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (com.google.android.gms.internal.ads.zzbma.zzc(r2, r11, r12, r13, r14) == null) goto L29;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmb.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z8) {
        zzbud zzbudVar = this.zzd;
        if (zzbudVar != null) {
            zzbudVar.zza(z8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r2 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmb.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i9) {
        String str;
        zzdvc zzdvcVar = this.zzb;
        if (zzdvcVar == null) {
            return;
        }
        zzdvb zza = zzdvcVar.zza();
        zza.zzb("action", "cct_action");
        switch (i9) {
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
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        zza.zzb("cct_open_status", str);
        zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        f4.c zzh;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzchd zzchdVar = (zzchd) zzaVar;
        if (zzchdVar.zzD() != null) {
            hashMap = zzchdVar.zzD().zzax;
        }
        String zzc = zzcaw.zzc(str, zzchdVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && this.zzf != null && zzcqd.zzj(zzc)) {
            zzh = this.zzf.zzb(zzc, com.google.android.gms.ads.internal.client.zzay.zze());
        } else {
            zzh = zzgft.zzh(zzc);
        }
        zzgft.zzr(zzh, new zzblx(this, map, zzaVar, str2), this.zzh);
    }
}
