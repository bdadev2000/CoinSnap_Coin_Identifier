package com.google.android.gms.internal.ads;

import a4.j;
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
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes3.dex */
public final class zzeea extends zzbsy {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsm zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzedp zze;
    private String zzf;
    private String zzg;

    public zzeea(Context context, zzedp zzedpVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zzc = zzdsmVar;
        this.zzd = zzrVar;
        this.zze = zzedpVar;
    }

    public static void zzc(Context context, zzdsm zzdsmVar, zzedp zzedpVar, String str, String str2) {
        zzd(context, zzdsmVar, zzedpVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdsm zzdsmVar, zzedp zzedpVar, String str, String str2, Map map) {
        String str3;
        String str4;
        if (true != com.google.android.gms.ads.internal.zzv.zzp().zzA(context)) {
            str3 = "offline";
        } else {
            str3 = o.a.ONLINE_EXTRAS_KEY;
        }
        if (zzdsmVar != null) {
            zzdsl zza = zzdsmVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str3);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str4 = zza.zze();
        } else {
            str4 = "";
        }
        zzedpVar.zzd(new zzedr(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzftr.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        return zzftr.zzb(context, 0, intent, zzftr.zza | 1073741824, 0);
    }

    @Nullable
    private static XmlResourceParser zzs(int i10) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze == null) {
            return null;
        }
        try {
            return zze.getLayout(i10);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzt() {
        zzedh zzedhVar = (zzedh) this.zza.get(this.zzf);
        return zzedhVar == null ? "" : zzedhVar.zzb();
    }

    private static String zzu(int i10, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze == null) {
            return str;
        }
        try {
            return zze.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzv(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzw() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.zzbq r0 = com.google.android.gms.ads.internal.util.zzs.zzz(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzedh r5 = (com.google.android.gms.internal.ads.zzedh) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L47
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L47:
            if (r1 != 0) goto L5b
            com.google.android.gms.internal.ads.zzedp r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfzr r2 = com.google.android.gms.internal.ads.zzfzr.zzd()
            r6.zzv(r0, r1, r2)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeea.zzw():void");
    }

    private final void zzx(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT < 33) {
                com.google.android.gms.ads.internal.zzv.zzq();
                AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzs.zzK(activity);
                zzK.setTitle(zzu(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzu(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        zzeea.this.zzk(activity, zzmVar, dialogInterface, i10);
                    }
                }).setNegativeButton(zzu(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        zzeea.this.zzl(zzmVar, dialogInterface, i10);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedv
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zzeea.this.zzm(zzmVar, dialogInterface);
                    }
                });
                zzK.create().show();
                zzv(this.zzf, "rtsdi", zzfzr.zzd());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzv(this.zzf, "asnpdi", zzfzr.zzd());
            return;
        }
        zzw();
        zzy(activity, zzmVar);
    }

    private final void zzy(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser zzs = zzs(R.layout.offline_ads_dialog);
        if (zzs == null) {
            onCancelListener.setMessage(zzu(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            Drawable drawable = null;
            View inflate = activity.getLayoutInflater().inflate(zzs, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzt = zzt();
            if (!zzt.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzt);
            }
            zzedh zzedhVar = (zzedh) this.zza.get(this.zzf);
            if (zzedhVar != null) {
                drawable = zzedhVar.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzedz(this, create, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean zzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zzb);
        HashMap hashMap = new HashMap();
        char c10 = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == zzA) {
                c10 = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                this.zzb.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
        }
        zzv(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
            if (c10 == 1) {
                this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
            } else {
                zzedp.zzi(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e2.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeec zzeecVar = (zzeec) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzeecVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzeecVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzw();
                    zzy(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzv(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzeec zzeecVar = (zzeec) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzeecVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzeecVar.zzb();
        this.zzf = zzeecVar.zzc();
        this.zzg = zzeecVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzie)).booleanValue()) {
            zzv(this.zzf, "dialog_impression", zzfzr.zzd());
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzs.zzK(zza);
            zzK.setTitle(zzu(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzu(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzu(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeea.this.zzn(zza, zzb, dialogInterface, i10);
                }
            }).setNegativeButton(zzu(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzeea.this.zzo(zzb, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeea.this.zzp(zzb, dialogInterface);
                }
            });
            zzK.create().show();
            return;
        }
        zzx(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzedp.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbsz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
        /*
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzb
            java.lang.String r11 = r11.zzc
            java.lang.String r2 = r9.zzt()
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzr()
            java.lang.String r4 = "AdMob Offline Notifications"
            java.lang.String r5 = "offline_notification_channel"
            r3.zzh(r10, r5, r4)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r10, r3, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r10, r4, r1, r0)
            androidx.core.app.s0 r4 = new androidx.core.app.s0
            r4.<init>(r10, r5)
            boolean r5 = r2.isEmpty()
            r6 = 1
            if (r5 != 0) goto L48
            int r5 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r5 = zzu(r5, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r5, r7)
            r4.d(r2)
            goto L53
        L48:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r5 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzu(r2, r5)
            r4.d(r2)
        L53:
            r4.c(r6)
            android.app.Notification r2 = r4.f1242s
            r2.deleteIntent = r0
            r4.f1230g = r3
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            int r0 = r0.icon
            r2.icon = r0
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzif
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f1233j = r0
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzih
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La1
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La1
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La1
            r0.<init>(r11)     // Catch: java.io.IOException -> La1
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La1
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La1
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La1
            goto La2
        La1:
            r11 = r2
        La2:
            if (r11 == 0) goto Lcd
            android.content.Context r0 = r4.a     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            android.graphics.Bitmap r0 = androidx.core.app.NotificationCompat.reduceLargeIconSize(r0, r11)     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            android.graphics.PorterDuff$Mode r3 = androidx.core.graphics.drawable.IconCompat.f1278k     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r0.getClass()     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r3.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r3.f1279b = r0     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r4.f1231h = r3     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            androidx.core.app.l0 r0 = new androidx.core.app.l0     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r3.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r3.f1279b = r11     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r0.f1205e = r3     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r0.f1206f = r2     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r0.f1207g = r6     // Catch: android.content.res.Resources.NotFoundException -> Lcd
            r4.f(r0)     // Catch: android.content.res.Resources.NotFoundException -> Lcd
        Lcd:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            android.app.Notification r0 = r4.a()     // Catch: java.lang.IllegalArgumentException -> Le7
            r2 = 54321(0xd431, float:7.612E-41)
            r10.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Le7
            java.lang.String r10 = "offline_notification_impression"
            goto Lf3
        Le7:
            r10 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r10 = r10.getMessage()
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Lf3:
            r9.zzv(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeea.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final /* synthetic */ void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzv(this.zzf, "rtsdc", j.q("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzv.zzr().zzf(activity));
        zzw();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        zzv(this.zzf, "dialog_click", j.q("dialog_action", "confirm"));
        zzx(activity, zzmVar);
    }

    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(String str, zzdiy zzdiyVar) {
        String str2;
        String str3 = "";
        if (!TextUtils.isEmpty(zzdiyVar.zzx())) {
            str2 = zzdiyVar.zzx();
        } else if (zzdiyVar.zzB() == null) {
            str2 = "";
        } else {
            str2 = zzdiyVar.zzB();
        }
        zzbfy zzm = zzdiyVar.zzm();
        if (zzm != null) {
            try {
                str3 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfy zzn = zzdiyVar.zzn();
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
        this.zza.put(str, new zzedd(str2, str3, drawable));
    }
}
