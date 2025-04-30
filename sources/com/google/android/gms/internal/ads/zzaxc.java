package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaxc extends zzaxb {
    public zzaxc(Context context, String str, boolean z8) {
        super(context, str, z8);
    }

    public static zzaxc zzt(String str, Context context, boolean z8) {
        zzaxb.zzr(context, false);
        return new zzaxc(context, str, false);
    }

    @Deprecated
    public static zzaxc zzu(String str, Context context, boolean z8, int i9) {
        zzaxb.zzr(context, z8);
        return new zzaxc(context, str, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final List zzp(zzaye zzayeVar, Context context, zzatp zzatpVar, zzatg zzatgVar) {
        if (zzayeVar.zzk() != null && ((zzaxb) this).zzu) {
            int zza = zzayeVar.zza();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.zzp(zzayeVar, context, zzatpVar, null));
            arrayList.add(new zzayw(zzayeVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzatpVar, zza, 24));
            return arrayList;
        }
        return super.zzp(zzayeVar, context, zzatpVar, null);
    }
}
