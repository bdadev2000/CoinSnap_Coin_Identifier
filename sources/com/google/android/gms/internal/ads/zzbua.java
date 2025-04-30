package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbua extends zzbuj {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbua(zzchd zzchdVar, Map map) {
        super(zzchdVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzchdVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
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
        if (TextUtils.isEmpty((CharSequence) this.zza.get(str))) {
            return "";
        }
        return (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(CampaignEx.JSON_KEY_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j7 = this.zzd;
        if (j7 > -1) {
            data.putExtra("beginTime", j7);
        }
        long j9 = this.zze;
        if (j9 > -1) {
            data.putExtra("endTime", j9);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbdx(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        if (zze != null) {
            str = zze.getString(R.string.s5);
        } else {
            str = "Create calendar event";
        }
        zzK.setTitle(str);
        if (zze != null) {
            str2 = zze.getString(R.string.f13886s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzK.setMessage(str2);
        if (zze != null) {
            str3 = zze.getString(R.string.f13884s3);
        } else {
            str3 = "Accept";
        }
        zzK.setPositiveButton(str3, new zzbty(this));
        if (zze != null) {
            str4 = zze.getString(R.string.f13885s4);
        } else {
            str4 = "Decline";
        }
        zzK.setNegativeButton(str4, new zzbtz(this));
        zzK.create().show();
    }
}
