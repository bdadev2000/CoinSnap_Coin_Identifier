package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zax implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zax(zaaa zaaaVar, zaw zawVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zaj = connectionResult;
            zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(@Nullable Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaaa.zao(this.zaa, bundle);
            this.zaa.zaj = ConnectionResult.RESULT_SUCCESS;
            zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i9, boolean z8) {
        Lock lock;
        Lock lock2;
        boolean z9;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabi zabiVar;
        lock = this.zaa.zam;
        lock.lock();
        try {
            zaaa zaaaVar = this.zaa;
            z9 = zaaaVar.zal;
            if (!z9) {
                connectionResult = zaaaVar.zak;
                if (connectionResult != null) {
                    connectionResult2 = zaaaVar.zak;
                    if (connectionResult2.isSuccess()) {
                        this.zaa.zal = true;
                        zabiVar = this.zaa.zae;
                        zabiVar.onConnectionSuspended(i9);
                        lock3 = this.zaa.zam;
                        lock3.unlock();
                    }
                }
            }
            this.zaa.zal = false;
            zaaa.zan(this.zaa, i9, z8);
            lock3 = this.zaa.zam;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.zaa.zam;
            lock2.unlock();
            throw th;
        }
    }
}
