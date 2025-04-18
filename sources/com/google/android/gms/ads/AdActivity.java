package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtg;

@KeepForSdk
/* loaded from: classes3.dex */
public final class AdActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    @Nullable
    private zzbtg zza;

    private final void zza() {
        zzbtg zzbtgVar = this.zza;
        if (zzbtgVar != null) {
            try {
                zzbtgVar.zzx();
            } catch (RemoteException e2) {
                zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzh(i10, i11, intent);
            }
        } catch (Exception e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                if (!zzbtgVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
        super.onBackPressed();
        try {
            zzbtg zzbtgVar2 = this.zza;
            if (zzbtgVar2 != null) {
                zzbtgVar2.zzi();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzbtg zzq = zzbc.zza().zzq(this);
        this.zza = zzq;
        if (zzq != null) {
            try {
                zzq.zzl(bundle);
                return;
            } catch (RemoteException e2) {
                zzm.zzl("#007 Could not call remote method.", e2);
                finish();
                return;
            }
        }
        zzm.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzm();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzo();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzq();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzr();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzs(bundle);
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzt();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzu();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbtg zzbtgVar = this.zza;
            if (zzbtgVar != null) {
                zzbtgVar.zzv();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
