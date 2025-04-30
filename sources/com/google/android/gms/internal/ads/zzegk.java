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
import androidx.core.app.NotificationManagerCompat;
import com.applovin.impl.L;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import u.C2732a;

/* loaded from: classes2.dex */
public final class zzegk extends zzbuy {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdvc zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzefz zze;
    private String zzf;
    private String zzg;

    public zzegk(Context context, zzefz zzefzVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdvc zzdvcVar) {
        this.zzb = context;
        this.zzc = zzdvcVar;
        this.zzd = zzrVar;
        this.zze = zzefzVar;
    }

    public static void zzc(Context context, zzdvc zzdvcVar, zzefz zzefzVar, String str, String str2, Map map) {
        String str3;
        String str4;
        if (true != com.google.android.gms.ads.internal.zzu.zzo().zzA(context)) {
            str3 = "offline";
        } else {
            str3 = C2732a.ONLINE_EXTRAS_KEY;
        }
        if (zzdvcVar != null) {
            zzdvb zza = zzdvcVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str3);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str4 = zza.zze();
        } else {
            str4 = "";
        }
        zzefzVar.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzfvl.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        return zzfvl.zzb(context, 0, intent, zzfvl.zza | 1073741824, 0);
    }

    private final String zzr() {
        zzefr zzefrVar = (zzefr) this.zza.get(this.zzf);
        if (zzefrVar == null) {
            return "";
        }
        return zzefrVar.zzb();
    }

    private static String zzs(int i9, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        if (zze == null) {
            return str;
        }
        return zze.getString(i9);
    }

    private final void zzt(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.ads.internal.util.zzbt r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.zzefr r5 = (com.google.android.gms.internal.ads.zzefr) r5     // Catch: android.os.RemoteException -> L22
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
            com.google.android.gms.internal.ads.zzefz r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgbf r2 = com.google.android.gms.internal.ads.zzgbf.zzd()
            r6.zzt(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegk.zzu():void");
    }

    private final void zzv(final Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT < 33) {
                com.google.android.gms.ads.internal.zzu.zzp();
                AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
                zzK.setTitle(zzs(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzs(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegd
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        zzegk.this.zzd(activity, zzmVar, dialogInterface, i9);
                    }
                }).setNegativeButton(zzs(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzege
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        zzegk.this.zzk(zzmVar, dialogInterface, i9);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegf
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zzegk.this.zzl(zzmVar, dialogInterface);
                    }
                });
                zzK.create().show();
                zzt(this.zzf, "rtsdi", zzgbf.zzd());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzt(this.zzf, "asnpdi", zzgbf.zzd());
            return;
        }
        zzu();
        zzw(activity, zzmVar);
    }

    private final void zzw(Activity activity, @Nullable final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        XmlResourceParser layout;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i9 = R.layout.offline_ads_dialog;
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        Drawable drawable = null;
        if (zze == null) {
            layout = null;
        } else {
            layout = zze.getLayout(i9);
        }
        if (layout == null) {
            onCancelListener.setMessage(zzs(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzr = zzr();
            if (!zzr.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzr);
            }
            zzefr zzefrVar = (zzefr) this.zza.get(this.zzf);
            if (zzefrVar != null) {
                drawable = zzefrVar.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzegj(this, create, timer, zzmVar), 3000L);
    }

    public final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i9) {
        zzt(this.zzf, "rtsdc", L.m("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzu();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean zzA = com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zzb);
        HashMap hashMap = new HashMap();
        char c9 = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == zzA) {
                c9 = 1;
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
        zzt(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
            if (c9 == 1) {
                this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
            } else {
                zzefz.zzi(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e4.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (strArr[i9].equals("android.permission.POST_NOTIFICATIONS")) {
                zzegm zzegmVar = (zzegm) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzegmVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzegmVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i9] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzu();
                    zzw(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzt(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzegm zzegmVar = (zzegm) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzegmVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzegmVar.zzb();
        this.zzf = zzegmVar.zzc();
        this.zzg = zzegmVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziA)).booleanValue()) {
            zzt(this.zzf, "dialog_impression", zzgbf.zzd());
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(zza);
            zzK.setTitle(zzs(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzs(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzs(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    zzegk.this.zzm(zza, zzb, dialogInterface, i9);
                }
            }).setNegativeButton(zzs(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    zzegk.this.zzn(zzb, dialogInterface, i9);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegi
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzegk.this.zzo(zzb, dialogInterface);
                }
            });
            zzK.create().show();
            return;
        }
        zzv(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                zzefz.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ef, code lost:
    
        r10.put("notification_not_shown_reason", r9.getMessage());
        r9 = "offline_notification_failed";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [B1.f, androidx.core.app.I] */
    @Override // com.google.android.gms.internal.ads.zzbuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r9, com.google.android.gms.ads.internal.offline.buffering.zza r10) {
        /*
            r8 = this;
            java.lang.Object r9 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r9)
            android.content.Context r9 = (android.content.Context) r9
            java.lang.String r0 = r10.zza
            java.lang.String r1 = r10.zzb
            java.lang.String r10 = r10.zzc
            java.lang.String r2 = r8.zzr()
            com.google.android.gms.ads.internal.util.zzab r3 = com.google.android.gms.ads.internal.zzu.zzq()
            java.lang.String r4 = "AdMob Offline Notifications"
            java.lang.String r5 = "offline_notification_channel"
            r3.zzh(r9, r5, r4)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzq(r9, r3, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzq(r9, r4, r1, r0)
            androidx.core.app.O r4 = new androidx.core.app.O
            r4.<init>(r9, r5)
            android.app.Notification r5 = r4.f4381s
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L4b
            int r6 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r6 = zzs(r6, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r6, r2)
            java.lang.CharSequence r2 = androidx.core.app.O.b(r2)
            r4.f4369e = r2
            goto L59
        L4b:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r6 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzs(r2, r6)
            java.lang.CharSequence r2 = androidx.core.app.O.b(r2)
            r4.f4369e = r2
        L59:
            r2 = 1
            r4.c(r2)
            r5.deleteIntent = r0
            r4.f4371g = r3
            android.content.pm.ApplicationInfo r0 = r9.getApplicationInfo()
            int r0 = r0.icon
            r5.icon = r0
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zziB
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.f4374j = r0
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zziD
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto La6
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto La6
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La6
            r0.<init>(r10)     // Catch: java.io.IOException -> La6
            java.net.URLConnection r10 = r0.openConnection()     // Catch: java.io.IOException -> La6
            java.io.InputStream r10 = r10.getInputStream()     // Catch: java.io.IOException -> La6
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch: java.io.IOException -> La6
            goto La7
        La6:
            r10 = r3
        La7:
            if (r10 == 0) goto Ld4
            android.content.Context r0 = r4.f4366a     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            android.graphics.Bitmap r0 = androidx.core.app.NotificationCompat.reduceLargeIconSize(r0, r10)     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            android.graphics.PorterDuff$Mode r5 = androidx.core.graphics.drawable.IconCompat.f4454k     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r0.getClass()     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            androidx.core.graphics.drawable.IconCompat r5 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r5.b = r0     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r4.f4372h = r5     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            androidx.core.app.I r0 = new androidx.core.app.I     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r5 = 3
            r6 = 0
            r0.<init>(r5, r6)     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            androidx.core.graphics.drawable.IconCompat r5 = new androidx.core.graphics.drawable.IconCompat     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r5.b = r10     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r0.f4362d = r5     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r0.f4363f = r3     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r0.f4364g = r2     // Catch: android.content.res.Resources.NotFoundException -> Ld4
            r4.d(r0)     // Catch: android.content.res.Resources.NotFoundException -> Ld4
        Ld4:
            java.lang.String r10 = "notification"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            android.app.Notification r0 = r4.a()     // Catch: java.lang.IllegalArgumentException -> Lee
            r2 = 54321(0xd431, float:7.612E-41)
            r9.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Lee
            java.lang.String r9 = "offline_notification_impression"
            goto Lfa
        Lee:
            r9 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r9 = r9.getMessage()
            r10.put(r0, r9)
            java.lang.String r9 = "offline_notification_failed"
        Lfa:
            r8.zzt(r1, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegk.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i9) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i9) {
        zzt(this.zzf, "dialog_click", L.m("dialog_action", "confirm"));
        zzv(activity, zzmVar);
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i9) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzp(String str, zzdlt zzdltVar) {
        String str2;
        String str3 = "";
        if (!TextUtils.isEmpty(zzdltVar.zzx())) {
            str2 = zzdltVar.zzx();
        } else if (zzdltVar.zzB() == null) {
            str2 = "";
        } else {
            str2 = zzdltVar.zzB();
        }
        zzbhv zzm = zzdltVar.zzm();
        if (zzm != null) {
            try {
                str3 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbhv zzn = zzdltVar.zzn();
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
        this.zza.put(str, new zzefn(str2, str3, drawable));
    }
}
