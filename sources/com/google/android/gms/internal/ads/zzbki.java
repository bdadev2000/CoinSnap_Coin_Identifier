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
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzbki implements zzbjw {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdud zzb;

    @Nullable
    private final zzbsj zzd;

    @Nullable
    private final zzeey zze;

    @Nullable
    private final zzcop zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final zzgfz zzh = zzcan.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbki(com.google.android.gms.ads.internal.zzb zzbVar, zzbsj zzbsjVar, zzeey zzeeyVar, zzdud zzdudVar, zzcop zzcopVar) {
        this.zza = zzbVar;
        this.zzd = zzbsjVar;
        this.zze = zzeeyVar;
        this.zzb = zzdudVar;
        this.zzf = zzcopVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzavn zzavnVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfhg zzfhgVar) {
        if (zzavnVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlC)).booleanValue() || zzfhgVar == null) {
                if (zzavnVar.zze(uri)) {
                    uri = zzavnVar.zza(uri, context, view, activity);
                }
            } else if (zzavnVar.zze(uri)) {
                uri = zzfhgVar.zza(uri, context, view, activity);
            }
        } catch (zzavo unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z2;
        boolean z3;
        Object obj;
        HashMap hashMap;
        Object obj2;
        boolean z4;
        zzcfo zzcfoVar = (zzcfo) zzaVar;
        zzfgh zzD = zzcfoVar.zzD();
        zzfgk zzR = zzcfoVar.zzR();
        boolean z5 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z2 = false;
        } else {
            String str4 = zzR.zzb;
            z2 = zzD.zzai;
            str3 = str4;
        }
        boolean z6 = (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkp)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) ? false : true;
        boolean z7 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmo)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfoVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcgy) zzaVar).zzaL(zzf(map), zzb(map), z6);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z8 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlx)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), AppEventsConstants.EVENT_PARAM_VALUE_YES);
            if (str != null) {
                ((zzcgy) zzaVar).zzaN(zzf(map), zzb(map), str, z6, z8);
                return;
            } else {
                ((zzcgy) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get(CreativeInfo.al), (String) map.get("baseurl"), z6);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzcfoVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzew)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeA)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    z5 = true;
                }
            }
            boolean zzg = zzbds.zzg(zzcfoVar.getContext());
            if (z5) {
                if (zzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcfoVar.getContext(), zzcfoVar.zzI(), Uri.parse(str), zzcfoVar.zzF(), zzcfoVar.zzi(), zzcfoVar.zzS()));
                    if (z2 && this.zze != null && zzl(zzaVar, zzcfoVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbkf(this);
                    ((zzcgy) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z6, z7);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            map.put("use_running_process", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzj(zzaVar, map, z2, str3, z6, z7);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z2, str3, z6, z7);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhQ)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing from open app action.");
                    return;
                }
                if (z2 && this.zze != null && zzl(zzaVar, zzcfoVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcfoVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcgy) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z6, z7);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcfoVar.getContext(), zzcfoVar.zzI(), data, zzcfoVar.zzF(), zzcfoVar.zzi(), zzcfoVar.zzS()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhR)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z9 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzij)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z9) {
            obj = "p";
            obj2 = "event_id";
            z3 = z7;
            hashMap = hashMap2;
            this.zzg = new zzbkg(this, z6, zzaVar, hashMap2, map);
            z4 = false;
        } else {
            z3 = z7;
            obj = "p";
            hashMap = hashMap2;
            obj2 = "event_id";
            z4 = z6;
        }
        if (intent2 != null) {
            if (!z2 || this.zze == null || !zzl(zzaVar, zzcfoVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzcgy) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z4, z3);
                return;
            } else {
                if (z9) {
                    hashMap.put((String) map.get(obj2), Boolean.TRUE);
                    ((zzbmr) zzaVar).zzd("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        boolean z10 = z3;
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcfoVar.getContext(), zzcfoVar.zzI(), Uri.parse(str), zzcfoVar.zzF(), zzcfoVar.zzi(), zzcfoVar.zzS())).toString() : str;
        if (!z2 || this.zze == null || !zzl(zzaVar, zzcfoVar.getContext(), uri, str3)) {
            ((zzcgy) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z4, z10);
        } else if (z9) {
            hashMap.put((String) map.get(obj2), Boolean.TRUE);
            ((zzbmr) zzaVar).zzd("openIntentAsync", hashMap);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdud zzdudVar = this.zzb;
        if (zzdudVar != null) {
            zzefj.zzd(context, zzdudVar, this.zze, str, "dialog_not_shown", zzgba.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (com.google.android.gms.internal.ads.zzbkh.zzc(r2, r11, r12, r13, r14) == null) goto L29;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbki.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z2) {
        zzbsj zzbsjVar = this.zzd;
        if (zzbsjVar != null) {
            zzbsjVar.zza(z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcv.zzib)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcv.zzia)).booleanValue()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbki.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i2) {
        String str;
        zzdud zzdudVar = this.zzb;
        if (zzdudVar == null) {
            return;
        }
        zzduc zza = zzdudVar.zza();
        zza.zzb("action", "cct_action");
        switch (i2) {
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

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcfo zzcfoVar = (zzcfo) zzaVar;
        if (zzcfoVar.zzD() != null) {
            hashMap = zzcfoVar.zzD().zzaw;
        }
        String zzc = zzbzb.zzc(str, zzcfoVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgfo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjG)).booleanValue() && this.zzf != null && zzcop.zzj(zzc)) ? this.zzf.zzb(zzc, com.google.android.gms.ads.internal.client.zzbc.zze()) : zzgfo.zzh(zzc), new zzbke(this, map, zzaVar, str2), this.zzh);
        } else {
            zzbVar.zzb(zzc);
        }
    }
}
