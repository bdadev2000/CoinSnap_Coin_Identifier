package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import x.b;
import x.i;
import x.l;

/* loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final b zab = new l();
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final b zaa = new l();

    /* JADX WARN: Type inference failed for: r0v0, types: [x.l, x.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [x.l, x.b] */
    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = ((i) this.zaa.keySet()).f24077c.d();
    }

    public final Task zaa() {
        return this.zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (this.zae) {
                this.zac.setException(new AvailabilityException(this.zaa));
            } else {
                this.zac.setResult(this.zab);
            }
        }
    }
}
