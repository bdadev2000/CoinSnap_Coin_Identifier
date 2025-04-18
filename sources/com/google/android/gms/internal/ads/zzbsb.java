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

/* loaded from: classes3.dex */
public final class zzbsb extends zzbsk {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbsb(zzcfk zzcfkVar, Map map) {
        super(zzcfkVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfkVar.zzi();
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
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(CampaignEx.JSON_KEY_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j3 = this.zzd;
        if (j3 > -1) {
            data.putExtra("beginTime", j3);
        }
        long j10 = this.zze;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
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
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbbv(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzs.zzK(this.zzb);
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze != null) {
            str = zze.getString(R.string.s5);
        } else {
            str = "Create calendar event";
        }
        zzK.setTitle(str);
        if (zze != null) {
            str2 = zze.getString(R.string.f11548s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzK.setMessage(str2);
        if (zze != null) {
            str3 = zze.getString(R.string.f11546s3);
        } else {
            str3 = "Accept";
        }
        zzK.setPositiveButton(str3, new zzbrz(this));
        if (zze != null) {
            str4 = zze.getString(R.string.f11547s4);
        } else {
            str4 = "Decline";
        }
        zzK.setNegativeButton(str4, new zzbsa(this));
        zzK.create().show();
    }
}
