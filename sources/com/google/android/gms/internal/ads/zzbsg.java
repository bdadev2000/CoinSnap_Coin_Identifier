package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbsg extends zzbsp {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbsg(zzcfo zzcfoVar, Map map) {
        super(zzcfoVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfoVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j2 = this.zzd;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.zze;
        if (j3 > -1) {
            data.putExtra(SDKConstants.PARAM_END_TIME, j3);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbcd(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        zzK.setTitle(zze != null ? zze.getString(R.string.s5) : "Create calendar event");
        zzK.setMessage(zze != null ? zze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzK.setPositiveButton(zze != null ? zze.getString(R.string.s3) : "Accept", new zzbse(this));
        zzK.setNegativeButton(zze != null ? zze.getString(R.string.s4) : "Decline", new zzbsf(this));
        zzK.create().show();
    }
}
