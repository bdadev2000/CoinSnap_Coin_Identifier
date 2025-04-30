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
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvg;

@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    @Nullable
    private zzbvg zza;

    private final void zza() {
        zzbvg zzbvgVar = this.zza;
        if (zzbvgVar != null) {
            try {
                zzbvgVar.zzx();
            } catch (RemoteException e4) {
                zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, @NonNull Intent intent) {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzh(i9, i10, intent);
            }
        } catch (Exception e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
        super.onActivityResult(i9, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                if (!zzbvgVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
        super.onBackPressed();
        try {
            zzbvg zzbvgVar2 = this.zza;
            if (zzbvgVar2 != null) {
                zzbvgVar2.zzi();
            }
        } catch (RemoteException e9) {
            zzm.zzl("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzbvg zzo = zzay.zza().zzo(this);
        this.zza = zzo;
        if (zzo != null) {
            try {
                zzo.zzl(bundle);
                return;
            } catch (RemoteException e4) {
                zzm.zzl("#007 Could not call remote method.", e4);
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
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzm();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzo();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i9, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzp(i9, strArr, iArr);
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzq();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzr();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzs(bundle);
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzt();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzu();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbvg zzbvgVar = this.zza;
            if (zzbvgVar != null) {
                zzbvgVar.zzv();
            }
        } catch (RemoteException e4) {
            zzm.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i9) {
        super.setContentView(i9);
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
