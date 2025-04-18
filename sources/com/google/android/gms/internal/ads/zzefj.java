package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.Ints;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes2.dex */
public final class zzefj extends zzbte {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdud zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzeey zze;
    private String zzf;
    private String zzg;

    @VisibleForTesting
    public zzefj(Context context, zzeey zzeeyVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdud zzdudVar) {
        this.zzb = context;
        this.zzc = zzdudVar;
        this.zzd = zzrVar;
        this.zze = zzeeyVar;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, g.f30053h);
        p02.startActivity(p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, g.f30053h);
        p02.startActivity(p12);
    }

    public static void zzc(Context context, zzdud zzdudVar, zzeey zzeeyVar, String str, String str2) {
        zzd(context, zzdudVar, zzeeyVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdud zzdudVar, zzeey zzeeyVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzu.zzo().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdudVar != null) {
            zzduc zza = zzdudVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = "";
        }
        zzeeyVar.zzd(new zzefa(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, str3, 2));
    }

    @VisibleForTesting
    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(ShareConstants.MEDIA_URI, str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfuz.zzb(context, 0, intent, zzfuz.zza | Ints.MAX_POWER_OF_TWO, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfuz.zza(context, 0, intent, 201326592);
    }

    private final String zzs() {
        zzeeq zzeeqVar = (zzeeq) this.zza.get(this.zzf);
        return zzeeqVar == null ? "" : zzeeqVar.zzb();
    }

    private static String zzt(int i2, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        return zze == null ? str : zze.getString(i2);
    }

    private final void zzu(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzv() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.ads.internal.util.zzbr r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.zzeeq r5 = (com.google.android.gms.internal.ads.zzeeq) r5     // Catch: android.os.RemoteException -> L22
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L42
        L24:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L22
        L28:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L22
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L22
            if (r1 != 0) goto L48
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.zzeey r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgba r2 = com.google.android.gms.internal.ads.zzgba.zzd()
            r6.zzu(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefj.zzv():void");
    }

    private final void zzw(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (new NotificationManagerCompat(activity).a()) {
            zzv();
            zzx(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzu(this.zzf, "asnpdi", zzgba.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
            zzK.setTitle(zzt(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzt(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    zzefj.this.zzk(activity, zzmVar, dialogInterface, i2);
                }
            }).setNegativeButton(zzt(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    zzefj.this.zzl(zzmVar, dialogInterface, i2);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefe
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzefj.this.zzm(zzmVar, dialogInterface);
                }
            });
            zzK.create().show();
            zzu(this.zzf, "rtsdi", zzgba.zzd());
        }
    }

    private final void zzx(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i2 = R.layout.offline_ads_dialog;
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        XmlResourceParser layout = zze == null ? null : zze.getLayout(i2);
        if (layout == null) {
            onCancelListener.setMessage(zzt(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzs = zzs();
            if (!zzs.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzs);
            }
            zzeeq zzeeqVar = (zzeeq) this.zza.get(this.zzf);
            Drawable zza = zzeeqVar != null ? zzeeqVar.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzefi(this, create, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra(ShareConstants.MEDIA_URI);
            boolean zzA = com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zzb);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzA ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(e.e)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.zzb, launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzu(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (r8 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzeey.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals("android.permission.POST_NOTIFICATIONS")) {
                zzefl zzeflVar = (zzefl) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzeflVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzeflVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i2] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzv();
                    zzx(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzu(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzefl zzeflVar = (zzefl) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzeflVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzeflVar.zzb();
        this.zzf = zzeflVar.zzc();
        this.zzg = zzeflVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzic)).booleanValue()) {
            zzw(zza, zzb);
            return;
        }
        zzu(this.zzf, "dialog_impression", zzgba.zzd());
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(zza);
        zzK.setTitle(zzt(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzt(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzt(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeff
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzefj.this.zzn(zza, zzb, dialogInterface, i2);
            }
        }).setNegativeButton(zzt(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzefj.this.zzo(zzb, dialogInterface, i2);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefh
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzefj.this.zzp(zzb, dialogInterface);
            }
        });
        zzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                zzeey.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:30)|4|(9:8|9|(3:21|22|(1:24))|11|12|13|14|15|16)|29|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.core.app.NotificationCompat$BigPictureStyle, java.lang.Object, androidx.core.app.NotificationCompat$Style] */
    @Override // com.google.android.gms.internal.ads.zzbtf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.ads.internal.offline.buffering.zza r9) {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r0 = r9.zza
            java.lang.String r1 = r9.zzb
            java.lang.String r9 = r9.zzc
            java.lang.String r2 = r7.zzs()
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzu.zzq()
            java.lang.String r4 = "AdMob Offline Notifications"
            java.lang.String r5 = "offline_notification_channel"
            r3.zzh(r8, r5, r4)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r8, r3, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r8, r4, r1, r0)
            androidx.core.app.NotificationCompat$Builder r4 = new androidx.core.app.NotificationCompat$Builder
            r4.<init>(r8, r5)
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L49
            int r5 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r6 = "You are back online! Continue learning about %s"
            java.lang.String r5 = zzt(r5, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r5, r2)
            java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.b(r2)
            r4.e = r2
            goto L57
        L49:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r5 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzt(r2, r5)
            java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.b(r2)
            r4.e = r2
        L57:
            android.app.Notification r2 = r4.f18444p
            int r5 = r2.flags
            r5 = r5 | 16
            r2.flags = r5
            r2.deleteIntent = r0
            r4.f18435g = r3
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            int r0 = r0.icon
            android.app.Notification r2 = r4.f18444p
            r2.icon = r0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzid
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f18437i = r0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzif
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto Laa
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Laa
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> Laa
            r0.<init>(r9)     // Catch: java.io.IOException -> Laa
            java.net.URLConnection r9 = r0.openConnection()     // Catch: java.io.IOException -> Laa
            java.io.InputStream r9 = com.safedk.android.internal.partials.AdMobNetworkBridge.urlConnectionGetInputStream(r9)     // Catch: java.io.IOException -> Laa
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch: java.io.IOException -> Laa
            goto Lab
        Laa:
            r9 = r2
        Lab:
            if (r9 == 0) goto Lcc
            r4.c(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r5 = 1
            r3.<init>(r5)     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r3.f18557b = r9     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r0.f18428b = r3     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r0.f18429c = r2     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r0.d = r5     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            androidx.core.app.NotificationCompat$Style r9 = r4.f18439k     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            if (r9 == r0) goto Lcc
            r4.f18439k = r0     // Catch: android.content.res.Resources.NotFoundException -> Lcc
            r0.g(r4)     // Catch: android.content.res.Resources.NotFoundException -> Lcc
        Lcc:
            java.lang.String r9 = "notification"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.app.Notification r0 = r4.a()     // Catch: java.lang.IllegalArgumentException -> Le6
            r2 = 54321(0xd431, float:7.612E-41)
            r8.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Le6
            java.lang.String r8 = "offline_notification_impression"
            goto Lf2
        Le6:
            r8 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r8 = r8.getMessage()
            r9.put(r0, r8)
            java.lang.String r8 = "offline_notification_failed"
        Lf2:
            r7.zzu(r1, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefj.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final /* synthetic */ void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzu(this.zzf, "rtsdc", hashMap);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzv();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzu(this.zzf, "dialog_click", hashMap);
        zzw(activity, zzmVar);
    }

    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i2) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(String str, zzdkp zzdkpVar) {
        String str2 = "";
        String zzx = !TextUtils.isEmpty(zzdkpVar.zzx()) ? zzdkpVar.zzx() : zzdkpVar.zzB() != null ? zzdkpVar.zzB() : "";
        zzbgc zzm = zzdkpVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbgc zzn = zzdkpVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeem(zzx, str2, drawable));
    }
}
