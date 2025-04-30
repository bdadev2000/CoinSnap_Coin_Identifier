package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        if (zakVar != null) {
            return zakVar;
        }
        return new zak(fragment);
    }

    @Nullable
    private final zaj zai(int i9) {
        if (this.zad.size() <= i9) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (zaj) sparseArray.get(sparseArray.keyAt(i9));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i9 = 0; i9 < this.zad.size(); i9++) {
            zaj zai = zai(i9);
            if (zai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(":");
                zai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        Log.d("AutoManageHelper", "onStart " + this.zaa + " " + String.valueOf(sparseArray));
        if (this.zab.get() == null) {
            for (int i9 = 0; i9 < this.zad.size(); i9++) {
                zaj zai = zai(i9);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i9 = 0; i9 < this.zad.size(); i9++) {
            zaj zai = zai(i9);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i9) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i9 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zajVar = (zaj) this.zad.get(i9);
        if (zajVar != null) {
            zae(i9);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i9 = 0; i9 < this.zad.size(); i9++) {
            zaj zai = zai(i9);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i9, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean z8;
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        int indexOfKey = this.zad.indexOfKey(i9);
        String h6 = o.h(i9, "Already managing a GoogleApiClient with id ");
        if (indexOfKey < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkState(z8, h6);
        zam zamVar = (zam) this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i9 + " " + this.zaa + " " + String.valueOf(zamVar));
        zaj zajVar = new zaj(this, i9, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i9, zajVar);
        if (this.zaa && zamVar == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i9) {
        zaj zajVar = (zaj) this.zad.get(i9);
        this.zad.remove(i9);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
