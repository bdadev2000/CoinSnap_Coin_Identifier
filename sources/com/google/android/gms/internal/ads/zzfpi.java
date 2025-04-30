package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzfpi {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfoq zzfoqVar, @Nullable String str) {
        zzfph zzfphVar;
        if (view != null) {
            if (zza.matcher("Ad overlay").matches()) {
                Iterator it = this.zzb.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzfphVar = (zzfph) it.next();
                        if (zzfphVar.zzb().get() == view) {
                            break;
                        }
                    } else {
                        zzfphVar = null;
                        break;
                    }
                }
                if (zzfphVar == null) {
                    this.zzb.add(new zzfph(view, zzfoqVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
