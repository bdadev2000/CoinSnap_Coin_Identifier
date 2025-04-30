package com.google.android.gms.measurement.internal;

import I.h;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.foundation.entity.o;
import com.vungle.ads.internal.signals.j;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzax extends zzii {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzax(zzhj zzhjVar) {
        super(zzhjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final long zzc() {
        zzt();
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    public final long zzg() {
        zzac();
        return this.zza;
    }

    public final String zzh() {
        zzac();
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    public final void zzm() {
        zzt();
        this.zzd = null;
        this.zze = 0L;
    }

    public final boolean zzn() {
        Account[] result;
        zzt();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (currentTimeMillis - this.zze > j.TWENTY_FOUR_HOURS_MILLIS) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (h.checkSelfPermission(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            zzj().zzw().zza("Permission error checking for dasher/unicorn accounts");
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if (this.zzc == null) {
            this.zzc = AccountManager.get(zza());
        }
        try {
            result = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e4) {
            e = e4;
            zzj().zzm().zza("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e9) {
            e = e9;
            zzj().zzm().zza("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        } catch (IOException e10) {
            e = e10;
            zzj().zzm().zza("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(AccountType.GOOGLE, new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        this.zze = currentTimeMillis;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final boolean zzo() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = o.k(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }
}
