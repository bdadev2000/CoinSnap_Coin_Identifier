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

/* loaded from: classes3.dex */
public final class zzfpb implements zzfoc {
    private static final zzfpb zza = new zzfpb();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfox();
    private static final Runnable zze = new zzfoy();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfou zzk = new zzfou();
    private final zzfoe zzj = new zzfoe();
    private final zzfov zzl = new zzfov(new zzfpe());

    public static zzfpb zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfpb zzfpbVar) {
        zzfpbVar.zzg = 0;
        zzfpbVar.zzi.clear();
        zzfpbVar.zzh = false;
        for (zzfna zzfnaVar : zzfnr.zza().zzb()) {
        }
        zzfpbVar.zzm = System.nanoTime();
        zzfpbVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfod zza2 = zzfpbVar.zzj.zza();
        if (zzfpbVar.zzk.zze().size() > 0) {
            Iterator it = zzfpbVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfpbVar.zzk.zza(str);
                zzfod zzb2 = zzfpbVar.zzj.zzb();
                String zzc2 = zzfpbVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfon.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e2) {
                        zzfoo.zza("Error with setting not visible reason", e2);
                    }
                    zzfon.zzc(zza3, zza5);
                }
                zzfon.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfpbVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfpbVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfpbVar.zzk(null, zza2, zza6, 1, false);
            zzfon.zzf(zza6);
            zzfpbVar.zzl.zzd(zza6, zzfpbVar.zzk.zzf(), nanoTime);
        } else {
            zzfpbVar.zzl.zzb();
        }
        zzfpbVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfpbVar.zzm;
        if (zzfpbVar.zzf.size() > 0) {
            for (zzfpa zzfpaVar : zzfpbVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfpaVar.zzb();
                if (zzfpaVar instanceof zzfoz) {
                    ((zzfoz) zzfpaVar).zza();
                }
            }
        }
        zzfob.zza().zzc();
    }

    private final void zzk(View view, zzfod zzfodVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfodVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final void zza(View view, zzfod zzfodVar, JSONObject jSONObject, boolean z10) {
        int zzl;
        boolean z11;
        boolean z12;
        if (zzfos.zza(view) == null && (zzl = this.zzk.zzl(view)) != 3) {
            JSONObject zza2 = zzfodVar.zza(view);
            zzfon.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfon.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
                } catch (JSONException e2) {
                    zzfoo.zza("Error with setting has window focus", e2);
                }
                Boolean valueOf = Boolean.valueOf(this.zzk.zzj(zzd2));
                if (valueOf.booleanValue()) {
                    try {
                        zza2.put("isPipActive", valueOf);
                    } catch (JSONException e10) {
                        zzfoo.zza("Error with setting is picture-in-picture active", e10);
                    }
                }
                this.zzk.zzh();
            } else {
                zzfot zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfnu zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put((String) zzb3.get(i10));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e11) {
                        zzfoo.zza("Error with setting friendly obstruction", e11);
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                zzk(view, zzfodVar, zza2, zzl, z12);
            }
            this.zzg++;
        }
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
        zzb.post(new zzfow(this));
    }
}
