package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfql implements zzfpm {
    private static final zzfql zza = new zzfql();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfqh();
    private static final Runnable zze = new zzfqi();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfqe zzk = new zzfqe();
    private final zzfpo zzj = new zzfpo();
    private final zzfqf zzl = new zzfqf(new zzfqo());

    public static zzfql zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfql zzfqlVar) {
        zzfqlVar.zzg = 0;
        zzfqlVar.zzi.clear();
        zzfqlVar.zzh = false;
        for (zzfom zzfomVar : zzfpd.zza().zzb()) {
        }
        zzfqlVar.zzm = System.nanoTime();
        zzfqlVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfpn zza2 = zzfqlVar.zzj.zza();
        if (zzfqlVar.zzk.zze().size() > 0) {
            Iterator it = zzfqlVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfqlVar.zzk.zza(str);
                zzfpn zzb2 = zzfqlVar.zzj.zzb();
                String zzc2 = zzfqlVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfpx.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfpy.zza("Error with setting not visible reason", e);
                    }
                    zzfpx.zzc(zza3, zza5);
                }
                zzfpx.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfqlVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfqlVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfqlVar.zzk(null, zza2, zza6, 1, false);
            zzfpx.zzf(zza6);
            zzfqlVar.zzl.zzd(zza6, zzfqlVar.zzk.zzf(), nanoTime);
        } else {
            zzfqlVar.zzl.zzb();
        }
        zzfqlVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfqlVar.zzm;
        if (zzfqlVar.zzf.size() > 0) {
            for (zzfqk zzfqkVar : zzfqlVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfqkVar.zzb();
                if (zzfqkVar instanceof zzfqj) {
                    ((zzfqj) zzfqkVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfpn zzfpnVar, JSONObject jSONObject, int i2, boolean z2) {
        zzfpnVar.zzb(view, jSONObject, this, i2 == 1, z2);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpm
    public final void zza(View view, zzfpn zzfpnVar, JSONObject jSONObject, boolean z2) {
        int zzk;
        boolean z3;
        if (zzfqc.zza(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfpnVar.zza(view);
        zzfpx.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfpx.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfpy.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfqd zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfpg zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) zzb3.get(i2));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e2) {
                    zzfpy.zza("Error with setting friendly obstruction", e2);
                }
                z3 = true;
            } else {
                z3 = false;
            }
            zzk(view, zzfpnVar, zza2, zzk, z2 || z3);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfqg(this));
    }
}
