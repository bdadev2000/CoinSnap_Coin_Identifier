package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgor {
    private final Class zza;
    private zzgos zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgnd zze = zzgnd.zza;

    public /* synthetic */ zzgor(Class cls, zzgot zzgotVar) {
        this.zza = cls;
    }

    private final zzgor zze(Object obj, zzgfw zzgfwVar, zzguk zzgukVar, boolean z10) throws GeneralSecurityException {
        byte[] zzc;
        zzgwu zzgwuVar;
        zzgwu zzgwuVar2;
        if (this.zzb != null) {
            if (obj != null) {
                if (zzgukVar.zzk() == 3) {
                    int ordinal = zzgukVar.zzf().ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    throw new GeneralSecurityException("unknown output prefix type");
                                }
                            } else {
                                zzc = zzgfr.zza;
                            }
                        }
                        zzc = zzgoa.zza(zzgukVar.zza()).zzc();
                    } else {
                        zzc = zzgoa.zzb(zzgukVar.zza()).zzc();
                    }
                    zzgos zzgosVar = new zzgos(obj, zzgwu.zzb(zzc), zzgukVar.zzk(), zzgukVar.zzf(), zzgukVar.zza(), zzgukVar.zzb().zzg(), zzgfwVar, null);
                    Map map = this.zzb;
                    List list = this.zzc;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zzgosVar);
                    zzgwuVar = zzgosVar.zzb;
                    List list2 = (List) map.put(zzgwuVar, Collections.unmodifiableList(arrayList));
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list2);
                        arrayList2.add(zzgosVar);
                        zzgwuVar2 = zzgosVar.zzb;
                        map.put(zzgwuVar2, Collections.unmodifiableList(arrayList2));
                    }
                    list.add(zzgosVar);
                    if (z10) {
                        if (this.zzd == null) {
                            this.zzd = zzgosVar;
                        } else {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }

    public final zzgor zza(Object obj, zzgfw zzgfwVar, zzguk zzgukVar) throws GeneralSecurityException {
        zze(obj, zzgfwVar, zzgukVar, false);
        return this;
    }

    public final zzgor zzb(Object obj, zzgfw zzgfwVar, zzguk zzgukVar) throws GeneralSecurityException {
        zze(obj, zzgfwVar, zzgukVar, true);
        return this;
    }

    public final zzgor zzc(zzgnd zzgndVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgndVar;
        return this;
    }

    public final zzgou zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgou zzgouVar = new zzgou(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgouVar;
    }
}
