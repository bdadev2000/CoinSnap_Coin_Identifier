package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes2.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @Nullable Intent intent, int i9) {
        return new zad(intent, activity, i9);
    }

    public static zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i9) {
        return new zae(intent, fragment, i9);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i9) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e4) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
